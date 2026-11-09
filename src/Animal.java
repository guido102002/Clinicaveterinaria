public abstract class Animal {

    protected String nombre;
    protected int edad;
    protected String nombreDueno;

    public Animal(String nombre, int edad, String nombreDueno) {
        this.nombre = nombre;
        this.edad = edad;
        this.nombreDueno = nombreDueno;
    }

    public abstract double calcularCostoConsulta();

    public void imprimirFicha() {
        System.out.println("nombre: " + nombre);
        System.out.println("edad: " + edad + " años");
        System.out.println("Propietario: " + nombreDueno);
        System.out.println("Valor $" + String.format("%,.0f", calcularCostoConsulta()));
        System.out.println("------------------------------");
    }

    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public String getNombreDueno() { return nombreDueno; }
}