package main;

import java.util.Scanner;

/**
 * Hello world!
 *
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
                //sc.nextLine();

            switch(i) {
                case 1:
                    System.out.println("Auto: " + car.getBrand() + " " + car.getModel() + ", Nopeus: " + car.getSpeed() + " km/h");
                    break;
                case 2:
                    System.out.println( "Anna uusi auton merkki: " );
                    car.setBrand(sc.nextLine());
                    System.out.println( "Anna uusi auton malli: " );
                    car.setModel(sc.nextLine());
                    break;
                case 3:
                    System.out.println("Kuinka monta km/h haluat kiihdyttää? ");
                    car.carAccelerate(sc.nextInt());
                    sc.nextLine();
                    break;
                case 4:
                    System.out.println("Kuinka monta km/h haluat hidastaa? ");
                    car.carBrake(sc.nextInt());
                    sc.nextLine();
                    break;
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
