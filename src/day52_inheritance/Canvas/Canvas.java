package day52_inheritance.Canvas;

import Quizzes.ArraQuizz;

import java.util.ArrayList;

public class Canvas {

    String topic;
    ArrayList<Quiz> quizzes;
    ArrayList<Module> modules;

    public Canvas( String topic ) {
        this.topic = topic;
       quizzes= new ArrayList<>(); // creates an empty ArrayList object
       modules= new ArrayList<>();// creates an empty ArrayList object


    }

    public Canvas(String topic, ArrayList<Quiz> quizzes, ArrayList<Module> modules) {
        this(topic);
        this.quizzes.addAll(quizzes);
        this.modules.addAll(modules);

    }


    @Override
    public String toString() {
        return  "topic='" + topic + '\'' +
                ", quizzes=" + quizzes +
                ", modules='" + modules + '\'' +
                '}';
    }
//    Canvas user1= new Canvas();


}
