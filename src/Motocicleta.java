public class Motocicleta extends Vehiculo implements Deportivos {

    private int cilindrada;

    public Motocicleta(String modelo, int precio, TipoVehiculo tipoVehiculo, int cilindrada) {
        super(modelo, precio, tipoVehiculo);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public void competirEnPista(){
        System.out.println("La motocicleta modelo " + getModelo() + " se aproxima a la pista para competir...");
    }

    @Override
    public void mostrarInfo(){
        System.out.println("Tipo de vehiculo: " + getTipoVehiculo());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Precio: " + getPrecio());
        System.out.println("Cilindrada: " + getCilindrada());
    }
}
