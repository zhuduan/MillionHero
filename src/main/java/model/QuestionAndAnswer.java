package model;

import java.util.List;

/**
 * purpose of this class
 *
 * @author Haifeng.Zhu
 *         created at 1/26/18
 */
public class QuestionAndAnswer {
    
    private String question;
    
    private List<String> answers;

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<String> getAnswers() {
        return answers;
    }

    public void setAnswers(List<String> answers) {
        this.answers = answers;
    }

    public QuestionAndAnswer(String question, List<String> answers) {
        this.question = question;
        this.answers = answers;
    }
}
