package bodyFat;
import java.util.Scanner;
import java.lang.Math;
public class male {
	
	public static void main(String[] args)
	{
		
	Scanner myObj = new Scanner(System.in);
	System.out.println("enter age");
	
	int age = myObj.nextInt();
	System.out.println("acknowledge age:" + age);
	
	Scanner myObj1= new Scanner(System.in);
	System.out.println("enter height");
	
	float height = myObj1.nextFloat();
	System.out.println("aknowlegde height");
	
	Scanner myNeck = new Scanner(System.in);
	System.out.println("enter neck");
	
	float neck1 = myNeck.nextFloat();
	System.out.println("copy");
	
	Scanner myWaist = new Scanner(System.in);
	System.out.println("enter waist");
	
	float waist = myWaist.nextFloat();
	System.out.println("recieved");
	

	
double x = (double) (86.01 * Math.log10(waist - neck1) - 70.041 * Math.log10(height) + 36.76);



	System.out.println(x);	
	}

	}

