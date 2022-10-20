public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(35,"Manuel Gomez", 6478229,3000);
        Trabajador trabajador1 = new Trabajador(56,"Raul Perez",4584893, 2000);
        cliente1.presentacion();
        trabajador1.presentacion();
    }
}