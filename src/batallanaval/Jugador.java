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
        int x=0;
        int y=0;
        System.out.println("Debe indicar 10 barcos:");
        do {
            System.out.println("Indica dónde se pondrá el barco de 5 casillas?");
            System.out.println("Cordenada x: ");
            x = sc.nextInt();
            System.out.println("Cordenada y: ");
            y = sc.nextInt();
            System.out.println("Horizontal o vertical?");
            sc.nextLine();
            String HoV = sc.nextLine();
            insertado = mitablero.ubicaBarco(x, y, HoV, 5);
            if (!insertado) {
                System.out.println("El barco no cabe, insertelo de nuevo.");
            }
        } while (!insertado);
        for (int i = 1; i <= 2; i++) {
            do {
                System.out.println("Indica dónde se pondrá el barco " + i + " de 4 casillas?");
                System.out.println("Cordenada x: ");
                x = sc.nextInt();
                System.out.println("Cordenada y: ");
                y = sc.nextInt();
                System.out.println("Horizontal o vertical?");
                sc.nextLine();
                String HoV = sc.nextLine();
                insertado = mitablero.ubicaBarco(x, y, HoV, 4);
                if (!insertado) {
                    System.out.println("El barco no cabe, insertelo de nuevo.");
                }
            } while (!insertado);
        }
        for (int i = 1; i <= 3; i++) {
            do {
                System.out.println("Indica dónde se pondrá el barco " + i + " de 3 casillas?");
                System.out.println("Cordenada x: ");
                x = sc.nextInt();
                System.out.println("Cordenada y: ");
                y = sc.nextInt();
                System.out.println("Horizontal o vertical?");
                String HoV = sc.nextLine();
                insertado = mitablero.ubicaBarco(x, y, HoV, 3);
                if (!insertado) {
                    System.out.println("El barco no cabe, insertelo de nuevo.");
                }
            } while (!insertado);
        }
        for (int i = 1; i <= 4; i++) {
            do {
                System.out.println("Indica dónde se pondrá el barco " + i + " de 2 casillas?");
                System.out.println("Cordenada x: ");
                x = sc.nextInt();
                System.out.println("Cordenada y: ");
                y = sc.nextInt();
                System.out.println("Horizontal o vertical?");
                String HoV = sc.nextLine();
                insertado = mitablero.ubicaBarco(x, y, HoV, 2);
                if (!insertado) {
                    System.out.println("El barco no cabe, insertelo de nuevo.");
                }
            } while (!insertado);
        }
    }

    public void getTablero() {
        mitablero.verTablero();
        int n=mitablero.getNumBarcos();
        System.out.println("numero de barcos: "+n);
    }
}
