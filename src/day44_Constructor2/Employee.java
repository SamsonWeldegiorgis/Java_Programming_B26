package day44_Constructor2;

public class Employee {
     /*
      create a class called Employee - with datas: name, id, job title, salary
      */

     String name;
     int id;
     String jobTitle;
     double salary;

     /*
     - Create constructor that creates an Employee object with the name and job title
 - create a constructor that creates an Employee object with the name, id, job title, and salary
      */

     public Employee(String name, String jobTitle) {
          this.name = name;
          this.jobTitle = jobTitle;
     }

     public Employee(String name, int id, String jobTitle, double salary) {
          this.name = name;
          this.id = id;
          this.jobTitle = jobTitle;
          this.salary = salary;
     }
     /*
     		- method:   	goToMeeting()  	when this method is called print:
               $name is going to a meeting

      */

     public void goToMeeting() {

          System.out.println(name + " is going to a meeting");

     }
          /*
               - method: -   toString()
               */

     @Override
     public String toString() {
          return  name + " - " + jobTitle  + " - " + id  + " - " + "$"+ salary+ " - "  ;
     }
}
