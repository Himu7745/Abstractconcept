package abstractconcept;

public abstract class FinalTest {

	public static void main(String[] args) {
		CarB b=new CarB ();
		b.debit();
		b.deposit();
		b.withDraw();
		System.out.println(CarA.total);
		System.out.println(b.amount);
		System.out.println(b.interestrate);
		
		
	}

}
