import java.util.Collection;
import java.util.function.*;

//import sun.security.util.Length;
class predicates
{

	public static void main(String[] args)

	{
		//THIS LOGIC IS GRATER THAN 10 OR NOT FOR PREDICTES
		
//Predicate<Integer> p=I->(  I > 10);
//System.out.println(p.test(100));
//System.out.println(p.test(9));

	
		// THIS PROGRAM LOGIC IS STRING ARE GRETER THAN 3 OR NOT
		
/*	Predicate<String> p= s-> (s.length() > 3);
	System.out.println(p.test("hello"));
	System.out.println(p.test("sam"));*/
	
	//Predicate<Collection> p =c-> c.isEmpty();
	
		
		Function<String, Integer> f=s->s.length();
		System.out.println(f.apply("sandip"));
		System.out.println(f.apply("lanke"));
	}

}


