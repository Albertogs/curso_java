package principal;

public class Clase3 {

	
	static class Inner{
		public void m1() {
			System.out.println("Este es el mensaje");
		}
	}
	public class Inner2{
		public void m2() {
			System.out.println("Mensaje 2");
		}
	}
	public static void main(String[] args) {
	Clase3.Inner ob = new Clase3.Inner()	;
	ob.m1();
	Clase3 c3 = new Clase3();
	Clase3.Inner2 ob2 = c3. new Inner2();
	ob2.m2();
	}
		
				
	
	
}
