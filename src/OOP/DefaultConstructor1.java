package OOP;

public class DefaultConstructor1 {
	  String Name;
	  int Age;
	  char Grade;
	  boolean Yesorno;
	  byte	key;
	  short	num1;
	  long	num2;
	  float	num3;
	  double num4;
	  

	public static void main(String[] args) {
	
		DefaultConstructor1 obj = new DefaultConstructor1();
	      System.out.println("String = "+obj.Age); 
	      System.out.println("Integer = "+obj.Name);
	      System.out.println("Char = " +obj.Grade);
	      System.out.println("Boolean = "+ obj.Yesorno);
	      System.out.println("Byte = "+obj.key);
	      System.out.println("Short = "+obj.num1);
	      System.out.println("Long = "+obj.num2);
	      System.out.println("Float = "+obj.num3);
	      System.out.println("Double = "+obj.num4);
	}

}
