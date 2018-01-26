package ocr;

import java.awt.image.BufferedImage;
import java.io.File;

/**
 * Created by 618 on 2018/1/12.
 * @author lingfengsan
 */
public interface OCR {
    /**
     *获取识别图片后的结果
     * @param file String
     * @return String
     */
    String getOCR(File file);
    
    String getQuestionAndAnswer(BufferedImage image);
}
