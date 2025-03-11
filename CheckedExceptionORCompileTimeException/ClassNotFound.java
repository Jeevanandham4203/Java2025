package CheckedExceptionORCompileTimeException;

public class ClassNotFound {
	public static void main(String[] args) {
        try {
            // Trying to load a non-existent class
            Class.forName("java.lang.Comparable");
            System.out.println("Class found and loaded!");
        } catch (ClassNotFoundException e) {
            System.out.println("Exception: Class not found!"+e);
        }
    }
}

