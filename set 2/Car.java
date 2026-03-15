public class Car {
    String brand;
    double price;

    Car(){
        this("Ferrari", 99999999.99);
    }
    Car(String b, double p){
        brand = b;
        price = p;
    }
    void display(){
        System.out.println("Brand: "+brand+" "+"Price: "+price);
    }
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.display();
    }
}
