package utils;

import common.ImageConfig;
import common.PeekMeeting_ImageConfig;

import javax.imageio.ImageIO;
import javax.imageio.ImageReadParam;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;


public class ImageUtil {
    /**
     * 图片裁剪通用接口
     *
     * @param src  图片源地址,图片格式PNG
     * @param dest 图片目的地址
     * @param x    图片起始点x坐标
     * @param y    图片起始点y坐标
     * @param w    图片宽度
     * @param h    图片高度
     * @throws IOException 异常处理
     */
    public static void cutImage(String src, String dest, int x, int y, int w, int h)  {
        try{
            Iterator iterator = ImageIO.getImageReadersByFormatName("png");
            ImageReader reader = (ImageReader) iterator.next();
            InputStream in = new FileInputStream(src);
            ImageInputStream iis = ImageIO.createImageInputStream(in);
            reader.setInput(iis, true);
            ImageReadParam param = reader.getDefaultReadParam();
            Rectangle rect = new Rectangle(x, y, w, h);
            param.setSourceRegion(rect);
            BufferedImage bi = reader.read(0, param);
            ImageIO.write(bi, "png", new File(dest));
        }catch (IOException e){
            System.err.println("裁剪图片失败");
        }
    }
    
    
    public static BufferedImage cutImage(String imgSrc, ImageConfig imageConfig){
        try{
            Iterator iterator = ImageIO.getImageReadersByFormatName("png");
            ImageReader reader = (ImageReader) iterator.next();
            InputStream in = new FileInputStream(imgSrc);
            ImageInputStream iis = ImageIO.createImageInputStream(in);
            reader.setInput(iis, true);
            ImageReadParam param = reader.getDefaultReadParam();
            Rectangle rect = new Rectangle(imageConfig.getLeft_x(), imageConfig.getLeft_y(), 
                    imageConfig.getWidth(), imageConfig.getHeight());
            param.setSourceRegion(rect);
            BufferedImage bi = reader.read(0, param);
            return bi;
        }catch (IOException e){
            System.err.println("裁剪图片失败");
        }
        return null;
    }
    
    // binary images
    public static BufferedImage binaryImage(BufferedImage srcImg){
        if ( srcImg==null ){
            return null;
        }
        
        try {
            //TODO:
            Iterator iterator = ImageIO.getImageReadersByFormatName("png");
            byte[] imageByte = null;
            InputStream in = new ByteArrayInputStream(imageByte);
            ImageInputStream iis = ImageIO.createImageInputStream(in);
            ImageReader reader = (ImageReader) iterator.next();
            reader.setInput(iis, true);
            BufferedImage image = reader.read(0);
            return image;
        } catch (IOException e){
            // something wrong
        }
        return null;
    }
    
    // denoise the image
    public static BufferedImage denoiseImage(BufferedImage srcImg){
        if ( srcImg==null ){
            return null;
        }
        
        return null;
    }
    
    public static void saveImage(BufferedImage srcImg, String dest){
        try {
            ImageIO.write(srcImg, "png", new File(dest));
        }catch (IOException exp){
            System.err.println("保存图片失败");
        }
    }

    public static void main(String[] args) throws IOException {
        String src = "src/resource/screenshot.png";
        String dest= "src/resource/screenshot_after_cut.png";
        ImageUtil imageUtil = new ImageUtil();
        BufferedImage bufferedImage = imageUtil.cutImage(src, new PeekMeeting_ImageConfig());
        imageUtil.saveImage(bufferedImage, dest);
    }
}
