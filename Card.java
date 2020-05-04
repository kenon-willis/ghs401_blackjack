import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;
/**
 * Write a description of class Card here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Card extends Actor
{
    /**
     * Act - do whatever the Card wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    
    private int cardWidth;
    private int cardHeight;
    
    public Card(int card){
        
        cardWidth=120;
        cardHeight=200;
        
        
        if(card==1){
            setImage("ace_of_clubs.png");
            GreenfootImage image = getImage();
            image.scale(cardWidth, cardHeight);
            setImage(image);
            
        }
        else if(card==2){
            setImage("ace_of_diamonds.png");
            GreenfootImage image = getImage();
            image.scale(cardWidth, cardHeight);
            setImage(image);
        }
        else if(card==3){
            setImage("ace_of_hearts.png");
            GreenfootImage image = getImage();
            image.scale(cardWidth, cardHeight);
            setImage(image);
        }
        else if(card==4){
            setImage("ace_of_spades.png");
            GreenfootImage image = getImage();
            image.scale(cardWidth, cardHeight);
            setImage(image);
        }
        else if(card==5){
            setImage("2_of_clubs.png");
            GreenfootImage image = getImage();
            image.scale(cardWidth, cardHeight);
            setImage(image);
            
        }
        else if(card==6){
            setImage("2_of_diamonds.png");
            GreenfootImage image = getImage();
            image.scale(cardWidth, cardHeight);
            setImage(image);
        }
        else if(card==7){
            setImage("2_of_hearts.png");
            GreenfootImage image = getImage();
            image.scale(cardWidth, cardHeight);
            setImage(image);
        }
        else if(card==8){
            setImage("2_of_spades.png");
            GreenfootImage image = getImage();
            image.scale(cardWidth, cardHeight);
            setImage(image);
        }
        else if(card==9){
            setImage("3_of_clubs.png");
            GreenfootImage image = getImage();
            image.scale(cardWidth, cardHeight);
            setImage(image);
            
        }
        else if(card==10){
            setImage("3_of_diamonds.png");
            GreenfootImage image = getImage();
            image.scale(cardWidth, cardHeight);
            setImage(image);
        }
        else if(card==11){
            setImage("3_of_hearts.png");
            GreenfootImage image = getImage();
            image.scale(cardWidth, cardHeight);
            setImage(image);
        }
        else if(card==12){
            setImage("3_of_spades.png");
            GreenfootImage image = getImage();
            image.scale(cardWidth, cardHeight);
            setImage(image);
        }
        else if(card==13){
            setImage("4_of_clubs.png");
            GreenfootImage image = getImage();
            image.scale(cardWidth, cardHeight);
            setImage(image);
            
        }
        else if(card==14){
            setImage("4_of_diamonds.png");
            GreenfootImage image = getImage();
            image.scale(cardWidth, cardHeight);
            setImage(image);
        }
        else if(card==15){
            setImage("4_of_hearts.png");
            GreenfootImage image = getImage();
            image.scale(cardWidth, cardHeight);
            setImage(image);
        }
        else if(card==16){
            setImage("4_of_spades.png");
            GreenfootImage image = getImage();
            image.scale(cardWidth, cardHeight);
            setImage(image);
        }
        else if(card==17){
            setImage("5_of_clubs.png");
            GreenfootImage image = getImage();
            image.scale(cardWidth, cardHeight);
            setImage(image);
            
        }
        else if(card==18){
            setImage("5_of_diamonds.png");
            GreenfootImage image = getImage();
            image.scale(cardWidth, cardHeight);
            setImage(image);
        }
        else if(card==19){
            setImage("5_of_hearts.png");
            GreenfootImage image = getImage();
            image.scale(cardWidth, cardHeight);
            setImage(image);
        }
        else if(card==20){
            setImage("5_of_spades.png");
            GreenfootImage image = getImage();
            image.scale(cardWidth, cardHeight);
            setImage(image);
        }
        else if(card==21){
            setImage("6_of_clubs.png");
            GreenfootImage image = getImage();
            image.scale(cardWidth, cardHeight);
            setImage(image);
            
        }
        else if(card==22){
            setImage("6_of_diamonds.png");
            GreenfootImage image = getImage();
            image.scale(cardWidth, cardHeight);
            setImage(image);
        }
        else if(card==23){
            setImage("6_of_hearts.png");
            GreenfootImage image = getImage();
            image.scale(cardWidth, cardHeight);
            setImage(image);
        }
        else if(card==24){
            setImage("6_of_spades.png");
            GreenfootImage image = getImage();
            image.scale(cardWidth, cardHeight);
            setImage(image);
        }
        else if(card==25){
            setImage("7_of_clubs.png");
            GreenfootImage image = getImage();
            image.scale(cardWidth, cardHeight);
            setImage(image);
            
        }
        else if(card==26){
            setImage("7_of_diamonds.png");
            GreenfootImage image = getImage();
            image.scale(cardWidth, cardHeight);
            setImage(image);
        }
        else if(card==27){
            setImage("7_of_hearts.png");
            GreenfootImage image = getImage();
            image.scale(cardWidth, cardHeight);
            setImage(image);
        }
        else if(card==28){
            setImage("7_of_spades.png");
            GreenfootImage image = getImage();
            image.scale(cardWidth, cardHeight);
            setImage(image);
        }
        else if(card==29){
            setImage("8_of_clubs.png");
            GreenfootImage image = getImage();
            image.scale(cardWidth, cardHeight);
            setImage(image);
            
        }
        else if(card==30){
            setImage("8_of_diamonds.png");
            GreenfootImage image = getImage();
            image.scale(cardWidth, cardHeight);
            setImage(image);
        }
        else if(card==31){
            setImage("8_of_hearts.png");
            GreenfootImage image = getImage();
            image.scale(cardWidth, cardHeight);
            setImage(image);
        }
        else if(card==32){
            setImage("8_of_spades.png");
            GreenfootImage image = getImage();
            image.scale(cardWidth, cardHeight);
            setImage(image);
        }
        else if(card==33){
            setImage("9_of_clubs.png");
            GreenfootImage image = getImage();
            image.scale(cardWidth, cardHeight);
            setImage(image);
            
        }
        else if(card==34){
            setImage("9_of_diamonds.png");
            GreenfootImage image = getImage();
            image.scale(cardWidth, cardHeight);
            setImage(image);
        }
        else if(card==35){
            setImage("9_of_hearts.png");
            GreenfootImage image = getImage();
            image.scale(cardWidth, cardHeight);
            setImage(image);
        }
        else if(card==36){
            setImage("9_of_spades.png");
            GreenfootImage image = getImage();
            image.scale(cardWidth, cardHeight);
            setImage(image);
        }
        else if(card==37){
            setImage("10_of_clubs.png");
            GreenfootImage image = getImage();
            image.scale(cardWidth, cardHeight);
            setImage(image);
            
        }
        else if(card==38){
            setImage("10_of_diamonds.png");
            GreenfootImage image = getImage();
            image.scale(cardWidth, cardHeight);
            setImage(image);
        }
        else if(card==39){
            setImage("10_of_hearts.png");
            GreenfootImage image = getImage();
            image.scale(cardWidth, cardHeight);
            setImage(image);
        }
        else if(card==40){
            setImage("10_of_spades.png");
            GreenfootImage image = getImage();
            image.scale(cardWidth, cardHeight);
            setImage(image);
        }
        else if(card==41){
            setImage("jack_of_clubs.png");
            GreenfootImage image = getImage();
            image.scale(cardWidth, cardHeight);
            setImage(image);
            
        }
        else if(card==42){
            setImage("jack_of_diamonds.png");
            GreenfootImage image = getImage();
            image.scale(cardWidth, cardHeight);
            setImage(image);
        }
        else if(card==43){
            setImage("jack_of_hearts.png");
            GreenfootImage image = getImage();
            image.scale(cardWidth, cardHeight);
            setImage(image);
        }
        else if(card==44){
            setImage("jack_of_spades.png");
            GreenfootImage image = getImage();
            image.scale(cardWidth, cardHeight);
            setImage(image);
        }
        else if(card==45){
            setImage("queen_of_clubs.png");
            GreenfootImage image = getImage();
            image.scale(cardWidth, cardHeight);
            setImage(image);
            
        }
        else if(card==46){
            setImage("queen_of_diamonds.png");
            GreenfootImage image = getImage();
            image.scale(cardWidth, cardHeight);
            setImage(image);
        }
        else if(card==47){
            setImage("queen_of_hearts.png");
            GreenfootImage image = getImage();
            image.scale(cardWidth, cardHeight);
            setImage(image);
        }
        else if(card==48){
            setImage("queen_of_spades.png");
            GreenfootImage image = getImage();
            image.scale(cardWidth, cardHeight);
            setImage(image);
        }
        else if(card==49){
            setImage("king_of_clubs.png");
            GreenfootImage image = getImage();
            image.scale(cardWidth, cardHeight);
            setImage(image);
            
        }
        else if(card==50){
            setImage("king_of_diamonds.png");
            GreenfootImage image = getImage();
            image.scale(cardWidth, cardHeight);
            setImage(image);
        }
        else if(card==51){
            setImage("king_of_hearts.png");
            GreenfootImage image = getImage();
            image.scale(cardWidth, cardHeight);
            setImage(image);
        }
        else if(card==52){
            setImage("king_of_spades.png");
            GreenfootImage image = getImage();
            image.scale(cardWidth, cardHeight);
            setImage(image);
        }
        
        
        
        
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
