package onlineshoppingapp;


public class cart {
	private String product;
	private int quantity;
	private double price;

	//constructor
	public cart()
	{
	     product = ""; 
	     quantity = 0;
	     price = 0.0;
	}
	public String getProduct()
	{
	return product;
	}
	public double getPrice()
	{
	return price;
	}
	public int getQuantity()
	{
	return quantity;
	}
	
	public cart (String inProduct, int inQuant, double inPrice)
	{
		
//	 update cart details
//	
}
}