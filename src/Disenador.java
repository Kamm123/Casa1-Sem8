public class Disenador extends Empleado {
    private String herramienta;

    public Disenador(String identificacion, String nombre, double salarioBase, String herramienta) {
        super(identificacion, nombre, salarioBase);
        this.herramienta = herramienta;
    }

    @Override
    public double calcularBono() {
        return getSalarioBase() * 0.12; // 12% del salario base
    }

    @Override
    public String mostrarInformacion() {
        return "[DISEÑADOR] " + super.mostrarInformacion() +
                " | Herramienta: " + herramienta + " | Bono: $" + calcularBono();
    }
}