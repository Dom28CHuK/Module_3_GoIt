public class QuadraticEquationSolver {
    public double[] solve(int a, int b, int c) {
        double[] roots;

        double discriminant = b * b - 4 * a * c;

        if (discriminant < 0) {
            roots = new double[0];
        } else if (discriminant == 0) {
            roots = new double[1];
            roots[0] = -b / (2.0 * a);
        } else {
            roots = new double[2];
            roots[0] = (-b + Math.sqrt(discriminant)) / (2.0 * a);
            roots[1] = (-b - Math.sqrt(discriminant)) / (2.0 * a);

            if (roots[0] < roots[1]) {
                double temp = roots[0];
                roots[0] = roots[1];
                roots[1] = temp;
            }
        }

        return roots;
    }
}
