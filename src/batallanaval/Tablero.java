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
public class Tablero {
    int[][] tablero;
    public Tablero(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tablero[i][j]=0;
            }
        }
    }
    public boolean ubicaBarco(String corx,String cory,String HoV,int tamano){
        boolean insertado=false;
        int x=Integer.getInteger(corx);
        int y=Integer.getInteger(cory);
        if (HoV=="horizontal") {
            for (int i = y; i < tamano; i++) {
                tablero[x-1][y-1+i]=1;
            }
        }
        else{
            for (int i = x; i < tamano; i++) {
                tablero[x-1+i][y-1]=1;
            }
        }
        return insertado;
    }
    
    public void verTablero(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(" "+tablero[i][j]+" ");
            }
        }
    }
}
