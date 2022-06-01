import greenfoot.*;

public class Jugador extends Actor
{
    private String nombre;
    private long totalTime;

    public void act(){
    }

    public Jugador(String nombre,long totalTime){
        this.nombre=nombre;
        this.totalTime=totalTime;
    }

    public Jugador(){

    }

    public String getNombre(){
        return nombre;
    }

    public long getTotalTime(){
        return totalTime;
    }
}
