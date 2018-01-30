package ocr;

import common.AdapterConfig;
import model.QuestionAndAnswer;

import java.awt.image.BufferedImage;
import java.io.File;


public interface OCR {
    
    QuestionAndAnswer getQuestionAndAnswer(byte[] image);
}
