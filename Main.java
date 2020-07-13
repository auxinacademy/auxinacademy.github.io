import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Are you tall enough to ride the roller-coaster?");
        Boolean tallEnough = in.nextBoolean();
        System.out.println("Are you old enough to ride the roller-coaster?");
        Boolean oldEnough = in.nextBoolean();
        if(tallEnough && oldEnough) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}




