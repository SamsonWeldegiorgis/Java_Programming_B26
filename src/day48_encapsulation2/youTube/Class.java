package day48_encapsulation2.youTube;

public class Class {

    String name;
    int version;

    public Class(String name, int version){
        this.name=name;
        this.version=version;
    }

    public void downLoad(){
        System.out.println(name + " is downloading "+ version + " version" );
    }

    @Override
    public String toString() {
        return "Class{" +
                "name='" + name + '\'' +
                ", version=" + version +
                '}';
    }
}
