package principal;

public class Test {

	public class ClaseI1{
		int v;
		public ClaseI1(int v){
			this.v = v;
		}
	}
	public static class CaseI2{
		public static void metodito() {
		}
	}
	public static void main(String[] args) {
		int c1 = 123; 
		class Mini{
			int c2;
			public Mini() {}
			public void metodo1() {
				//int c2 = c1 + 1; Solo se puede utilizar c1 si es una constante, no se cambia
				int c2 = 4;
			}
		}
		c1 = c1+3;
		Mini mi1 = new Mini();
		mi1.metodo1();
	}
	
	
	
}
