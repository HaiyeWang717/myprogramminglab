import java.util.Scanner;
public class Invoice{
	private String partNumber, partDescription;
	private int itemQty;
	private double unitPrice,invoiceAmount;

	public Invoice(String partNumber, String partDescription, int itemQty, double unitPrice){
	
		this.partNumber=partNumber;
		this.partDescription=partDescription;
		this.itemQty=itemQty;
		this.unitPrice=unitPrice;
		
	}
	public Invoice(){
		this.partNumber=partNumber;
		this.partDescription=partDescription;
		this.itemQty=itemQty;
		this.unitPrice=unitPrice;
	}
	public void setPartNumber(String partNumber){
		this.partNumber=partNumber;
	}
	public String getPartNumber(){
		return partNumber;
	}
	public void setPartDescription(String partDescription){
		this.partDescription=partDescription;
	}
	public String getPartDescription(){
		return partDescription;
	}
	public void setItemQty(int itemQty){
		if (itemQty>0){
		this.itemQty=itemQty;
		}
		else {
			this.itemQty=0;
		}
	}
	public int getItemQty(){
		return itemQty;
	}
	public void setUnitPrice(double unitPrice){
		if (unitPrice>0){
		this.unitPrice=unitPrice;
		}
		else {
			this.unitPrice=0;
		}
	}
	public double getUnitPrice(){
		return unitPrice;
	}
	public double getInvoiceAmount(){
		invoiceAmount=unitPrice*itemQty;
		return invoiceAmount;
	}
	public void outputResult(){
		System.out.println("Using all the get methods the state of the object is:");
		System.out.printf("The part number: %s%n",partNumber);
		System.out.printf("The part description: %s%n",partDescription);
		System.out.printf("The Quantity of Items: %d%n",itemQty);
		System.out.printf("The Price Per Item with cents in decimals: %.2f%n",unitPrice);
		System.out.printf("Using getInvoiceAmount the Invoice is: %.2f%n%n",itemQty*unitPrice);
	}
		
	
	public static void main(String args[]){
		String newPartNumber, newPartDescription;
		int newItemQty;
		double newUnitPrice;
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Making a new object of class Invoice:");
		Invoice i1=new Invoice();
		System.out.print("Enter the part number:");
		newPartNumber=input.nextLine();
		i1.setPartNumber(newPartNumber);
		System.out.print("Enter the part description:");
		newPartDescription=input.nextLine();
		i1.setPartDescription(newPartDescription);
		System.out.print("Enter the Quantity of Items:");
		newItemQty=input.nextInt();
		i1.setItemQty(newItemQty);
		System.out.print("Enter the Price Per Item with cents in decimals:\n\n");
		newUnitPrice=input.nextDouble();
		i1.setUnitPrice(newUnitPrice);
		
		
		i1.outputResult();
		

		
		System.out.println("Using the setters to mutate the object one step at a time:\n\n");
		
		System.out.println("Enter the new Price Per Item with cents in decimals:");
		newUnitPrice = input.nextDouble();
		i1.setUnitPrice(newUnitPrice);
		i1.outputResult();

		
		System.out.println("Enter the new Quantity of Items:");
		newItemQty = input.nextInt();
		i1.setItemQty(newItemQty);
		i1.outputResult();
		
		

		
		System.out.println("Enter the new part description:");
		newPartDescription=input.next();            \\ don't use nextLine(), that will be get wrong.
		i1.setPartDescription(newPartDescription);
		i1.outputResult();

		
		System.out.println("Enter the new part number:");
		newPartNumber=input.next();
		i1.setPartNumber(newPartNumber);
		i1.outputResult();

		
	}
}
