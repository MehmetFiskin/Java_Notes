package homeWork;

import java.util.Scanner;

public class Package {
    private double length;//Package should have three private instance variables of type double named length, width, and height.
    private double width;
    private double height;

    Scanner input = new Scanner(System.in);



    public Package() {
        this.length = 1.0;
        this.width = 1.0;
        this.height = 1.0;
    }

    public Package(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Package(Package packageCopy){
        this.length = packageCopy.length;
        this.width = packageCopy.width;
        this.height = packageCopy.height;
    }

    public  void inputLength(){
        System.out.println("Enter the length");
        length =input.nextDouble();
        System.out.println("The length is: "+length);
    }

    public  void inputWidth(){
        System.out.println("Enter the width");
        width =input.nextDouble();
        System.out.println("The Width is: "+length);
    }

    public  void inputHeight(){
        System.out.println("Enter the height");
        height =input.nextDouble();
        System.out.println("The height is: "+length);
    }

    public void displayDimensions(){
        System.out.println("Dimensions: "+length+" X "+width+" X "+height);
    }

    public double calcVolume(){
        return length*width*height;
    }


}
