import java.io.File;
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class ParseInput {

    public static ArrayList<Double> parseTxt(String inputFile){
        ArrayList<Double> arrlist = new ArrayList<Double>();

        try{
            File file = new File(inputFile);
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                arrlist.add(Double.parseDouble(sc.nextLine()));
            }
        }
        catch(IOException e){
            System.out.println(e);
        }

        return arrlist;
    }
}
