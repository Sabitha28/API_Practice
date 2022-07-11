package pojo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//@JsonIgnoreProperties(ignoreUnknown = true)
public class Getitems {

	private Itemss Items;
	private List<Locations> Location;
	
	public Itemss getItems() {
		return Items;
	}
	public void setItems(Itemss items) {
		Items = items;
	}
	public List<Locations> getLocation() {
		return Location;
	}
	public void setLocation(List<Locations> location) {
		Location = location;
	}
	
	@Override
	public String toString() {
		return "Getitems [Items=" + Items + ", Location=" + Location + "]";
	}
	
	
}
