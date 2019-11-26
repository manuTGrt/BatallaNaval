/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batallanaval;

import java.util.Scanner;

/**
 *
 * @author manueltejadaguzman
 */
public class BatallaNaval {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("Nombre del jugador: ");
        String nombre=sc.nextLine();
        Jugador yo=new Jugador(nombre);
        yo.ubicarBarcos();
        yo.getTablero();
    }
    
}
