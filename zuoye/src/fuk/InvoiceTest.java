package fuk;
import java.util.Scanner;
public class InvoiceTest {

	    public static void main (String [] args) {
	 
	 Invoice invoice = new Invoice (" ", " ", 0, 0.0);
	 
	 Scanner input = new Scanner (System.in);
	         
	        String item;
	        String qaq;
	        int quantity;
	        double price;
	         
	        System.out.print ("Making a new object of class Invoice:\nEnter the part number:");
	        item = input.nextLine();
	        invoice.setPartNumber(item);
	         
	        System.out.print ("Enter the part description:");
	        qaq = input.nextLine();
	        invoice.setPartDescription(qaq);
	         
	        System.out.print ("Enter the Quantity of Items:");
	        quantity = input.nextInt();
	        if (quantity > 0)
			{invoice.setQuantityOfItemPurchased(quantity);}
		   else{quantity=0;}
	         
	        System.out.print ("Enter the Price Per Item with cents in decimals:");
	        price = input.nextDouble();
	        if (price > 0)
			{invoice.setPricePerItem (price);}
		   else{price=0.0;}
	       
	        System.out.println();
	        System.out.println();
	        System.out.printf("Using all the get methods the state of the object is:\nThe part number:%s\n",invoice.getPartNumber());
	        System.out.printf("The part description: %s\n",invoice.getPartDescription());
	        System.out.printf("The Quantity of Items: %d\n",invoice. getQuantityOfItemPurchased());
	        System.out.printf("The Price Per Item with cents in decimals: %.2f\n",invoice.getPricePerItem());
	        System.out.printf ("Using getInvoiceAmount the Invoice is: %.2f\n",invoice.getInvoiceAmount());
	        System.out.println();

	        
	        System.out.println("Using the setters to mutate the object one step at a time:");
	        System.out.println();
	        System.out.println();
	        System.out.print ("Enter the new Price Per Item with cents in decimals: ");
	        price = input.nextDouble();
	        if (price > 0)
			{invoice.setPricePerItem (price);}
		   if (price<0){invoice.setPricePerItem (0.0);}
	        System.out.println();
	        System.out.printf("Using all the get methods the state of the object is:\nThe part number:%s\n",invoice.getPartNumber());
	        System.out.printf("The part description: %s\n",invoice.getPartDescription());
	        System.out.printf("The Quantity of Items: %d\n",invoice. getQuantityOfItemPurchased());
	        System.out.printf("The Price Per Item with cents in decimals: %.2f\n",invoice.getPricePerItem());
	        System.out.printf ("Using getInvoiceAmount the Invoice is: %.2f\n",invoice.getInvoiceAmount());
	        
	        System.out.println();
	        System.out.print ("Enter the new Quantity of Items:");
	        quantity = input.nextInt();
	        if (quantity > 0)
	        invoice.setQuantityOfItemPurchased(quantity);
	        System.out.println();
	        System.out.printf("Using all the get methods the state of the object is:\nThe part number:%s\n",invoice.getPartNumber());
	        System.out.printf("The part description: %s\n",invoice.getPartDescription());
	        System.out.printf("The Quantity of Items: %d\n",invoice. getQuantityOfItemPurchased());
	        System.out.printf("The Price Per Item with cents in decimals: %.2f\n",invoice.getPricePerItem());
	        System.out.printf ("Using getInvoiceAmount the Invoice is: %.2f\n",invoice.getInvoiceAmount());
	        
	        System.out.println();
	        System.out.print ("Enter the new part description:");
	        qaq  = input.nextLine();
	        invoice.setPartDescription(qaq);
	        System.out.println();
	        System.out.println();
	        System.out.printf("Using all the get methods the state of the object is:\nThe part description:%s\n",invoice.getPartNumber());
	        System.out.printf("The part description: %s\n",invoice.getPartDescription());
	        System.out.printf("The Quantity of Items: %d\n",invoice. getQuantityOfItemPurchased());
	        System.out.printf("The Price Per Item with cents in decimals: %.2f\n",invoice.getPricePerItem());
	        System.out.printf ("Using getInvoiceAmount the Invoice is: %.2f\n",invoice.getInvoiceAmount());
	        
	        System.out.println();
	        System.out.print ("Enter the new part number:");
	        item = input.nextLine();
	        invoice.setPartNumber(item);
	        System.out.println();
	        System.out.printf("Using all the get methods the state of the object is:\nThe part number:%s\n",invoice.getPartNumber());
	        System.out.printf("The part description: %s\n",invoice.getPartDescription());
	        System.out.printf("The Quantity of Items: %d\n",invoice. getQuantityOfItemPurchased());
	        System.out.printf("The Price Per Item with cents in decimals: %.2f\n",invoice.getPricePerItem());
	        System.out.printf ("Using getInvoiceAmount the Invoice is: %.2f\n",invoice.getInvoiceAmount());
	    }
	}
