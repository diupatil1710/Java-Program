public class car
{
    int noOfWheels;
    int noOfDoors;
    int maxSpeed;
    String name;
    String modelNumber;
    String company;

    public car(int noOfWheels, int noOfDoors, int maxSpeed, String name, String modelNumber, String company) {
        this.noOfWheels = noOfWheels;
        this.noOfDoors = noOfDoors;
        this.maxSpeed = maxSpeed;
        this.name = name;
        this.modelNumber = modelNumber;
        this.company = company;
    }

    
    @Override
    public String toString() {
        return "car [noOfWheels=" + noOfWheels + ", noOfDoors=" + noOfDoors + ", maxSpeed=" + maxSpeed + ", name="
                + name + ", modelNumber=" + modelNumber + ", company=" + company + "]";
    }


    public static void main(String[] args) {
        car swift = new car(4,4,120,"swift","SW876","maruti");
        System.out.println(swift);
    }
}