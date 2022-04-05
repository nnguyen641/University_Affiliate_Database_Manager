/**
* The Student class stores information about a Chapman student
* @author Nathan Nguyen
* @version 1.0
* @see Affiliate
* @see Graduate
* @see Undergraduate
*/

public class Student extends Affiliate{
  /** A string representing the student's major */
  protected String m_major;
  /** A string representing the student's minor */
  protected String m_minor;
  /** A string representing the student's class standing */
  protected String m_classStanding;

  /** The default constructor */
  public Student(){
    super();
    m_major = "";
    m_minor = "";
    m_classStanding = "";
  }

  /**
  * Create an student based on name, age, address, phone number, ID number, year, major, minor, and class standing
  * @param n The name of the student
  * @param a The age of the student
  * @param ad The address of the student
  * @param pn The phone number of the student
  * @param id The ID number of the student
  * @param y The year the student came to Chapman
  * @param ma The major of the student
  * @param mi The minor of the student
  * @param c The class standing of the student
  */
  public Student(String n, int a, String ad, int pn, int id, int y, String ma, String mi, String c){
    super(n, a, ad, pn, id, y);
    m_major = ma;
    m_minor = mi;
    m_classStanding = c;
  }

  /**
  * Mutator for major
  * @param ma The major to set
  */
  public void setMajor(String ma){
    m_major = ma;
  }

  /**
  * Mutator for minor
  * @param mi The minor to set
  */
  public void setMinor(String mi){
    m_minor = mi;
  }

  /**
  * Mutator for class standing
  * @param c The class standing to set
  */
  public void setClassStand(String c){
    m_classStanding = c;
  }

  /**
  * Accessor for major
  * @return A string representing the student's major
  */
  public String getMajor(){
    return m_major;
  }

  /**
  * Accessor for minor
  * @return A string representing the student's minor
  */
  public String getMinor(){
    return m_minor;
  }

  /**
  * Accessor for class standing
  * @return A string representing the student's class standing
  */
  public String getClassStand(){
    return m_classStanding;
  }

  public String toString(){
    String s = "";
    s += super.toString() + "," + m_major + "," + m_minor + "," + m_classStanding;
    return s;
  }
}
