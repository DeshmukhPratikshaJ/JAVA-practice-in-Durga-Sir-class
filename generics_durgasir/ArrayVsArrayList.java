package generics_durgasir;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayVsArrayList {
	public static void main(String[] args) {
		
		//purose of GENERICS:to get type safety,to resoleve type casting
		//array DS are type safe but not collection
		ArrayList string=new ArrayList();
		string.add("string1");
		string.add(23);
		//every type is valid for this AL and not getting any JAVAC error
		String s=(String)string.get(0);  //type casting is necessary at the time retrieval
		String s1=(String) string.get(1);// no javac error even when i m trying to cast Integer to string
		//but i will get CCE at run time .
		
		ArrayList<String> name= new ArrayList<>();
		name.add("name1");
//		name.add(23);  //JAVAC error----------name is type safe
		String s2=name.get(0);  //no need of type casting
		
		//following are valid                                invalid
		List<String> l=new ArrayList<String>();     //JAVAC error of tyep mismatch
		List<Object> l2= new LinkedList<Object>();  //List<Object> l3=new ArrayList<String>();    
		
	//1.polymorphism/upcasting/indirect ref can work in base tyep and not in parameter type.
	//2.
		
		
		
		
		
	
	}

}
