public class rectangle extends displayGeometricObject{
    int side1;
    int side2;
    public rectangle(){
        this.side1=0;
        this.side2=0;
    }
    public rectangle(int side1, int side2){
        this.side1=side1;
        this.side2=side2;
    }
    @Override
    public void getArea(){
        System.out.println("The area of rectangle is "+this.side1*this.side2);
    }
}
