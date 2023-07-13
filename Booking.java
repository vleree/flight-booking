package com.flightbooking;
import java.util.Scanner;

public class Booking {    
    
    public Booking(){
        
    }

    public void addBooking(){
        Passenger passenger = new Passenger(null, null, null, null);
        passenger.addPassenger();
    }


    public void cancelFlight(){
        String[] flightIds = {"FL001","FL002","FL003","FL004","FL005","FL006"};
        Integer[] randomPasswordSaver;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter flight ID: ");
        int flightId = scanner.nextInt();
        System.out.print("Enter temporary password: ");
        Integer inputPassword = scanner.nextInt();

        
        if (flightIdExists(flightId, flightIds) && (inputPassword == randomPasswordSaver)) {
            System.out.println("Flight " + flightId + " has been cancelled.");
        } else {
            System.out.println("Invalid flight ID or password.");
        }

        scanner.close();
    }

    public boolean flightIdExist(int flightId, String[] flightIds){
        for (String flightId = 0; flightId < flightIds; flightId++) {
            if(flightId == flightIds){
                return true;
            }
        }
        return false;
    }
}