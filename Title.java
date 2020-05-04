import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
//import java.awt.Color;
/**
 * Write a description of class Title here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Title extends Actor
{
    /**
     * Act - do whatever the Title wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
      
    }    
    public Title(String text, int fontsize, int rectW, int colorChoice){
        //setImage(new GreenfootImage("\"Flappy Bird\" by Mr. Willis", 33, Color.red, null));
         
       
        Color fontColor = Color.BLACK; // change as desired
        Color bgColor = new Color(0, 0, 0, 0); // transparent background
        GreenfootImage txtImg = new GreenfootImage(text, fontsize, fontColor, bgColor);
        // create the base image
        GreenfootImage img = new GreenfootImage(rectW, 100);
        if(colorChoice==1)
            bgColor = Color.RED; // change as desired
        else
            bgColor=Color.YELLOW;
        img.setColor(bgColor);
        img.fill();
        // draw text image on base image
        img.drawImage(txtImg, 10, 5);
        setImage(img);
    }
}
