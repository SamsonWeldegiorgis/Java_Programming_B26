package day43_constructors;

import java.util.Locale;

public class Offer {
    /*
    		create a class called Offer with -  data:  location, company, salary, is full time, number of PTO

     */
    String location;
    String company;
    double salary;
    boolean isFullTime;
    int numberOfPto;

    /*
    	- constructor
				- create a constructor that creates an Offer object with the company and location
				- create a constructor that creates an Offer object with the company, location, and salary
- create a constructor that creates an Offer object with the company, location, salary, is full time, and number of PTO
     */

    public Offer(String company) {
        this.company = company;
    }

    public Offer(String company, String location) {
        this.company = company;
        this.location = location;

    }

    public Offer(String company, String location, double salary) {
        this.company = company;
        this.location = location;
        this.salary = salary;
    }

    public Offer(String company, String location, double salary, boolean isFullTime, int numberOfPto) {
        this.company = company;
        this.location = location;
        this.salary = salary;
        this.isFullTime = isFullTime;
        this.numberOfPto = numberOfPto;
    }
//
//    @Override
//    public String toString() {
//        return "\nCompany : " + company +
//                "\nLocation : " + location +
//                "\nSalary : " + salary +
//                "\nIsFullTime :" + isFullTime +
//                "\nNumber Of PTO :" + numberOfPto;

    /*
     method:  toString()   ,,,,,,,,,,,,,
print all the employees information
     */

    public String toString() {
        String info = company + " is located in " + location;

        info += " - " + (salary > 0 ? salary : "");

        info += " - " + (isFullTime ? " Full Time " : "Contract");

        info += "\n " + (numberOfPto > 0 ? numberOfPto : "");

        return info;
    }
}


