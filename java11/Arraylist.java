import java.util.ArrayList;
import java.util.List;

public class arraylisttoarray {
	
	public static void main(String args[])
	{
		List<String> List = new ArrayList<>();
		List.add("A");
		List.add("Quick");
		List.add("brown");
		List.add("fox");
		List.add("jumps");
		List.add("over");
		List.add("the");
		List.add("lazy");
		List.add("dog");
		
		String[] array = List.toArray(new String[0]);
		
		for (String s: array) {
			System.out.println(s);
		}
	}

}
