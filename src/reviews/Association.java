package reviews;

class Teacher
{
  public String name;
  Teacher(String name)
  {
    this.name = name;
  }
  public String getTeacherName()
  {
    return this.name;
  }
}
class Student
{
  public String name;
  Student(String name)
  {
    this.name = name;
  }
  public String getStudentName()
  {
    return this.name;
  }
}

public class Association {

	public static void main(String[] args) {
		
		 Teacher teacherObj = new Teacher("Ravi");
		 
		 Student studentObj = new Student("Adithya");
		    
System.out.println(studentObj.getStudentName() +" is Student of " + teacherObj.getTeacherName());
		
		

	}

}
