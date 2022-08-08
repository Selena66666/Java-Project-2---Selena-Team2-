package project2;

public class Items {

	public String Items_name;
	public double Items_l;
	public double Items_w;
	public double Items_h;
	public double Items_weight;
	private int Items_Num;
	
	public Items(String items_name, double items_l, double items_w, double items_h, double items_weight) {
		super();
		Items_name = items_name;
		Items_l = items_l;
		Items_w = items_w;
		Items_h = items_h;
		Items_weight = items_weight;
	}
	
	public String getItems_name() {
		return Items_name;
	}
	public void setItems_name(String items_name) {
		Items_name = items_name;
	}
	public double getItems_l() {
		return Items_l;
	}
	public void setItems_l(int items_l) {
		Items_l = items_l;
	}
	public double getItems_w() {
		return Items_w;
	}
	public void setItems_w(int items_w) {
		Items_w = items_w;
	}
	public double getItems_h() {
		return Items_h;
	}
	public void setItems_h(int items_h) {
		Items_h = items_h;
	}
	public double getItems_weight() {
		return Items_weight;
	}
	public void setItems_weight(double items_weight) {
		Items_weight = items_weight;
	}
	
	public void setNum(int num) {
		this.Items_Num = num;
	}
	
	public double Items_Volume() {
		double Items_Volume =  Items_l *  Items_h *  Items_h;
		return Items_Volume;	
	}
	
	public double Shipments_Volume() {
		double Shipments_Volume =  Items_l *  Items_h *  Items_h * Items_Num;
		return Shipments_Volume;	
	}
	
	public double Shipments_Weight() {
		double Shipments_Weight = Items_weight * Items_Num;
		return Shipments_Weight;
	}	
}
