import java.util.Arrays;
import java.util.Scanner;

/*
Encapsulation 01
Exercise: Encapsulation 1

use a tester class to:
set the values by asking the user to input them
for the residentsNames, the user will have to input a list of names separated by a comma (e.g. John,Lucy,Peter)
prints the house details using the getters and String.format()
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        House house = new House();

        System.out.println("Type in the floor you live on and hit enter");
        house.setFloorNumber(scanner.nextInt());

        System.out.println("Type in your address and hit enter");
        house.setAddress(scanner.next());

        System.out.println("Type the names of all residents separated by commas and press enter");
        house.setResidentNames(scanner.next().split(","));

        System.out.println(String.format("%s live in %s on the %d floor", Arrays.toString(house.getResidentNames()),house.getAddress(),house.getFloorNumber()));
    }
}
