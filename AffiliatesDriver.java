import java.util.HashMap;
import java.util.Scanner;
import java.util.Collections;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.LinkedList;
import java.util.ArrayList;
import java.io.IOException;
import java.util.Arrays;
/**
* The AffiliatesDriver class implements and runs the database of affiliates
* @author Nathan Nguyen
* @version 1.0
* @see Affiliate
*/

public class AffiliatesDriver{

  /** A hashmap representing the database of affiliates */
  private static HashMap<Integer, Affiliate> dataBase;

  /**
  * Creates a record of the affiliate in the database
  */
  public static void createRecord(){
    Scanner sin = new Scanner(System.in);
    String type = "";

      System.out.print("Enter type of affiliate: ");
      type = sin.nextLine();

      System.out.print("Enter name of affiliate: ");
      String name = sin.nextLine();

      System.out.print("Enter age of affiliate: ");
      int age = Integer.parseInt(sin.nextLine());

      System.out.print("Enter address of affiliate: ");
      String address = sin.nextLine();

      System.out.print("Enter phone number of affiliate: ");
      int phoneNum = Integer.parseInt(sin.nextLine());

      System.out.print("Enter ID of affiliate: ");
      int id = Integer.parseInt(sin.nextLine());

      System.out.print("Enter the year the affiliate came to Chapman: ");
      int year = Integer.parseInt(sin.nextLine());

    if(type.equals("Assistant")){
      System.out.print("Enter department of affiliate: ");
      String dept = sin.nextLine();
      System.out.print("Enter salary of affiliate: ");
      int salary = Integer.parseInt(sin.nextLine());
      System.out.print("Enter number of papers by affiliate: ");
      int numPapers = Integer.parseInt(sin.nextLine());
      System.out.print("Enter number of years until tenure for affiliate: ");
      int yearsUntilTenure = Integer.parseInt(sin.nextLine());

      Assistant tempAssist = new Assistant(name, age, address, phoneNum, id, year, dept, salary, numPapers, yearsUntilTenure);
      AffiliatesDriver.dataBase.put(id, tempAssist);
    }

    if(type.equals("Associate")){
      System.out.print("Enter department of affiliate: ");
      String dept = sin.nextLine();
      System.out.print("Enter salary of affiliate: ");
      int salary = Integer.parseInt(sin.nextLine());
      System.out.print("Enter number of papers by affiliate: ");
      int numPapers = Integer.parseInt(sin.nextLine());
      System.out.print("Enter number of years since tenure for affiliate: ");
      int yearsSinceTenure = Integer.parseInt(sin.nextLine());

      Associate tempAssociate = new Associate(name, age, address, phoneNum, id, year, dept, salary, numPapers, yearsSinceTenure);
      AffiliatesDriver.dataBase.put(id, tempAssociate);
    }

    if(type.equals("Full")){
      System.out.print("Enter department of affiliate: ");
      String dept = sin.nextLine();
      System.out.print("Enter salary of affiliate: ");
      int salary = Integer.parseInt(sin.nextLine());
      System.out.print("Enter number of papers by affiliate: ");
      int numPapers = Integer.parseInt(sin.nextLine());
      System.out.print("Enter number of years until retirement for affiliate: ");
      int yearsToRetire = Integer.parseInt(sin.nextLine());

      Full tempFull = new Full(name, age, address, phoneNum, id, year, dept, salary, numPapers, yearsToRetire);
      AffiliatesDriver.dataBase.put(id, tempFull);
    }

    if(type.equals("Graduate")){
      System.out.print("Enter major of affiliate: ");
      String major = sin.nextLine();
      System.out.print("Enter minor of affiliate: ");
      String minor = sin.nextLine();
      System.out.print("Enter class standing affiliate: ");
      String classStanding = sin.nextLine();
      System.out.print("Enter number of published papers by affiliate: ");
      int numPapers = Integer.parseInt(sin.nextLine());
      System.out.print("Enter name of thesis advisor for affiliate:");
      String thesisAdvisor = sin.nextLine();

      Graduate tempGrad = new Graduate(name, age, address, phoneNum, id, year, major, minor, classStanding, numPapers, thesisAdvisor);
      AffiliatesDriver.dataBase.put(id, tempGrad);
    }

    if(type.equals("Undergraduate")){
      System.out.print("Enter major of affiliate: ");
      String major = sin.nextLine();
      System.out.print("Enter minor of affiliate: ");
      String minor = sin.nextLine();
      System.out.print("Enter class standing affiliate: ");
      String classStanding = sin.nextLine();
      System.out.print("Enter number of courses taken by affiliate: ");
      int numCourses = Integer.parseInt(sin.nextLine());
      System.out.print("Enter amount of scholarhsip earned by affiliate:");
      int scholarshipAmt = Integer.parseInt(sin.nextLine());

      Undergraduate tempUnderGrad = new Undergraduate(name, age, address, phoneNum, id, year, major, minor, classStanding, numCourses, scholarshipAmt);
      AffiliatesDriver.dataBase.put(id, tempUnderGrad);
    }

    if(type.equals("FullTime")){
      System.out.print("Enter the title of the affiliate: ");
      String title = sin.nextLine();
      System.out.print("Enter the building of the affiliate: ");
      String building = sin.nextLine();
      System.out.print("Enter the yearly salary of the affiliate: ");
      int yearlySalary = Integer.parseInt(sin.nextLine());

      FullTime tempFullTime = new FullTime(name, age, address, phoneNum, id, year, title, building, yearlySalary);
      AffiliatesDriver.dataBase.put(id, tempFullTime);
    }

    if(type.equals("PartTime")){
      System.out.print("Enter the title of the affiliate: ");
      String title = sin.nextLine();
      System.out.print("Enter the building of the affiliate: ");
      String building = sin.nextLine();
      System.out.print("Enter the hourly salary of the affiliate: ");
      int hourlySalary = Integer.parseInt(sin.nextLine());

      PartTime tempPartTime = new PartTime(name, age, address, phoneNum, id, year, title, building, hourlySalary);
      AffiliatesDriver.dataBase.put(id, tempPartTime);
    }

  }

