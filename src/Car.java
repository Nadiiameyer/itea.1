public class Car {

    String color;
    float weight;

    void printColorAndWeight(){
        System.out.println(color + " " + weight);
    }

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.color="black";
        car1.weight=1200.5f;
        car1.printColorAndWeight();

    }


}
