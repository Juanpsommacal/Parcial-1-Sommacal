public abstract class Vehiculo {
    private String modelo;
    private int precio;
    private TipoVehiculo tipoVehiculo;

    public Vehiculo(String modelo, int precio, TipoVehiculo tipoVehiculo) {
        this.modelo = modelo;
        this.precio = precio;
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public TipoVehiculo getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(TipoVehiculo tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public abstract void mostrarInfo();
}
