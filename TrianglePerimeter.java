package triangleperimeter;

import java.util.Scanner;

public class TrianglePerimeter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double triangleEdges[] = new double[3];
        String validationMessage = "The input value is invalid";

        System.out.println("Enter 3 edges of a triangle!");

        for (int i = 0; i < 3; i++) {
            triangleEdges[i] = input.nextDouble();

        }

        if (triangleEdges[0] + triangleEdges[1] <= triangleEdges[2]) {
            System.out.println(validationMessage);

        } else if (triangleEdges[0] + triangleEdges[2] <= triangleEdges[1]) {
            System.out.println(validationMessage);

        } else if (triangleEdges[1] + triangleEdges[2] <= triangleEdges[0]) {
            System.out.println(validationMessage);

        } else {

            double sum = 0;

            for (double value : triangleEdges) {
                sum += value;
            }
            System.out.printf("The perimeter of the triangle is %f.\n\n", sum);

        }

    }

}
