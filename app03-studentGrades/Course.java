
/**
 * This class will store information about a university course. 
 * Courses will have an official title and a course code.
 * 
 * @author Mehul Patel
 * @version (a version number or a date)
 */
public class Course
{
    //Attributes/Variables/Fields
    private String title; 
    
    private String codeNo;

    /**
     * Constructor for objects of class Course
     * 
     */
    public Course(String title, String codeNo)
    {
        this.title = title;
        this.codeNo = codeNo;
    }

    public void print()
    {
        System.out.println("Course: " + title + "  " + codeNo);
    }
    
    
}//end of class 