package customerview;

import customermodel.Customer;
import customermodel.Product;

public class Main {
	int getcustomerIdFromCustomer(Customer custObj) {
		String custName = custObj.getCustomerName();
		System.out.println("Customer Name : " + custName);
		return(custObj.getCustomerId());
	}
	

	
	String getproductNameFromProduct(Product proObj) {
		return(proObj.getProductName());
	}
	
	
    int getPriceFromProduct(Product proObj) {
    	return(2*proObj.getPrice());
    }

	public static void main(String args[]) {
    	Main mainObj = new Main();

		Customer customer1 = new Customer(1,"Anu");
		int custId = mainObj.getcustomerIdFromCustomer(customer1); 
		System.out.println("Customer Id : "+custId);
		
		
		
		Product product1 = new Product(2, "Rice", 100);
		String proName = mainObj.getproductNameFromProduct(product1);
		System.out.println("Product Name : " + proName);
		
		
		int proPrice = mainObj.getPriceFromProduct(product1);
		System.out.println("Product Price : " + proPrice);
		
}
}
