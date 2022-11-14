import java.util.Scanner;

public class Entrada {
    public static String getString(String text){
        System.out.println(text);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static int getInt(String text){
        System.out.println(text);
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()){
            System.out.println("ingresa un numero entero");
            scanner.next();
        }
        return scanner.nextInt();
    }
}
