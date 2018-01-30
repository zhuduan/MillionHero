import common.Config.*;
import ocr.OCR;
import ocr.impl.BaiDuOCR;
import ocr.impl.TessOCR;
import search.Search;
import search.impl.BaiDuSearch;
import search.impl.GoogleSearch;

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
    
    
    public Search getSearchMethod(SearchMethod type){
        switch (type){
            case BAIDU:
                return new BaiDuSearch();
            case GOOGLE:
                return new GoogleSearch();
            default:
                return new BaiDuSearch();
        }
    }
}
