package functionalPrromming;
@FunctionalInterface
interface Demo{
	void methodSAM(int i);
	default void methodDefault() {
		System.out.println("default meth of i/f");
	}
	static void methodStatic() {
		System.out.println("static method of i/f");
	}
}

@FunctionalInterface
interface Demo2{
	int squaring(int a);
}

public class DemoFunctionalIF {

	public static void main(String[] args) {
		Demo d=a->System.out.println(a+":lambda tell HOW of SAM");
//once HOW part is over we call give as many i/p as possible and call SAM
	    d.methodSAM(1);
	    d.methodSAM(2);
	    
	    d.methodDefault();        //calling default method thru ref of i/f-----just like class
	    Demo.methodStatic();      //interface calling static method----------just like class
	    
	    
	    Demo2 d1=(a)->{return a*a;};    //if writing return statement the ; in those places+{}
	    System.out.println("Demo2 squaring"+d1.squaring(4));
	    
	    Demo2 d2=a->a*2;                 //giving different behavior and no return statement
	    System.out.println("Demo2 squaring different behavr "+d2.squaring(4));
	}

}
