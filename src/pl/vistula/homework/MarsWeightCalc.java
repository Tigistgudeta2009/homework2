package pl.vistula.homework;

public class MarsWeightCalc {
    public static void main(String[] args) {

        float earthWeight;
        float marsWeight;
        double marsWeightInDouble;
         int marsWeightInInt;

         earthWeight =80;
         marsWeight = (earthWeight * 0.38F);
         System.out.println(earthWeight + "kg on the earth is" + marsWeight + "kg on the mars");

         // from float to double
        marsWeightInDouble = marsWeight;
        System.out.println("Kilograms on the mars after converting to double " + marsWeightInDouble);

        // printing a variable listing of printing to 5 decimal places

        System.out.printf("kilograms on the  mars displayed to five decimal places: %.5f %n" , marsWeightInDouble);

        // from float  caste to integer

        marsWeightInInt =(int) marsWeightInDouble;
        System.out.println("Kilograms on the mars when casted to integer " + marsWeightInInt);

        //casting int type to char
         char c = (char) marsWeightInInt;
         System.out.println("The ASCII table equivalent of marsWeight is: " + c);

         //assign the value of performing some mathematical operation on the char character to the  new int variables
         int exampleOfMathOnChar = c*c;
         System.out.println("An example of a mathematical operation on the char type:" + exampleOfMathOnChar);

    }


}
