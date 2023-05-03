package interfaceconept;

public class Rav4  implements  Vehicle{

	@Override
	public void start() {
	System.out.println("Rav4-start");	
		
	}

	@Override
	public void stop() {
		System.out.println("Rav4-stop");
		
	}
	
	
	
	public static void testDrive() {
		System.out.println("testdrive rav4");
	}

	@Override
	public void reverse() {
		System.out.println("reverse");
		
	}

}
