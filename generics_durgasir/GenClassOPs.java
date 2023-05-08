package generics_durgasir;

public class GenClassOPs<T extends Number>               //generic class
{
	public T get(T ob) {                //non generic method
		return ob;
	}
	public static<T> void show(T ts){   //generic method
		System.out.println(ts);	
	}
	
	public void displayClass(T t){            
		System.out.println(t.getClass());
	}
	

}
