/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import TDAs.ArrayList;
import TDAs.CircularDoublyLinkedList;
import TDAs.Node;

/**
 *
 * @author anton
 */
public class GameLoader {
    //Carga todos los juegos en una Lista Circular Doblemente Enlazada
    public static CircularDoublyLinkedList<Juego> cargarJuegos() {
        CircularDoublyLinkedList<Juego> juegos = new CircularDoublyLinkedList<>();
        juegos.addFirst(new Juego("Apex Lengeds", "Apex Legends is the award-winning, free-to-play Hero Shooter from Respawn Entertainment. Master an ever-growing roster of legendary characters with powerful abilities, and experience strategic squad play and innovative gameplay in the next evolution of Hero Shooter and Battle Royale.", "ACCION", null, "EA Electronics",  "4/11/2020"));
        juegos.addLast(new Juego("Doom Eternal", "Hell’s armies have invaded Earth. Become the Slayer in an epic single-player campaign to conquer demons across dimensions and stop the final destruction of humanity. The only thing they fear... is you", "ACCION", null, "Bethesda Softworks",  "4/03/2020"));
        juegos.addLast(new Juego("COD Warzone 2.0", "Welcome to Warzone™ 2.0, the massive free-to-play combat arena which now features the brand-new map, Al Mazrah.", "ACCION", null, "Activision", "16/11/2022"));
        juegos.addLast(new Juego("FIFA 23", "Experience the excitement of the biggest tournament in football with EA SPORTS™ FIFA 23 and the men’s FIFA World Cup™ update, available on November 9 at no additional cost!","DEPORTES", null, "EA Electronics",  "19/09/2022"));
        juegos.addLast(new Juego("Terraria", "Dig, fight, explore, build! Nothing is impossible in this action-packed adventure game. Four Pack also available!","ACCION", null, "Re-Logic", "16/05/2011"));
        juegos.addLast(new Juego("Stray", "Lost, alone and separated from family, a stray cat must untangle an ancient mystery to escape a long-forgotten cybercity and find their way home.", "INDIE", null, "Annapurna Interactive",  "19/07/2022"));
        juegos.addLast(new Juego("Dead by Daylight", "Dead by Daylight is a multiplayer (4vs1) horror game where one player takes on the role of the savage Killer, and the other four players play as Survivors, trying to escape the Killer and avoid being caught and killed.", "HORROR", null, "Behaviour Interactive Inc.", "14/06/2016"));
        juegos.addLast(new Juego("NBA 2k23", "Rise to the occasion in NBA 2K23. Showcase your talent in MyCAREER. Pair All-Stars with timeless legends in MyTEAM. Build your own dynasty in MyGM, or guide the NBA in a new direction with MyLEAGUE. Take on NBA or WNBA teams in PLAY NOW and feel true-to-life gameplay.","DEPORTES", null, "EA Electronics",  "22/09/2022"));
        juegos.addLast(new Juego("Brawlhalla", "An epic platform fighter for up to 8 players online or local. Try casual free-for-alls, ranked matches, or invite friends to a private room. And it's free! Play cross-platform with millions of players on PlayStation, Xbox, Nintendo Switch, iOS, Android & Steam! Frequent updates. Over fifty Legends.", "MULTIJUGADOR", null, "Ubisoft",  "17/10/2017"));
        cargarReseña(juegos);
        return juegos;
    }
    //Crea todas las resenas en un arraylist
    public static CircularDoublyLinkedList<Juego> cargarReseña(CircularDoublyLinkedList<Juego> juegos) {
        ArrayList<Reseña> c_reseña= new ArrayList<>();
        c_reseña.addFirst(new Reseña("Complejo!", "Apex Legends","El juego requiere de mucha habiliad y comunicacion",3,"Cosme Fulanito","15/8/2022"));
        c_reseña.addLast(new Reseña("Es DOOM, que más se puede decir?", "Doom Eternal","Solo una palabra, yo soy el DOOM GUY!!!",4,"Monty Bolainas","20/10/2022"));
        c_reseña.addLast(new Reseña("Matar demonions, claro que si!", "Doom Eternal","La esencia de Doom no se pierde nunca, y que mejor que esté tan bien optimizado",4,"Bartolomeo J","20/10/2022"));
        c_reseña.addLast(new Reseña("El chat de voz lo es todo", "COD Warzone 2.0","El chat de voz por proximidad es genial, garantizan mucha diversión y le da otro aire a este tipo de juegos",4,"Nelson Muntz","20/10/2022"));
        c_reseña.addLast(new Reseña("Algo más lento que su entrega anterior", "COD Warzone 2.0","El sistema de looteo no me termina de agradar",4,"Pepe Salas","20/10/2022"));
        c_reseña.addLast(new Reseña("Bugs y máß bugs", "FIFA 23","El mismo anticheat no deja jugar el juego, mal ahí EA",4,"Aquiles Alvarez","20/10/2022"));
        c_reseña.addLast(new Reseña("Otro Fifa más", "FIFA 23","Supongo que el FIFA no puede cambiar para EA",4,"Pancho Segura","20/10/2022"));
        c_reseña.addLast(new Reseña("Super bueno y recomendado", "Terraria","Un juego para entretenerse un montón de horas",4,"Perico de los Palotes","20/10/2022"));
        c_reseña.addLast(new Reseña("Ser un gato? Que genial!", "Stray","Un juego fuera de lo común, simplemente épico",4,"Orlando Quiñonez","20/10/2022"));
        c_reseña.addLast(new Reseña("Multijugador entretenido", "Dead by Daylight","La idea de que 4 jugadores cooperen para derrotar a otro es buena",4,"Jeremy Sarmiento","20/10/2022"));
        c_reseña.addLast(new Reseña("El Smash de los pobres", "Brawlhalla","Una autentica alternativa al Smash en PC",4,"Gonzalo Cooper","20/10/2022"));
        c_reseña.addLast(new Reseña("Entretenido con amigos", "Brawlhalla","Personajes balanceados y jugarlos con amigos, lo mejor de lejos",4,"Jose Mora","20/10/2022"));
        asignarResena(juegos,c_reseña);           
        return juegos;
    }
    //asigna las resenas a sus respectivos juegos en la circularlinkedlist
    public static CircularDoublyLinkedList<Juego> asignarResena(CircularDoublyLinkedList<Juego> juegos,  ArrayList<Reseña> resena){
        Node<Juego> actual = juegos.getTail();        
        for (int i= 0 ;i<resena.size();i++){
            for (int j = 0 ;j<juegos.size();j++){
                actual = actual.getNext();
                if(resena.get(i).getNombreJuego().equals(actual.getVal().getTitulo())){
                    actual.getVal().getReseñas().addLast(resena.get(i));
                    j=resena.size();
                }                
            }
        }
        return juegos;        
    }
}
