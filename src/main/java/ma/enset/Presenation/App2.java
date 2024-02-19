package ma.enset.Presenation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App2 {
    public static void main(String[] args) throws ClassNotFoundException, FileNotFoundException {
        Scanner scanner = new Scanner(new File("config.txt"));
        String daoClassName = scanner.nextLine();
        Class cDao = Class.forName(daoClassName);

    }

}