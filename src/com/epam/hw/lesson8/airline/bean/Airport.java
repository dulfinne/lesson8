package com.epam.hw.lesson8.airline.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Airport implements Serializable
{
    private List<Airline> airlines;
    
    public Airport()
    {
    	airlines = new ArrayList<Airline>();
    }
    
    public Airport(ArrayList<Airline> airlines)
    {
    	this.airlines = airlines;
    }

	public List<Airline> getAirlines()
	{
		return airlines;
	}

	public void setAirlines(List<Airline> airlines)
	{
		this.airlines = airlines;
	}

    public void add(Airline airline)
    {
    	airlines.add(airline);
    }
    
    public void delete(Airline airline)
    {
    	airlines.remove(airline);
    }
    
    public List<Airline> byDestination (String destination)
    {
        List<Airline> airlinesByDestination = new ArrayList<>();
        
        for (int i = 0; i < airlinesByDestination.size(); i++) 
        {
            if (destination.equals(airlines.get(i).getDestination()))
            {
            	airlinesByDestination.add(airlines.get(i));
            }
        }
        
        return airlinesByDestination;
    }
    
    public List<Airline> byDay (String day)
    {
        List<Airline> airlinesByDay = new ArrayList<>();
        
        for (int i = 0; i < airlinesByDay.size(); i++) 
        {
        	for(int j = 0; j < airlines.get(j).getDays().length; j++)
        	{
        		if (day.equals(airlines.get(i).getDays()[j]))
        		{
        			airlinesByDay.add(airlines.get(i));
        		}
        	}
        }
        
        return airlinesByDay;
    }
    
    public List<Airline> byTime (int time)
    {
        List<Airline> airlinesByTime = new ArrayList<>();
        
        for (int i = 0; i < airlinesByTime.size(); i++) 
        {
            if (time < airlines.get(i).getTime())
            {
            	airlinesByTime.add(airlines.get(i));
            }
        }
        
        return airlinesByTime;
    }

	@Override
	public int hashCode()
	{
		return Objects.hash(airlines);
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Airport other = (Airport) obj;
		return Objects.equals(airlines, other.airlines);
	}

	@Override
	public String toString()
	{
		return "Airport [airlines=" + airlines + "]";
	}
    
    
}
