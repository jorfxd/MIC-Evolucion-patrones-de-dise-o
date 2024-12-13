/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller;

/**
 *
 * @author Angel Arturo
 */
public class RPMGame {

    /**
     * @param args the command line arguments
     */
    public void main(String args[])
    {
        Player p1 = new Player();
        Player p2 = new Player();
        boolean gameWon = false;  
        int roundsPlayed = 0;    // Number of rounds played
        int p1Wins = p1.wins;
        int p2Wins = p2.wins;
        int draw = 0;
        String p1Choice;
        String p2Choice;
        // Game Loop
        do
        {
            System.out.println("***** Round: " +
                roundsPlayed + " *********************\n");
            System.out.println("Number of Draws: "+ 
                draw + "\n");
            p1Choice = p1.playerChoice();
            System.out.println("Player 1: " + p1Choice + 
                "\t Player 1 Total Wins: " + p1Wins);
            p2Choice = p2.playerChoice();
            System.out.println("Player 2: " + p2Choice+ 
                "\t Player 2 Total Wins: " + p2Wins);
            
            boolean rock_vs_paper=(p1Choice.equals("rock"))&&(p2Choice.equals("paper"));
            boolean paper_vs_rock=(p1Choice.equals("paper"))&&(p2Choice.equals("rock"));
            boolean rock_vs_scissors=(p1Choice.equals("rock"))&&(p2Choice.equals("scissors"));
            boolean scissors_vs_rock=(p1Choice.equals("scissors"))&&(p2Choice.equals("rock"));
            boolean scissors_vs_paper=(p1Choice.equals("scissors"))&&(p2Choice.equals("paper"));
            boolean paper_vs_scissors=(p1Choice.equals("paper"))&&(p2Choice.equals("scissors"));
            
            
            if(rock_vs_paper)
            {
                p2Wins=playerWins(p2,2);               
            }
            else if(paper_vs_rock)
            {                
                p1Wins=playerWins(p1,1);
            }
            else if(rock_vs_scissors)
            {
                p1Wins=playerWins(p1,1);
            }
            else if(scissors_vs_rock)
            {
                p2Wins=playerWins(p2,2);
            }
            else if(scissors_vs_paper)
            {
                p1Wins=playerWins(p1,1);
            }
            else if(paper_vs_scissors)
            {
                p2Wins=playerWins(p2,2);
            }
            else
            {
                draw++;
                System.out.println("\n\t\t\t Draw \n");
            }
            roundsPlayed++;
            if((p1.getWins()>=3)||(p2.getWins()>=3))
            {
                gameWon = true;
                System.out.println("GAME WON");
            }
            System.out.println();
        } while(gameWon != true);
        
    }   
    
    
    int playerWins(Player p,int nJugador){        
        System.out.println("Player "+nJugador+" Wins");
        return p.setWins();
    }
    
}
