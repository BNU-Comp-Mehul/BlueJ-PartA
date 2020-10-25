/**
 * This class stores information about a course
 * that enrolled students may want to complete
 *
 * @author Mehul Patel
 * Modified on 23.10.2020
 */
public class Course
{
    // instance variables - replace the example below with your own
    private String codeNo;
    private String title;
    private Grades finalGrade;
    
    /**
     * Constructor for objects of class Course
     */
    public Course(String codeNo, String title)
    {
        // initialise instance variables
        this.codeNo = codeNo;
        this.title = title;
    }

   
    /**
     * Prints out the details of a course
     */
    public void print()
    {
        // put your code here
        System.out.println("Course " + codeNo + " - " + title);
    }
    
    public void convertMark(int mark)
    {
        if((mark >= 0) && (mark < 40))
        {
            finalGrade = Grades.F;
        }
        
        else if((mark >= 40) && (mark < 50))
        {
            finalGrade = Grades.D;
        }
        
        else if((mark >= 50) && (mark < 60))
        {
            finalGrade = Grades.C;
        }
        
        else if((mark >= 60) && (mark < 70))
        {
            finalGrade = Grades.B;
        }
        
        else if((mark >= 70) && (mark < 100))
        {
            finalGrade = Grades.A;
        }
      
        
        
    }
    
    
}

