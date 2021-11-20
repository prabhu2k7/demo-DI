package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class User1 {

	private int id;
	private String firstName;
	private String lastName;
	
	@Autowired
	private User2 user2;
	
	public User1() 
	{
		super();
		System.out.println("user object created!");
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

	public void calluser2() 
	{
		System.out.println("before calling user2");
		user2.callUser2();
	}
}

	
