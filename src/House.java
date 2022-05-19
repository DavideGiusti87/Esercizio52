/*
Encapsulation 01
Exercise: Encapsulation 1

achieve encapsulation using getters/setters and without using Lombok for a class House that has the following instance variables:
an int floorsNumber
a string address
an array of strings residentsNames
use a tester class to:
set the values by asking the user to input them
for the residentsNames, the user will have to input a list of names separated by a comma (e.g. John,Lucy,Peter)
prints the house details using the getters and String.format()
 */
public class House {

    private int floorNumber;
    private String address;
    private String[] residentNames;

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String[] getResidentNames() {
        return residentNames;
    }

    public void setResidentNames(String[] residentNames) {
        this.residentNames = residentNames;
    }
}
