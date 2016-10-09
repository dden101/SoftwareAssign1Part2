package SoftwareFinalYearProject.Assign1Part2;

import java.util.ArrayList;
import org.joda.time.LocalDate;
import SoftwareFinalYearProject.Assign1.Course;
import SoftwareFinalYearProject.Assign1.Module;
import SoftwareFinalYearProject.Assign1.Student;

public class Driver {
	
	static ArrayList<Module> modules = new ArrayList<Module>();
	static ArrayList<Student> students = new ArrayList<Student>();

	public static void main(String[] args)
	{
		// ArrayList<Student> stud = new ArrayList<Student>();
		 students.add(new Student ("Earl",21, 124, new LocalDate ("1995-03-19") ));
		 students.add(new Student ("John", 19, 125,new LocalDate ("1997-02-17") ));
		 students.add(new Student ("Paul",22, 126, new LocalDate ("1994-07-12") ));
		 
		 
		 modules.add(new Module ("Programming","CT") );
		 modules.add(new Module ("Software Engineering", "CT") );
		 modules.add(new Module ("Machine Learning","CT") );
		 
		 Course ComputerScience = new Course("Computer Science",new LocalDate ("2012-09-5"),new LocalDate ("2017-05-19")); 
		 ComputerScience.setmodules(modules);
		 
		 for (Student stud :students){
			 System.out.println("Student:"+stud+"Course");
			 
			for (Module mod :modules){
			 System.out.println("Module Name:"+mod.getModuleName()+"Module ID:"+mod.getModuleID());
			 
			 
			// System.out.println("Course:"ComputerScience);
				  
		 }
	}
}
}
