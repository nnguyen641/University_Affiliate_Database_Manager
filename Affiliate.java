/**
* The Affiliate class stores information about a Chapman affiliate
* @author Nathan Nguyen
* @version 1.0
* @see AffiliatesDriver
* @see Faculty
* @see Student
* @see Staff
*/

public class Affiliate implements Comparable<Affiliate>{
  /** A string representing the name of the affiliate */
  protected String m_name;
  /** An int representing the age of the affiliate */
  protected int m_age;
  /** A string representing the address of the affiliate */
  protected String m_address;
  /** An int representing the phone number of the affiliate */
  protected int m_phoneNum;
  /** An int representing the ID number of the affiliate */
  protected int m_id;
  /** An int representing the year the affiliate came to Chapman */
  protected int m_year;

  /** The default constructor */
  public Affiliate(){
    m_name = "";
    m_age = -1;
    m_address = "";
    m_phoneNum = -1;
    m_id = -1;
    m_year = -1;
  }

  /**
  * Create an affiliate based on name, age, address, phone number, ID number, and year
  * @param n The name of the affiliate
  * @param a The age of the affiliate
  * @param ad The address of the affiliate
  * @param pn The phone number of the affiliate
  * @param id The ID number of the affiliate
  * @param y The year the affiliate came to Chapman
  */
  public Affiliate(String n, int a, String ad, int pn, int id, int y){
    m_name = n;
    m_age = a;
    m_address = ad;
    m_phoneNum = pn;
    m_id = id;
    m_year = y;
  }

  /**
  * Mutator for name
  * @param n The name to set
  */
  public void setName(String n){
    m_name = n;
  }

  /**
  * Mutator for age
  * @param a The age to set
  */
  public void setAge(int a){
    m_age = a;
  }

  /**
  * Mutator for address
  * @param ad The address to set
  */
  public void setAddress(String ad){
    m_address = ad;
  }

  /**
  * Mutator for phone number
  * @param pn The phone number to set
  */
  public void setPhoneNum(int pn){
    m_phoneNum = pn;
  }

  /**
  * Mutator for ID number
  * @param id The ID number to set
  */
  public void setID(int id){
    m_id = id;
  }

  /**
  * Mutator for year
  * @param y The year to set
  */
  public void setYear(int y){
    m_year = y;
  }

  /**
  * Accessor for name
  * @return A string representing the name of the affiliate
  */
  public String getName(){
    return m_name;
  }

  /**
  * Accessor for age
  * @return An int representing the age of the affiliate
  */
  public int getAge(){
    return m_age;
  }

  /**
  * Accessor for address
  * @return A string representing the address of the affiliate
  */
  public String getAddress(){
    return m_address;
  }

  /**
  * Accessor for phone number
  * @return An int representing the phone number of the affiliate
  */
  public int getPhoneNum(){
    return m_phoneNum;
  }

  /**
  * Accessor for ID number
  * @return An int representing the ID of the affiliate
  */
  public int getID(){
    return m_id;
  }

  /**
  * Accessor for year
  * @return An int representing the year the affiliate came to Chapman
  */
  public int getYear(){
    return m_year;
  }

  /**
  * Compares two affiliates' years of coming to Chapman
  * @param a An affiliate to compare
  * @return An int where 1 means that the current affiliate year is larger than the parameter affiliate year, -1 means that the current affiliate year is smaller than the parameter affiliate year, and 0 means that they are the same year
  */
  public int compareTo(Affiliate a){
    int i = 0;
    if(this.m_year < a.m_year){
      i = -1;
    } else if(this.m_year > a.m_year){
      i = 1;
    } else{
      i = 0;
    }
    return i;
  }

  /**
  * Prints the output of an affiliate
  */
  public void print(){
    System.out.println("Name: " + this.m_name);
    System.out.println("Age: " + this.m_age);
    System.out.println("Address: " + this.m_address);
    System.out.println("Phone Number: " + this.m_phoneNum);
    System.out.println("ID Number: " + this.m_id);
    System.out.println("Year came to Chapman: " + this.m_year);
  }

  public String toString(){
    String s = "";
    s += m_age + "," + m_address + "," + m_id + "," + m_name + "," + m_phoneNum + "," + m_year;
    return s;
  }

}
