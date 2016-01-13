// Cat.java; the subclass of Animal!

package com.rhairy.animals;

public class Cat extends Animal
{
	// Public enums.
	public enum CatColor {
		Black, Brown, Calico, Grey, Orange
	}

	// Private instance variables.
	private CatColor m_color;

	// Constructor.
	public Cat( int age, boolean alive, String name, CatColor color )
	{
		super( age, alive, name );
		this.m_color = color;
	}

	// Public methods.
	public void purr()
	{
		System.out.println( "Purr, Purr, Purr." );
	}
}
