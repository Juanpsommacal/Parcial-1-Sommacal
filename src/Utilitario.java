public class Utilitario extends Vehiculo {

    private int cargaKGMax;
    private int alturaCM;

    public Utilitario(String modelo, int precio, TipoVehiculo tipoVehiculo, int cargaKGMax, int alturaCM) {
        super(modelo, precio, tipoVehiculo);
        this.cargaKGMax = cargaKGMax;
        this.alturaCM = alturaCM;
    }

    public int getCargaKGMax() {
        return cargaKGMax;
    }

    public void setCargaKGMax(int cargaKGMax) {
        this.cargaKGMax = cargaKGMax;
    }

    public int getAlturaCM() {
        return alturaCM;
    }

    public void setAlturaCM(int alturaCM) {
        this.alturaCM = alturaCM;
    }

    @Override
    public void mostrarInfo(){
        System.out.println("Tipo de vehiculo: " + getTipoVehiculo());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Precio: " + getPrecio());
        System.out.println("Carga Maxima: " + getCargaKGMax() + "Kg");
        System.out.println("Altura: " + getAlturaCM() + "Cm");
    }
}
