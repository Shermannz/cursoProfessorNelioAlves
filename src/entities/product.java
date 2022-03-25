package entities;

public class product {
	
	public String name;
	public double price;
	public int quantity;
	
	public double totalValueInStoke() {
        return price * quantity;		
	}
	
    public void addProducts(int quantity) {
    	this.quantity += quantity;
    }
    
    public void removeProducts(int quantity) {
    	this.quantity -= quantity;
    }

    public String toString() {
    	return name
        + ", $ "
        + String.format("%.2f", price) // essa poha faz tipo o printf
        + ", "
        + quantity
        + " units, total: $ "
        + String.format("%.2f", totalValueInStoke());
    }
    
}
