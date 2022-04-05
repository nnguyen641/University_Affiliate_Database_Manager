/**
* The Faculty class stores information about a Chapman faculty member
* @author Nathan Nguyen
* @version 1.0
* @see Affiliate
* @see Assistant
* @see Associate
* @see Full
*/

public class Faculty extends Affiliate{
  /** A string representing the faculty member's department */
  protected String m_department;
  /** An int representing the faculty member's salary */
  protected int m_salary;
  /** An int representing the faculty member's number of papers */
  protected int m_numPapers;

  /** The default constructor */
  public Faculty(){
    super();
    m_department = "";
    m_salary = -1;
    m_numPapers = -1;
  }

  /**
  * Create an faculty member based on name, age, address, phone number, ID number, year, department, salary, and number of papers
  * @param n The name of the faculty member
  * @param a The age of the faculty member
  * @param ad The address of the faculty member
  * @param pn The phone number of the faculty member
  * @param id The ID number of the faculty member
  * @param y The year the faculty member came to Chapman
  * @param d The department of the faculty member
  * @param s The salary of the faculty member
  * @param p The number of papers by the faculty member
  */
  public Faculty(String n, int a, String ad, int pn, int id, int y, String d, int s, int p){
    super(n, a, ad, pn, id, y);
    m_department = d;
    m_salary = s;
    m_numPapers = p;
  }

  /**
  * Mutator for department
  * @param d The department to set
  */
  public void setDepartment(String d){
    m_department = d;
  }

  /**
  * Mutator for salary
  * @param s The salary to set
  */
  public void setSalary(int s){
    m_salary = s;
  }

  /**
  * Mutator for number of papers
  * @param p The numbers of papers to set
  */
  public void setNumPapers(int p){
    m_numPapers = p;
  }

  /**
  * Accessor for department
  * @return An string representing the faculty member's department
  */
  public String getDepartment(){
    return m_department;
  }

  /**
  * Accessor for salary
  * @return An int representing the faculty member's salary
  */
  public int getSalary(){
    return m_salary;
  }

  /**
  * Accessor for number of paper
  * @return An int representing the faculty member's number of papers
  */
  public int getNumPapers(){
    return m_numPapers;
  }

  public String toString(){
    String s = "";
    s += super.toString() + "," + m_department + "," + m_salary + "," + m_numPapers;
    return s;
  }

}
