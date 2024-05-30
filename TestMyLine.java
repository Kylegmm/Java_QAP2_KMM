public class TestMyLine {
    public static void main(String[] args) {
        // Test constructors and toString()
        MyLine line1 = new MyLine(0, 0, 3, 4);
        System.out.println(line1);  

        MyPoint p1 = new MyPoint(1, 1);
        MyPoint p2 = new MyPoint(4, 5);
        MyLine line2 = new MyLine(p1, p2);
        System.out.println(line2);  

        // Test getters and setters for begin and end points
        MyPoint p3 = new MyPoint(2, 2);
        line1.setBegin(p3);
        System.out.println(line1.getBegin());  
        MyPoint p4 = new MyPoint(5, 6);
        line1.setEnd(p4);
        System.out.println(line1.getEnd());  

        // Test getters and setters for begin and end coordinates
        line1.setBeginX(0);
        line1.setBeginY(0);
        System.out.println("BeginX: " + line1.getBeginX()); 
        System.out.println("BeginY: " + line1.getBeginY()); 

        line1.setEndX(3);
        line1.setEndY(4);
        System.out.println("EndX: " + line1.getEndX());  
        System.out.println("EndY: " + line1.getEndY());  

        // Test getters and setters for begin and end coordinates as arrays
        line1.setBeginXY(1, 1);
        int[] beginXY = line1.getBeginXY();
        System.out.println("BeginXY: (" + beginXY[0] + "," + beginXY[1] + ")");  

        line1.setEndXY(4, 5);
        int[] endXY = line1.getEndXY();
        System.out.println("EndXY: (" + endXY[0] + "," + endXY[1] + ")");  

        // Test getLength()
        System.out.println("Length: " + line1.getLength()); 

        // Test getGradient()
        System.out.println("Gradient: " + line1.getGradient());  

        // Test toString() again after modifications
        System.out.println(line1);  
    }
}
