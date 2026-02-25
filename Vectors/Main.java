public class Main {

    public static void main(String[] args) {

        try {
            Vector v1 = new Vector(new double[]{1, 2, 3});
            Vector v2 = new Vector(new double[]{4, 5, 6});

            System.out.println("Vector 1:");
            v1.display();

            System.out.println("Vector 2:");
            v2.display();

            Vector sum = v1.add(v2);
            System.out.println("Addition:");
            sum.display();

            Vector diff = v1.subtract(v2);
            System.out.println("Subtraction:");
            diff.display();

            double dot = v1.dotProduct(v2);
            System.out.println("Dot Product: " + dot);

        } catch (VectorException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
