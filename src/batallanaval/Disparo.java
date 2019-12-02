/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batallanaval;

/**
 *
 * @author manueltejadaguzman
 */
public class Disparo {
    int cordenadaX;
    int cordenadaY;
    Tablero tableroAtacado;
    public Disparo(int corx, int cory,Tablero tabla){
        cordenadaX=corx;
        cordenadaY=cory;
        tableroAtacado=tabla;
    }
}