  /**
  * Prints all of the information about an affiliate
  * @param a The affiliate ID desired to print information about
  */
  public static void printInfo(int a){
    dataBase.get(a).print();
  }

  /**
  * Lists all of the affiliates by seniority
  * @param hm The hashmap full of affiliates to sort
  */
  public static void ListOrder(HashMap<Integer, Affiliate> hm){
    LinkedList<Affiliate> a = new LinkedList<Affiliate>();

    for(int key: hm.keySet()){
      a.add(hm.get(key));
    }

    Collections.sort(a);
    for(Affiliate af: a){
      System.out.println("Name: " + af.getName());
      System.out.println("Year: " + af.getYear());
      System.out.println();
    }

  }

  /**
  * Deletes a record of the affiliate from the database
  * @param a The affiliate ID to delete
  */
  public static void deleteRecord(int a){
    dataBase.remove(a);
    if(!(AffiliatesDriver.dataBase.containsKey(a))){
      System.out.println("SUCCESSFULLY DELETED.");
    } else{
      System.out.println("UNSUCCESSFULLY DELETED.");
    }
  }

  /**
  * Saves the data of the affiliates to a file
  */
  public static void saveData(){
    Scanner sin = new Scanner(System.in);
    System.out.print("Enter name of file you would like to save to: ");
    String fileName = sin.nextLine();
    try{
      PrintWriter pw = new PrintWriter(new FileWriter(fileName));
      for(int key: AffiliatesDriver.dataBase.keySet()){
        pw.println(AffiliatesDriver.dataBase.get(key));
      }
      pw.close();
      System.out.println("SUCCESSFULLY SAVED TO " + fileName);
    } catch(IOException e){
      System.err.println("Couldn't output to file");
      e.printStackTrace();
    }
  }

