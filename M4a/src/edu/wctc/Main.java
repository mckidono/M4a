package edu.wctc;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner keyboard = new Scanner(System.in);
    private static PaintCalculator PaintCalulater=new PaintCalculator();
    PrintWriter outputFile =new PrintWriter("data.txt");

    public Main() throws FileNotFoundException {
    }

    private static void printMenu(){
        System.out.println("1.Add room\n" +
                "2.View rooms\n" +
                "3.Read rooms from file\n" +
                "4.Write rooms to file\n" +
                "5.Exit program\n");


    }
    private static double promptForDimension(String dimensionName){

        System.out.print("Enter "+ dimensionName+": ");
        double n=keyboard.nextDouble();
       return n;
    }
    private static void createRoom(){
        double width =0;
        double height=0;
        double length=0;
        String[] dimension={"Width","Height","Length"};
        for (int x=0;x<=2;x++){
        if (x==0){
            width=promptForDimension(dimension[x]);
        }
        else if (x==1){
            height=promptForDimension(dimension[x]);
        }
        else {
            length=promptForDimension(dimension[x]);
        }
        }

        PaintCalulater.addRoom(length,width,height);
        System.out.println("Room created \n");

    }
    private static void readFile() throws FileNotFoundException {
        int x=0;
        Scanner fileReader=new Scanner(new File("data.txt"));
        List<String> fileData=new ArrayList<>();
        while(fileReader.hasNext()){
            fileData.add(fileReader.nextLine());
            System.out.println(fileData.get(x));
            x++;
        }
    }
    private static void writeFile() throws FileNotFoundException {
        PrintWriter pw=new PrintWriter("data.txt");
        String out=PaintCalulater.toString();
        pw.println(out);
        pw.flush();
        pw.close();


    }
    public static void main(String[] args) throws IOException {


        printMenu();
        System.out.print("Enter Selection: ");
        int desc=keyboard.nextInt();
        while (desc<5){
        if(desc==1){
            createRoom();
            printMenu();
            System.out.print("Enter Selection: ");
            desc=keyboard.nextInt();
        }
        else if (desc==2){

            String output=PaintCalulater.toString();
            System.out.println(output);
            printMenu();
            System.out.print("Enter Selection: ");
            desc=keyboard.nextInt();
        }
        else if(desc==3){
            readFile();
            printMenu();
            System.out.print("Enter Selection: ");
            desc=keyboard.nextInt();
        }
        else if (desc==4){
            writeFile();
            printMenu();
            System.out.print("Enter Selection: ");
            desc=keyboard.nextInt();

        }
        }
    }
    }

