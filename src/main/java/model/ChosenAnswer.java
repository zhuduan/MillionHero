package model;

/**
 * purpose of this class
 *
 * @author Haifeng.Zhu
 *         created at 2/7/18
 */
public class ChosenAnswer {
    
    private Integer chooseNo = 0;
    private String answer = "未知";

    public ChosenAnswer() {
    }

    public ChosenAnswer(Integer chooseNo, String answer) {
        this.chooseNo = chooseNo;
        this.answer = answer;
    }

    public Integer getChooseNo() {
        return chooseNo;
    }

    public void setChooseNo(Integer chooseNo) {
        this.chooseNo = chooseNo;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
