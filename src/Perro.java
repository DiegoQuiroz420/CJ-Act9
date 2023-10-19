public class Perro {
    // Atributos privados
    private String nombre;
    private String raza;
    private int edad;

    // Constructor
    public Perro(String nombre, String raza, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Método comer
    public void comer(String comida, double cantidadEnGramos) {
        System.out.println(nombre + " está comiendo " + cantidadEnGramos + " gramos de " + comida + ".");
    }

    // Método ladrar
    public String ladrar() {
        return "¡Guau guau!";
    }
}
