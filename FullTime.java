/**
* The FullTime class stores information about a Chapman fulltime staff member
* @author Nathan Nguyen
* @version 1.0
* @see Affiliate
* @see Staff
* @see PartTime
*/

public class FullTime extends Staff implements Printable{
  /** An int representing the yearly salary of the fulltime staff member */
  protected int m_yearlySalary;

  /** The default constructor */
  public FullTime(){
    super();
    m_yearlySalary = -1;
  }

  /**
  * Create a fulltime staff member based on name, age, address, phone number, ID number, year, title, building, and yearly salary
  * @param n The name of the fulltime staff member
  * @param a The age of the fulltime staff member
  * @param ad The address of the fulltime staff member
  * @param pn The phone number of the fulltime staff member
  * @param id The ID number of the fulltime staff member
  * @param y The year the fulltime staff member came to Chapman
  * @param t The title of the fulltime staff member
  * @param b The building of the fulltime staff member
  * @param ys The yearly salary of the fulltime staff member
  */
  public FullTime(String n, int a, String ad, int pn, int id, int y, String t, String b, int ys){
    super(n, a, ad, pn, id, y, t, b);
    m_yearlySalary = ys;
  }

  /**
  * Mutator for yearly salary
  * @param ys The yearly salary to set
  */
  public void setYearlySalary(int ys){
    m_yearlySalary = ys;
  }

  /**
  * Accessor for yearly salary
  * @return An int representing the fulltime staff member's yearly salary
  */
  public int getYearlySalary(){
    return m_year;
  }

  /**
  * Prints all information for this class instance to the console
  */
  public void print(){
    System.out.println(" ~ CHAPMAN FULLTIME STAFF MEMBER ~");
    super.print();
    System.out.println("Title: " + this.m_title);
    System.out.println("Building: " + this.m_building);
    System.out.println("Yearly Salary: " + this.m_yearlySalary);
  }

  public String toString(){
    String s = "";
    s += "FullTime," + super.toString() + "," + m_yearlySalary;
    return s;
  }

}
