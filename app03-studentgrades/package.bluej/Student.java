import java.util.*;
/**
 * The Student class represents a student in a student administration system.
 * 
 * @author Mehul Patel
 * Modified on 25.10.2020
 */

 /** 
 * Variables required for class.
 */
 public class Student
 {
    private String name;
    
    private String id;
    
    private int credits;
    
    private Course course;
    
    /**
     * Student with a given name and ID number.
     */
    public Student(String fullName, String studentID)
    {
        name = fullName;
        id = studentID;
        credits = 0;
    }

    /**
     * Returns the full name of the student.
     */
    public String getName()
    {
        return name;
    }

    /**
     * Sets a new name for the student.
     */
    public void changeName(String replacementName)
    {
        name = replacementName;
    }

    /**
     * Returns the student ID of the student.
     */
    public String getStudentID()
    {
        return id;
    }

    /**
     * Adds credit points to the student's accumulated credits.
     */
    public void addCredits(int additionalPoints)
    {
        credits += additionalPoints;
    }

    /**
     * Returns the number of credit points the student has accumulated.
     */
    public int getCredits()
    {
        return credits;
    }

    /**
     * Returns the login name of the student. The login name is a combination
     * of the first four characters of the student's name and the first three
     * characters of the student's ID number.
     */
    public String getLoginName()
    {
        return name.substring(0,4) + id.substring(0,3);
    }
    
    /**
     * Prints the student's name and ID number to the output terminal.
     */
    public void print()
    {
        System.out.println(name + ", student ID: " + id + ", credits: " + credits);
    }
    
    /**
     * Student can enrol onto course.
     */
    public void enrolOnCourse(Course course)
    {
        this.course = course;
    }
}
