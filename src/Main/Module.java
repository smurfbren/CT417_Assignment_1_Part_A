import java.util.ArrayList;

public class Module {
	
	private String Name;
	private int ID;
	private  ArrayList<Student> ST;
	private ArrayList<Course> CS;
	
	public Module(String name, int id){
        this.Name = name;
        this.ID = id;
        this.CS = new ArrayList<Course>();
        this.ST = new ArrayList<Student>();
    }

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getID() {
		return ID;
	}

	public void setID(int id) {
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
        return "Module: " + Name + "ID: " + Integer.toString(ID) +
                "Courses: " +  courses +
                "Students: " + students;
    }

}

