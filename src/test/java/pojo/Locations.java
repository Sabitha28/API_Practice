package pojo;

public class Locations {
	
	private String state;
	private String zip;
	
	
	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getZip() {
		return zip;
	}


	public void setZip(String zip) {
		this.zip = zip;
	}


	@Override
	public String toString() {
		return "Locations [State=" + state + ", Zip=" + zip + "]";
	}
	
	

}
