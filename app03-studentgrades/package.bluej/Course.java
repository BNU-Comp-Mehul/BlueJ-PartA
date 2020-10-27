/**
 * This class stores information about a course and the students who are enrolled on the course.
 *
 * @author Mehul Patel
 * Modified on 25.10.2020
 */

/**
 * Variables required for class.
 */
public class Course
{
    private String codeNo;
    private String title;

    private Module module1;
    private Module module2;
    private Module module3;
    private Module module4;

    private Grades finalGrade;
    private int finalMark;

    /**
     * Constructor for objects of class Course.
     */
    public Course(String codeNo, String title)
    {
        this.codeNo = codeNo;
        this.title = title;

        this.finalMark = 0;
        this.finalGrade = null;

        createModules();
    }

    /**
     * Creates the modules.
     */
    public void createModules()
    {
        module1 = new Module("CO452", "Programming Concepts");
        module2 = new Module("CO453", "Application Programming");
        module3 = new Module("CO455", "User Experience");
        module4 = new Module("CO456", "Website Development");
    }

    /**
     * Adds the modules.
     */
    public void addModule(Module module, int moduleNo)
    {
        if (moduleNo == 1)
        {
            this.module1 = module;
        }

        else if (moduleNo == 2)
        {
            this.module2 = module;
        }

        else if (moduleNo == 3)
        {
            this.module3 = module;
        }

        else if (moduleNo == 4)
        {
            this.module4 = module;
        }
    }

    /**
     * Sets the marks for modules.
     */
    public void setMark(int mark, int moduleNo)
    {
        if (moduleNo == 1)
        {
            module1.awardMark(mark);
        }

        else if (moduleNo == 2)
        {
            module2.awardMark(mark);
        }

        else if (moduleNo == 3)
        {
            module3.awardMark(mark);
        }

        else if (moduleNo == 4)
        {
            module4.awardMark(mark);
        }
    }

    /**
     * Calculates the final mark for modules.
     */
    public void calculateFinalMark()
    {
        if (courseCompleted())
        {
            int totalMark = module1.getMark() + module2.getMark() + module3.getMark() + module4.getMark();

            finalMark = totalMark / 4;
        }
    }

    /**
     * Checks if course has been completed.
     */
    public boolean courseCompleted()
    {
        if ((module1.isCompleted()) && module2.isCompleted() && module3.isCompleted() && module4.isCompleted())
        {
            return true;
        }

        else 
        {
            return false;
        }
    }

    /**
     * Prints out the details of the course.
     */
    public void print()
    {
        System.out.println("Course " + codeNo + " - " + title);
        printModules();

        if (courseCompleted())
        {
            System.out.println("Final Mark = " + finalMark);
            System.out.println("Final Grade = " + finalGrade);
        }
    }

    /**
     * Prints all the module marks.
     */
    public void printModules()
    {
        // syste.out.printlm("Module List ");
        module1.print();
        module2.print();
        module3.print();
        module4.print();

    }

    /**
     * Converts the module marks into grades. 
     */
    public void convertMark(int mark)
    {
        if ((mark >= 0) && (mark < 40))
        {
            finalGrade = Grades.F;
        }

        else if ((mark >= 40) && (mark < 50))
        {
            finalGrade = Grades.D;
        }

        else if ((mark >= 50) && (mark < 60))
        {
            finalGrade = Grades.C;
        }

        else if ((mark >= 60) && (mark < 70))
        {
            finalGrade = Grades.B;
        }

        else if ((mark >= 70) && (mark < 100))
        {
            finalGrade = Grades.A;
        }
    }
}