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
    private int winnings;
    private int amountWagered;
    
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
        playerTextY=70;
        
        rowWidth=200;
        colWidth=150;
        numRows=3;
        numCols=3;
      
        
        playerY=200;
        compY=600;
        
        int compTextX=getWidth()-300;
        
        playerCardHeight=200;
        compCardHeight=compTextY+20;
        
        //scoring variables initialization
        playerWins=0;
        gamesPlayed=0;
        winnings=10000;
        amountWagered=100;
        
        
        //sets up game, deals new cards, updates score, etc
        resetGame();
        
        
        
        
           
        
            
        
    }
    
    
    public void act(){
        
        // if your code in hitDecision() returns true, and the h key is not pressed, and the player has less than 21, and the games is active, then hit for the next card
        if(hitDecision() && !keyHisDown && playerTotal<21 && gameIsActive){
            
            hit();
            keyHisDown=true;
            
        }
        //??????????????????????????????? Place your comment here to explain code below
        if(!Greenfoot.isKeyDown("h")){
            keyHisDown=false;
          
        }
        // if your code in stayDecision() returns true, and the s key is not pressed, and the games is active, then the player will stay
        if(stayDecision() && !keySisDown && gameIsActive){
            
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
        
         // if your code in doubleBetDecision() returns true, and the player only has two cards, then the player will stay
        if(doubleBetDecision() && cardsRevealed==2){
            amountWagered=200;
            addObject(new TitleScore("$$",56,100),getWidth()-50,140);
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
        removeObjects(getObjects(TitleScore.class));
        addObject(new TitleScore("'H' to hit       'S' to stay       'Space' to start next hand       Wager=$100       'Up Arrow' when player has 2 cards to increase wager to $200",20,1000),getWidth()/2,20);
        addObject(new TitleScore("P:" + playerTotal,50,100), getWidth()-75, playerTextY+150);
        
        //showText(Integer.toString(playerTotal),cardsRevealed*colWidth,playerTextY+20);
        
        if(playerTotal==21){
            stay();
            
        }
        
        //??????????????????????????????? Place your comment here to explain code below
        if(playerTotal>21){
            addObject(new Title("  Bust",55,170,1), getWidth()/2, playerTextY+200);
            addObject(new Title("Winner!",55,180,3), getWidth()/2, compTextY+200);
            canResetGame = true;
            gamesPlayed++;
            winnings-=amountWagered;
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
        
        
        addObject(new TitleScore("D:" + compTotal,50,100), getWidth()-75, compTextY+150);
        
        if(compTotal>21){
            addObject(new Title("  Bust",55,170,1), getWidth()/2, compTextY+150);
            
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
        
        //removes old text so there is no layering of new text updates
        removeObjects(getObjects(Card.class));
        removeObjects(getObjects(Title.class));
        removeObjects(getObjects(TitleScore.class));
        removeObjects(getObjects(TitleScoreboard.class));
        
        //resets all variables to default
        keySisDown = false;
        keyHisDown = false;
        canResetGame = false;
        gameIsActive = true;
        cardsRevealed=0;
        compCardsRevealed=1;
        playerTotal=0;
        amountWagered=100;//default wager amount"
        
        
        //??????????????????????????????? Place your comment here to explain code below
        cardList = new ArrayList<Integer>();
        for(int i=1; i<53; i++){
            cardList.add(i);
        }
        
        
        addObject(new TitleScore("Player",24,100),colWidth,playerTextY);
        addObject(new TitleScore("'H' to hit       'S' to stay       'Space' to start next hand       Wager=$100       'Up Arrow' when player has 2 cards to increase wager to $200",20,1000),getWidth()/2,20);
        //showText("'H' to hit   'S' to stay   'Space' to start next hand   Wager=$100  'Up Arrow' on new hand =Doubles wager to $200",getWidth()/2,20);
        //showText("$$$$$",30,100);
        
        addObject(new TitleScore("$",55,100),getWidth()-50,140);
        addObject(new TitleScore("Dealer",24,100),colWidth,compTextY);
        
        
        
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
            winnings+=amountWagered;
            addObject(new Title("Winner!",55,180,3), getWidth()/2, playerTextY+150);
        }
        else if(playerTotal==compTotal){
            addObject(new Title("Push",75,180,4), getWidth()/2, getHeight()/2);
        }
        else{
            addObject(new Title("Winner!",55,180,3), getWidth()/2, compTextY+150);
            winnings-=amountWagered;
        }
        if(playerTotal==compTotal){
            gamesPlayed--;
        }
        updateScore();
    }
    
    //calculates wins, win%, and winnings and updates to screen
    private void updateScore(){
        double winPerc=0.0;
        double winPercRounded=0.0;
        if(gamesPlayed>0)
        {
            winPerc = (double)(playerWins)/(gamesPlayed);
            winPercRounded =100* Math.round(winPerc*1000)/1000.0;
            
            
        }
      
        //remove all old text objects so there is no layering effect, than add the new text objects
        removeObjects(getObjects(TitleScoreboard.class));
        addObject(new TitleScoreboard("Wins      " + playerWins + "/"+gamesPlayed,30,200,2), getWidth()-150, compTextY-130);
        addObject(new TitleScoreboard("Win%     " + winPercRounded,30,200,2), getWidth()-150, compTextY-80);
        addObject(new TitleScoreboard("Winnings $" +winnings,30,200,2), getWidth()-150, compTextY-30);
        
    }
    
    
    
    
    //*******************These are the methods you code the strategy!!  If done correctly, all you have to do is 
    //*******************hold the spacebar down to play multiple hands in succession to test your strategy
    public boolean hitDecision(){
        boolean hit=Greenfoot.isKeyDown("h");
        
        return hit;
        
        
    }
    
    public boolean stayDecision(){
        boolean stay=Greenfoot.isKeyDown("s");
        
        return stay;
        
        
    }
    
    
    public boolean doubleBetDecision(){
        boolean doubleBet=Greenfoot.isKeyDown("up");
        
        return doubleBet;
        
        
    }
    
    
}
