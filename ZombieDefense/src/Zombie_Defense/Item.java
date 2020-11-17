
package Zombie_Defense;
//Clase con los items que se pueden obtener
//Una vez que matan a un atacante
public class Item {
    
    public Tablero tablero;
    private String tipo; 
    /* Los tres tipos de items:
        
        Collar: Aumenta en 1 la vida
        Flecha: Aumenta el ataque en 1
        Abrigo: Aumenta la defensa en 1
        */
    
    private int x;   //Coordenadas
    private int y;
    
    
    //Setters y getters
    public Item(int x, int y, String tipo, Tablero tablero)
    {
        this.x = x;
        this.y = y;
        this.tipo = tipo;
        this.tablero = tablero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
}
