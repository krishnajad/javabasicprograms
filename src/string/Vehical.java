package string;


public class Vehical {
	private String vehicleName;
	protected String vehicleNumber;
	double vehiclePrice;
	public String vehicleModel;
	//private String vehcleName;
	
	public Vehical(String vn, String vnum, double vp, String vm) {
		
		vehicleName = vn;
		vehicleNumber = vnum;
		vehiclePrice = vp;
		vehicleModel = vm;
	}

	//public void Vehicle(String vn,String vnum,double vp,String vm){
		
	//}

	public static void main(String[] args) {

		Vehical ob = new Vehical("hero","MH 55 ky 1223",11111.00,"akk");
		
		System.out.println("vehicle Name :- "+ob.vehicleName);

		System.out.println("Vehicle number :- "+ob.vehicleNumber);

		System.out.println("Vehicle  Price :- "+ob.vehiclePrice);

		System.out.println("Vehicle Model :- "+ob.vehicleModel);
	}
		
}
	



