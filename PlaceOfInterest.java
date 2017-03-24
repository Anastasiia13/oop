public class PlaceOfInterest {

	public string place_name;
	public string category_name;
	public string address;
	public string info;
	public boolean free_exit;

	public string getPlace_name() {
		return this.place_name;
	}

	public void setPlace_name(string place_name) {
		this.place_name = place_name;
	}

	public string getAddress() {
		return this.address;
	}

	public void setAddress(string address) {
		this.address = address;
	}

	public string getInfo() {
		return this.info;
	}

	public void setInfo(string info) {
		this.info = info;
	}

	public void view_place_on_map() {
		// TODO - implement PlaceOfInterest.view_place_on_map
		throw new UnsupportedOperationException();
	}

}