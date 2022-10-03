package day52_inheritance.Canvas;

import java.util.ArrayList;

public class Module {

    ArrayList<File> files;

    public Module(ArrayList<File> files) {
        this.files= new ArrayList<>();

    }

    public Module() {

    }

    public void addFile(File file) {
        files.add(file);


     }
     public void removeFile(){
        files.remove(files);


}

    @Override
    public String toString() {
        return "Module{" +
                "files=" + files +
                '}';
    }
}


