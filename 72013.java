import java.util.Scanner;
public class TrianglePrinting {
	public static void main(String args[]){
				Scanner input=new Scanner(System.in);
			System.out.print("Enter an integer to be a limit of the pattern:");
			int num=input.nextInt();
			int a1=0;
			int a2=num;
			int a3=0;
			int a4=0;
			
			System.out.println("Pattern A:");	//Pattern A
			while (a1<num) {
				for (int i1=0;i1<=a1;i1++) {
					System.out.print("*");
				}
				System.out.println();
				a1++;
			}
			System.out.println();
			
			System.out.println("Pattern B:");
			while (a2>0) {								//Pattern B
				for (int i2=0;i2<a2;i2++){
					System.out.print("*");
				}
				System.out.println();
				a2--;
			}
		System.out.println();
			
			System.out.println("Pattern C:"); //Pattern C
			while (a3<num) {
				for (int b3=0;b3<a3;b3++) 
					System.out.print(" ");
				
				for (int i3=0;i3<num-a3;i3++) 
					System.out.print("*");
							
				System.out.println();
				a3++;
			}
		System.out.println();
			
			System.out.println("Pattern D:"); //Pattern D
			while (a4<num) {
				for (int b4=1;b4<num-a4;b4++) 
					System.out.print(" ");
				
				for (int i4=0;i4<=a4;i4++) 
					System.out.print("*");
							
				System.out.println();
				a4++;
			}
		System.out.println();
			
	}		
}
