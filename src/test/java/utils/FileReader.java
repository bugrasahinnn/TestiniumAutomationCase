package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {

    public static String getLineFromCSV() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/test/resources/kitap_turu.csv"));
        return sc.next();
    }
}
