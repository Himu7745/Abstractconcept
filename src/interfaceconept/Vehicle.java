package interfaceconept;

public interface Vehicle {
	
	int door=4;
	
	
public void start()	;//in inter face we can not creat a method body .its is concreat method


public void stop();// we creat a defult method when java 1.8.//and also we creat a static method





public void reverse() ;
	

default void refuel() {
	System.out.println("refuling vehcle");
}

static void test() {
	System.out.println("Testdrive");
}



}
