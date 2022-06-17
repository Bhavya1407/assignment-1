import java.util.*;

interface myInt {
	
	int add(int a, int b);
}
class var5 {
	public static void main(String[] args)
	{
		
		// var cannot be used since they
		// require explicit target type
		var obj = (a, b) -> (a + b);

		// calling add method
		System.out.println(obj.add(2, 3));
	}
}
