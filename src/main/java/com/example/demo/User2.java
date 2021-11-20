package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class User2
{
	private int id;
	private String firstName;
	private String lastName;


	public User2() 
	{
	
		System.out.println(" user2 called ");
	}
	
	
	public int getId()
	{
		return id;
	}


	public void setId(int id)
	{
		this.id = id;
	}


	public String getFirstName()
	{
		return firstName;
	}


	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}


	public String getLastName()
	{
		return lastName;
	}


	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}


	public void callUser2()
	{
		System.out.println(" calling user2 ");
	}
}
