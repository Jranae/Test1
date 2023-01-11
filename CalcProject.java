import java.util.Scanner;
public class CalcProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	double a,b,res=0;
		
		char choice, ch;
		
		Scanner scan = new Scanner(System.in);
		
		do
		{
		// Prepare the menu for user
		System.out.println("\n\nMain Menu: \n1.Addition\n2.Subtraction"
				+ "\n3.Multiplication\n4.Division\n5.Absolute\n6.Maximum\n7.SquareRoot\n8.Round\n9.Floor\nc.Tangent\nd.Sin\ne.CubeRoot\nf.Asin\ng.Minimum\nh.Logarithm\ni.Cosine\nj.ArkCosine\nk.ArkTangent\nl.Degrees\nq.Exit\n");
		
		System.out.println("Enter your choice: ");
		
		choice =scan.next().charAt(0);
		
		switch(choice) {
		
		case '1': 
			System.out.println("Enter two numbers: ");
			a = scan.nextDouble();
			b= scan.nextDouble();
			
			res =a+b;
			System.out.println("Result: "+ res);
		    break;
		case '2':
			System.out.println("Enter two numbers: ");
			a = scan.nextDouble();
			b= scan.nextDouble();
			res =a-b;
			System.out.println("Result: "+ res);
			break;
		case '3':
			System.out.println("Enter two numbers: ");
			a = scan.nextDouble();
			b= scan.nextDouble();			
			res =a*b;
			System.out.println("Result: "+ res);
			break;
		case '4':
			System.out.println("Enter two numbers: ");
			a = scan.nextDouble();
			b= scan.nextDouble();			
			res =a/b;
			System.out.println("Result: "+ res);
			break;
		case '5': 
			System.out.println("Enter one numbers: ");
			a = scan.nextDouble();
			res = Math.abs(a);
			System.out.println("Result: "+ res);
		    break;
		case '6': 
			System.out.println("Enter two numbers: ");
			a = scan.nextDouble();
			b= scan.nextDouble();
			
			res =Math.max(a, b);
			System.out.println("Result: "+ res);
		    break;
		case '7': 
			System.out.println("Enter one numbers: ");
			a = scan.nextDouble();
			res =Math.sqrt(a);
			System.out.println("Result: "+ res);
		    break;
		case '8': 
			System.out.println("Enter one numbers: ");
			a = scan.nextDouble();
			res =Math.round(a);
			System.out.println("Result: "+ res);
		    break;
		case '9': 
			System.out.println("Enter one numbers: ");
			a = scan.nextDouble();
			res =Math.floor(a);
			System.out.println("Result: "+ res);
		    break;
		case 'c': 
			System.out.println("Enter one numbers: ");
			a = scan.nextDouble();
			res =Math.tan(a);
			System.out.println("Result: "+ res);
		    break;
		case 'd': 
			System.out.println("Enter one numbers: ");
			a = scan.nextDouble();
			res =Math.sin(a);
			System.out.println("Result: "+ res);
		    break;
		case 'e': 
			System.out.println("Enter one numbers: ");
			a = scan.nextDouble();
			res =Math.cbrt(a);
			System.out.println("Result: "+ res);
		    break;
		case 'f': 
			System.out.println("Enter one numbers: ");
			a = scan.nextDouble();
			b = Math.toRadians(a);
			res =Math.asin(b);
			System.out.println("Result: "+ res);
		    break;
		case 'g': 
			System.out.println("Enter two numbers: ");
			a = scan.nextDouble();
			b = scan.nextDouble();
			res = Math.min(a,b);
			System.out.println("Result: "+ res);
		    break;
		case 'h': 
			System.out.println("Enter one numbers: ");
			a = scan.nextDouble();
			res =Math.log(a);
			System.out.println("Result: "+ res);
		    break;
		case 'i': 
			System.out.println("Enter one numbers: ");
			a = scan.nextDouble();
			res =Math.cos(a);
			System.out.println("Result: "+ res);
		    break;
		case 'j': 
			System.out.println("Enter one numbers: ");
			a = scan.nextDouble();
			b = Math.toRadians(a);
			res =Math.acos(b);
			System.out.println("Result: "+ res);
		    break;
		case 'k': 
			System.out.println("Enter one numbers: ");
			a = scan.nextDouble();
			res =Math.atan(a);
			System.out.println("Result: "+ res);
		    break;
		case 'l': 
			System.out.println("Enter one numbers: ");
			a = scan.nextDouble();
			res =Math.toDegrees(a);
			System.out.println("Result: "+ res);
		    break;
		case 'q':
			System.exit(0);
			break;
			
		default:
			System.out.println("The choice is not present in main menu");
			break;
		
		}	
		}
		while(choice!='q');		
		
	}

}
