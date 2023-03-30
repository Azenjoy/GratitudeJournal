import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class GratitudeLog {

        public static void gratitudelog (String gratitude) {
            String path = "C:\\Temp\\StatsResults\\GratitudeLog.txt";
            File file = new File(path);
            String inf = "";
            if (file.exists()) {
                try {

                    Scanner myReader = new Scanner(file);
                    while (myReader.hasNextLine()) {
                        inf += myReader.nextLine() + '\n';

                    }
                    myReader.close();

                    //	System.out.println(inf);
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            } else {
                try {
                    if (file.createNewFile()) {
                        ;
                    } else {
                        System.out.println("file does not exist " + path);
                    }
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

            }
            DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("E MMM dd yyyy HH:mm:ss");
            LocalDateTime myDateObj = LocalDateTime.now();
            String formattedDate = myDateObj.format(myFormatObj);
            String contentToAppend = '\n' + " ____________ " + '\n' + " gratitude results " + '\n' +formattedDate
                    + '\n' + " ------------ " + '\n' + gratitude + '\n';

            try {
                Files.write(Paths.get(path), contentToAppend.getBytes(), StandardOpenOption.APPEND);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            System.out.println(" gratitude log " + '\n' + contentToAppend);
//            write.close();
            //	System.out.println("game stats " + '\n' + inf + '\n' + contentToAppend);
        } // booleanresults
    }
