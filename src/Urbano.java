public class Urbano extends Automovil {

    private int cantMaxOcupantes;

    public Urbano(String modelo, int precio, TipoVehiculo tipoVehiculo, int maxAirbags, int cantMaxOcupantes) {
        super(modelo, precio, tipoVehiculo, maxAirbags);
        this.cantMaxOcupantes = cantMaxOcupantes;
    }

    public int getCantMaxOcupantes() {
        return cantMaxOcupantes;
    }

    public void setCantMaxOcupantes(int cantMaxOcupantes) {
        this.cantMaxOcupantes = cantMaxOcupantes;
    }

    @Override
    public void mostrarInfo(){
        System.out.println("Tipo de vehiculo: " + getTipoVehiculo());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Precio: " + getPrecio());
        System.out.println("Cantidad maxima de Airbags: " + getMaxAirbags());
        System.out.println("Cantidad maxima de ocupantes: " + getCantMaxOcupantes());
    }
}
