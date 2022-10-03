package day47_encapsulation;

public class Login {

    private String userName ; // Non accessible anywhere
    private String passWord ;  // hidden ,,,encapsulated,,,it means

    public void setUserName (String userName) {
        this.userName=userName;  // Accessible anywhere
    }
    public void setPassWord ( String passWord) {
        if (passWord.length() >= 4 ) {
            this.passWord = passWord;
        }

    }

    public String getUserName() {
        return userName; // returns the value to you
    }

    public String getPassWord() {
        return passWord;
    }
}
