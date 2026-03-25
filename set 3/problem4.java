public class problem4 {
    public static void main(String[] args) {
        class Product{
            String name;
            int price;
            Product(String n, int p){
                name = n;
                price = p;
            }
        }
        class Electronics extends Product{
            int warrantyPeriod;
            Electronics(String n, int p, int w){
                super(n,p);
                warrantyPeriod = w;
            }
            void display(){
                System.out.println("Name: "+name+" Price: "+price+" Warranty: "+warrantyPeriod+" months");
            }
        }
        Electronics e= new Electronics("Washing Machine", 59999, 18);
        e.display();
    }
}
