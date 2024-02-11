import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//Joleyne Hernandez CSCI 1660 2/08/24

public class Main {
    public static Scanner input = new Scanner(System.in);
    public static ArrayList<String> cities = new ArrayList<>();
    public static ArrayList<Double> averageTemps = new ArrayList<>();
    public static Map<String, Double> hashMap = new HashMap<String, Double>();


    public static String prompt(){
        System.out.println("Enter A City, Type END To Stop");
        String city = input.nextLine();
        return city;
    }
    public static double getAverage(double a, double b, double c, double d, double e){
        double averAge = (a+b+c+d+e)/5;
        return averAge;
    }
    public static void printMap(Map a){
        System.out.println(a);
    }


    public static void main(String[] args) {
        String city = prompt();
        while(!(city.equals("END"))){
            cities.add(city);
            System.out.println(cities);
            city = prompt();

        }
        for (int i = 0; i < cities.size(); i++) {
            System.out.println("What temperature would you like to input for Day 1 in "+cities.get(i));
            double a = input.nextInt();
            System.out.println("What temperature would you like to input for Day 2 in "+cities.get(i));
            double b = input.nextInt();
            System.out.println("What temperature would you like to input for Day 3 in "+cities.get(i));
            double c = input.nextInt();
            System.out.println("What temperature would you like to input for Day 4 in "+cities.get(i));
            double d = input.nextInt();
            System.out.println("What temperature would you like to input for Day 5 in "+cities.get(i));
            double e = input.nextInt();
            double avG = getAverage(a,b,c,d,e);
            averageTemps.add(avG);
        }

        for(int i = 0; i < averageTemps.size(); i++){
            hashMap.put(cities.get(i), averageTemps.get(i));

        }

        printMap(hashMap);




    }
}