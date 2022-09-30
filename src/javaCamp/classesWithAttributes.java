package javaCamp;

public class classesWithAttributes {

	public static void main(String[] args) {
		Product product = new Product();
		product.setName("laptop");
		product.setId(1);
		product.setDescription("Apple");
		product.setPrice(5000);
		product.setStockAmount(3);
		
		ProductManager productManger = new ProductManager();
		productManger.Add(product);
		
		
	}

}
