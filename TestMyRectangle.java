public class TestMyRectangle {
    public static void main(String[] args) {
        // Test constructors and toString()
        MyRectangle rect1 = new MyRectangle(0, 0, 3, 4);
        System.out.println(rect1);  

        MyPoint p1 = new MyPoint(1, 1);
        MyPoint p2 = new MyPoint(4, 5);
        MyRectangle rect2 = new MyRectangle(p1, p2);
        System.out.println(rect2); 

        // Test getters and setters for topLeft and bottomRight points
        MyPoint p3 = new MyPoint(2, 2);
        rect1.setTopLeft(p3);
        System.out.println(rect1.getTopLeft());  
        MyPoint p4 = new MyPoint(5, 6);
        rect1.setBottomRight(p4);
        System.out.println(rect1.getBottomRight());  

        // Test getters and setters for individual coordinates
        rect1.setTopLeftX(0);
        rect1.setTopLeftY(0);
        System.out.println("TopLeftX: " + rect1.getTopLeftX());  
        System.out.println("TopLeftY: " + rect1.getTopLeftY());  

        rect1.setBottomRightX(3);
        rect1.setBottomRightY(4);
        System.out.println("BottomRightX: " + rect1.getBottomRightX()); 
        System.out.println("BottomRightY: " + rect1.getBottomRightY());  

        // Test getWidth(), getHeight(), getArea(), and getPerimeter()
        System.out.println("Width: " + rect1.getWidth());  
        System.out.println("Height: " + rect1.getHeight());  
        System.out.println("Area: " + rect1.getArea());  
        System.out.println("Perimeter: " + rect1.getPerimeter());  

        // Test toString() again after modifications
        System.out.println(rect1);  
    }
}
