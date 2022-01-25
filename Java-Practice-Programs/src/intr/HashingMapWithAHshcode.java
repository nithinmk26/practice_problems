package intr;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashingMapWithAHshcode {
	
	public static void main(String[] args) {
		HashMap<Integer, Laptop> map = new HashMap<>();
		map.put(2, new Laptop(1, "bhxias"));
		map.put(3, new Laptop(2, "sdfgh"));
		map.put(5, new Laptop(3, "rtyuj"));
		map.put(7, new Laptop(4, "Moelnsd"));
		
		Set set = map.keySet();
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			Object key = itr.next();
			System.out.println("  Key  - "+key + " VAlue - "+map.get(key));
		}

		
	}

}

class Laptop{
	private int lapi_id;
	
	private String model_number;

	int getLapi_id() {
		return lapi_id;
	}

	void setLapi_id(int lapi_id) {
		this.lapi_id = lapi_id;
	}

	String getModel_number() {
		return model_number;
	}

	void setModel_number(String model_number) {
		this.model_number = model_number;
	}

	public Laptop(int lapi_id, String model_number) {
		super();
		this.lapi_id = lapi_id;
		this.model_number = model_number;
	}

	public Laptop() {
		super();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		return prime;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		if (lapi_id != other.lapi_id)
			return false;
		if (model_number == null) {
			if (other.model_number != null)
				return false;
		} else if (!model_number.equals(other.model_number))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Laptop [lapi_id=" + lapi_id + ", model_number=" + model_number + "]";
	}
	
	
	
	
}
