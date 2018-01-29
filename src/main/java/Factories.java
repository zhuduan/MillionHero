import common.Config;
import common.Config.OcrMethod;
import ocr.OCR;
import ocr.impl.BaiDuOCR;
import ocr.impl.TessOCR;

/**
 * purpose of this class
 *
 * @author Haifeng.Zhu
 *         created at 1/29/18
 */
public class Factories {
    
    public OCR getOcrMethod(OcrMethod type){
        switch (type){
            case BAIDU:
                return new BaiDuOCR();
            case Tess:
                return new TessOCR();
            default:
                return new TessOCR();
        }
    }
    
}
