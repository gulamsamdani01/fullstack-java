package Java.Collections;

import java.util.concurrent.ConcurrentHashMap;

class Products{
	int productId;
	String productName;
	int stock;
	
	public Products(int productId,String productName,int stock) {
		 this.productId = productId;
		 this.productName=productName;
		 this.stock=stock;
	}
	public int getproductId(){
		return productId;
	}
	public String getproductName() {
		return productName;
	}
	public int getstock() {
		return stock;
	}
	public void reducestock() {
		stock--;
	}
	public String toString() {
		return " Product ID :" + productId+
				" Product Name: "+productName+
				" Stock: "+ stock;
	}
}

public class E_Commerce_Inventoray_Managment_System {
	
	public static ConcurrentHashMap<Integer, Products>
		inventory = new ConcurrentHashMap<>();

	public static void main(String[] args) throws InterruptedException {
		
		inventory.put(101,new Products(101,"laptop",20));
		inventory.put(102,new Products(102,"Mobile",12));
		inventory.put(103,new Products(103,"Headphone",15));
		
		Thread Customer1 = new Thread(()->{
			Products product = inventory.get(101);
			product.reducestock();
			
			
			System.out.println("Customer 1 | Purchased Laptop");
		});
		
		Thread Customer2 = new Thread(()->{
			Products product = inventory.get(102);
			product.reducestock();
			
			System.out.println("Customer 2 | Purchased Mobile");
		});
		
		Customer1.start();
		Customer2.start();
		
		Customer1.join();
		Customer1.join();
		
		System.out.println("\n Current Inventory \n");
		
		inventory.forEach((Id,product) ->{
			System.out.println(product);
		});	
		
	}

}
