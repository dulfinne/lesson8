package com.epam.hw.lesson8.airline.main;

import java.util.List;

import com.epam.hw.lesson8.airline.bean.Airline;
import com.epam.hw.lesson8.airline.bean.Airport;

public class Main
{
	public static void main(String[] args)
	{
		Airport airport = new Airport();
		
		Airline line1 = new Airline("Москва", 1994, "пассажирский", 1200, new String[]{"пн","пт","вс"});
		Airline line2 = new Airline("СПБ", 1234, "пассажирский", 2150, new String[]{"пт","сб","вс"});
		Airline line3 = new Airline("Минск", 1214, "пассажирский", 1738, new String[]{"пн","ср","вс"});
		Airline line4 = new Airline("Москва", 1943, "пассажирский", 620, new String[]{"вт","чт","сб"});
		
		airport.add(line1);
		airport.add(line2);
		airport.add(line3);
		airport.add(line4);

		printAsTable(airport.getAirlines());
		
		printAsTable(airport.byDestination("Москва"));
		
		printAsTable(airport.byDay("пн"));
		
		printAsTable(airport.byTime(1300));

	}
	
	public static void printAsTable(List<Airline> airlines)
	{
		for(int i = 0; i < airlines.size(); i++)
		{
			System.out.printf("%10s\t|\t%d\t|\t%s\t|\t%4d\t|", airlines.get(i).getDestination(), airlines.get(i).getFlightNumber(),
					airlines.get(i).getType(), airlines.get(i).getTime());
			
			for(int j = 0; j < airlines.get(j).getDays().length; j++)
        	{
        		System.out.print(airlines.get(i).getDays()[j] + " ");
        	}
    		System.out.println();
		}
		
		System.out.println();
	}
}
