/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller;

import java.util.ArrayList;

/**
 *
 * @author Angel Arturo
 */
public class Player {
     int wins;      // # of wins
    int winTotal;
    /**
     * Randomly choose rock, paper, or scissors
     */
    public String playerChoice()
    {         
        String[] elecciones=new String[]{"rock","paper","scissors"};
        int c = (int)(Math.random()*(elecciones.length-1));
        
        return elecciones[c];
    }
    public int setWins() 
    {         
        return ++wins;
    }
    public int getWins() 
    {
        return(wins);
    }
    
}
