class Circle{

    private int radius;

    public Circle(int radius){
        this.radius=radius;
    }

    public double getArea(){

        return radius*radius*Math.PI;
    }
}

public class CircleTest{
    
    public static void main(String[] args){

        Circle circle = new Circle(5);

        double area=circle.getArea();

        System.out.println(area);
    }
}