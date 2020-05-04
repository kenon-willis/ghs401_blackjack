import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rectangle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CardBack extends Actor
{
    /**
     * Act - do whatever the Rectangle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int cardWidth;
    private int cardHeight;
    
    public CardBack(){
        cardWidth=120;
        cardHeight=200;
        setImage("back.png");
        GreenfootImage image = getImage();
        image.scale(cardWidth, cardHeight);
        setImage(image);
    }
    
    public void act() 
    {
        // Add your action code here.
        
    }    
}
