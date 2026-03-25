public class problem3 {
    public static void main(String[] args) {
        class Vehicle{
            String vehicleNo;
            String ownerName;
            Vehicle(String v, String o){
                vehicleNo = v;
                ownerName = o;
            }
        }
        class Car extends Vehicle{
            String model;
            String fuelType;
            Car(String v, String o, String m, String f){
                super(o,v);
                model = m;
                fuelType = f;
            } 
            void display(){
                System.out.println("Vehicle no: "+vehicleNo+" Owner: "+ownerName+" Model: "+model+" Fuel Type: "+fuelType);
            }
        }
        Car c = new Car("JK21QWERTY", "Abc", "Model Y", "Octane");
        c.display();
    }
}
