/**
* The Assistant class stores information about a Chapman assistant professor
* @author Nathan Nguyen
* @version 1.0
* @see Affiliate
* @see Faculty
* @see Associate
* @see Full
*/

public class Assistant extends Faculty implements Printable{
  /** An int representing the amount of years until tenure */
  protected int m_yearsToTenure;

  /** The default constructor */
  public Assistant(){
    super();
    m_yearsToTenure = -1;
  }

  /**
  * Create an assistant professor based on name, age, address, phone number, ID number, year, department, salary, number of papers, and years until tenure
  * @param n The name of the assistant professor
  * @param a The age of the assistant professor
  * @param ad The address of the assistant professor
  * @param pn The phone number of the assistant professor
  * @param id The ID number of the assistant professor
  * @param y The year the assistant professor came to Chapman
  * @param d The department of the assistant professor
  * @param s The salary of the assistant professor
  * @param p The number of papers by the assistant professor
  * @param ytt The number of years until tenure
  */
  public Assistant(String n, int a, String ad, int pn, int id, int y, String d, int s, int p, int ytt){
    super(n, a, ad, pn, id, y, d, s, p);
    m_yearsToTenure = ytt;
  }

  /**
  * Mutator for years until tenure
  * @param ytt The amount of years until tenure
  */
  public void setYearsToTenure(int ytt){
    m_yearsToTenure = ytt;
  }

  /**
  * Accessor for years until tenure
  * @return An int representing the years until tenure
  */
  public int getYearsToTenure(){
    return m_yearsToTenure;
  }

  /**
  * Prints all information for this class instance to the console
  */
  public void print(){
    System.out.println(" ~ CHAPMAN ASSISTANT PROFESSOR ~");
    super.print();
    System.out.println("Department: " + this.m_department);
    System.out.println("Salary: " + this.m_salary);
    System.out.println("Number of papers: " + this.m_numPapers);
    System.out.println("Number of years until tenure: " + this.m_yearsToTenure);
  }

  public String toString(){
    String s = "";
    s += "Assistant," + super.toString() + "," + m_yearsToTenure;
    return s;
  }

}
