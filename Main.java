public class Main {
    public static void main(String[] args){
        displayGeometricObject circleDefault=new circle();
        displayGeometricObject circle1=new circle(5);

        displayGeometricObject rectangleDefault=new rectangle();
        displayGeometricObject rectangle1=new rectangle(3,4);
        circleDefault.getArea();
        circle1.getArea();

        rectangleDefault.getArea();
        rectangle1.getArea();
    }
}