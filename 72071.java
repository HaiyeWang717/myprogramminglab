import java.util.Scanner;  // another method, you can build method for input number and print, then you create new objects to invoke input and print method.



public class BarChart {
	public static void main(String[] args) {
		int a=0;
		int num1=0;  // store input number
		int num2=0;
		int num3=0;
		int num4=0;
		int num5=0;
		
		Scanner input=new Scanner(System.in);
		for (a=0;a<5;a++) {
			System.out.print("Enter an integer(1-30):");
			switch (a) {
				case 0:
					num1=input.nextInt();
					break;
				case 1:
					num2=input.nextInt();
					break;
				case 2:
					num3=input.nextInt();
					break;
				case 3:
					num4=input.nextInt();
					break;
				case 4:
					num5=input.nextInt();
					break;
			} 	
		}   //get input number
		for (a=0;a<5;a++) {
			switch (a) {
			case 0:
				for (int i=0;i<num1;i++)
				System.out.print("*");
				System.out.println();
			break;
			case 1:
				for (int i=0;i<num2;i++)
					System.out.print("*");
					System.out.println();
				break;
			case 2:
				for (int i=0;i<num3;i++)
					System.out.print("*");
					System.out.println();
				break;
			case 3:
				for (int i=0;i<num4;i++)
					System.out.print("*");
					System.out.println();
				break;
			case 4:
				for (int i=0;i<num5;i++)
					System.out.print("*");
				break;
				
			}	
		}
	
	}
}
