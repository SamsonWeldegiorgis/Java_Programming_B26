package day48_encapsulation2.Exam;

public class FinalExam extends GradeActivity{
    int numQuestions;
    double pointEach;
    int numMissed;

    public FinalExam(int numQuestions, int numMissed){
        this.numQuestions=numQuestions;
        this.numMissed = numMissed;
        calcuateNUmericaScore();
    }

    public void calcuateNUmericaScore(){
        pointEach = 100.00/numQuestions;
        double numericScore = 100.00 - (numMissed * pointEach);
        setScore(numericScore);


    }
}
