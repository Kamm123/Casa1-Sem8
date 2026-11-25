public class Programador extends Empleado {
    private String lenguaje;

    public Programador(String identificacion, String nombre, double salarioBase, String lenguaje) {
        super(identificacion, nombre, salarioBase);
        this.lenguaje = lenguaje;
    }

    @Override
    public double calcularBono() {
        return getSalarioBase() * 0.20; // 20% del salario base
    }

    @Override
    public String mostrarInformacion() {
        return "[PROGRAMADOR] " + super.mostrarInformacion() +
                " | Lenguaje: " + lenguaje + " | Bono: $" + calcularBono();
    }
}