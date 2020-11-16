package Personajes;

import Zombie_Defense.Tablero;

public class Personaje {
    private int x;
    private int y;
    private int vida;
    private int ataque;
    final private boolean es_Defensor;
    private String directorio;
    public Tablero tablero;
    
    public Personaje(int x, int y, boolean es_Defensor, String directorio, Tablero tablero, int vida, int ataque)
    {
        this.es_Defensor = es_Defensor;
        this.x = x;
        this.y = y;
        this.directorio = directorio;
        this.tablero = tablero;
        this.vida = vida;
        this.ataque = ataque;
    }
    
    /////////////////////////////////////////////Setters y getters
    public String getDirectorio()
    {
        return directorio;
    }
    public void setDirectorio(String directorio)
    {
        this.directorio = directorio;
    }
    public boolean esDefensor()
    {
        return es_Defensor;
    }
    public boolean esAtacante()
    {
        return !es_Defensor;
    }
    public void setX(int x)
    {
        this.x = x;
    }
    public void setY(int y)
    {
        this.y = y;
    }
    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }
    
    
      /////////////////////////////////////////////Metodos
    public boolean permitirMover(int posX, int posY)
    {
        return false;
    }
    
    public void mover(int x, int y)
    {
        this.setX(x);
        this.setY(y);
    }
    
}
