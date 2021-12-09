package mvcsample;

class MVCPattern 
{
    public static void main(String[] args) 
    {
        Student model  = retrieveStudentFromDatabase();
  
        StudentView view = new StudentView();
  
        StudentController controller = new StudentController(model, view);
  
        controller.updateView();
  
        controller.setStudentName("Steve Jobs");
  
        controller.updateView();
    }
  
    private static Student retrieveStudentFromDatabase()
    {
        Student student = new Student();
        student.setName("Bilbo Jobs");
        student.setRollNo("15UCS157");
        return student;
    }
      
}