import java.util.Scanner;

public class Menu {
	private static Scanner sc;
	private static int c;

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Menu");
		System.out.println("1.Insert new price");
		System.out.println("2.View purchase total");
		System.out.println("3.Exit");
		
		
		System.out.println("select your option: ");
		int ch = scanner.nextInt();
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		
		switch(ch) {
		
		case 1:
			
			sc.nextLine();
			System.out.println("choose the first choice");
			sc.nextLine();
			System.out.println("insert the first price");
			sc.nextLine();
	             a=100;
	             sc.nextLine();
			System.out.println("price has been saved to file");
			sc.nextLine();
			System.out.println("do you want to enter price for more items?(yes/no)");
			sc.nextLine();
			System.out.println("yes");
			sc.nextLine();
			System.out.println("insert second price");
			sc.nextLine();
              b=200;
              sc.nextLine();
			System.out.println("do you want to enter price for more items?(yes/no)");
			sc.nextLine();
			System.out.println("no");
			break;
		case 2:
			sc.nextLine(); 
			System.out.println("choose the second choice");
			sc.nextLine();
			c = a + b;
			sc.nextLine();
			System.out.println("total of price of all items:"+c+"\n");
			break;
		case 3:
			sc.nextLine();
			System.out.println("choose the third choice");
			sc.nextLine();
			System.out.println("exit program........");
			break;
			
		
		
			
			
		}
	}

}
