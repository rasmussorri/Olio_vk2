package main;

import java.util.Scanner;

/*
 * Name of program: Car
 * Name of file: App.java
 * Maker: Rasmus Sorri
 * This program is a simple car simulator. It asks for the brand and model of the car and then lets the user accelerate or brake the car.
 * Last modified: 2025-01-18
 * Written with Visual Studio Code
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        Car car = new Car();
        System.out.print( "Anna auton merkki: " );
        car.setBrand(sc.nextLine());
        System.out.print( "Anna auton malli: " );
        car.setModel(sc.nextLine());

        Boolean exit = false;
        while(!exit) {
            System.out.println("1) Näytä auton tila\n2) Muokkaa auton merkkiä ja mallia\n3) Kiihdytä autoa\n4) Hidasta autoa\n0) Lopeta ohjelma");

            if(sc.hasNext()) {
                int i = 0;
                i = Integer.parseInt(sc.nextLine());

            switch(i) {
                case 1:
                    car.status();
                    break;
                case 2:
                    System.out.println( "Anna uusi auton merkki: " );
                    car.setBrand(sc.nextLine());
                    System.out.println( "Anna uusi auton malli: " );
                    car.setModel(sc.nextLine());
                    break;
                case 3:
                    System.out.println("Kuinka monta km/h haluat kiihdyttää? ");
                    int speed = sc.nextInt();
                    if (speed >= 0) {
                        car.carAccelerate(speed);
                        sc.nextLine();
                        break;
                    } else {
                        System.out.println("Nopeuden täytyy olla positiivinen luku.");
                        sc.nextLine();
                        break;
                    }
                case 4:
                    System.out.println("Kuinka monta km/h haluat hidastaa? ");
                    int brake = sc.nextInt();
                    if (brake >= 0) {
                        car.carBrake(brake);
                        sc.nextLine();
                        break;
                    } else {
                        System.out.println("Nopeuden täytyy olla positiivinen luku.");
                        sc.nextLine();
                        break;
                    }
                case 0:
                    System.out.println("Kiitos ohjelman käytöstä.");
                    exit = true;
                    break;
                default:
                    System.out.println("Virheellinen valinta");
                    break;
                }
            } else {
                System.out.println("Virheellinen valinta. Syötä numero 1-5.");
                sc.next();
            }
        }
    sc.close();    
    }
}
