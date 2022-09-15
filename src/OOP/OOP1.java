package OOP;

public class OOP1 {
	String name = "Nidish";
	int rollno=1;
	String group="EC";
	
	public static void main(String[] args) {

		OOP1 std1= new OOP1();
		std1.display();
		System.out.println("");
		std1.init("Bruce",2,"CS");
		std1.display();
		System.out.println("");
		std1.init("Tony", 3, "ME");
		std1.display();

	}
	void init(String name_temp,int rollno_temp,String group_temp)    //init is used to initialize data
	{
		 name = name_temp;
		 rollno=rollno_temp;
		 group=group_temp;
	}
	
	
	void display() {
		System.out.println("Name of student is "+name);
		System.out.println("RollNo of student is "+rollno);
		System.out.println("Group of student is "+group);
	}
}
