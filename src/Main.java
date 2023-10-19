import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Capturar datos para el primer perro
        System.out.println("Datos del primer perro:");
        System.out.print("Nombre: ");
        String nombre1 = scanner.nextLine();
        System.out.print("Raza: ");
        String raza1 = scanner.nextLine();
        System.out.print("Edad: ");
        int edad1 = Integer.parseInt(scanner.nextLine());

        // Instanciar el primer perro
        Perro perro1 = new Perro(nombre1, raza1, edad1);

        // Capturar datos para el segundo perro
        System.out.println("Datos del segundo perro:");
        System.out.print("Nombre: ");
        String nombre2 = scanner.nextLine();
        System.out.print("Raza: ");
        String raza2 = scanner.nextLine();
        System.out.print("Edad: ");
        int edad2 = Integer.parseInt(scanner.nextLine());

        // Instanciar el segundo perro
        Perro perro2 = new Perro(nombre2, raza2, edad2);

        // Invocar los métodos para cada perro
        System.out.println("\nAcciones de los perros:");
        perro1.comer("croquetas", 50);
        System.out.println(perro1.getNombre() + " dice: " + perro1.ladrar());

        perro2.comer("huesos", 150);
        System.out.println(perro2.getNombre() + " dice: " + perro2.ladrar());
    }
}
