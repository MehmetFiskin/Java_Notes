package day01_variables;

public class Vehicle {

    int no_of_seats;
    int no_of_wheels;

    public Vehicle(int no_of_seats, int no_of_wheels) {

        this.no_of_seats = no_of_seats;
        this.no_of_wheels = no_of_wheels;

    }
    public static void main(String[] args) {

        Vehicle motorcycle = new Vehicle(1, 2);
        Vehicle car = new Vehicle(4, 4);

        System.out.println("Number of seats for Car: " + car.no_of_seats);
        System.out.println("Number of wheels for Car: " + car.no_of_wheels);
        System.out.println("Number of wheels for Motorcycle: " + motorcycle.no_of_wheels);
        System.out.println("Number of seats for Motorcycle: " + motorcycle.no_of_seats);


    }
}