import static org.junit.Assert.assertEquals;

import org.joda.time.LocalDate;
import org.junit.Test;

public class Student_Reg_Test {
    
    @Test
    public void Username_Test_Case () {
        Student student = new Student("John Doe", 22, LocalDate.parse("1996-05-20"), 17, new Course("Engish", LocalDate.parse("2013-01-07"), LocalDate.parse("2017-11-29")));
       
        assertEquals("John Doe", student.getUsername());
    }
    
    @Test
   public void Age_Test_Case (){
	   
	   Student student = new Student("Sam Blue", 23, LocalDate.parse("1996-05-20"), 15, new Course("Physics", LocalDate.parse("2014-01-07"), LocalDate.parse("2018-11-22")));
	   
	   assertEquals(23, student.getAge());
	   
   }
    
    @Test
   public void ID_Test_Case (){
	   
	   Student student = new Student("David Wall", 23, LocalDate.parse("1996-05-20"), 12, new Course("History", LocalDate.parse("2013-01-05"), LocalDate.parse("2017-11-27")));
	   
	   assertEquals(12, student.getID());  
	   
   }
}