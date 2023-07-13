package com.flightbooking;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to our ticket booking system!");
        System.out.println("**********************************************");
        System.out.println("Stating that number 1 is for booking a flight,\n"+
        "Number 2 is for canceling a flight and\n"+
        "Number 3 is for exit,");
        System.out.println("Please enter the number of what you want to do: ");
        int select = scan.nextInt();

        Booking booking = new Booking();
        switch(select){
            case 1:
                booking.addBooking();
                break;
            case 2:
                //cancel
                break;
            case 3:
                //exit
                System.out.println("Thank you!");
                break;
            
        }
    }
}
