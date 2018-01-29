package common;

/**
 * purpose of this class
 *
 * @author Haifeng.Zhu
 *         created at 1/29/18
 */
public class PeekMeeting_ImageConfig extends ImageConfig {

    private int left_x=100;

    private int left_y=100;

    private int width=100;

    private int height=100;

    @Override
    public int getLeft_x() {
        return left_x;
    }

    @Override
    public void setLeft_x(int left_x) {
        this.left_x = left_x;
    }

    @Override
    public int getLeft_y() {
        return left_y;
    }

    @Override
    public void setLeft_y(int left_y) {
        this.left_y = left_y;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public void setHeight(int height) {
        this.height = height;
    }
}
