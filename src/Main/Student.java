import java.util.ArrayList;
import org.joda.time.LocalDate;

public class Student {
	
	private String Name;
	private int Age;
	private LocalDate DateOfBirth;
	private int ID;
	private String Username;
	private Course Course;
	private ArrayList <Module> M = new ArrayList<Module>();
	
	public Student(String name, int age, LocalDate Dob, int id, Course c){
        this.Name = name;
        this.Age = age;
        this.DateOfBirth = Dob;
        this.ID = id;
        this.Course = c;
        setUsername();
    }
	 // Get and Set Methods
	public String getUsername() {
		return Username;
	}

	public void setUsername() {
		Username = Name;
	}
    
    public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}
	public int getID() {
		return ID;
	}

	public void setID(int id) {
		ID = id;
	}

	public LocalDate getDateOfBirth() {
		return DateOfBirth;
	}

	public void setDateOfBirth(LocalDate DOB) {
		DateOfBirth = DOB;
	}

	public Course getCourse() {
		return Course;
	}

	public void setCourse(Course c) {
		Course = c;
	}

	public ArrayList<Module> getModules() {
		return M;
	}

	public void setModule(Module module) {
		M.add(module);
	}
	
	 @Override public String toString(){
	        String course = getCourse().getName();
	        String username = getUsername();
	        String modules = new String();
	        
	        for(int i=0; i<getModules().size(); i++){
	                    modules += getModules().get(i).getName() + ", ";
	        }
	        
	        // prints out the student name, ID as well as course details
	        
	        return "Student: " + this.Name +" " + "ID: " + Integer.toString(ID) +" " + "Username: " + username +" " + "Course: " +  course +" " + "Modules: " + modules;
	    }
}