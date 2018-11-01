import java.util.ArrayList;
import org.joda.time.LocalDate;

public class Course {
	
	private String Name;
	private ArrayList<Module> Modules;	// Array list for both the modules as well as a list of students attending the course
	private ArrayList<Student> Students;
	private LocalDate SD;
	private LocalDate ED;
	
	public Course(String name, LocalDate start, LocalDate end) {
		this.Name = name;
		this.SD = start;
		this.ED = end;
		this.Modules = new ArrayList<Module>();
		this.Students = new ArrayList<Student>();
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public ArrayList<Module> getModules() {
		return Modules;
	}
	public void setModules(Module module) {
		Modules.add(module);
	}
	public ArrayList<Student> getStudents() {
		return Students;
	}
	public void setStudents(Student student) {
		Students.add(student);
	}
	public LocalDate getStartDate() {
		return SD;
	}
	public void setStartDate(LocalDate startDate) {
		SD = startDate;
	}
	public LocalDate getEndDate() {
		return ED;
	}
	public void setEndDate(LocalDate endDate) {
		ED = endDate;
	}
	
	@Override public String toString(){
        String modules = new String();
        for(int x=0; x<getModules().size(); x++){
        	
                    modules += getModules().get(x).getName() + ", ";
        }
        String students= new String();
        for(int x=0; x<getStudents().size(); x++){
        	
                    students += getStudents().get(x).getName() + ", ";
        }
        
        //prints out course details
        
        return "Course: " + Name + " " +" Start Date: " + SD +" " + "End Date: " + ED +" " + "Modules: " +  modules ;
    }
}