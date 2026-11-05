
class ComplexNumber {
    double real, imaginary;

    // Constructor
    ComplexNumber(double r, double i) {
        real = r;
        imaginary = i;
    }

    ComplexNumber add(ComplexNumber c) {
        return new ComplexNumber(
            real + c.real,
            imaginary + c.imaginary
        );
    }

    ComplexNumber subtract(ComplexNumber c) {
        return new ComplexNumber(
            real - c.real,
            imaginary - c.imaginary
        );
    }

    ComplexNumber multiply(ComplexNumber c) {
        return new ComplexNumber(
            real * c.real - imaginary * c.imaginary,
            real * c.imaginary + imaginary * c.real
        );
    }

    ComplexNumber divide(ComplexNumber c) {
        double d = c.real * c.real +
                   c.imaginary * c.imaginary;

        if (d == 0)
            throw new ArithmeticException("Division by zero");

        return new ComplexNumber(
            (real * c.real + imaginary * c.imaginary) / d,
            (imaginary * c.real - real * c.imaginary) / d
        );
    }

    void display() {
        System.out.println(real + " + " + imaginary + "i");
    }

    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(5, 3);
        ComplexNumber c2 = new ComplexNumber(2, 4);

        System.out.print("Addition: ");
        c1.add(c2).display();

        System.out.print("Subtraction: ");
        c1.subtract(c2).display();

        System.out.print("Multiplication: ");
        c1.multiply(c2).display();

        System.out.print("Division: ");
        c1.divide(c2).display();
    }
}
