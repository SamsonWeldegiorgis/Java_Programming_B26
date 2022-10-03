package day63_functional_interface;

import java.util.List;

public class Generic2 <T>{


    public void printEach(T [] array){
        for (T each : array){
            System.out.println(each);
        }
    }


    public void printEach(List<T> list){
        for (T each : list){
            System.out.println(each);
        }
    }

}



