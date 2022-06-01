import src.main.java.Counter;

public class Driver {

	public static void main(String[] args) {
		
		Counter count = new Counter();
		
		System.out.println("Count:" + count.getCount());
		
		count.increment();
		
		System.out.println("Count:" + count.getCount());
		
		count.decrement();
		
		System.out.println("Count:" + count.getCount());
		
	}

}
