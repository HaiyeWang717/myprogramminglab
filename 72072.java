import java.util.Scanner;

public class DiamondPrint {
	public static void main(String args[]) {

Scanner input=new Scanner(System.in);
		
		System.out.print("Enter the number of rows of the diamond:");
		int num=input.nextInt();  // input number
		while ((num%2)==0) {// number must a odd
			System.out.print("Enter the number of rows of the diamond:");	
		}
		int count=num;
		for (int i=1;i<=(count+1)/2;i++) {  // first loop nest, print (count+1)/2 lines
			
			for (int a=0;a<=(count-1)/2-i;a++) // print spaces
				System.out.print(" ");
						
			for (int b=1;b<=2*i-1;b++) 
				System.out.print("*");			//print triangle *
				
			for (int a=0;a<=(count-1)/2-i;a++) 
				System.out.print(" ");
			
			System.out.println();
		}
		
		for (int i=1;i<=(count-1)/2;i++) {    // second loop nest, print (count-1)/2 lines
			
			for (int c=0;c<=i-1;c++)
				System.out.print(" ");
			
			for (int b=(count-2*i);b>=1;b--) 
				System.out.print("*");
			
			for (int c=0;c<=i-1;c++)
				System.out.print(" ");
			
				System.out.println();
				
		}
		
	
	}
}
