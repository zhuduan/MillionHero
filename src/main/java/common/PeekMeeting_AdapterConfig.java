package common;

/**
 * purpose of this class
 *
 * @author Haifeng.Zhu
 *         created at 1/29/18
 */
public class PeekMeeting_AdapterConfig extends AdapterConfig {

    // image related 
    private int img_left_x=0;
    private int img_left_y=150;
    private int img_width=1080;
    private int img_height=1000;
    private String img_suffix = "png";

    // Q&A related 
    private int qa_txt_max_per_line = 15;
    private int qa_answer_max_num = 3;

    @Override
    public int getImg_left_x() {
        return img_left_x;
    }

    @Override
    public void setImg_left_x(int img_left_x) {
        this.img_left_x = img_left_x;
    }

    @Override
    public int getImg_left_y() {
        return img_left_y;
    }

    @Override
    public void setImg_left_y(int img_left_y) {
        this.img_left_y = img_left_y;
    }

    @Override
    public int getImg_width() {
        return img_width;
    }

    @Override
    public void setImg_width(int img_width) {
        this.img_width = img_width;
    }

    @Override
    public int getImg_height() {
        return img_height;
    }

    @Override
    public void setImg_height(int img_height) {
        this.img_height = img_height;
    }

    @Override
    public int getQa_txt_max_per_line() {
        return qa_txt_max_per_line;
    }

    @Override
    public void setQa_txt_max_per_line(int qa_txt_max_per_line) {
        this.qa_txt_max_per_line = qa_txt_max_per_line;
    }

    @Override
    public String getImg_suffix() {
        return img_suffix;
    }

    @Override
    public void setImg_suffix(String img_suffix) {
        this.img_suffix = img_suffix;
    }

    @Override
    public int getQa_answer_max_num() {
        return qa_answer_max_num;
    }

    @Override
    public void setQa_answer_max_num(int qa_answer_max_num) {
        this.qa_answer_max_num = qa_answer_max_num;
    }
}
