package com.mycompany.tallerpatrones;

import Strategy.Aereo;
import Strategy.Automotriz;
import Strategy.Ciclismo;
import Strategy.Ferroviario;
import Strategy.Fluvial;
import Strategy.Logistica;

public class TallerPatrones {

    public static void main(String[] args) {
        
        Logistica contextLog = new Logistica();
        
        //Aereo Strategy
        contextLog.setStrategy(new Aereo());
        contextLog.startDistribuir();
        
        //Automotriz Strategy
        contextLog.setStrategy(new Automotriz());
        contextLog.startDistribuir();
        
        //Ciclismo Strategy
        contextLog.setStrategy(new Ciclismo());
        contextLog.startDistribuir();
                
        //Ferroviario Strategy
        contextLog.setStrategy(new Ferroviario());
        contextLog.startDistribuir();
        
        //Fluvial Strategy
        contextLog.setStrategy(new Fluvial());
        contextLog.startDistribuir();
        
    }
}
