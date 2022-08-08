package project2;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[3];
		for(int i = 0; i < 3; i++) {
			num[i] = Integer.parseInt(args[i]);
		}
		
		Items Laptop = new Items("Laptop", 0.6, 0.5, 0.5, 6.5);
		Items Mouse = new Items("Mouse", 0.3, 0.3, 0.2, 0.2);
		Items Desktop = new Items("Desktop", 1.0, 1.5, 0.5, 20);
		Laptop.setNum(num[0]);
		Mouse.setNum(num[1]);
		Desktop.setNum(num[2]);
		
		Containers Small = new Containers("Small", 2.59, 2.43, 6.06);
		Containers Big = new Containers("Big", 2.59, 2.43, 12.01);
		Big.setPrice(1800);
		int big_price = Big.getNum();
		
		double totalVolume_Shipment;
		totalVolume_Shipment =  Laptop.Shipments_Volume() + Mouse.Shipments_Volume() + Desktop.Shipments_Volume();
		System.out.println("total volume of Shipment: " +totalVolume_Shipment + " m^3");

	    double totalWeight_Shipment; 
	    totalWeight_Shipment = Laptop.Shipments_Weight() +  Mouse.Shipments_Weight() + Desktop.Shipments_Weight();
	    System.out.println("total weight of Shipment: "+totalWeight_Shipment + " kg");
	    
	    if(totalWeight_Shipment > 500)
	    {
	    	Small.setPrice(1200);
	    }else {
	    	Small.setPrice(1000);
	    }
	    int small_price = Small.getNum();
	    
	    double Totalvolume1 = totalVolume_Shipment; 
		double Totalvolume2 = Totalvolume1;
		double SC = Small.Containers_Volume();
		double BC = Big.Containers_Volume();
		  
		  int x = 0; //number of BC
		  int y = 0;
		  
		  while (Totalvolume1 >= 0)
		  {
		   Totalvolume1 = Totalvolume1 - BC;
		   x++;
		  }
		  
		  Totalvolume2 -= SC;
		  while(Totalvolume2 >=0)
		  {
		   Totalvolume2 -= BC;
		   y++;
		  }
		  
		  double cost1 = big_price * x;
		  double cost2 = small_price + big_price * y;
		  
		//  Compare
		  if (cost1<=cost2)
		  {
		   System.out.println("We need "+ x +" Big Containers");
		  }
		  else
		  {
		   System.out.println("We need "+ y + " Big Containers and 1 Small Container");
		  }

	}	
	}


