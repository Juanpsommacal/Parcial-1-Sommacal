public abstract class Automovil extends Vehiculo {

    int maxAirbags;

    public Automovil(String modelo, int precio, TipoVehiculo tipoVehiculo, int maxAirbags) {
        super(modelo, precio, tipoVehiculo);
        this.maxAirbags = maxAirbags;
    }

    public int getMaxAirbags() {
        return maxAirbags;
    }

    public void setMaxAirbags(int maxAirbags) {
        this.maxAirbags = maxAirbags;
    }

    public abstract void mostrarInfo();
}
