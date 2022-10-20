public class Trabajador extends Persona{
    private int salario;
    public Trabajador(int edad, String nombre, int telefono, int salario) {
        super(edad, nombre, telefono);
        this.salario = salario;
    }


    @Override
    public void presentacion() {
        System.out.println("Datos trabajador: \nNombre: " + super.getNombre() + "\nEdad: " + super.getEdad() + "\nTelefono: "
        + super.getTelefono() + "\nSalario: " + salario + "€\n");
    }
}
