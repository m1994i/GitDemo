package testng;

	public class PS2 extends PS3 {
		int a;
		
		//default constructor
	public PS2(int a) {
			super(a); //roditelj klase konstruktora je ukljucen
			this.a=a;
		}
		
		//default constructor
	public int increment() {
		
		a=a+1;
		return a;
	}
	
	public int decrement() {
		
		a=a-1;
		return a;
	}
}
