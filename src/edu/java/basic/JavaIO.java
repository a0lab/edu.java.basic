package edu.java.basic;

import java.io.*;

public class JavaIO {

    public void readBytes() throws IOException {
        byte data[] = new byte[100];
        System.out.println("Enter a line of characters");
        System.in.read(data);
        System.out.println("You entered the below text");
        for (int i = 0; i < data.length; i++) {
            System.out.print((char) data[i]);
        }
    }

    public void readAndWriteBytes() throws IOException {
        byte data[] = new byte[100];
        System.out.println("Enter a line of characters");
        System.in.read(data);
        System.out.println("You entered the below text");
        for (int i = 0; i < data.length; i++) {
            System.out.write((char) data[i]);
        }
    }

    public void displayTextFile(String filePath) {
//         java <mainClass> test.txt
//        if (args.length != 1) {
//            System.out.println("Usage: java HelloJava <fileName.ext>");
//            return;
//        }

        int i;
        FileInputStream fileInput;

        try {
            fileInput = new FileInputStream(filePath);

        } catch (FileNotFoundException ex) {
            System.out.println("File not found. pleaes give correct file/path" + ex);
            return;
        }

        try {
            // read until EOF encountered
            do {
                i = fileInput.read();
                if (i != -1) System.out.write((char) i);
            } while (i != -1);

        } catch(IOException ex)  {
            System.out.println("Error reading file" + ex);
        } finally {
            try {
                if (fileInput != null) fileInput.close();
            }  catch (IOException ex) {
                System.out.println("Error closing file");
            }
        }

    }

    public void copyFile(String sourceFile, String destFile ) {
//         java <mainClass> test.txt test-copy.txt
//        if (args.length != 2) {
//            System.out.println("Usage: java HelloJava <sourceFileName.ext> <destinationFileName.ext>");
//            return;
//        }
//        new JavaIO().copyFile(args[0], args[1]);

        int i;
        FileInputStream fileInput;
        FileOutputStream fileOutput;

        try {
            fileInput = new FileInputStream(sourceFile);
            fileOutput = new FileOutputStream(destFile);

        } catch (FileNotFoundException ex) {
            System.out.println("Error while opening source file or creating destination file" + ex);
            return;
        }

        try {
            // read until EOF encountered
            do {
                i = fileInput.read();
                if (i != -1) fileOutput.write(i);
            } while (i != -1);
            System.out.println("File copied successfully.");
        } catch(IOException ex)  {
            System.out.println("Error reading file" + ex);
        } finally {
            try {
                if (fileInput != null) fileInput.close();
            }  catch (IOException ex) {
                System.out.println("Error closing source file");
            }
            try {
                if (fileInput != null) fileInput.close();
            }  catch (IOException ex) {
                System.out.println("Error closing destination file");
            }
        }

    }
}
