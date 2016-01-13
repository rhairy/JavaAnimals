// Animal.java; the base animal class!

package com.rhairy.animals;

public class Animal
{
	// Private instance variables.
	private int m_age;
	private boolean m_alive;
	private String m_name;

	// Constructor.
	Animal( int age, boolean alive, String name )
	{
		this.m_age = age;
		this.m_alive = alive;
		this.m_name = name;
	}

	// Public accessor methods.
	public int getAge()
	{
		return this.m_age;
	}

	public boolean isAlive()
	{
		return this.m_alive;
	}

	public String getName()
	{
		return this.m_name;
	}
}
