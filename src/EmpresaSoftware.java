import java.util.ArrayList;

public class EmpresaSoftware {
    private String nombreEmpresa;
    private ArrayList<Empleado> empleados;

    public EmpresaSoftware(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        if (empleado != null) {
            empleados.add(empleado);
        }
    }

    public double calcularTotalBonos() {
        double total = 0;
        for (Empleado e : empleados) {
            total += e.calcularBono();
        }
        return total;
    }

    public String mostrarEmpleados() {
        String resultado = "=== Personal de " + nombreEmpresa + " ===\n";
        for (Empleado e : empleados) {
            resultado += "- " + e.mostrarInformacion() + "\n";
        }
        return resultado;
    }
}