public class Vector {

    private double[] arr;

    // Constructor: allows only 2D or 3D
    public Vector(double[] arr) throws VectorException {
        if (arr == null) {
            throw new VectorException("Array cannot be null.");
        }
        if (arr.length != 2 && arr.length != 3) {
            throw new VectorException("Vector must be strictly 2D or 3D.");
        }
        this.arr = arr;
    }

    // Dimension check method (USED BY ALL OPERATIONS)
    private void checkDimension(Vector v) throws VectorException {
        if (this.arr.length != v.arr.length) {
            throw new VectorException("Vectors must have same dimensions.");
        }
    }

    // Add vectors
    public Vector add(Vector v) throws VectorException {
        checkDimension(v);
        double[] result = new double[arr.length];

        for (int i = 0; i < arr.length; i++) {
            result[i] = this.arr[i] + v.arr[i];
        }
        return new Vector(result);
    }

    // Subtract vectors
    public Vector subtract(Vector v) throws VectorException {
        checkDimension(v);
        double[] result = new double[arr.length];

        for (int i = 0; i < arr.length; i++) {
            result[i] = this.arr[i] - v.arr[i];
        }
        return new Vector(result);
    }

    // Dot product
    public double dotProduct(Vector v) throws VectorException {
        checkDimension(v);
        double sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += this.arr[i] * v.arr[i];
        }
        return sum;
    }

    // Display vector
    public void display() {
        System.out.print("Vector: ");
        for (double value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
