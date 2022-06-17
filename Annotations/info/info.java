package Info;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


@Documented
@Retention(RetentionPolicy.RUNTIME)
@ interface TestAnnotation
{

	public @interface Testinfo {
	public String developer() default"sheerin";

	public String Developer();

	public String DeveloperID();

	public String Supervisior();

	public String Date();

	public String Time();

	public String Description();
	}
}


public class info
{
	@Testinfo(Developer="sheerin", DeveloperID="07635",Supervisior="sunny",Date="24/02/2022",Time="05:40pm",Description="i am happy")
	void fun1()
	{
		System.out.println("Test method 1");
	}

	@Testinfo(Developer="maahir", DeveloperID="17635",Supervisior="sulthana",Date="23/02/2022",Time="06:40pm",Description="i am soo happy")
	void fun2()
	{
		System.out.println("Test method 2");
	}
	public static void main(String args[])
	{
		System.out.println("Hello");
	}

}
