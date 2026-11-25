public class Main {
    public static void main(String[] args) {
        Empleado e1 = new Programador("E01", "Kamila", 2000.0, "Java");
        Empleado e2 = new Tester("E02", "Fernando", 1600.0, "Automatizadas");
        Empleado e3 = new Disenador("E03", "Tihago", 1500.0, "Figma");

        EmpresaSoftware empresa = new EmpresaSoftware("DevQuito");
        empresa.agregarEmpleado(e1);
        empresa.agregarEmpleado(e2);
        empresa.agregarEmpleado(e3);

        System.out.println(empresa.mostrarEmpleados());

        System.out.println("Total a pagar en bonos: $" + empresa.calcularTotalBonos());
    }
}