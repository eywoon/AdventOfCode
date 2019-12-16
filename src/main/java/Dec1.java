
import java.lang.Math;
import java.util.ArrayList;

public class Dec1{

    public static double getFuelPerModule(double mass){
        double fuel = Math.floor(mass/3)-2;
        if(fuel >= 0){
            return fuel;
        }
        else return 0;
    }

    public static double getFuelForFuel(double fuel){
        double sum = 0.0;
        while(fuel > 0){
            fuel = getFuelPerModule(fuel);
            sum = fuel + sum;
        }
        return sum;
    }

    public static double calculateTotalConsumption(ArrayList<Double> arrlist){
        double sum = 0;
        for(Double number : arrlist){
            double fuelForFuel = getFuelForFuel(number);
            sum = sum + fuelForFuel;
        }
        return sum;
    }

    public static void main(String[] args){
        ArrayList<Double> arrlist = ParseInput.parseTxt("/Users/Eyrun/Dev/src/main/resources/dec1input.txt");
        double fuel = calculateTotalConsumption(arrlist);
        System.out.println(fuel);
    }
}