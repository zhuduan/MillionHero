package utils;

import common.GameConfig;
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
    
    public static OCR getOcrMethod(OcrMethod type, GameConfig config){
        switch (type){
            case BAIDU:
                return new BaiDuOCR(config);
            case Tess:
                return new TessOCR(config);
            default:
                return new TessOCR(config);
        }
    }
    
    
    public static Search getSearchMethod(SearchMethod type, GameConfig config){
        switch (type){
            case BAIDU:
                return new BaiDuSearch(config);
            case GOOGLE:
                return new GoogleSearch(config);
            default:
                return new BaiDuSearch(config);
        }
    }
}
