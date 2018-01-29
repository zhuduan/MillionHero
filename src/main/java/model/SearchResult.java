package model;

/**
 * purpose of this class
 *
 * @author Haifeng.Zhu
 *         created at 1/29/18
 */
public class SearchResult {
    
    private Long searchResult = 0L;
    
    private String content = "";

    public Long getSearchResult() {
        return searchResult;
    }

    public void setSearchResult(Long searchResult) {
        this.searchResult = searchResult;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
