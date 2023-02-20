package bai16.bai1;

import access_modifier.Student;

import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;

public class CoppyFileText {

    public static final String BLANK = "";

    public static ArrayList<String> readCoppyFileTest(String path) {
        ArrayList<String> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                if (line.trim().equals(BLANK)) {
                    continue;
                }
                list.add(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
    public static void writeCoppyFileTest(String path,ArrayList<String> strings){
        try (BufferedWriter writer=new BufferedWriter(new FileWriter(path))){
            for (String s:strings) {
                writer.write(s);
                writer.write("\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        ArrayList<String> strings=readCoppyFileTest("D:\\CG\\moduel2\\moduel2\\src\\bai16\\coppy");
        writeCoppyFileTest("D:\\CG\\moduel2\\moduel2\\src\\bai16\\coppyfile",strings);
    }
}



