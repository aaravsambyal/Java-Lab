public class Rectangle {
    int length, width;

    Rectangle(int l, int w){
        length = l;
        width = w;
    }
    void display(){
        System.out.println("Area: "+ length*width);
    }
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 8);
        r1.display();
    }
}
