package interfaceconept;

public class TestRav4 {
	
	public static void main(String[] args) {
		Rav4 r= new Rav4();
		
		
		
		r.start();
		
		r.stop();
		System.out.println(Vehicle.door);
		Vehicle.test();//staic method we call by class name
		Rav4.testDrive();
		r.reverse();
		r.refuel();
		
		
	}

	

}
