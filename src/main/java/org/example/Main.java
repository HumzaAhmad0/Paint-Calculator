package org.example;
import java.util.Scanner;
import java.util.Vector;


public class Main {


    public static double surfaceAreaSquare(){
        Scanner sc = new Scanner(System.in);
        double tempArea = 0.00;
        double totalAreaRectangle = 0.00;
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
            totalAreaRectangle = totalAreaRectangle + tempArea;
            currentSurface++;

        }
        System.out.println(totalAreaRectangle);

        return totalAreaRectangle;
    }
    public static double surfaceAreaTriangle(){
        Scanner sc = new Scanner(System.in);
        double tempArea = 0.00;
        double totalAreaTriangle = 0.00;
        int numOfSurfaces=0;
        double height;
        double base;
        int currentSurface = 1;

        System.out.println("How many Triangles would you like to enter measurements for?");
        numOfSurfaces = sc.nextInt();

        for(int i = 0; i < numOfSurfaces; i++ ){
            System.out.println("Enter Height Dimension in Meters for surface: " + currentSurface);
            height = sc.nextDouble();
            System.out.println("Enter Base Dimension in Meters for surface " + currentSurface);
            base = sc.nextDouble();

            tempArea = (height*base)/2;
            totalAreaTriangle = totalAreaTriangle + tempArea;
            currentSurface++;

        }
        System.out.println(totalAreaTriangle);

        return totalAreaTriangle;

    }
    public static double surfaceAreaCircle(){
        Scanner sc = new Scanner(System.in);
        double tempArea = 0.00;
        double totalAreaCircle = 0.00;
        int numOfSurfaces=0;
        double radius;
        int currentSurface = 1;

        System.out.println("How many Triangles would you like to enter measurements for?");
        numOfSurfaces = sc.nextInt();

        for(int i = 0; i < numOfSurfaces; i++ ){
            System.out.println("Enter Radius Dimension in Meters for surface: " + currentSurface);
            radius = sc.nextDouble();

            tempArea = Math.PI*(radius*radius);
            totalAreaCircle = totalAreaCircle + tempArea;
            currentSurface++;

        }
        System.out.println(totalAreaCircle);

        return totalAreaCircle;
    }
    public static double surfaceAreaSemiCircle(){
        Scanner sc = new Scanner(System.in);
        double tempArea = 0.00;
        double totalAreaSemiCircle = 0.00;
        int numOfSurfaces=0;
        double radius;
        int currentSurface = 1;

        System.out.println("How many Triangles would you like to enter measurements for?");
        numOfSurfaces = sc.nextInt();

        for(int i = 0; i < numOfSurfaces; i++ ){
            System.out.println("Enter Radius Dimension in Meters for surface: " + currentSurface);
            radius = sc.nextDouble();

            tempArea = (Math.PI*(radius*radius))/2;
            totalAreaSemiCircle = totalAreaSemiCircle + tempArea;
            currentSurface++;

        }
        System.out.println(totalAreaSemiCircle);

        return totalAreaSemiCircle;
    }
    public static double surfaceAreaTrapezoid(){
        Scanner sc = new Scanner(System.in);
        double tempArea = 0.00;
        double totalAreaTrapezoid = 0.00;
        int numOfSurfaces=0;
        double height;
        double base;
        double base2;
        int currentSurface = 1;

        System.out.println("How many Square / Rectangles would you like to enter measurements for?");
        numOfSurfaces = sc.nextInt();

        for(int i = 0; i < numOfSurfaces; i++ ){
            System.out.println("Enter Height Dimension in Meters for surface: " + currentSurface);
            height = sc.nextDouble();
            System.out.println("Enter the first base Dimension in Meters for surface " + currentSurface);
            base = sc.nextDouble();
            System.out.println("Enter the second base Dimension in Meters for surface " + currentSurface);
            base2 = sc.nextDouble();

            tempArea = ((base*base2)/2)*height;
            totalAreaTrapezoid = totalAreaTrapezoid + tempArea;
            currentSurface++;

        }
        System.out.println(totalAreaTrapezoid);

        return totalAreaTrapezoid;
    }
    public static double coveragePerLitreCalc(){
        double result= 0.00;
        double squareMeter = 0.00;
        double liter = 0.00;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the coverage of your paint per square meter");
        System.out.print("Please input the square meters: ");
        squareMeter = sc.nextDouble();
        System.out.print("Please input the liters: ");
        liter = sc.nextDouble();
        result = squareMeter/liter;

        return result;
    }
    public static void question(){
        
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vector<Integer> allSurfaceAreas = new Vector<Integer>();
        double surfaceArea = 0.00;
        double coveragePerLitre = 0.00;
        double volumeNeeded = 0.00;

        System.out.println("Please select how many surface types you wish to calculate for (Square/Rectangles are considered as the same)");
        System.out.println("E.g. 3 (Circle, Triangle, Square)");
        int numOfSurfaceTypes = scanner.nextInt();

        do {
            System.out.println("Please select which surface type you would like to calculate for");
            System.out.println("1: Rectangle / Square");
            System.out.println("2: Triangle");
            System.out.println("3: Circle");
            System.out.println("4: Semi-Circle");
            System.out.println("5: Trapezoid");

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
                case 5:
                    System.out.println("5: Trapezoid");
                    surfaceArea = surfaceArea + surfaceAreaTrapezoid();
                    break;
                default:
                    System.out.println("Not valid input");

                    break;
            }

            numOfSurfaceTypes--;
        }
        while(numOfSurfaceTypes != 0);

        System.out.println(surfaceArea);

        System.out.println("Do you have any non-paint surfaces on the surfaces you mentioned earlier? (yes or no)");
        String response = String.valueOf(scanner);
        if (response == "yes"){

        } else if (response == "no") {

        }
        else {
            System.out.println("Not valid choice");
        }


        // how many coats will be added?
        // divide surface area by coverage rate per litre
        // ask for coverage rate or for them to select options

        coveragePerLitre = coveragePerLitreCalc();


        volumeNeeded = surfaceArea / coveragePerLitre;

        System.out.println("How many coats ");



    }

}