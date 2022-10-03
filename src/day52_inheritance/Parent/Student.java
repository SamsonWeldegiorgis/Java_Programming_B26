package day52_inheritance.Parent;

public class Student extends Person {

    private int id;
    private String schoolName;


    public Student(String name, char gender, int age, int id, String schoolName) {
        super(name, gender, age);
        this.id = id;
        this.schoolName = schoolName;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void study() {
        System.out.println(getName() + " is studying");
    }

    public void attendClass() {
        System.out.println(getName() + " is attending");
    }

    @Override
    public String toString() {
        return "Student{" +
                super.toString() +
                "id=" + id +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}
