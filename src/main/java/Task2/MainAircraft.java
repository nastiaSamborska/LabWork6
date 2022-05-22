package Task2;

import java.util.ArrayList;
import java.util.Scanner;

public class MainAircraft {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);


        Aircraft aircraft = new Aircraft(1, "Passenger", "AAA-BBB", 2);
        aircraft.addAircraftList(aircraft);
        Aircraft aircraft1 = new Aircraft(5, "Postal", "CC-DD", 3);
        aircraft.addAircraftList(aircraft1);
        Aircraft aircraft2 = new Aircraft(2, "Transport", "XX-MM", 3);
        aircraft2.addAircraftList(aircraft2);
        Aircraft aircraft3 = new Aircraft(8, "Postal", "TT-YY", 5);
        aircraft3.addAircraftList(aircraft3);
        Aircraft aircraft4 = new Aircraft(10, "Passenger", "WW-BBB", 6);
        aircraft4.addAircraftList(aircraft4);
        Aircraft aircraft5 = new Aircraft(7, "Transport", "HH-FF", 2);
        aircraft5.addAircraftList(aircraft5);


        aircraft1.removeAircraftElement(aircraft1);


        while (true){
            System.out.println("\n" +"Input 1 to find type of aircraft");
            System.out.println("Input 2 to sort");
            System.out.println("Input 0 to exit");
            int task = console.nextInt();

            if (task == 1){
                Aircraft.findElement();

            } else if (task == 2){
                Aircraft.sortElement();

            } else if (task == 0){
                break;
            }
        }

    }
}