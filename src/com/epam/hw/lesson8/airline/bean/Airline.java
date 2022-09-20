package com.epam.hw.lesson8.airline.bean;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

public class Airline implements Serializable
{
	private static final long serialVersionUID = 1L;

	private String destination;
	private int flightNumber;
	private String type;
	private int time;
	private String[] days;
	
	public Airline() {}
	
	public Airline(String destination, int flightNumber, String type, int time, String[] days)
	{
		this.destination = destination;
		this.flightNumber = flightNumber;
		this.type = type;
		this.time = time;
		this.days = days;
	}

	public String getDestination()
	{
		return destination;
	}

	public void setDestination(String destination)
	{
		this.destination = destination;
	}

	public int getFlightNumber()
	{
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber)
	{
		this.flightNumber = flightNumber;
	}

	public String getType()
	{
		return type;
	}

	public void setType(String type)
	{
		this.type = type;
	}

	public int getTime()
	{
		return time;
	}

	public void setTime(int time)
	{
		this.time = time;
	}

	public String[] getDays()
	{
		return days;
	}

	public void setDays(String[] days)
	{
		this.days = days;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(days);
		result = prime * result + Objects.hash(destination, flightNumber, time, type);
		return result;
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
		Airline other = (Airline) obj;
		return Arrays.equals(days, other.days) && Objects.equals(destination, other.destination)
				&& flightNumber == other.flightNumber && time == other.time && Objects.equals(type, other.type);
	}

	@Override
	public String toString()
	{
		return "Airline [destination=" + destination + ", flightNumber=" + flightNumber + ", type=" + type + ", time="
				+ time + ", days=" + Arrays.toString(days) + "]";
	}
}
