/**
 * This class will store information about the course marks and credits.
 *
 * @author Mehul Patel
 * Modified on 25.10.2020
 */

/** 
 * Variables required for class.
 */
public class Module
{
    private String title;
    
    private String codeNo;
    
    private int mark;
    
    private int credit;
    
    private boolean completed;
    
    private boolean passed;
    
    /**
     * Constructor for objects of class Module.
     */
    public Module(String title, String codeNo)
    {
        this.title = title;
        this.codeNo = codeNo;
        
        mark = -1;
        credit = 15;
        
        passed = false;
        completed = false;
    }
    
    /**
     * Awards a mark. 
     */
    public void awardMark (int mark)
    {
        this.mark = mark;
    }
    
    /**
     * Returns a mark.
     */
    public int getMark()
    {
        return mark;
    }
    
    /**
     * Returns the module code number.
     */
    public String getCodeNo()
    {
        return codeNo;
    }
    
    /**
     * Returns the module mark.
     */
    public boolean isCompleted()
    {
        return mark >= 0;
    }
    
    /**
     * Prints module information. 
     */
    public void print()
    {
        System.out.println("Module: " + title + " " + codeNo + "Mark = " + mark);
    }    
}





