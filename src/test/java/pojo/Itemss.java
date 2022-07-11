package pojo;

public class Itemss {
	
	private String ItemCount;
	private String Price;
	
	public String getItemCount() {
		return ItemCount;
	}
	public void setItemCount(String itemCount) {
		ItemCount = itemCount;
	}
	public String getPrice() {
		return Price;
	}
	public void setPrice(String price) {
		Price = price;
	}
	@Override
	public String toString() {
		return "Itemss [ItemCount=" + ItemCount + ", Price=" + Price + "]";
	}
	
	

}
