/**
* The Associate class stores information about a Chapman associate professor
* @author Nathan Nguyen
* @version 1.0
* @see Affiliate
* @see Faculty
* @see Assistant
* @see Full
*/

public class Associate extends Faculty implements Printable{
  /** An int representing the years since tenure */
  protected int m_yearsSinceTenure;

  /** The default constructor */
  public Associate(){
    super();
    m_yearsSinceTenure = -1;
  }

  /**
  * Create an associate professor based on name, age, address, phone number, ID number, year, department, salary, number of papers, and years since tenure
  * @param n The name of the associate professor
  * @param a The age of the associate professor
  * @param ad The address of the associate professor
  * @param pn The phone number of the associate professor
  * @param id The ID number of the associate professor
  * @param y The year the associate professor came to Chapman
  * @param d The department of the associate professor
  * @param s The salary of the associate professor
  * @param p The number of papers by the associate professor
  * @param yst The number of years since tenure
  */
  public Associate(String n, int a, String ad, int pn, int id, int y, String d, int s, int p, int yst){
    super(n, a, ad, pn, id, y, d, s, p);
    m_yearsSinceTenure = yst;
  }

  /**
  * Mutator for years since tenure
  * @param yst The amount of years since tenure
  */
  public void setYearsSinceTenure(int yst){
    m_yearsSinceTenure = yst;
  }

  /**
  * Accessor for years since tenure
  * @return An int representing the years since tenure
  */
  public int getYearsSinceTenure(){
    return m_yearsSinceTenure;
  }

  /**
  * Prints all information for this class instance to the console
  */
  public void print(){
    System.out.println(" ~ CHAPMAN ASSOCIATE PROFESSOR ~");
    super.print();
    System.out.println("Department: " + this.m_department);
    System.out.println("Salary: " + this.m_salary);
    System.out.println("Number of papers: " + this.m_numPapers);
    System.out.println("Number of years since tenure: " + this.m_yearsSinceTenure);
  }

  public String toString(){
    String s = "";
    s += "Associate," + super.toString() + "," + m_yearsSinceTenure;
    return s;
  }

}
