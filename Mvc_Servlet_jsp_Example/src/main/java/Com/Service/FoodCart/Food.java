package Com.Service.FoodCart;

public class Food {
	private int id;
	private String items;
	private float price;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getItems() {
		return items;
	}

	public void setItems(String items) {
		this.items = items;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Food(int id, String items, float price) {
		super();
		this.id = id;
		this.items = items;
		this.price = price;
	}

}
