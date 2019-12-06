import java.io.*;
import java.util.Scanner;

public class Lab11 {
    public static void main (String[] args) {
        System.out.println("Michael Han : Lab 11\n");
        File myObj = new File("javafile.txt");
/*        try {
            File myObj = new File("javafile.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
 */
        try {
            FileWriter myWriter = new FileWriter("javafile.txt");
            System.out.println("write to the file:");
            myWriter.write("This is the first line of text in javafile.txt\n");
            myWriter.write("This is the second line of text in javafile.txt\n");
            myWriter.close();
            System.out.println("Successfully wrote to the file.\n");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        System.out.println("get file information: ");
        if (myObj.exists()) {
            System.out.println("File name: " + myObj.getName());
            System.out.println("Absolute path: " + myObj.getAbsolutePath());
            System.out.println("Writeable: " + myObj.canWrite());
            System.out.println("Readable " + myObj.canRead());
            System.out.println("File size in bytes " + myObj.length());
            System.out.println("");
        } else {
            System.out.println("The file does not exist.");
        }
        System.out.println("first read file: ");
        try {
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        System.out.println("\nadd to the file");
        try {
            String data = "This is the third line of text in javafile.txt\n";
            String data2 = "This is the fourth line of text in javafile.txt\n";
            File f1 = new File(myObj.getAbsolutePath());
            if(!f1.exists()) {
                f1.createNewFile();
            }
            FileWriter fileWriter = new FileWriter(f1.getName(),true);
            BufferedWriter bw = new BufferedWriter(fileWriter);
            bw.write(data);
            bw.write(data2);
            bw.close();
            System.out.println("Done\n");
        } catch(IOException e){
            e.printStackTrace();
        }
        System.out.println("second read file: ");
        try {
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
/*
Output:

Michael Han : Lab 11

write to the file:
Successfully wrote to the file.

get file information:
File name: javafile.txt
Absolute path: /Users/mhan/production/Java Play Area/javafile.txt
Writeable: true
Readable true
File size in bytes 95

first read file:
This is the first line of text in javafile.txt
This is the second line of text in javafile.txt

add to the file
Done

second read file:
This is the first line of text in javafile.txt
This is the second line of text in javafile.txt
This is the third line of text in javafile.txt
This is the fourth line of text in javafile.txt

 */
