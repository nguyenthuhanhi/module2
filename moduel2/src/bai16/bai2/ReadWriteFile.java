package bai16.bai2;

import access_modifier.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFile {

    public static final String BLANK = "";
    public static final String DELIMITER = ",";

//    public static void writeToFile(String path, List<Country> countryList){
//        try (BufferedWriter writer=new BufferedWriter(new FileWriter(path))){
//            for (Country country: countryList) {
//                writer.write(country.toString());
//                writer.write("\n");
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }

    public static List<Country> readToFile(String path){
        List<Country>country =new ArrayList<>();
        try (BufferedReader reader=new BufferedReader(new FileReader(path))){
            String line=null;
            while ((line=reader.readLine())!=null){
                if (line.trim().equals(BLANK)){
                    continue;
                }
                String[] result=line.split(DELIMITER);
                Country countries=new Country(result);
                country.add(countries);
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return country;
    }

    public static void main(String[] args) {
      List<Country> countryList= readToFile("D:\\CG\\moduel2\\moduel2\\src\\bai16\\bai2\\country");
      countryList.forEach(System.out::println);
    }
}
