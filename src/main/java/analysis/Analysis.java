package analysis;

import model.QuestionAndAnswer;

/**
 * purpose of this class
 *
 * @author Haifeng.Zhu
 *         created at 1/26/18
 */
public interface Analysis {

    /***
     * 
     * get the answer's index : 1 for answer1, 2 for answer2, 3 for answer3
     * or null if can not get effective one
     * 
     * @param questionAndAnswer
     * @return
     */
    Integer getAnswer(QuestionAndAnswer questionAndAnswer);
}
