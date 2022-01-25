/**
 * 
 */
package adidas.adidas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 * @author M1056182
 *
 */
public class Utilities {
	
	static ArrayList<String> data = new ArrayList<String>();
	static HashMap<String, String> addressData = new HashMap<String, String>();
	static ArrayList<String> ListOfXpathAddToCart =  new ArrayList<String>();
	static HashMap<String, String> cardData = new HashMap<String, String>();
	
	
	public static String generateEmail() {
		Random rand = new Random();
		StringBuilder sb = new StringBuilder("testing_eguest_adipl_");
		sb.append(String.format("%04d%n", rand.nextInt(10000)));
		sb.append("@yopmail.com");
		data.add(sb.toString());
		
		return sb.toString();
		
	}
	
	static {
		addressData.put("//*[@id=\"shippingAddress-firstName\"]", "Nanda");
		addressData.put("//*[@id=\"shippingAddress-lastName\"]", "Nanda");
		addressData.put("//*[@id=\"shippingAddress-address1\"]", "Poland");
		addressData.put("//*[@id=\"shippingAddress-zipcode\"]", "05-332");
		addressData.put("//*[@id=\"shippingAddress-city\"]", "Warszawa");
		
		
		
		ListOfXpathAddToCart.add("//*[@id=\"app\"]/div/div[1]/div/div/div/div[2]/div[2]/div[2]/section/div[3]/button/span");
		ListOfXpathAddToCart.add("//*[@id=\"modal-root\"]/div/div/div/div[2]/div/section/div[3]/a[1]/span");
		ListOfXpathAddToCart.add("//*[@id=\"app\"]/div/div[1]/div/div/div/div[2]/div/div/main/div[1]/div/div/div[1]/div/div/div[2]/div[2]/div[2]/div/div/button");
		ListOfXpathAddToCart.add("//*[@id=\"app\"]/div/div[1]/div/div/div/div[2]/div/div/main/div[1]/div/div/div[1]/div/div/div[2]/div[2]/div[2]/div/div/div/ul/li[5]/button");
		ListOfXpathAddToCart.add("//*[@id=\"app\"]/div/div[1]/div/div/div/div[2]/div/aside/div[2]/div[1]/div/div[3]/div[1]/button/span");

		cardData.put("//*[@id=\"card-number\"]", "4111111111111111");
		cardData.put("//*[@id=\"name\"]", "Approved");
		cardData.put("//*[@id=\"expiryDate\"]", "0330");
		cardData.put("//*[@id=\"security-number-field\"]", "737");
		
	}

}
