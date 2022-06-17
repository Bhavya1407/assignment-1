import java.util.*;
import java.util.function.Predicate;

class predicate {
	public static void main(String args[])
	{

		
		List<String> names = Arrays.asList(
			"sheerin", "sunny", "maahir", "sulthana", "honey");


		Predicate<String> p = (s) -> s.startsWith("s");

	
		for (String st : names) {
			
			if (p.test(st))
				System.out.println(st);
		}
	}
}
