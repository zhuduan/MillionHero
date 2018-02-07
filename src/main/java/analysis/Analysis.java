package analysis;

import common.Config;
import common.GameConfig;
import common.GameConfig_Default;
import model.ChosenAnswer;
import model.QuestionAndAnswer;
import ocr.OCR;
import search.Search;
import utils.Factories;

/**
 * purpose of this class
 *
 * @author Haifeng.Zhu
 *         created at 1/26/18
 */
public abstract class Analysis {

    private Search searchMethod = Factories.getSearchMethod(Config.SearchMethod.BAIDU, new GameConfig_Default());
    private OCR ocrMethod = Factories.getOcrMethod(Config.OcrMethod.BAIDU, new GameConfig_Default());
    
    /***
     * 
     * get the answer should be chosen
     * 
     * @param imgBytes
     * @return
     */
    public abstract ChosenAnswer getAnswer(byte[] imgBytes);
}
