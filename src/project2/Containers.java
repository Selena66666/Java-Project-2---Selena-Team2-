package project2;

public class Containers {

	public String Containers_name;
	public double Containers_l;
	public double Containers_w;
	public double Containers_h;
	private double Containers_Price;
	private int Containers_Num;

	public Containers(String containers_name, double containers_l, double containers_w, double containers_h) {
		super();
		Containers_name = containers_name;
		Containers_l = containers_l;
		Containers_w = containers_w;
		Containers_h = containers_h;
	}

	public String getContainers_name() {
		return Containers_name;
	}
	public void setContainers_name(String containers_name) {
		Containers_name = containers_name;
	}
	public double getContainers_l() {
		return Containers_l;
	}
	public void setContainers_l(double containers_l) {
		Containers_l = containers_l;
	}
	public double getContainers_w() {
		return Containers_w;
	}
	public void setContainers_w(double containers_w) {
		Containers_w = containers_w;
	}

	public double getContainers_h() {
		return Containers_h;
	}
	public void setContainers_h(double containers_h) {
		Containers_h = containers_h;
	}
	
	public int getNum() {
		return this.Containers_Num;
	}
	public double getPrice() {
		return this.Containers_Price;
	}
	public void setPrice(double price) {
		this.Containers_Price = price;
	}
	public void setNum(int num) {
		this.Containers_Num = num;
	}
	
	public double Containers_Volume() {
		double Containers_Volume = Containers_l * Containers_w * Containers_h;
		return Containers_Volume;
	}
	
	public double Containers_Price() {
		double Containers_Volume =  Containers_Price *  Containers_Num;
		return Containers_Volume;
	}
}
