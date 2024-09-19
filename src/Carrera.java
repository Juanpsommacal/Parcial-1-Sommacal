public class Carrera extends Automovil implements Deportivos {

    private int velocidadMax;

    public Carrera(String modelo, int precio, TipoVehiculo tipoVehiculo, int maxAirbags, int velocidadMax) {
        super(modelo, precio, tipoVehiculo, maxAirbags);
        this.velocidadMax = velocidadMax;
    }

    public int getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(int velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    @Override
    public void competirEnPista(){
        System.out.println("El vehiculo de Carrera modelo " + getModelo() + " se acerca a la pista para competir...");
    }

    @Override
    public void mostrarInfo(){
        System.out.println("Tipo de vehiculo: " + getTipoVehiculo());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Precio: " + getPrecio());
        System.out.println("Cantidad maxima de Airbags: " + getMaxAirbags());
        System.out.println("Velocidad maxima: " + getVelocidadMax() + "Km/h");
    }
}
