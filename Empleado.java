public class Empleado {

    public String nombre;
    public String apellido;
    public double sueldoBase;
    public double retenciones;
    public String categoria;

    public Empleado(String nombre, String apellido, double sueldoBase, double retenciones, String categoria) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldoBase = sueldoBase;
        this.retenciones = retenciones;
        this.categoria = categoria;
    }

    public Empleado(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public void mostrarInformacionSolo(){
        System.out.println("Nombre: " +this.nombre);
        System.out.println("Apellido: " +this.apellido);
    }


    public void mostrarInformacion(){

        System.out.println("Nombre: " +this.nombre);
        System.out.println("Apellido: " +this.apellido);
        System.out.println("Sueldo: " +this.sueldoBase);
        System.out.println("Retenciones: " +this.retenciones);
        System.out.println("Categoria: " +this.categoria);
    }
    

    public void calcularSueldo(){

        double a = this.sueldoBase+100;
        double b = this.sueldoBase+200;
        double c = this.sueldoBase+300;
        double d = this.sueldoBase+500;

        switch (this.categoria) {
            case "A" -> System.out.println("Sueldo categoria: " + a);
            case "B" -> System.out.println("Sueldo categoria: " + b);
            case "C" -> System.out.println("Suelado categoria: " + c);
            case "D" -> System.out.println("Sueldo categoria: " + d);
            default -> System.out.println("No hay Categorias reconocidas para ese valor");

        }
    }
}
