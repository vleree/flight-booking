package com.flightbooking;

import java.util.Scanner;

public class Flights{
    private String departureCity;
    private String arrivalCity;
    private String dateAndTime;
    private String flightId;

    public Flights(String departureCity, String arrivalCity, String dateAndTime, String flightId) {
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
        this.dateAndTime = dateAndTime;
        this.flightId = flightId;


    }

    public String getDepartureCity() {
        return departureCity;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    public String getDateAndTime() {
        return dateAndTime;
    }

    public String getFlightId() {
        return flightId;
    }


    public void addFlight(){
        Flights[] flights = {
            new Flights("Copenhagen", "Tirana", "2023-03-25 10:00", "FL001"),
            new Flights("Tirana", "Copenhagen", "2023-03-26 14:00", "FL002"),
            new Flights("Copenhagen", "Paris", "2023-03-27 11:00", "FL003"),
            new Flights("Paris", "Copenhagen", "2023-03-28 15:00", "FL004"),
            new Flights("Pristina", "Istanbul", "2023-03-30 09:00", "FL005"),
            new Flights("Istanbul", "Pristina", "2023-03-31 21:00", "FL006")
        };
        
        // Display the flight options to the user
        System.out.println("Please choose a flight option from the list below:");
        for (int i = 0; i < flights.length; i++) {
            System.out.println((i+1) + ". " + flights[i].getDepartureCity() + " to " + flights[i].getArrivalCity());
        }
        
        // Read the user's input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your choice: ");
        int choice = scanner.nextInt();
        
        // Display the details of the chosen flight
        Flights flight = flights[choice - 1];
        System.out.println("Flight ID: " + flight.getFlightId());
        System.out.println("From: " + flight.getDepartureCity());
        System.out.println("To: " + flight.getArrivalCity());
        System.out.println("Date and Time: " + flight.getDateAndTime());
    }

    public boolean flightIdExists(Flights flights){
        
        return false;
        
    }

}
