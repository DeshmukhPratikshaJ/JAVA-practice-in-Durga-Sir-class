package generics_durgasir;

public class TestGenClass {

	public static void main(String[] args) {
		GenClassOPs<Integer> n1= new GenClassOPs<Integer>();
		GenClassOPs<Double> n2= new GenClassOPs<>();
		
		System.out.println(n1.getClass());  //GenClassOPs
		n1.displayClass(21);    //Integer class
		
		
		

	}

}
