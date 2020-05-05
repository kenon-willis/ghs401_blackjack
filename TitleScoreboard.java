import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScore here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleScoreboard extends Actor
{
    /**
     * Act - do whatever the TitleScore wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    
    public TitleScoreboard(String text, int fontsize, int rectW, int colorChoice){
        //setImage(new GreenfootImage("\"Flappy Bird\" by Mr. Willis", 33, Color.red, null));
         
        Color fontColor = Color.WHITE; // change as desired
        
        if(colorChoice==1)
            fontColor = Color.RED; // change as desired
        else if(colorChoice==2)
            fontColor=Color.YELLOW;
        else if(colorChoice==3)
            fontColor=Color.GREEN;
        else
            fontColor=Color.ORANGE;
            
            
            
        
        Color bgColor = new Color(0, 0, 0, 0); // transparent background
        GreenfootImage txtImg = new GreenfootImage(text, fontsize, fontColor, bgColor);
        // create the base image
        GreenfootImage img = new GreenfootImage(rectW+20, 50);
        //img.setColor(bgColor);
        //img.fill();
        // draw text image on base image
        img.drawImage(txtImg, 10, 5);
        setImage(img);
    }
}
