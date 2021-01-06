/**
 * Created by laurashi on 10/22/17.
 */
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;


public class Mood extends JApplet
{
    private int count = 0;
    private BufferedImage img1, img2, img3, img4, img5;
    private int selection;

    public void init()
    {
        try
        {
            URL url1 = new URL(getCodeBase(), "woohoo.jpg");
            img1 = ImageIO.read(url1);
            URL url2 = new URL(getCodeBase(), "good.jpg");
            img2 = ImageIO.read(url2);
            URL url3 = new URL(getCodeBase(), "okay.jpg");
            img3 = ImageIO.read(url3);
            URL url4 = new URL(getCodeBase(), "workharder.jpg");
            img4 = ImageIO.read(url4);
            URL url5 = new URL(getCodeBase(), "yikes.png");
            img5 = ImageIO.read(url5);
        } catch (IOException e)
        {
            e.printStackTrace();
        }
        String Question1 = JOptionPane.showInputDialog(null, "On a scale from 1-10, how often do you procrastinate?", "Mood Tester", JOptionPane.QUESTION_MESSAGE);
        selection = Integer.parseInt(Question1);
        count++;

        String Question2 = JOptionPane.showInputDialog(null, "On a scale from 1-10, how often do you yell?", "Mood Tester", JOptionPane.QUESTION_MESSAGE);
        selection = Integer.parseInt(Question2);
        count++;

        String Question3 = JOptionPane.showInputDialog(null, "On a scale from 1-10, how often do you feel angry?", "Mood Tester", JOptionPane.QUESTION_MESSAGE);
        selection = Integer.parseInt(Question3);
        count++;

        String Question4 = JOptionPane.showInputDialog(null, "On a scale from 1-10, how often do you intentionally not do homework?", "Mood Tester", JOptionPane.QUESTION_MESSAGE);
        selection = Integer.parseInt(Question4);
        count++;

        String Question5 = JOptionPane.showInputDialog(null, "On a scale from 1-10, how often do you litter?", "Mood Tester", JOptionPane.QUESTION_MESSAGE);
        selection = Integer.parseInt(Question5);
        count++;

        String Question6 = JOptionPane.showInputDialog(null, "On a scale from 1-10, how often do you watch TV instead of talking to people?", "Mood Tester", JOptionPane.QUESTION_MESSAGE);
        selection = Integer.parseInt(Question6);
        count++;

    }

    public void paint(Graphics g)
    {
        if (selection == 10) // for 10 only
            g.drawImage(img5, 100, 50, null);
        else if (selection >= 8) // range from 8 to 10 (not inclusive)
            g.drawImage(img4, 100, 50, null);
        else if (selection >= 6) // range from 6 to 8 (not inclusive)
            g.drawImage(img3, 100, 50, null);
        else if (selection >= 4) // range from 4 to 6 (not inclusive)
            g.drawImage(img2, 100, 50, null);
        else if (selection >= 1) // range from 1 to 4 (not inclusive)
            g.drawImage(img1, 50, 50, null);
        else
            System.out.println("Not valid number");
    }

    public String getCount()
    {
        return ("You have answered " + count + " out of 6 questions.");
    }

    public static void main(String[] args)
    {
        Mood m = new Mood();
        System.out.println(m.getCount());
    }
}