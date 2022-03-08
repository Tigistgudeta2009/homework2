package pl.vistula.homework;

public class EvenOdd {
    public static void main(String[] args) {
        // generating a random number from 1 to 100
        int randomNumber =(int) (Math.random()*(100-1));
        //checking it if is even or odd
        if (randomNumber%2==0)
        {
            System.out.println(randomNumber + "is an even number");

        }
        else
        {
          System.out.println(randomNumber+ " is an odd number");
        }
    }
}
