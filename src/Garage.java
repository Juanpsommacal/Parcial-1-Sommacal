import java.util.ArrayList;

public class Garage {

     private ArrayList<Vehiculo> garage;

     public Garage(){
         garage = new ArrayList<>();
     }

     public void agregarVehiculo(Vehiculo nuevoVehiculo){
         garage.add(nuevoVehiculo);
     }

     public void mostrarInfo(){
         for(Vehiculo vehiculo : garage){
             System.out.println("----- Vehiculo n: " + (garage.indexOf(vehiculo) + 1) + " -----");
             vehiculo.mostrarInfo();
         }
     }

     ///Recibe un porcentaje y un TipoVehiculo por parametro para aumentar el valor de ese tipo.
     public void actualizarPrecios(int porcentaje, TipoVehiculo tipoVehiculo){
         for(Vehiculo vehiculo : garage){ ///Creamos un vehiculo para recorrer el Array
             if(vehiculo.getTipoVehiculo() == tipoVehiculo){ ///Buscamos que el tipo del vehiculo en esta posiciion del array sea la misma que la que nos pasaron por parametro
                 int precioActual = garage.get(garage.indexOf(vehiculo)).getPrecio(); ///Si es asi, guardamos el precio actual de venta
                 int aumento = precioActual * porcentaje / 100; ///Calculamos cuanto es el monto a aumentar
                 garage.get(garage.indexOf(vehiculo)).setPrecio(precioActual + aumento);
             }
         }


     }


   }
