public class main {

    public static void main(String[] args) {

        System.out.println("fichas");
        Animal[] animales = {
                new Perro("logan", 4, "jose", "Labrador"),
                new Gato("Dante", 3, "yulieth", true),
                new Ave("hades", 2, "lina", 350)
        };
        for (Animal a : animales) {
            a.imprimirFicha();
        }

        System.out.println("vacunas");
        Perro perro = new Perro("logan", 4, "jose", "Labrador");
        Gato gato = new Gato("Dante", 3, "Yulieth", true);

        perro.registrarVacuna("Rabia");
        perro.registrarVacuna("Coronavirus");
        gato.registrarVacuna("chande");

        System.out.println(perro.getNombre() + " lleva " + perro.getVacunasAplicadas() + " vacunas");
        System.out.println(gato.getNombre() + " lleva " + gato.getVacunasAplicadas() + " vacuna(s)");
        System.out.println("\n poliz");
        Clinica clinica = new Clinica("VetCare", "calle 19 cali");

        Asegurable[] asegurables = { perro, gato, clinica };
        for (Asegurable a : asegurables) {
            System.out.println("Póliza: " + a.obtenerNumeroPoliza()
                    + " | Prima anual: $" + String.format("%,.0f", a.calcularPrimaSeguro()));
        }
    }
}