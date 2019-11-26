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
public class Jugador {

    String nombre;
    Tablero mitablero;

    public Jugador(String nombre) {
        this.nombre = nombre;
        mitablero = new Tablero();
    }

    public void ubicarBarcos() {
        Scanner sc = new Scanner(System.in);
        boolean insertado = false;
        System.out.println("Debe indicar 10 barcos:");
        do {
            System.out.println("Indica dónde se pondrá el barco de 5 casillas?");
            System.out.println("Cordenada x: ");
            String corx = sc.nextLine();
            System.out.println("Cordenada y: ");
            String cory = sc.nextLine();
            System.out.println("Horizontal o vertical?");
            String HoV = sc.nextLine();
            insertado=mitablero.ubicaBarco(corx, cory, HoV,5);
        } while (!insertado);
        for (int i = 1; i <= 2; i++) {
            do {
                System.out.println("Indica dónde se pondrá el barco "+i+" de 4 casillas?");
                System.out.println("Cordenada x: ");
                String corx = sc.nextLine();
                System.out.println("Cordenada y: ");
                String cory = sc.nextLine();
                System.out.println("Horizontal o vertical?");
                String HoV = sc.nextLine();
                insertado=mitablero.ubicaBarco(corx, cory, HoV,4);
            } while (!insertado);
        }
        for (int i = 1; i <= 3; i++) {
            do {
                System.out.println("Indica dónde se pondrá el barco "+i+" de 3 casillas?");
                System.out.println("Cordenada x: ");
                String corx = sc.nextLine();
                System.out.println("Cordenada y: ");
                String cory = sc.nextLine();
                System.out.println("Horizontal o vertical?");
                String HoV = sc.nextLine();
                insertado=mitablero.ubicaBarco(corx, cory, HoV,3);
            } while (!insertado);
        }
        for (int i = 1; i <= 4; i++) {
            do {
                System.out.println("Indica dónde se pondrá el barco "+i+" de 2 casillas?");
                System.out.println("Cordenada x: ");
                String corx = sc.nextLine();
                System.out.println("Cordenada y: ");
                String cory = sc.nextLine();
                System.out.println("Horizontal o vertical?");
                String HoV = sc.nextLine();
                insertado=mitablero.ubicaBarco(corx, cory, HoV,2);
            } while (!insertado);
        }
    }
    
    public void getTablero(){
        mitablero.verTablero();
    }
}
