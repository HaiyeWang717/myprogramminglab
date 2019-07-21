import java.util.Scanner;
public class SmallestValue {
	public static void main(String args[]){
	Scanner input = new Scanner(System.in);
	int min=Integer.MAX_VALUE,temp;
	System.out.print("Enter the number of integers you are going to enter:");
	int num=input.nextInt();
	for (int i=1;i<=num;i++){
		System.out.print("Enter the "+i+" of "+num+" number:");
		temp=input.nextInt();
		if (i==1) 
			min=temp;

			if (temp<min)
			min=temp;

		
	}
	System.out.println("The lowest number is "+min);
	}
}