  /**
  * Restores the database from a file
  */
  public static void restoreData(){
    Scanner sin = new Scanner(System.in);
    System.out.print("Enter the filename you wish to restore from: ");
    String fileRestore = sin.nextLine();
    try{
      BufferedReader br = new BufferedReader(new FileReader(fileRestore));
      String line = "";
      while((line = br.readLine())!=null){
        String[] record = line.split(",");
        String type = record[0];
        int age = Integer.parseInt(record[1]);
        String address = record[2];
        int id = Integer.parseInt(record[3]);
        String name = record[4];
        int phoneNum = Integer.parseInt(record[5]);
        int year = Integer.parseInt(record[6]);

        if(type.equals("Assistant")){
          String dept = record[7];
          int salary = Integer.parseInt(record[8]);
          int numPapers = Integer.parseInt(record[9]);
          int yearsUntilTenure = Integer.parseInt(record[10]);
          Assistant tempAssist = new Assistant(name, age, address, phoneNum, id, year, dept, salary, numPapers, yearsUntilTenure);
          AffiliatesDriver.dataBase.put(id, tempAssist);
        }

        if(type.equals("Associate")){
          String dept = record[7];
          int salary = Integer.parseInt(record[8]);
          int numPapers = Integer.parseInt(record[9]);
          int yearsSinceTenure = Integer.parseInt(record[10]);

          Associate tempAssociate = new Associate(name, age, address, phoneNum, id, year, dept, salary, numPapers, yearsSinceTenure);
          AffiliatesDriver.dataBase.put(id, tempAssociate);
        }

        if(type.equals("Full")){
          String dept = record[7];
          int salary = Integer.parseInt(record[8]);
          int numPapers = Integer.parseInt(record[9]);
          int yearsToRetire = Integer.parseInt(record[10]);

          Full tempFull = new Full(name, age, address, phoneNum, id, year, dept, salary, numPapers, yearsToRetire);
          AffiliatesDriver.dataBase.put(id, tempFull);
        }

        if(type.equals("Graduate")){
          String major = record[7];
          String minor = record[8];
          String classStanding = record[9];
          int numPapers = Integer.parseInt(record[10]);
          String thesisAdvisor = record[11];

          Graduate tempGrad = new Graduate(name, age, address, phoneNum, id, year, major, minor, classStanding, numPapers, thesisAdvisor);
          AffiliatesDriver.dataBase.put(id, tempGrad);
        }

        if(type.equals("Undergraduate")){
          String major = record[7];
          String minor = record[8];
          String classStanding = record[9];
          int numCourses = Integer.parseInt(record[10]);
          int scholarshipAmt = Integer.parseInt(record[11]);

          Undergraduate tempUnderGrad = new Undergraduate(name, age, address, phoneNum, id, year, major, minor, classStanding, numCourses, scholarshipAmt);
          AffiliatesDriver.dataBase.put(id, tempUnderGrad);
        }

        if(type.equals("FullTime")){
          String title = record[7];
          String building = record[8];
          int yearlySalary = Integer.parseInt(record[9]);

          FullTime tempFullTime = new FullTime(name, age, address, phoneNum, id, year, title, building, yearlySalary);
          AffiliatesDriver.dataBase.put(id, tempFullTime);
        }

        if(type.equals("PartTime")){
          String title = record[7];
          String building = record[8];
          int hourlySalary = Integer.parseInt(record[9]);

          PartTime tempPartTime = new PartTime(name, age, address, phoneNum, id, year, title, building, hourlySalary);
          AffiliatesDriver.dataBase.put(id, tempPartTime);
        }

      }
      br.close();
      System.out.println("SUCCESSFULLY RESTORED.");

    } catch(Exception e){
      System.err.println("Couldn't read from file");
      e.printStackTrace();
    }
  }

  /**
  * Implements and runs the database program
  * @param args A string array
  */
  public static void main(String[] args){
    String choiceString = "\n1) Create an affiliate record\n2) Print information for an Affiliate given the ID\n3) List all affiliates in order of seniority\n4) Delete a record given the ID\n5) Save your database to a file\n6) Restore your database from a file\n7) Exit\n";
    int choice = 0;
    boolean done = false;
    dataBase = new HashMap<Integer, Affiliate>();

    Scanner scnr = new Scanner(System.in);

    System.out.println("Welcome to the Chapman Affiliate Database. Choose an option: ");
    System.out.println(choiceString);
    System.out.print("ENTER YOUR CHOICE: ");
    choice = scnr.nextInt();

    while(done == false){

      switch(choice){
        case 1:
          AffiliatesDriver.createRecord();
          System.out.print(choiceString + "\nENTER YOUR CHOICE: ");
          choice = scnr.nextInt();
          break;

        case 2:
          System.out.print("Enter the affiliate ID number: ");
          int idNum1 = scnr.nextInt();
          if(dataBase.containsKey(idNum1)){
            AffiliatesDriver.printInfo(idNum1);
          }else{
            System.out.println("No person found with that ID number.");
          }
          System.out.print(choiceString + "\nENTER YOUR CHOICE: ");
          choice = scnr.nextInt();
          break;

        case 3:
          if(AffiliatesDriver.dataBase.isEmpty()){
            System.out.println("Database is empty.");
          } else{
            AffiliatesDriver.ListOrder(AffiliatesDriver.dataBase);
          }
          System.out.print(choiceString + "\nENTER YOUR CHOICE: ");
          choice = scnr.nextInt();
          break;

        case 4:
          System.out.print("Enter the ID number of the affiliate you would like to delete: ");

          int idNum2 = scnr.nextInt();
          if(dataBase.containsKey(idNum2)){
            AffiliatesDriver.deleteRecord(idNum2);
          }else{
            System.out.println("No person found with that ID number.");
          }
          System.out.print(choiceString + "\nENTER YOUR CHOICE: ");
          choice = scnr.nextInt();
          break;

        case 5:
          AffiliatesDriver.saveData();
          System.out.print(choiceString + "\nENTER YOUR CHOICE: ");
          choice = scnr.nextInt();
          break;

        case 6:
          AffiliatesDriver.restoreData();
          System.out.print(choiceString + "\nENTER YOUR CHOICE: ");
          choice = scnr.nextInt();
          break;

        case 7:
          System.out.println("Have a nice day!");
          done = true;
          break;

        default:
          System.out.println("Please put in a valid response.");
          System.out.print(choiceString + "\nENTER YOUR CHOICE: ");
          choice = scnr.nextInt();
          break;

        }
      }
  }

}
