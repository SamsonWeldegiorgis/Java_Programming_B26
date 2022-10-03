package day43_constructors;

public class ThisKeyWord {

    int  a = 100;
    // java prioritizes this local,,,

    public ThisKeyWord(int a){
        a=400;
       System.out.println(a);
       this.a=600;


    }

}
