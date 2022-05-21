//NAME: Puja Roy
//DATE: 5/21/22

import java.util.*;
import java.io.*;

public class GasPrice {

    // This method will be used to read the data from the file and store it in an arraylist
    public void readData(String fileName, ArrayList<Double> list) {
        File file = new File(fileName);
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String s = sc.nextLine();
                list.add(Double.parseDouble(s));
            }

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }

    }

    // This method will iterate through the list and will calculate the lowest average price
    public void printLowest(ArrayList<Double> list) {
        double min_price = Double.MAX_VALUE;
        int min_week = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < min_price) {
                min_price = list.get(i);
                min_week = i + 1;
            }
        }

        System.out.println("The lowest average price was " + min_price + " in week " + min_week
                + ". The month was " + getMonth(min_week));
    }

    // This method will iterate through the list and will calculate the highest average price
    public void printHighest(ArrayList<Double> list) {
        double max_price = Double.MIN_VALUE;
        int max_week = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max_price) {
                max_price = list.get(i);
                max_week = i + 1;
            }
        }
        System.out.println("The highest average price was " + max_price + " in week " + max_week
                + ". The month was " + getMonth(max_week));
    }

    /*
     * This method will take a string from the user and will check if the user has entered a valid
     * month of the year. If not, it will tell the user to enter the value again and continue the
     * loop until the user enters done. On a valid entry by the user, it will take help of the utility
     * function getMonth and will get a range of start and end week.
     * With this, it will perform parsing of the string and will calculate the average from the 
     * list that is entered as a parameter.
     */
    public void averagePriceForMonth(ArrayList<Double> list) {
        Scanner sc = new Scanner(System.in);
        String ch = "";
        while (true) {
            System.out.println("For which month do you want the average price?");
            ch = sc.nextLine();
            if (ch.equalsIgnoreCase("done")) {
                break;
            }
            String week = getWeek(ch);
            if (week.equals("")) {
                System.out.println("Please enter a valid month\nTry Again!");
                continue;
            }

            String[] temp = week.split(",");
            int start = Integer.parseInt(temp[0]);
            int end = Integer.parseInt(temp[1]);

            double sum = 0;
            int count = 0;
            for (int i = start; i <= end; i++) {
                sum += list.get(i);
                count++;
            }

            double avg = (double) sum / count;

            System.out.println("The average Gas Price in the month of " + ch + " is " + avg);
        }
    }

    /*Utility methods to get the month and the week of the year
     * This method will return a String that will represent a month based on the number of week
     * received.
     * This method works on a bit of assumption since some months have 4 week while some have 5.
     * Also, there could a confusion wherein 1 week might be the end of a month and it could be the
     * start of the next month as well.
     * In this case, an assumption is to be made as in which month should that week belong to.
     */
    private String getMonth(int week) {
        if (week >= 0 && week <= 4) {
            return "January";
        }
        if (week >= 5 && week <= 8) {
            return "February";
        }
        if (week >= 9 && week <= 12) {
            return "March";
        }
        if (week >= 13 && week <= 17) {
            return "April";
        }
        if (week >= 18 && week <= 22) {
            return "May";
        }
        if (week >= 23 && week <= 26) {
            return "June";
        }
        if (week >= 27 && week <= 30) {
            return "July";
        }
        if (week >= 31 && week <= 34) {
            return "August";
        }
        if (week >= 35 && week <= 38) {
            return "September";
        }
        if (week >= 39 && week <= 43) {
            return "October";
        }
        if (week >= 44 && week <= 48) {
            return "November";
        }
        return "December";
    }

    private String getWeek(String month) {
        if (month.equalsIgnoreCase("January")) {
            return "0,4";
        }
        if (month.equalsIgnoreCase("February")) {
            return "5,8";
        }
        if (month.equalsIgnoreCase("March")) {
            return "9,12";
        }
        if (month.equalsIgnoreCase("April")) {
            return "13,17";
        }
        if (month.equalsIgnoreCase("May")) {
            return "18,22";
        }
        if (month.equalsIgnoreCase("June")) {
            return "23,26";
        }
        if (month.equalsIgnoreCase("July")) {
            return "27,30";
        }
        if (month.equalsIgnoreCase("August")) {
            return "31,34";
        }
        if (month.equalsIgnoreCase("September")) {
            return "35,38";
        }
        if (month.equalsIgnoreCase("October")) {
            return "39,43";
        }
        if (month.equalsIgnoreCase("November")) {
            return "44,48";
        }
        if (month.equalsIgnoreCase("December")) {
            return "49,51";
        }
        return "";
    }

    // Driver method to test the code
    public static void main(String[] args) {
        GasPrice obj = new GasPrice();
        String fileName = "Gasprices.txt";
        ArrayList<Double> list = new ArrayList<>();
        obj.readData(fileName, list);
        obj.printLowest(list);
        obj.printHighest(list);
        obj.averagePriceForMonth(list);
    }
}