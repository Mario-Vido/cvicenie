package sk.stuba.fei.uim.oop;

public class Main {
    public static void main(String[] args) {
        var student = new Contact("Jozko Mrkvicka");
        var absolvent = new Graduate("Ing","Tomas","kovacik");

        System.out.println(student.akoText());
        System.out.println(absolvent.akoText());
        System.out.println(absolvent.akoTextSTitulom());
    }


}
