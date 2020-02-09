
import java.util.Scanner;

public class Car {
   private String make;                 //make and model of this car
   private String model;
   private int numberOfDoors;          //number of door in this car
   private int year;                   //year of this car

//mutator methods
   public void setMake(String newMake) {
       make = newMake;
   }

   public void setYear(int theYear) {
        year = theYear;
   }


//access methods
   public String getMake() {
        return make;
   }

   public int getYear() {
        return year;
   }



 // main method for testing of the Car class
   public static void main (String [] args) {
      Scanner in = new Scanner(System.in);
      String aMake;
      int aYear;

      //create two Car objects
      Car car1 = new Car();
      Car car2 = new Car();

      //test setting of  make and year methods
      System.out.println("Enter make of first car");
      aMake = in.nextLine();
      System.out.println("what is the year of the first car? ");
      aYear = in.nextInt();
      car1.setMake(aMake);
      car1.setYear(aYear);

      in.nextLine();   // since a number was just read, there will be an /n still unread in the input .. this clears it
      System.out.println("Enter make of second car");
      aMake = in.nextLine();
      System.out.println("what is the year of the second car? ");
      aYear = in.nextInt();
      car2.setMake(aMake);
      car2.setYear(aYear);

      // output Car info entered so far
      System.out.println("The first car is a " + car1.getMake() + " made in " + car1.getYear() );
      System.out.println("The first car is a " + car2.getMake() + " made in " + car2.getYear() );
   }

}
