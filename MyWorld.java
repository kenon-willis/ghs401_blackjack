import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;
import java.awt.Color;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    
    //instance variables for screen positioning
    private int playerTextY;
    private int compTextY;
    private int rowWidth;
    private int colWidth;
    private int numRows;
    private int numCols;
    private int compY;
    private int playerY;
    private int playerCardHeight;
    private int compCardHeight;
    
    //instance variables for scoring 
    private int playerTotal;
    private int compTotal;
    private int playerWins;
    private int gamesPlayed;
    
    private int cardsRevealed;
    private int compCardsRevealed;

    //instance variables for keyPress activation and deactivation
    private boolean keyHisDown;
    private boolean keySisDown;
    private boolean canResetGame;
    private boolean gameIsActive;
    
    private List<Integer> cardList;
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1); 
        
        //postitioning of text and cards
        compTextY=470;
        playerTextY=60;
        
        rowWidth=200;
        colWidth=150;
        numRows=3;
        numCols=3;
      
        
        playerY=200;
        compY=600;
        
        int compTextX=getWidth()-300;
        
        playerCardHeight=200;
        compCardHeight=compTextY+20;
        
          
        playerWins=0;
        gamesPlayed=0;
        
        
        //sets up game
        resetGame();
        
        
        
        
           
        
            
        
    }
    
    
    public void act(){
        
        //??????????????????????????????? Place your comment here to explain code below
        if(Greenfoot.isKeyDown("h") && !keyHisDown && playerTotal<21 && gameIsActive){
            
            hit();
            keyHisDown=true;
            
        }
        //??????????????????????????????? Place your comment here to explain code below
        if(!Greenfoot.isKeyDown("h")){
            keyHisDown=false;
          
        }
        if(Greenfoot.isKeyDown("s") && !keySisDown && gameIsActive){
            
            stay();
            keySisDown=true;
            
        }
        if(!Greenfoot.isKeyDown("s")){
            keySisDown=false;
          
        }
        
        //check for spaceBar press to reset game and the boolean locks from activiating multiple runs with only one key press
        if(Greenfoot.isKeyDown("space") && canResetGame){
            
            resetGame();
            
        }
        
    }
    
    
    public void hit(){
        //add to cardRevealed to know where to position next card
        cardsRevealed++;
        
        //??????????????????????????????? Place your comment here to explain code below
        int card = getCard();
        
        //??????????????????????????????? Place your comment here to explain code below
        addObject(new Card(card),cardsRevealed*colWidth,playerCardHeight);
        int valueOfCard = getCardValue(card);
        
        //??????????????????????????????? Place your comment here to explain code below
        playerTotal+=valueOfCard;
        addObject(new TitleScore("P:" + playerTotal,50), getWidth()-75, playerTextY+150);
        
        //showText(Integer.toString(playerTotal),cardsRevealed*colWidth,playerTextY+20);
        
        
        //??????????????????????????????? Place your comment here to explain code below
        if(playerTotal>21){
            addObject(new Title("BUST",75,180,1), getWidth()/2, playerTextY+200);
            canResetGame = true;
            gamesPlayed++;
            updateScore();
            gameIsActive=false;
        }
        
    }
    
    public void stay(){
        
        
        //??????????????????????????????? Place your comment here to explain code below
        while(compTotal<17){
            compCardsRevealed++;
            int card = getCard();
            
            int valueOfCard = getCardValue(card);
        
            compTotal+=valueOfCard;
            addObject(new Card(card),compCardsRevealed*colWidth,compY);
            //showText(Integer.toString(compTotal),compCardsRevealed*colWidth,compTextY+20);
            
            
        }
        
        
        addObject(new TitleScore("D:" + compTotal,50), getWidth()-75, compTextY+150);
        
        if(compTotal>21){
            addObject(new Title("BUST",75,180,1), getWidth()/2, compTextY+200);
            
        }
        
        //??????????????????????????????? Place your comment here to explain code below
        checkWinner();
        canResetGame = true;
        gameIsActive = false;
    }
    
    public int getCardValue(int cardVal){
        //??????????????????????????????? Place your comment here to explain code below
        int valueOfCard = (cardVal-1)/4+1;
        
        //??????????????????????????????? Place your comment here to explain code below
        if(valueOfCard>10){
            valueOfCard=10;
        }
        if(valueOfCard==1){
            valueOfCard=11;
        }
            
        return valueOfCard;
        
    }
    
    
    
    public int getCard(){
        int card=(int)(Math.random()*52+1);
        
        //??????????????????????????????? Place your comment here to explain code below
        while(!cardList.contains(card)){
            card=(int)(Math.random()*52+1);
        }
        
        //??????????????????????????????? Place your comment here to explain code below
        cardList.remove(Integer.valueOf(card));
        
        return card;
    }
    
    public void resetGame(){
        
        removeObjects(getObjects(Card.class));
        removeObjects(getObjects(Title.class));
        removeObjects(getObjects(TitleScore.class));
        keySisDown = false;
        keyHisDown = false;
        canResetGame = false;
        gameIsActive = true;
        cardsRevealed=0;
        compCardsRevealed=1;
        playerTotal=0;
        
        
        //??????????????????????????????? Place your comment here to explain code below
        cardList = new ArrayList<Integer>();
        for(int i=1; i<53; i++){
            cardList.add(i);
        }
        
        
        addObject(new TitleScore("Player",24),colWidth,playerTextY);
        showText("'H' to hit   'S' to stay   'Space' to start next hand",getWidth()/2,20);
        addObject(new TitleScore("Dealer",24),colWidth,compTextY);
        
        
        
        int card = getCard();
        int valueOfCard = getCardValue(card);
        compTotal=valueOfCard;
        addObject(new Card(card),colWidth,compY);
        
        addObject(new CardBack(), 2*colWidth,compY);
        
        hit();
        hit();
        updateScore();
    }
    
    
    private void checkWinner(){
        
        gamesPlayed++;
        //??????????????????????????????? Place your comment here to explain code below
        if(compTotal>21 ||  playerTotal > compTotal){
            playerWins++;
        }
        if(playerTotal==compTotal){
            gamesPlayed--;
        }
        updateScore();
    }
    
    
    private void updateScore(){
        double winPerc=0.0;
        if(gamesPlayed>0)
        {
            winPerc = (double)playerWins/gamesPlayed;
            winPerc = Math.round(winPerc*1000)/1000.0;
            winPerc*=100;
        }
      
        
        addObject(new Title("Wins:" + playerWins + "/"+gamesPlayed + "  Win%: " + winPerc,40,400,2), getWidth()-400, compTextY-100);
        
    }
    
    
}
