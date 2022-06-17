import java.io.*;

	public class Student {
	

		@SuppressWarnings("resource")
		public static void main(String[] args)
			throws IOException
		{
			File file = new File("C:\\Users\\SHESHAIK\\SudentList.txt");
			FileInputStream fileInputStream = new FileInputStream(file);
			InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
			BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
			
		String Student;
		int StudentCount = 0;
		int StudentNameCount = 0;
		
		 while ((Student = bufferedReader.readLine()) != null) {
	            if (Student.equals("")) {
	                StudentCount += 1;
	            }
	            
		 }
		
		 if (StudentNameCount >= 1) {
	            StudentNameCount++;
		 }
	        System.out.println("Total Student Count = "+ StudentCount);
		}
	}
