package Task2;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;
import java.util.Scanner;

public class Aircraft {
    private int flightNumber;
    private String typeOfAircraft;
    private String directionOfMovement;
    private int frequencyOfDeparture;
    public static ArrayList<Aircraft> planeElement = new ArrayList<Aircraft>();

    public Aircraft(int flightNumber, String typeOfAircraft, String directionOfMovement, int frequencyOfDeparture) {
        setFlightNumber(flightNumber);
        setTypeOfAircraft(typeOfAircraft);
        setDirectionOfMovement(directionOfMovement);
        setFrequencyOfDeparture(frequencyOfDeparture);
    }


    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        if (flightNumber > 0) {
            this.flightNumber = flightNumber;
        } else {
            throw new IllegalArgumentException("Invalid flight number !");
        }
    }

    public String getTypeOfAircraft() {
        return typeOfAircraft;
    }

    public void setTypeOfAircraft(String typeOfAircraft) {
        if (typeOfAircraft.equals("Passenger") || typeOfAircraft.equals("Transport") || typeOfAircraft.equals("Postal")) {
            this.typeOfAircraft = typeOfAircraft;
        } else {
            throw new IllegalArgumentException("Invalid type of aircraft ( can be Passenger, Transport, Postal) !");
        }
    }

    public String getDirectionOfMovement() {
        return directionOfMovement;
    }

    public void setDirectionOfMovement(String directionOfMovement) {
        this.directionOfMovement = directionOfMovement;
    }

    public int getFrequencyOfDeparture() {
        return frequencyOfDeparture;
    }

    public void setFrequencyOfDeparture(int frequencyOfDeparture) {
        if (frequencyOfDeparture > 0) {
            this.frequencyOfDeparture = frequencyOfDeparture;
        } else {
            throw new IllegalArgumentException("Invalid frequency of departure !");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aircraft aircraft = (Aircraft) o;
        return flightNumber == aircraft.flightNumber &&
                frequencyOfDeparture == aircraft.frequencyOfDeparture &&
                Objects.equals(typeOfAircraft, aircraft.typeOfAircraft) &&
                Objects.equals(directionOfMovement, aircraft.directionOfMovement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flightNumber, typeOfAircraft, directionOfMovement, frequencyOfDeparture);
    }

    @Override
    public String toString() {
        return "Aircraft{" +
                "flightNumber=" + flightNumber +
                ", typeOfAircraft='" + typeOfAircraft + '\'' +
                ", directionOfMovement='" + directionOfMovement + '\'' +
                ", frequencyOfDeparture=" + frequencyOfDeparture +
                '}';
    }

    public void addAircraftList(Aircraft element) {
        ArrayList<Aircraft> planes = new ArrayList<Aircraft>();
        planes.add(element);

        planeElement.addAll(planes);

    }

    public void removeAircraftElement(Aircraft element) {
        if (planeElement.size() == 0) {
            System.out.println("Array is empty");
        } else {
            planeElement.remove(element);
        }
    }

    public static void sortElement() {
        if (planeElement.size() == 0) {
            System.out.println("Array is empty");
        } else {

            Comparator<Aircraft> comparator = Comparator.comparing(Aircraft::getFlightNumber);
            planeElement.sort(comparator);

            for (Aircraft plane : planeElement) {
                System.out.println("\n" + plane);

            }
        }
    }

    public static void findElement() {
        Scanner console = new Scanner(System.in);
        String findType = console.next();

        if (planeElement.size() == 0) {
            System.out.println("Array is empty");

        } else if (!(findType.equals("Passenger") || findType.equals("Transport") || findType.equals("Postal"))) {
            throw new IllegalArgumentException("Invalid value !");

        } else {

            for (Aircraft plane : planeElement) {
                if (findType.equals(plane.getTypeOfAircraft())) {
                    System.out.println("\n" + plane);
                }
            }

        }
    }
}