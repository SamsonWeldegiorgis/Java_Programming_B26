package day49_inheritance.Employee;

public class Developer extends Employee {

        /*
    - Developer class inherits Employee class

    - create additional variables:
        features created

    - create method:
        develop()
            Example output: prints Creating more features
         */

        String featuresCreated;

        public void develop(){
            System.out.println(featuresCreated +" is creating more features");
        }
    }

