package OOP;

public class OPP1Constructor {

	String name = "Nidish";
	int rollno=1;
	String group="EC";
	public static void main(String[] args) {
			
			OPP1Constructor std1= new OPP1Constructor("Bruce",2,"CS");
			std1.display();
			System.out.println("");
			OPP1Constructor std2= new OPP1Constructor ("Tony", 3, "ME");
			std2.display();

		}
		OPP1Constructor(String name_temp,int rollno_temp,String group_temp)    //init is used to initialize data
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


