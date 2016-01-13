// This will be used to test my Cat and Animal classes.

import com.rhairy.animals.*;

public class Test
{
	public static void main( String [] args )
	{
		Cat myCat = new Cat( 1, true, "Mr. Kat", Cat.CatColor.Calico );

		System.out.printf( "My Cat's name is %s and he is %d years old!\n", myCat.getName(), myCat.getAge() );
	}
}
