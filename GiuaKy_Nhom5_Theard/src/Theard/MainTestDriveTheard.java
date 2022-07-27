package Theard;

public class MainTestDriveTheard {
    public static void main(String[] args) {
        TheardA theardA = new TheardA();
        theardA.start();
        TheardB theardB = new TheardB();
        theardB.start();
        System.out.println("This is code outside Theard");
    }

}
