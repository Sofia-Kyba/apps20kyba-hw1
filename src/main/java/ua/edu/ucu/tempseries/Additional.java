package ua.edu.ucu.tempseries;

public class Additional {
    public void printName(){
        String email = "kyba@ucu.edu.ua";
        System.out.println(email.split("@")[0].replace(".", "_"));
    }
}

class Main{
    public static void main(String[] args) {
        Additional add = new Additional();
        add.printName();
    }
}
