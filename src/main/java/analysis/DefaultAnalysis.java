package analysis;

import common.Config;
import common.GameConfig_Default;
import common.GameConfig_PeekMeeting;
import model.ChosenAnswer;
import model.QuestionAndAnswer;
import model.SearchResult;
import ocr.OCR;
import ocr.impl.BaiDuOCR;
import search.Search;
import utils.Factories;
import utils.ImageUtil;

/**
 * purpose of this class
 *
 * @author Haifeng.Zhu
 *         created at 1/29/18
 */
public class DefaultAnalysis extends Analysis {

    private Search searchMethod = Factories.getSearchMethod(Config.SearchMethod.BAIDU, new GameConfig_Default());
    private OCR ocrMethod = Factories.getOcrMethod(Config.OcrMethod.BAIDU, new GameConfig_Default());
    
    @Override
    public ChosenAnswer getAnswer(byte[] imgBytes) {
        QuestionAndAnswer questionAndAnswer = ocrMethod.getQuestionAndAnswer(imgBytes);
        
        
        ChosenAnswer chosenAnswer = new ChosenAnswer();
        return chosenAnswer;
    }
    
    // whether this is a "not" question
    private Boolean isNegtiveQuestion(QuestionAndAnswer questionAndAnswer){
        if ( questionAndAnswer.getQuestion().contains("不是") ){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        GameConfig_PeekMeeting config = new GameConfig_PeekMeeting();
        OCR ocr=new BaiDuOCR(config);
        String path = "src/resource/screenshot_after_cut.png";
        byte[] imgBytes = ImageUtil.getByteFromImage(ImageUtil.cutImage(path, config),config);
        QuestionAndAnswer questionAndAnswer = ocr.getQuestionAndAnswer(imgBytes);
        System.out.println(questionAndAnswer.toString());
    }
}
