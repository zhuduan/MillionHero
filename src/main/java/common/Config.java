package common;

/**
 * The config info 
 *
 * @author Haifeng.Zhu
 *         created at 1/23/18
 */
public class Config {
    
    public enum OcrMethod {
        BAIDU(1),
        Tess(2);
        
        private int id;

        OcrMethod(int id) {
            this.id = id;
        }
    }
    
    public enum SearchMethod {
        BAIDU(1),
        GOOGLE(2);
        
        private int id;

        SearchMethod(int id) {
            this.id = id;
        }
    }
    
    public enum AnswerMethod {
        FREQUENCE_STATISTIC(1),
        OTHER(2);
        
        private int id;

        AnswerMethod(int id) {
            this.id = id;
        }
    }
}
