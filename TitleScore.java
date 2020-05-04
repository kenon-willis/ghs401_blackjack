import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScore here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleScore extends Actor
{
    /**
     * Act - do whatever the TitleScore wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    
    public TitleScore(String text,int fontsize){
        //setImage(new GreenfootImage("\"Flappy Bird\" by Mr. Willis", 33, Color.red, null));
         
         // change as desired
        Color fontColor = Color.BLACK; // change as desired
        Color bgColor = new Color(0, 0, 0, 0); // transparent background
        GreenfootImage txtImg = new GreenfootImage(text, fontsize, fontColor, bgColor);
        // create the base image
        
        GreenfootImage img = new GreenfootImage(100, 50);
        bgColor = Color.WHITE; // change as desired
        img.setColor(bgColor);
        img.fill();
        
        
        // draw text image on base image
        img.drawImage(txtImg, 10, 5);
        setImage(img);
    }
}
