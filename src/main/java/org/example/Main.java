package org.example;
import java.util.Scanner;
import java.util.Vector;


public class Main {


    public static double surfaceAreaSquare(){
        Scanner sc = new Scanner(System.in);
        double tempArea = 0.00;
        double totalArea = 0.00;
        int numOfSurfaces=0;
        double height;
        double width;
        int currentSurface = 1;

        System.out.println("How many Square / Rectangles would you like to enter measurements for?");
        numOfSurfaces = sc.nextInt();

        for(int i = 0; i < numOfSurfaces; i++ ){
            System.out.println("Enter Height Dimension in Meters for surface: " + currentSurface);
            height = sc.nextDouble();
            System.out.println("Enter Width Dimension in Meters for surface " + currentSurface);
            width = sc.nextDouble();

            tempArea = height*width;
            totalArea = totalArea + tempArea;
            currentSurface++;

        }
        System.out.println(totalArea);

        return totalArea;
    }
    public static double surfaceAreaTriangle(){
        Scanner sc = new Scanner(System.in);
        double tempArea = 0.00;
        double totalAreaTriangle = 0.00;
        int numOfSurfaces=0;
        double height;
        double width;
        int currentSurface = 1;

        System.out.println("How many Square / Rectangles would you like to enter measurements for?");
        numOfSurfaces = sc.nextInt();

        for(int i = 0; i < numOfSurfaces; i++ ){
            System.out.println("Enter Height Dimension in Meters for surface: " + currentSurface);
            height = sc.nextDouble();
            System.out.println("Enter Width Dimension in Meters for surface " + currentSurface);
            width = sc.nextDouble();

            tempArea = height*width;
            totalAreaTriangle = totalAreaTriangle + tempArea;
            currentSurface++;

        }
        System.out.println(totalAreaTriangle);

        return totalAreaTriangle;

    }
    public static double surfaceAreaCircle(){

        return 0;
    }
    public static double surfaceAreaSemiCircle(){

        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vector<Integer> allSurfaceAreas = new Vector<Integer>();
        double surfaceArea = 0.00;
        System.out.println("Please select how many surface types you wish to calculate for (Square/Rectangles are considered as the same)");
        System.out.println("E.g. I have 3 surface types (Circle, Triangle, Square)");
        int numOfSurfaceTypes = scanner.nextInt();

        do {
            System.out.println("Please select which surface type you would like to calculate for");
            System.out.println("1: Rectangle / Square");
            System.out.println("2: Triangle");
            System.out.println("3: Circle");
            System.out.println("4: Semi-Circle");

            int userChoiceSurface = scanner.nextInt();

            switch (userChoiceSurface){
                case 1:
                    System.out.println("1: Rectangle / Square");
                    surfaceArea = surfaceArea + surfaceAreaSquare();
                    break;
                case 2:
                    System.out.println("2: Triangle");
                    surfaceArea = surfaceArea + surfaceAreaTriangle();
                    break;
                case 3:
                    System.out.println("3: Circle");
                    surfaceArea = surfaceArea + surfaceAreaCircle();
                    break;
                case 4:
                    System.out.println("4: Semi-Circle");
                    surfaceArea = surfaceArea + surfaceAreaSemiCircle();
                    break;
                default:
                    System.out.println("error");

                    break;
            }

            numOfSurfaceTypes--;
        }
        while(numOfSurfaceTypes != 0);

        System.out.println(surfaceArea);
        // how many coats will be added?
        // divide surface area by coverage rate per litre
        // ask for coverage rate or for them to select options

    }

}