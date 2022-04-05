/**
* The PartTime class stores information about a Chapman part-time staff member
* @author Nathan Nguyen
* @version 1.0
* @see Affiliate
* @see Staff
* @see FullTime
*/

public class PartTime extends Staff implements Printable{
  /** An int representing the hourly salary of the part-time staff member */
  protected int m_hourlySalary;

  /** The default constructor */
  public PartTime(){
    super();
    m_hourlySalary = -1;
  }
  /**
  * Create a part-time staff member based on name, age, address, phone number, ID number, year, title, building, and hourly salary
  * @param n The name of the part-time staff member
  * @param a The age of the part-time staff member
  * @param ad The address of the part-time staff member
  * @param pn The phone number of the part-time staff member
  * @param id The ID number of the part-time staff member
  * @param y The year the part-time staff member came to Chapman
  * @param t The title of the part-time staff member
  * @param b The building of the part-time staff member
  * @param hs The hourly salary of the part-time staff member
  */
  public PartTime(String n, int a, String ad, int pn, int id, int y, String t, String b, int hs){
    super(n, a, ad, pn, id, y, t, b);
    m_hourlySalary = hs;
  }

  /**
  * Mutator for hourly salary
  * @param hs The hourly salary to set
  */
  public void setHourlySalary(int hs){
    m_hourlySalary = hs;
  }

  /**
  * Accessor for hourly salary
  * @return An int representing the part-time staff member's hourly salary
  */
  public int getHourlySalary(){
    return m_hourlySalary;
  }

  /**
  * Prints all information for this class instance to the console
  */
  public void print(){
    System.out.println(" ~ CHAPMAN PART-TIME STAFF MEMBER ~");
    super.print();
    System.out.println("Title: " + this.m_title);
    System.out.println("Building: " + this.m_building);
    System.out.println("Hourly Salary: " + this.m_hourlySalary);
  }

  public String toString(){
    String s = "";
    s += "PartTime," + super.toString() + "," + m_hourlySalary;
    return s;
  }

}
