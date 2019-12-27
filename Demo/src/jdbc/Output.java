package jdbc;
import java.util.*;
public class Output {
	
//		public static void main(String args[]) 
//		{
//			ArrayList obj = new ArrayList();
//			obj.add("A");
//			obj.ensureCapacity(3);
//			System.out.println(obj.size());
//		}
//	public class RuntimeExceptionTests {
//	     public static char performOperation(String str) {
//	          return str.charAt(0);
//	     }
//	     public static void main (String[] args) {
//	          performOperation("");
//	     }
//	}
	
	     public static void main (String[] args) {
	          ArrayList<String> names = new ArrayList<>(
	          Arrays.asList("Amy","Anne","Brian","George","Ruth","Todd"));
			  names.add("Jason");
	          System.out.println(names[6]);
	     }
}
	

