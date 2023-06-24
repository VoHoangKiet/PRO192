/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package point;

public class Point {
    private double x, y;
//    Hàm khởi tạo mặc định(hàm khởi tạo ko có đối số

    public      Point() {
        this.x = 0;
        this.y = 0;
    }
//    Hàm khởi tạo có 2 đối số

    public      Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setX(double X) {
            x = X;
        }

    public void setY(double Y) {
            y = Y;
        }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }
    
    public void output() {
        System.out.println("(" + this.x + "," + this.y + ")");
    }
    
    public double distance(Point p2){
        return Math.sqrt(Math.pow(this.x - p2.x, 2) + Math.pow(this.y - p2.y, 2));
    }
    
    public double perimeter(Point p2, Point p3){
        double a= this.distance(p3);
        double b= this.distance(p2);
        double c= p2.distance(p3);
        return a+b+c;
    }
    
    public int type(Point p2, Point p3){
        double a= this.distance(p3);
        double b= this.distance(p2);
        double c= p2.distance(p3);
        if(a==b && b==c) return 2;
        else if((Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) || (Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a, 2) || (Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b, 2))))
                if(a==b || b==c || c==a) return 4;
                else return 3;
        else if(a==b || b==c || c==a) return 1;
        else return 5;
    }
    
//    public int type2(Point p2, Point p3){
//        double a= this.distance(p3);
//        double b= this.distance(p2);
//        double c= p2.distance(p3);
//        if ((this.type(p2,p3)==3) && (a==b || b==c || c==a)) return 4;
//        return 0;
//    }
    
    public void checkType(Point p2, Point p3){
        double a= this.distance(p3);
        double b= this.distance(p2);
        double c= p2.distance(p3);
        if ((this.type(p2,p3)==1)) 
        {
            if ((Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) || (Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a, 2) || (Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b, 2)))) System.out.println("Tam giac vuong can");
            else System.out.println("Tam giac can");
        }
        else if ((this.type(p2,p3)==2)) System.out.println("Tam giac deu");
        else if ((this.type(p2,p3)==3)) System.out.println("Tam giac vuong");
        else if ((this.type(p2,p3)==5)) System.out.println("Tam giac");            
    }
    
    public int check(Point p2, Point p3){
        double a= this.distance(p3);
        double b= this.distance(p2);
        double c= p2.distance(p3);
        if(a+b<=c || a+c<=b || b+c<=a) return -1;
        return 0;
    }
    
    public double area(Point p2, Point p3){
        double a= this.distance(p3);
        double b= this.distance(p2);
        double c= p2.distance(p3);
        double p=(a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
    
    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point(3, 0);
        Point p3 = new Point(0,3);
        if (p1.check(p2, p3)== -1) System.out.println("Invalid triangle");
        else if (p1.check(p2, p3)== 0){
            System.out.println("Area of 3 point: " + p1.area(p2, p3));
            System.out.println("Perimeter of 3 point: " + p1.perimeter(p2, p3));
            System.out.println("Type of 3 point: ");
            p1.checkType(p2, p3);
        }
    }
}
