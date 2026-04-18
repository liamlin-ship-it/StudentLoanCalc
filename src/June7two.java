public class June7two {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie", "David", "Eve"};

        try {
            for (int i = 0; i <= names.length; i++) {
                System.out.println(names[i]);
            }
        } catch (ArrayIndexOutOfBoundsException error) {
            System.out.println("Error: Index is out of bounds.");
            System.out.println(error.getMessage());
        }

        System.out.println("Program continues after exception handling.");
    }
}
