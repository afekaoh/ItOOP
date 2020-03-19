import java.util.Arrays;

/**
 * The class Triangle check.
 * Assigment Ass1.
 *
 * @author Adam Shay Shapira.
 * @author adam.shspira@live.biu.ac.il
 * @author Id 316044809.
 */
public class TriangleCheck {

    /**
     * Main method of the CharCount Class.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        final int numOfTriangleEdges = 3;

        // validity check
        if (args.length != numOfTriangleEdges) {
            System.out.println("Invalid input");
            return;
        }

        // turning the args into a workable format
        double[] triangle = new double[numOfTriangleEdges];
        for (int i = 0; i < triangle.length; i++) {
            triangle[i] = Double.parseDouble(args[i]);
            // validity check
            if (triangle[i] <= 0) {
                System.out.println("Invalid input");
                return;
            }
        }

        // checking for triangle
        if (isTriangle(triangle)) {
            System.out.println("triangle!");
            //  check for right angle only if it's a triangle
            if (isRightAngle(triangle)) {
                System.out.println("right angled!");
            }
        }
    }

    /**
     * Is right angle.
     *
     * @param triangle an array representing 3 edges of a triangle
     * @return if the triangle contains right angle
     */
    public static boolean isRightAngle(final double[] triangle) {
        // checking for right angle with Pythagoras Theorem
        Arrays.sort(triangle);
        return (Math.pow(triangle[0], 2) + Math.pow(triangle[1], 2) == Math.pow(triangle[2], 2));
    }

    /**
     * is Triangle.
     *
     * @param triangle an array representing 3 edges
     * @return true if the the edges represents a triangle and false if not
     */
    public static boolean isTriangle(final double[] triangle) {
        // checking if the edges makes a triangle with the triangle inequality
        Arrays.sort(triangle);
        return triangle[0] + triangle[1] > triangle[2];
    }
}
