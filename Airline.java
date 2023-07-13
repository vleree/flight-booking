package com.flightbooking;

public class Airline {
    
    String airlineName;
    String[] flightFrom;
    String []flightTo;
    static long[] flightDate;
    int []flightTime;
    static int[] flightId;

    
    public Airline(String airlineName,String[] flightFrom,String[] flightTo,long[] flightDate,int[] flightTime,int[] flightId){
        this.airlineName = airlineName;
        this.flightFrom = flightFrom;
        this.flightTo = flightTo;
        this.flightDate = flightDate;
        this.flightTime = flightTime;
        this.flightId = flightId;
    }
 
}
