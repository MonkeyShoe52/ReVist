import java.io.File;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws Exception{

        NBA.readData();
        Olympia.readData();

        for(Sports sports : Sports.getSports()) {
            System.out.println(sports);
        }
    }

}