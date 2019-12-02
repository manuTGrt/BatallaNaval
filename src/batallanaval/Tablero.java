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
    Barco[] barcos;
    int numerobarcos;
    public Tablero(){
        tablero=new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tablero[i][j]=0;
            }
        }
        barcos=new Barco[10];
        numerobarcos=0;
    }
    public boolean ubicaBarco(int x,int y,String HoV,int tamano){
        boolean insertado=false;
        boolean encontrado=false;
        
        if (HoV.equals("horizontal")) {
            if (x-1+tamano<10) {
                for (int i = 0; i < tamano; i++) {
                    tablero[x-1+i][y-1]=1;
                }
                insertado=true;
                numerobarcos++;
                barcos[numerobarcos]=new Barco(x,y,tamano,"horizontal");
            }
        }
        else{
            if (y-1+tamano<10) {
                for (int i = 0; i < tamano; i++) {
                    tablero[x-1][y-1+i]=1;
                }
                insertado=true;
                numerobarcos++;
                barcos[numerobarcos]=new Barco(x,y,tamano,"vertical");
            }
        }
        verTablero();
        System.out.println("");
        return insertado;
    }
    
    public void verTablero(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(tablero[j][i]+" ");
            }
            System.out.println("");
        }
    }
    public int getNumBarcos(){
        return numerobarcos;
    }
}
