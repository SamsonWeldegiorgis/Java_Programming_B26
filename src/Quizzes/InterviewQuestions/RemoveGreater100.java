package Quizzes.InterviewQuestions;

import javax.management.openmbean.OpenMBeanAttributeInfo;
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveGreater100 {

    public static void main(String[] args) {

        ArrayList<Integer> num = new ArrayList(Arrays.asList(10,15,13,18,100,200,300,15,215,100,51,101,51,99,10,5,7,3,321));

        num.removeIf(each -> each ==100);

        System.out.println(num);
    }
}
