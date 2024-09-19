public class Main {
    public static void main(String[] args) {

        Garage garage = new Garage();
        Urbano urbano = new Urbano("Nissan", 500, TipoVehiculo.AUTOMOVIL, 1, 4);
        Carrera carrera = new Carrera("Porsche", 1000, TipoVehiculo.AUTOMOVIL, 1, 280);
        Urbano urbano2 = new Urbano("Peugeot", 750, TipoVehiculo.AUTOMOVIL, 3, 4);
        Utilitario utilitario = new Utilitario("Volvo", 10000, TipoVehiculo.UTILITARIO, 14000, 250);
        Motocicleta motocicleta = new Motocicleta("Honda", 450, TipoVehiculo.MOTOCICLETA, 110);
        garage.agregarVehiculo(urbano);
        garage.agregarVehiculo(utilitario);
        garage.agregarVehiculo(carrera);
        garage.agregarVehiculo(motocicleta);
        garage.agregarVehiculo(urbano2);

        garage.mostrarInfo();

        garage.actualizarPrecios(15, TipoVehiculo.AUTOMOVIL);

        System.out.println("Actualizando precios...");
        garage.mostrarInfo();


    }
}