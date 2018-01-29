package ocr.impl;

import com.baidu.aip.ocr.AipOcr;
import ocr.OCR;
import org.json.JSONArray;
import org.json.JSONObject;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.HashMap;

/**
 * Created by 618 on 2018/1/12.
 * @author lingfengsan
 */
public class BaiDuOCR implements OCR{
    //设置APPID/AK/SK
    private static final String APP_ID = "10735363";
    private static final String API_KEY = "le7sCcyhkwlC3TaQ1Ldz9yRy";
    private static final String SECRET_KEY = "GYMifAnU7LnszTApP9xS4lvvVkqgZdWP";
    private static final AipOcr CLIENT=new AipOcr(APP_ID, API_KEY, SECRET_KEY);
    
   public BaiDuOCR(){
        // 可选：设置网络连接参数
        CLIENT.setConnectionTimeoutInMillis(2000);
        CLIENT.setSocketTimeoutInMillis(60000);
        System.out.println("欢迎您使用百度OCR进行文字识别");
    }
    
    @Override
    public String getOCR(File file) {
        Long start=System.currentTimeMillis();
        String path=file.getAbsolutePath();
        // 调用接口
        JSONObject res = CLIENT.basicGeneral(path, new HashMap<String, String>());
        System.out.println(res.toString());
        JSONArray jsonArray=res.getJSONArray("words_result");
        StringBuilder sb=new StringBuilder();
        for (Object aJsonArray : jsonArray) {
            String str=aJsonArray.toString();
            str=str.substring(10,str.lastIndexOf('"'));
            sb.append(str);
            sb.append("\n");
        }
        Long time=System.currentTimeMillis()-start;
        System.out.println("tessOCR提取信息成功，耗时："+time+"s");
        return sb.toString();
    }

    @Override
    public String getQuestionAndAnswer(BufferedImage image) {
        return null;
    }

    public static void main(String[] args) {
        OCR ocr=new BaiDuOCR();
        String path = "src/resource/screenshot.png";
        String result=ocr.getOCR(new File(path));
        System.out.println(result);
    }
}
