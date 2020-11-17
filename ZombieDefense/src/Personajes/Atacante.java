package Personajes;

import Zombie_Defense.Tablero;

public class Atacante extends Personaje {
    
    private int drop;    //Numero del 1 al 5, random 
    /* 
    1: Espada      -Arma
    2: Arco        -Arma
    3: Flecha      -Item
    4: Collar      -Item
    5: Abrigo      -Item
    */
    private String item; //Item que dejan al morir

    public Atacante(int x, int y, boolean es_Defensor, String directorio, Tablero tablero, int vida, int ataque, int drop)
    {
        super(x,y,es_Defensor,directorio, tablero, vida, ataque);
        this.drop = 
        
    }
    
    @Override
    public boolean permitirMover(int posX, int posY)
    {
        return false;
    }   
    
    @Override
    public void mover(int x, int y)
    {
        this.setX(x);
        this.setY(y);
    }
    
}
