package search.impl;

import common.AdapterConfig;
import common.PeekMeeting_AdapterConfig;
import model.SearchResult;
import search.Search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;


public class BaiDuSearch implements Search {
    
    
    private static String URL_PREFIX = "http://www.baidu.com/s?tn=ichuner&lm=-1&word=";
    private static String URL_SUFFIX = "&rn=1";

    private AdapterConfig config = null;

    
    public BaiDuSearch(AdapterConfig config) {
        this.config = config;
    }

    @Override
    public SearchResult search(String searchContent) {
        SearchResult searchResult = new SearchResult();
        StringBuilder content = new StringBuilder();
        try {
            URL url = new URL(URL_PREFIX + getEncodeContent(searchContent) + URL_SUFFIX);
            BufferedReader breaded = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));
            String line = breaded.readLine();
            while ( line != null ) {
                if (line.contains("百度为您找到相关结果约")) {
                    int start = line.indexOf("百度为您找到相关结果约") + 11;
                    line = line.substring(start);
                    int end = line.indexOf("个");
                    line = line.substring(0, end);
                    line = line.replace(",", "");
                    searchResult.setHitNum(Long.valueOf(line));
                }

                content.append(line);
                line = breaded.readLine();
            }
        } catch (MalformedURLException exp){
            
        } catch (IOException exp){
            
        }
        searchResult.setContent(content.toString());
        return searchResult;
    }

    @Override
    public SearchResult call() throws IOException {
        if (config.isShow_browser()) {
            //todo:
//            new Utils().openBrowser(path);
        }
        return search("");
    }
    
    // encode the search content
    private String getEncodeContent(String content){
        try {
            return URLEncoder.encode(content, this.config.getQa_char_code());
        } catch (UnsupportedEncodingException exp){
            // error log
        }
        return "";
    }
    
    public static void main(String[] args){
        BaiDuSearch search = new BaiDuSearch(new PeekMeeting_AdapterConfig());
        SearchResult searchResult = search.search("以下哪个不是清华大学的代表校花");
        System.out.println(searchResult.toString());
    }
}
