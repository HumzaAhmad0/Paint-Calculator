package org.example;
import java.util.Scanner;

public class Main {

    public static double surfaceAreaSquare(){
        double tempArea;
        double totalAreaRectangle=0;
        int numOfSurfaces;
        double height;
        double width;
        int currentSurface = 1;

        numOfSurfaces = validInputInt("How many Squares / Rectangles would you like to enter measurements for?");

        for(int i = 0; i < numOfSurfaces; i++ ){
            System.out.println("For Square/Rectangle number: " + currentSurface);
            height = validInputDouble("Enter Height Dimension in Meters: ");
            System.out.println("For Square/Rectangle number: " + currentSurface);
            width = validInputDouble("Enter Width Dimension in Meters: ");

            tempArea = height*width;
            totalAreaRectangle = totalAreaRectangle + tempArea;
            currentSurface++;
        }
        //System.out.println(totalAreaRectangle);
        return totalAreaRectangle;
    }
    public static double surfaceAreaTriangle(){
        double tempArea;
        double totalAreaTriangle = 0.00;
        int numOfSurfaces;
        double height;
        double base;
        int currentSurface = 1;

        numOfSurfaces = validInputInt("How many Triangles would you like to enter measurements for?");

        for(int i = 0; i < numOfSurfaces; i++ ){
            System.out.println("For Triangle number: " + currentSurface);
            height = validInputDouble("Enter Height Dimension in Meters: ");
            System.out.println("For Triangle number: " + currentSurface);
            base = validInputDouble("Enter Base Dimension in Meters: ");

            tempArea = (height*base)/2;
            totalAreaTriangle = totalAreaTriangle + tempArea;
            currentSurface++;
        }
        //System.out.println(totalAreaTriangle);
        return totalAreaTriangle;
    }
    public static double surfaceAreaCircle(){
        double tempArea;
        double totalAreaCircle = 0.00;
        int numOfSurfaces;
        double radius;
        int currentSurface = 1;

        numOfSurfaces = validInputInt("How many Circles would you like to enter measurements for?");

        for(int i = 0; i < numOfSurfaces; i++ ){
            System.out.println("For Circle number: " + currentSurface);
            radius = validInputDouble("Enter Radius Dimension in Meters: ");
            tempArea = Math.PI*(radius*radius);
            totalAreaCircle = totalAreaCircle + tempArea;
            currentSurface++;
        }
        //System.out.println(totalAreaCircle);
        return totalAreaCircle;
    }
    public static double surfaceAreaOval(){
        double tempArea;
        double totalAreaOval = 0.00;
        int numOfSurfaces;
        double radiusOne;
        double radiusTwo;
        int currentSurface = 1;

        numOfSurfaces = validInputInt("How many Ovals would you like to enter measurements for?");

        for(int i = 0; i < numOfSurfaces; i++ ){
            System.out.println("for Oval number: " + currentSurface);
            radiusOne = validInputDouble("Enter the first Radius Dimension in Meters:");
            System.out.println("For Oval number: " + currentSurface);
            radiusTwo = validInputDouble("Enter the second Radius Dimension in Meters:");

            tempArea = Math.PI*(radiusOne*radiusTwo);
            totalAreaOval = totalAreaOval + tempArea;
            currentSurface++;
        }
        //System.out.println(totalAreaOval);
        return totalAreaOval;
    }
    public static double surfaceAreaSemiCircle(){
        double tempArea;
        double totalAreaSemiCircle = 0.00;
        int numOfSurfaces;
        double radiusOne;
        double radiusTwo;
        int currentSurface = 1;

        numOfSurfaces = validInputInt("How many Semi Circles would you like to enter measurements for?");

        for(int i = 0; i < numOfSurfaces; i++ ){
            System.out.println("for Semi-Circle number: " + currentSurface);
            radiusOne = validInputDouble("Enter the first Radius Dimension in Meters:");
            System.out.println("For Semi-Circle number: " + currentSurface);
            radiusTwo = validInputDouble("Enter the second Radius Dimension in Meters:");

            tempArea = (Math.PI*(radiusOne*radiusTwo))/2;
            totalAreaSemiCircle = totalAreaSemiCircle + tempArea;
            currentSurface++;
        }
        //System.out.println(totalAreaSemiCircle);
        return totalAreaSemiCircle;
    }
    public static double surfaceAreaTrapezoid(){
        double tempArea;
        double totalAreaTrapezoid = 0.00;
        int numOfSurfaces;
        double height;
        double base;
        double base2;
        int currentSurface = 1;

        //System.out.println("How many Trapezoids would you like to enter measurements for?");
        numOfSurfaces = validInputInt("How many Trapezoids would you like to enter measurements for?");

        for(int i = 0; i < numOfSurfaces; i++ ){
            System.out.println("For Trapezoid number: " + currentSurface);
            height = validInputDouble("Enter Height Dimension in Meters: ");
            System.out.println("For Trapezoid number: " + currentSurface);
            base = validInputDouble("Enter the first base Dimension in Meters: ");
            System.out.println("For Trapezoid number: " + currentSurface);
            base2 = validInputDouble("Enter the second base Dimension in Meters: ");

            tempArea = ((base*base2)/2)*height;
            totalAreaTrapezoid = totalAreaTrapezoid + tempArea;
            currentSurface++;
        }
        System.out.println(totalAreaTrapezoid);

        return totalAreaTrapezoid;
    }
    public static double coveragePerLitreCalc(){
        double result;
        double squareMeter;
        double liter;
        squareMeter = validInputDouble("Please enter the coverage of your paint per square meter\n" + "Please input the square meters: ");
        liter = validInputDouble("Please input the liters: ");
        result = squareMeter/liter;

        return result;
    }
    public static double question(){
        double surfaceArea = 0.00;

        //int numOfSurfaceTypes = validInputInt("Please select how many surface types you wish to calculate for (Square/Rectangles are considered as the same)\n" + " E.g. 3 (Circle, Triangle, Square) (as an integer e.g. 1,2,3,4, etc)");
        int numOfSurfaceTypes = validInputInt("""
                Please select how many different surface types you wish to calculate for
                E.g. 3 (Circle, Triangle, Square) (as an integer e.g. 1,2,3,4, etc)
                (Square/Rectangles are considered as the same)""");

        do {
            int userChoiceSurface = validInputInt("""
                    Please select which surface type you would like to calculate for
                    1: Rectangle / Square
                    2: Triangle
                    3: Circle
                    4: Semi-Circle
                    5: Trapezoid
                    6: Oval""");

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
                case 6:
                    System.out.println("5: Oval");
                    surfaceArea = surfaceArea + surfaceAreaOval();
                    break;
                default:
                    System.out.println("Not valid input");
                    break;
            }
            numOfSurfaceTypes--;
        }
        while(numOfSurfaceTypes != 0);
        return surfaceArea;
    }
    public static double validInputDouble(String question){
        Scanner sc = new Scanner(System.in);
        boolean valid= false;
        double userResponse = 0.00;
        do {
            System.out.println(question);
            if(sc.hasNextDouble()) {
                double tempUserResponse = sc.nextDouble();
                if(tempUserResponse>0.00){
                    userResponse = tempUserResponse;
                    valid = true;
                }
                else{
                    System.out.println("Please input only positive numbers greater than 0");
                }
            }
            else {
                System.out.println("Please enter numbers in numerical format");
                sc.next();
            }
        }while(!valid);
        return userResponse;
    }
    public static int validInputInt (String question){
        Scanner sc = new Scanner(System.in);
        boolean valid= false;
        int userResponse = 0;
        do {
            System.out.println(question);
            if(sc.hasNextInt()) {
                int tempUserResponse = sc.nextInt();
                if(tempUserResponse>0){
                    userResponse = tempUserResponse;
                    valid = true;
                }
                else{
                    System.out.println("Please input only positive numbers ");
                }
            }
            else {
                System.out.println("Please whole numbers in numerical format");
                sc.next();
            }
        }while(!valid);
        return userResponse;
    }

    public static void main(String[] args) {
        double surfaceArea;
        double coveragePerLitre;
        double volumeNeeded;
        double removableSurfaceArea = 0.00;
        double finalSurfaceArea;
        boolean validInput = true;

        surfaceArea = question();
        System.out.println(surfaceArea);

        do {
            int nonPaintResponse = validInputInt("Do you have any non-paint surfaces on the surfaces you mentioned earlier? (1 for yes or 2 for no)");
            if (nonPaintResponse==1 || nonPaintResponse== 2){
                if (nonPaintResponse == 1){
                    removableSurfaceArea = question();
                } else{
                    removableSurfaceArea = 0.00;
                }
            } else {
                System.out.println("Not valid choice");
                validInput = false;
            }
        }while(!validInput);

        coveragePerLitre = coveragePerLitreCalc();
        finalSurfaceArea = surfaceArea - removableSurfaceArea;

        int numOfCoats = validInputInt("How many coats of paint are required?");
        volumeNeeded = (finalSurfaceArea / coveragePerLitre) * numOfCoats;

        double litrePerCan = validInputDouble("How many Litres of paint are in one paint-can");
        double numOfCansNeeded = (volumeNeeded/litrePerCan);
        double finalCansNeeded = Math.ceil(numOfCansNeeded);

        System.out.println("You need: " + volumeNeeded + " Litres of paint");
        System.out.println("You need " + finalCansNeeded + " number of " + litrePerCan + "L cans");
    }
}