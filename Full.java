/**
* The Full class stores information about a Chapman full professor
* @author Nathan Nguyen
* @version 1.0
* @see Affiliate
* @see Faculty
* @see Assistant
* @see Associate
*/

public class Full extends Faculty implements Printable{
  /** An int representing the amount of years until retirement */
  protected int m_yearsToRetire;

  /** The default constructor */
  public Full(){
    super();
    m_yearsToRetire = -1;
  }
  /**
  * Create an full professor based on name, age, address, phone number, ID number, year, department, salary, number of papers, and years until retirement
  * @param n The name of the full professor
  * @param a The age of the full professor
  * @param ad The address of the full professor
  * @param pn The phone number of the full professor
  * @param id The ID number of the full professor
  * @param y The year the full professor came to Chapman
  * @param d The department of the full professor
  * @param s The salary of the full professor
  * @param p The number of papers by the full professor
  * @param yur The number of years until retirement
  */
  public Full(String n, int a, String ad, int pn, int id, int y, String d, int s, int p, int yur){
    super(n, a, ad, pn, id, y, d, s, p);
    m_yearsToRetire = yur;
  }
  /**
  * Mutator for years until retirement
  * @param yur The amount of years until retirement
  */
  public void setYearsToRetire(int yur){
    m_yearsToRetire = yur;
  }

  /**
  * Accessor for years until retirement
  * @return An int representing the years until retirement
  */
  public int getYearsToRetire(){
    return m_yearsToRetire;
  }

  /**
  * Prints all information for this class instance to the console
  */
  public void print(){
    System.out.println(" ~ CHAPMAN FULL PROFESSOR ~");
    super.print();
    System.out.println("Department: " + this.m_department);
    System.out.println("Salary: " + this.m_salary);
    System.out.println("Number of papers: " + this.m_numPapers);
    System.out.println("Number of years until retirement: " + this.m_yearsToRetire);
  }

  public String toString(){
    String s = "";
    s += "Full," + super.toString() + "," + m_yearsToRetire;
    return s;
  }


}
