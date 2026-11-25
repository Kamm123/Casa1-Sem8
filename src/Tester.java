public class Tester extends Empleado {
    private String tipoPruebas;

    public Tester(String identificacion, String nombre, double salarioBase, String tipoPruebas) {
        super(identificacion, nombre, salarioBase);
        this.tipoPruebas = tipoPruebas;
    }

    @Override
    public double calcularBono() {
        return getSalarioBase() * 0.15; // 15% del salario base
    }

    @Override
    public String mostrarInformacion() {
        return "[TESTER] " + super.mostrarInformacion() +
                " | Pruebas: " + tipoPruebas + " | Bono: $" + calcularBono();
    }
}