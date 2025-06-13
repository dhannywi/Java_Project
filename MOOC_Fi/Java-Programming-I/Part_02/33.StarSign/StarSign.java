public class StarSign {

    public static void main(String[] args) {
        printStars(3);
        System.out.println("\n---");
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        // prints the given number of stars and a line break
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSquare(int size) {
    // prints the correct sized square by using the `printStars` method
        for (int i = 0; i < size; i++) {
            printStars(size);
        }
    }

    public static void printRectangle(int width, int height) {
    // prints the correct sized rectangle by using the `printStars` method
        for (int i = 0; i < height; i++) {
            printStars(width);
        }
    }

    public static void printTriangle(int size) {
    // prints a triangle by using the `printStars` method
        for (int i = 0; i < size; i++) {
            printStars(i+1);
        }
    }
}