/**
 * 
 */

/**
 * @author M1056182
 *
 */
public class OrderList {
	
	private int productId;
	
	private int quantity;
	
	private int productPriceInPoints;

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getProductPriceInPoints() {
		return productPriceInPoints;
	}

	public void setProductPriceInPoints(int productPriceInPoints) {
		this.productPriceInPoints = productPriceInPoints;
	}

	/**
	 * @param productId
	 * @param quantity
	 * @param productPriceInPoints
	 */
	public OrderList(int productId, int quantity, int productPriceInPoints) {
		super();
		this.productId = productId;
		this.quantity = quantity;
		this.productPriceInPoints = productPriceInPoints;
	}

	/**
	 * 
	 */
	public OrderList() {
		super();
	}
	
	

}
