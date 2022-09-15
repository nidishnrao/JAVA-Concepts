package OOP;

public class Static1ExampleStudent {
	String name;
	int rollno;
	String group;
	static String collegename = "Harvard"; 
	
	
		public static void main(String[] args) {

			Static1ExampleStudent std1= new Static1ExampleStudent();
			std1.init("Bruce",1,"CS");
			std1.display();
			System.out.println("");
			std1.init("Tony", 2, "ME");
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
			System.out.println("College of student is "+collegename);
		}
	}
