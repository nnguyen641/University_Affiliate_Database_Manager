/**
* The Undergraduate class stores information about a Chapman undergraduate student
* @author Nathan Nguyen
* @version 1.0
* @see Affiliate
* @see Student
* @see Graduate
*/

public class Undergraduate extends Student implements Printable{
  /** An int representing the number of courses the undergraduate student has taken */
  protected int m_numCourses;
  /** An int representing the amount of scholarship money in dollars the undergraduate student has */
  protected int m_scholarshipAmt;

  /** The default constructor */
  public Undergraduate(){
    super();
    m_numCourses = -1;
    m_scholarshipAmt = -1;
  }

  /**
  * Create an undergraduate student based on name, age, address, phone number, ID number, year, major, minor, class standing, number of courses taken, and scholarship amount
  * @param n The name of the undergraduate student
  * @param a The age of the undergraduate student
  * @param ad The address of the undergraduate student
  * @param pn The phone number of the undergraduate student
  * @param id The ID number of the undergraduate student
  * @param y The year the undergraduate student came to Chapman
  * @param ma The major of the undergraduate student
  * @param mi The minor of the undergraduate student
  * @param c The class standing of the undergraduate student
  * @param ct The number of courses taken
  * @param sa The scholarship amount
  */
  public Undergraduate(String n, int a, String ad, int pn, int id, int y, String ma, String mi, String c, int ct, int sa){
    super(n, a, ad, pn, id, y, ma, mi, c);
    m_numCourses = ct;
    m_scholarshipAmt = sa;
  }

  /**
  * Mutator for number of courses taken
  * @param ct The number of courses to set
  */
  public void setNumCourses(int ct){
    m_numCourses = ct;
  }

  /**
  * Mutator for scholarship amount
  * @param sa The scholarship amount to set
  */
  public void setScholarshipAmt(int sa){
    m_scholarshipAmt = sa;
  }

  /**
  * Accessor for numbers of courses taken
  * @return An int representing the number of courses taken
  */
  public int getNumCourses(){
    return m_numCourses;
  }

  /**
  * Accessor for scholarship amount
  * @return An int representing the undergraduate student's scholarship amount
  */
  public int getScholarshipAmt(){
    return m_scholarshipAmt;
  }

  /**
  * Prints all information for this class instance to the console
  */
  public void print(){
    System.out.println(" ~ CHAPMAN UNDERGRADUATE STUDENT ~");
    super.print();
    System.out.println("Major: " + this.m_major);
    System.out.println("Minor: " + this.m_minor);
    System.out.println("Class standing: " + this.m_classStanding);
    System.out.println("Number of courses taken: " + this.m_numCourses);
    System.out.println("Scholarship Amount: " + this.m_scholarshipAmt);
  }

  public String toString(){
    String s = "";
    s += "Undergraduate," + super.toString() + "," + m_numCourses + "," + m_scholarshipAmt;
    return s;
  }

}
