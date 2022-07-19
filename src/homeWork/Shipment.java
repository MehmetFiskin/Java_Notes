package homeWork;

public class Shipment{
    static double costOne;
    static double costTwo;

    public static void main(String[] args) {
        System.out.println("Welcome to shipping calculator!");
        costOne();
        costTwo();

    
    if(costOne==costTwo){
        System.out.println("Package One is the same cost as Package Two: ");
    }else if (costOne<costTwo*2) {
        System.out.println("Package One is slightly more than Package Two");
    }else if (costOne<costTwo*3) {
        System.out.println("Package One is twice Package Two");
    }else if (costOne<costTwo*4) {
        System.out.println("Package One is triple Package Two");
    }else if (costOne<costTwo*5) {
        System.out.println("Package One is quadruple Package Two");
    }else {
        System.out.println("Package One is "+(costOne/costTwo)+" time Package Two");
    }


    }

   public static void costOne(){
       System.out.println("Package 1");
       Package obj = new Package();
       obj.inputLength();
       obj.inputWidth();
       obj.inputHeight();
       obj.displayDimensions();

       if(obj.calcVolume()<=1){
           costOne=3;

       }else {
           costOne=3+obj.calcVolume()-1;

       }
       System.out.println("Package One costs: "+costOne);
   }

    public static void costTwo(){
        System.out.println("Package 2");
        Package obj = new Package();
        obj.inputLength();
        obj.inputWidth();
        obj.inputHeight();
        obj.displayDimensions();



        if(obj.calcVolume()<=1){
            costTwo=3;

        }else {
            costTwo=3+obj.calcVolume()-1;

        }
        System.out.println("Package Two costs: "+costTwo);

    }




}
