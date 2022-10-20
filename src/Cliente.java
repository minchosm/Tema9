public class Cliente extends Persona{
    int credito;

    public Cliente(int edad, String nombre, int telefono, int credito) {
        super(edad, nombre, telefono);
        this.credito = credito;
    }

    @Override
    public void presentacion() {
        System.out.println("Datos cliente: \nNombre: " + super.getNombre() + "\nEdad: " + super.getEdad() + "\nTelefono: "
                + super.getTelefono() + "\nCredito: " + credito + "€\n");
    }
}
