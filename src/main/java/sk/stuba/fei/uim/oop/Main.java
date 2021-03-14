package sk.stuba.fei.uim.oop;

public class Main {
    public static void main(String[] args) {

        var absolvent = new Graduate("Ing","Tomas","kovacik");
        absolvent.setFriends(new Graduate("Ing","Martin","kranec"),new Graduate("Ing","Jakub","kovac"));

        System.out.println(absolvent.akoText());
        System.out.println(absolvent);


    }


}
