package book.example.chapter02;

import com.sun.jmx.snmp.internal.SnmpOutgoingRequest;

/**
 * 2024/05/28
 *
 * @author yangcq6
 */
public class ComputeArea {
    public static void main(String[] args) {
        double radius; // Declare radius
        double area; // Declare area

        // Assign a radius
        radius = 20; // radius is now 20

        // Compute area
        area = radius * radius * 3.14159;

        // Display results
        System.out.println("The area for the circle of radius " +
                radius + " is " + area);
    }
}
