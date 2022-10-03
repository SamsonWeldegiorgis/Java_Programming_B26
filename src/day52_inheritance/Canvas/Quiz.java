package day52_inheritance.Canvas;

public class Quiz {

    String topic;
    int NumberOfQuestions;
    double totalPoints;

    public Quiz(String topic, int totalNumberOfQuestions, double totalPoints) {
        this.topic = topic;
        this.NumberOfQuestions = totalNumberOfQuestions;
        this.totalPoints = totalPoints;
    }

    public void takeQuiz(){
        System.out.println("Taking" + topic + "quiz");

}

    @Override
    public String toString() {
        return "Quiz{" +
                "topic='" + topic + '\'' +
                ", NumberOfQuestions=" + NumberOfQuestions +
                ", totalPoints=" + totalPoints +
                '}';
    }
}
