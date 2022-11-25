import java.util.Scanner;

// import javax.sound.sampled.SourceDataLine;

public class project {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int myNumber = (int) (Math.random() * 100);
        int UserNumber = 0;

        do {
            System.out.println("Guess My number: ");
            UserNumber = sc.nextInt();

            if (UserNumber == myNumber) {
                System.out.println("WOOHOO correct number!!");
                break;
            } else if (UserNumber > myNumber) {
                System.out.println("Your number is too large");

            } else {
                System.out.println("Your number is too small");

            }
        } while (UserNumber >= 0);

        System.out.println("My number was : ");
        System.out.println(myNumber);
    }

}
