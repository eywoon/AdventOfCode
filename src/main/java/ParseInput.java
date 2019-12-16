import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class ParseInput {

    //parse lines with no delimeter
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

    //parse csv to int map
    public static Map<Integer, Integer> parseTxtLineWithDelimeter(String inputFile){
        HashMap<Integer, Integer> arrlist = new HashMap<Integer, Integer>();

        try{
            File file = new File(inputFile);
            Scanner sc = new Scanner(file).useDelimiter(",");
            int index = 0;
            while (sc.hasNextInt()) {
                arrlist.put(index, sc.nextInt());
                index++;
            }
            sc.close();
        }
        catch(IOException e){
            System.out.println(e);
        }

        return arrlist;
    }
}
