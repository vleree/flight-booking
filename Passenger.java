package com.flightbooking;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Passenger {
    
    int numOfPassengers;
    String passengerName;
    String passengerSurname;
    String passengerGender;
    Integer passengerAge;
    Integer[] randomPasswordSaver;
    
    

    public Passenger(String passengerName,String passengerSurname,String passengerGender,Integer passengerAge){
        this.passengerName=passengerName;
        this.passengerSurname = passengerSurname;
        this.passengerAge = passengerAge;
        this.passengerGender = passengerGender;
        Integer[] randomPasswordSaver = new Integer[numOfPassengers];
        Integer[] tempPasword;
   }

   public void addPassenger(){
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter the number of passengers that you want to add: ");
    numOfPassengers = scan.nextInt();
    randomPasswordSaver = new Integer[numOfPassengers];
    for (int i = 1; i <=numOfPassengers; i++) {
        Passenger passenger = new Passenger(passengerName,passengerSurname, passengerGender, passengerAge);
        
        System.out.print("Please enter the " + i + " passenger name: ");
        passengerName = scan.next();
        System.out.print("Please enter passenger surname: ");
        passengerSurname = scan.next();
        System.out.print("Please enter passenger gender with f or m: ");
        passengerGender = scan.next();
        System.out.print("Please enter passenger age: ");
        passengerAge = scan.nextInt();

        
        Random random = new Random();
        int randomNumber = random.nextInt(900)+100;

        randomPasswordSaver[i-1] = randomNumber;

        System.out.println("Your credentials are: " + passengerName +" "+ passengerSurname +" and your TP is "+" "+randomNumber  );


    }
    System.out.println(Arrays.toString(randomPasswordSaver));


    }

    public boolean checkTP(){
        
        
        return false;
    }

}
