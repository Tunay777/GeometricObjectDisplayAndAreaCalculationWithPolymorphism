public class circle extends displayGeometricObject{
    int radius;
    public circle(){
        this.radius=0;
    }
    public circle(int radius){
        this.radius=radius;
    }

    @Override
    public void getArea() {
        System.out.println("The diameter of the circle is "+this.radius+" and the are of the circle is"+Math.PI*radius*radius);
    }
}
