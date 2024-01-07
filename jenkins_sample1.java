import java.util.Scanner;
class Circle{
    double radius;
    String color;
    Circle()
    {
        radius=2.0;
        color="red";
    }
    Circle(double radius)
    {
        this.radius=radius;
        color="red";
    }
    Circle(double radius,String color)
    {
        this.radius=radius;
        this.color=color;
    }
    double getArea()
    {
        return Math.PI*radius*radius;
    }
    double getRadius()
    {
        return radius;
    }
    String getColor()
    {
        return color;
    }
    
}
class Cylinder extends Circle
{
    double height;
    Cylinder()
    {
        super();
        height=5.0;
    }
    Cylinder(double height)
    {
        super();
        this.height=height;
    }
    Cylinder(double height, double radius)
    {
        super(radius);
        this.height=height;
    }
    Cylinder(double height, double radius, String color)
    {
        super(radius,color);
        this.height=height;
    }
    double getHeight()
    {
        return height;
    }
    double getVolume()
    {
        return (super.getArea()*height);
    }
    double getArea()
    {
        return (2*Math.PI*radius*height+2*super.getArea());
    }
    void check (Cylinder c1,Cylinder c2){
        if((c1.radius==c2.radius)&& (c1.height==c2.height)&&(c1.color.equals(c2.color)))
            System.out.println("The cylinders 1 and 2 are similar");
        else
        System.out.println("The cylinders 1 and 2 are not similar");
    }
}
public class jenkins_sample1
{
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	 
        Cylinder c=new Cylinder();
        System.out.println("Enter the details of cylinder1 (height , radius and color)");
        double h = s.nextDouble();
        s.nextLine();
        double r = s.nextDouble();
        s.nextLine();
        String st = s.nextLine();
        Cylinder c1 = new Cylinder(h,r,st);
        System.out.println("Enter the details of cylinder2 (height , radius and color)");
        double height = s.nextDouble();
        s.nextLine();
        double rad = s.nextDouble();
        s.nextLine();
        String string = s.nextLine();
        Cylinder c2 = new Cylinder(height,rad,string);
        
        c.check(c1,c2);


	}
}
