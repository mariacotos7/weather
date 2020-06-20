import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.util.Comparator.*;

public class Main {
    public static void main(String[] args) {
        List<Record> records = new ArrayList<>();
        // read file
                try {
                    File myObj = new File("D://set2//excel//result_set2.csv");
                    Scanner myReader = new Scanner(myObj);
                    while (myReader.hasNextLine()) {
                        String data = myReader.nextLine();
                        System.out.println(data.length());
                        if(data !=  null && data.length() > 10) {    //there are 2 empty spaces on the blank lines
                            String[] splitData = data.split(",");
                            Record record = new Record(Integer.parseInt(splitData[1]), Integer.parseInt(splitData[2]), Double.parseDouble(splitData[3]), Double.parseDouble(splitData[4]), Double.parseDouble(splitData[5]), (Double.parseDouble(splitData[5]) - 273.15));
                            records.add(record);

                            System.out.println(record.toString());

                        }
                    }
                    myReader.close();
                } catch (FileNotFoundException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }
        System.out.println("Min temp: " + calclulateMinTemp(records));
        System.out.println("Max Temp: " + calclulateMaxTemp(records));
        Day day = new Day("12.02.2020",calclulateMaxTemp(records), calclulateMinTemp(records));
        //write data in the file
        //writeFile(day);
    }

    public static double calclulateMinTemp(List<Record> records){
        records.sort(comparing(Record::getTemperature));
        return records.get(0).getTemperature();
    }

    public static double calclulateMaxTemp(List<Record> records){
        records.sort(comparing(Record::getTemperature));
        return records.get(records.size() - 1).getTemperature();
    }

//    public static void writeFile(Day day){
//        String fileContent = "Hello Learner !! Welcome to howtodoinjava.com ------------2.";
//    try {
//        //BufferedWriter writer = new BufferedWriter(new FileWriter("d:/first_test.csv", true));
//        //writer.write(fileContent);
//        //writer.close();
//        //CSVWriter writer = new CSVWriter(new FileWriter("D://output.csv"));
//        } catch(IOException e) {
//            System.out.println("An error occurred.");
//            e.printStackTrace();
//        }
//    }
}
