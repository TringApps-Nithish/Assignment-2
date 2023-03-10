/*2. Design a class for a basic shape. The class should have the following features:
- An instance variable for the shape's type (e.g. triangle, rectangle, circle).
- An instance variable for the shape's dimensions (e.g. side lengths for a triangle, length and width for a rectangle, radius for a circle).
- A constructor that allows the user to create a shape with a given type and dimensions.
- A method that calculates and returns the perimeter of the shape.
- A method that calculates and returns the area of the shape.*/

import java.util.*;

class declaration {

    double triangle,rectangle, circle, side1, side2, base, length, width, radius;
    String s;
    declaration(double sd1, double sd2, double bs,String shp) {

        side1 = sd1;
        side2 = sd2;
        base = bs;
        s=shp;
        System.out.printf("\n "+s+" created successfully \n ");
    }

    declaration(double lnth, double wdth,String shp) {
        length = lnth;
        width = wdth;
        s=shp;
        System.out.printf("\n "+s+" created successfully \n ");
    }

    declaration(double rds,String shp) {
        radius = rds;
        s=shp;
        System.out.printf("\n "+s+" created successfully \n ");
    }

    double area(double base, float height) {

        return 0.5 * base * height;

    }

    double perimeter(double side1, double side2, double base) {

        return side1 + side2 + base;

    }

    double area(double length, double width) {
        return length * width;

    }

    double perimeter(double length, double width) {

        return 2 * (length + width);

    }

    double area(double radius) {

        return radius * radius * 3.14;

    }

    double perimeter(double radius) {

        return 2 * 3.14 * radius;

    }

}

class shape {
    public static void main(String args[]) {
        int ch = 0;
        Scanner sc = new Scanner(System.in);
        System.out.printf("\t\t----- Area and Perimeter Calculation -----");
        while (ch != 4)
        {

            System.out.printf("\n\n 1.Triangle \n 2.Rectangle \n 3.Circle \n 4.Exit \n Enter your choice : ");
            ch = sc.nextInt();
            switch (ch) {
                case 1: {
                    System.out.printf("\n Enter the Base Value : ");
                    double base = sc.nextDouble();
                    System.out.printf(" Enter the Lenth value : ");
                    float length = sc.nextFloat();
                    System.out.printf(" Enter the Hypotenuse : ");
                    double Hypotenuse = sc.nextDouble();
                    declaration ob = new declaration(base ,length , Hypotenuse,"Triangle");
                    System.out.printf("\n Area of Triangle : " + ob.area(base, length));
                    System.out.printf("\n Perimeter of Tri angle : " + ob.perimeter(base ,length , Hypotenuse));
                }
                    break;

                case 2: {
                    System.out.printf("\n Enter the Length Value : ");
                    double length = sc.nextDouble();
                    System.out.printf(" Enter the Width Value : ");
                    double width = sc.nextDouble();
                    declaration ob = new declaration(length, width,"Rectangle");
                    System.out.printf("\n Area of Rectangle : " + ob.area(length, width));
                    System.out.printf("\n Perimeter of Rectangle : " + ob.perimeter(length, width));
                }
                    break;

                case 3: {
                    System.out.printf("\n Enter the Radius Value : ");
                    double radius = sc.nextDouble();
                    declaration ob = new declaration(radius,"Circle");
                    System.out.printf("\n Area of Circle : " + ob.area(radius));
                    System.out.printf("\n Perimeter of Circle : " + ob.perimeter(radius));
                }
                    break;
                case 4:
                    System.exit(0);
                    break;

                default:
                    System.out.printf("\n Invalid Choice");
                    break;
            }
        }
    sc.close();
    }
}
