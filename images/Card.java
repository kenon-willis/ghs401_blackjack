import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Card here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Card extends Actor
{
    private int suit;
    private int showVal;
    private int val;
    /**
     * Act - do whatever the Card wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Card(int suit, int showVal, int val){
        
        this.suit=suit;
        this.showVal=showVal;
        this.val=val;
        
    }
    
    
    public void act() 
    {
        // Add your action code here.
        
       
    }    
}
