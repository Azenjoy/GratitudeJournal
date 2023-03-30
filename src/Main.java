import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String gratitudeworld = gratitudetoday();
        GratitudeLog gratitude = new GratitudeLog();
        gratitude.gratitudelog(gratitudeworld);

    }

    public static String gratitudetoday() {
        String gratitude = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println(" What are you thankful for today? ");
        gratitude = scanner.nextLine();
        System.out.println(" Hello world! ");
        scanner.close();
        return gratitude;
    }

}