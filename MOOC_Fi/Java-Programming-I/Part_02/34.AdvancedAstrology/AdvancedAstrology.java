public class AdvancedAstrology {

    public static void printStars(int number) {
        // prints the given number of stars
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // produces the number of spaces specified by number
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // uses printSpaces and printStars to print a right-leaning triangle
        for (int i = 1; i <= size; i++) {
            printSpaces(size - i);
            printStars(i);
        }
    }

    public static void christmasTree(int height) {
        // Prints Christmas tree consisting of a triangle with the specified height as well as the base. 
        // The base is two stars high and three stars wide, and is placed at the center of the triangle's bottom.
        // The tree is to be constructed by using the methods printSpaces and printStars.
        
        for (int i = 1; i <= height; i++) {
            printSpaces(height - i);
            printStars(i * 2 - 1);
        }
        // tree base
        printSpaces(height - 2);
        printStars(3);
        printSpaces(height - 2);
        printStars(3);
    }

    public static void main(String[] args) {
        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}

