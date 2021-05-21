import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

import static java.awt.image.BufferedImage.TYPE_INT_RGB;

public class JImageDisplay extends javax.swing.JComponent //Класс для отрисовки
{
    private BufferedImage image;//Поле для хранения картинки
    public JImageDisplay(int width,int height)//конструктор инициализации картинки (ширина,высота)
    {
        image=new BufferedImage(width,height,TYPE_INT_RGB);
        setPreferredSize(new Dimension(width,height));//хрень
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage (image, 0, 0, image.getWidth(), image.getHeight(), null);
    }
    public void clearImage(){//замазать черным картинку
        for(int i=0;i<image.getWidth();i++){
            for(int j=0;j<image.getHeight();j++){
                image.setRGB(i,j,0);
            }
        }
    }
    public void drawPixel(int xCoordinate,int yCoordinate,int rgbColor){
        image.setRGB(xCoordinate,yCoordinate,rgbColor);
    }
}
