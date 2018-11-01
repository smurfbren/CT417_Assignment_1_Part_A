import java.util.ArrayList;

public class Module {
	
	private String Name;
	private String ID;
	private  ArrayList<Student> ST;
	private ArrayList<Course> CS;
	
	public Module(String name, String string){
        this.Name = name;
        this.ID = string;
        this.CS = new ArrayList<Course>();
        this.ST = new ArrayList<Student>();
    }

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getID() {
		return ID;
	}

	public void setID(String id) {
		ID = id;
	}

	public ArrayList<Student> getStudents() {
		return ST;
	}

	public void setStudent(Student student) {
		ST.add(student);
	}

	public ArrayList<Course> getCourses() {
		return CS;
	}

	public void setCourse(Course course) {
		CS.add(course);
	}
	
	@Override public String toString(){
        String courses = new String();
        for(int y=0; y<getCourses().size(); y++){
                    courses += getCourses().get(y).getName() + ", ";
        }
        String students = new String();
        for(int y=0; y<getStudents().size(); y++){
                    students += getStudents().get(y).getName() + ", ";
        }
        
        //prints out the module details for each student
        
        return "Module: " + Name + "ID: " + ID +" " +"Courses: " +  courses +" " + "Students: " + students;
    }

}

