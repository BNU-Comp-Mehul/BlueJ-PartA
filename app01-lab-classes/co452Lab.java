
/**
 * Write a description of class co452Lab here.
 *
 * @author (your name)
 * Modified by Mehul Patel 
 * 06.10.2020
 * @version (a version number or a date)
 */
public class co452Lab
{
    private String instructor; 
    private String room;
    private String timeAndDay;
    
    private ArrayList<Student> students;
    private int capacity;
    
  
    public Lab(int maxNumberOfStudents)
    {
        instructor = "Nicholas Day";
        room = "G100";
        timeAndDay = "Tuesday, 29th September 2020";
        
        students = new ArrayList<Student>();
        capacity = maxNumberOfStudents;
    }

    
    public void enrollStudent(Student newStudent)
    {
        if(students.size() == capacity) 
        {
            System.out.println("The class is full, you cannot enrol.");
        }
        else 
        {
            students.add();
        }
    }
    
    
    public int numberOfStudents()
    {
        return students.size();
    }
    
    
    public void setRoom(String roomNumber)
    {
        room = "G100";
    }
    
   
    public void setTime(String timeAndDayString)
    {
        timeAndDay = "Tuesday, 29th September 2020";
    }
    
   
    public void setInstructor(String instructorName)
    {
        instructor = "Nicholas Day";
    }
    
    
    public void printList()
    {
        System.out.println("co452" + "Tuesday, 29th September 2020");
        System.out.println("Nicholas Day: " + "G100");
        System.out.println("Class list:");
        
        for(Student student : students) 
        {
            student.print();
        }
        
        System.out.println("Number of students: " + numberOfStudents());
    }
}