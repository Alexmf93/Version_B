//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Empleado Pedro = new Empleado("Pedro","Pérez",1300,6,"B");
        Pedro.mostrarInformacion();
        Pedro.calcularSueldo();

        Empleado Ana = new Empleado("Ana","Diez");
        Ana.mostrarInformacionSolo();

        Empleado Carmen = new Empleado("Carmen","Lorenzo",1250,6,"D");
        Carmen.mostrarInformacion();
        Carmen.calcularSueldo();
    }
}