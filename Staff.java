/**
* The Staff class stores information about a Chapman staff member
* @author Nathan Nguyen
* @version 1.0
* @see Affiliate
* @see FullTime
* @see PartTime
*/

public class Staff extends Affiliate{
  /** A string representing the title of the staff member */
  protected String m_title;
  /** A string representing the building of the staff member */
  protected String m_building;

  /** The default constructor */
  public Staff(){
    super();
    m_title = "";
    m_building = "";
  }

  /**
  * Create an staff member based on name, age, address, phone number, ID number, year, title, and building
  * @param n The name of the staff member
  * @param a The age of the staff member
  * @param ad The address of the staff member
  * @param pn The phone number of the staff member
  * @param id The ID number of the staff member
  * @param y The year the staff member came to Chapman
  * @param t The title of the staff member
  * @param b The building of the staff member
  */
  public Staff(String n, int a, String ad, int pn, int id, int y, String t, String b){
    super(n, a, ad, pn, id, y);
    m_title = t;
    m_building = b;
  }

  /**
  * Mutator for title
  * @param t The title to set
  */
  public void setTitle(String t){
    m_title = t;
  }

  /**
  * Mutator for building
  * @param b The building to set
  */
  public void setBuilding(String b){
    m_building = b;
  }

  /**
  * Accessor for title
  * @return A string representing the staff member's title
  */
  public String getTitle(){
    return m_title;
  }

  /**
  * Accessor for building
  * @return A string representing the staff member's building
  */
  public String getBuilding(){
    return m_building;
  }

  public String toString(){
    String s = "";
    s += super.toString() + "," + m_title + "," + m_building;
    return s;
  }

}
