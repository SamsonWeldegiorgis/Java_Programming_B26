package day52_inheritance.Amazon;

public class AmazonAccount {

    private String userName;
    private String email;
    private boolean hasPrime;

    public AmazonAccount(String userName, String email, boolean hasPrime){
        this.userName = userName;
        this.email = email;
        this.hasPrime=hasPrime;

    }

    public String getUserName(){
        return userName;
    }
    public void setUserName(String userName){
        this.userName=userName;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }

    public boolean getHasPrime(){
        return hasPrime;
    }

    public void setHasPrime(){
        this.email=email;
    }

    @Override
    public String toString() {
        return "userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", " + (hasPrime ? "Has Prime : " :
                 "No Prime");
    }
}

