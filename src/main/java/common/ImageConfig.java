package common;

/**
 * purpose of this class
 *
 * @author Haifeng.Zhu
 *         created at 1/29/18
 */
public abstract class ImageConfig{
    
    private int left_x=0;
    
    private int left_y=0;
    
    private int width=100;
    
    private int height=100;

    public int getLeft_x() {
        return left_x;
    }

    public void setLeft_x(int left_x) {
        this.left_x = left_x;
    }

    public int getLeft_y() {
        return left_y;
    }

    public void setLeft_y(int left_y) {
        this.left_y = left_y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
