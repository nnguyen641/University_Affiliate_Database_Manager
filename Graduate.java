/**
* The Graduate class stores information about a Chapman graduate student
* @author Nathan Nguyen
* @version 1.0
* @see Affiliate
* @see Student
* @see Undergraduate
*/

public class Graduate extends Student implements Printable{
  /** An int representing the numbers of papers published */
  protected int m_numPapersPub;
  /** A string representing the name of the thesis advisor */
  protected String m_thesisAdvisor;

  /** The default constructor */
  public Graduate(){
    super();
    m_numPapersPub = -1;
    m_thesisAdvisor = "";
  }

  /**
  * Create a graduate student based on name, age, address, phone number, ID number, year, major, minor, class standing, number of published papers, and thesis advisor
  * @param n The name of the graduate student
  * @param a The age of the graduate student
  * @param ad The address of the graduate student
  * @param pn The phone number of the graduate student
  * @param id The ID number of the graduate student
  * @param y The year the graduate student came to Chapman
  * @param ma The major of the graduate student
  * @param mi The minor of the graduate student
  * @param c The class standing of the graduate student
  * @param pp The number of published papers
  * @param ta The name of the thesis advisor
  */
  public Graduate(String n, int a, String ad, int pn, int id, int y, String ma, String mi, String c, int pp, String ta){
    super(n, a, ad, pn, id, y, ma, mi, c);
    m_numPapersPub = pp;
    m_thesisAdvisor = ta;
  }

  /**
  * Mutator for number of papers published
  * @param pp The number to set
  */
  public void setNumPapersPub(int pp){
    m_numPapersPub = pp;
  }

  /**
  * Mutator for thesis advisor
  * @param ta The thesis advisor to set
  */
  public void setThesisAdvisor(String ta){
    m_thesisAdvisor = ta;
  }

  /**
  * Accessor for numbers of papers published
  * @return An int representing the number of papers published
  */
  public int getNumPapersPub(){
    return m_numPapersPub;
  }

  /**
  * Accessor for thesis advisor
  * @return A string representing the graduate student's thesis advisor
  */
  public String getThesisAdvisor(){
    return m_thesisAdvisor;
  }

  /**
  * Prints all information for this class instance to the console
  */
  public void print(){
    System.out.println(" ~ CHAPMAN GRADUATE STUDENT ~");
    super.print();
    System.out.println("Major: " + this.m_major);
    System.out.println("Minor: " + this.m_minor);
    System.out.println("Class standing: " + this.m_classStanding);
    System.out.println("Number of published papers: " + this.m_numPapersPub);
    System.out.println("Thesis Advisor: " + this.m_thesisAdvisor);
  }

  public String toString(){
    String s = "";
    s += "Graduate," + super.toString() + "," + m_numPapersPub + "," + m_thesisAdvisor;
    return s;
  }


}
