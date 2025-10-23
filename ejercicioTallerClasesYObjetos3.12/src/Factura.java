/** 3.12 (La clase Factura) Cree una clase llamada Factura que una ferretería podría utilizar
 para representar una factura para un artículo vendido en la tienda. Una Factura debe incluir
 cuatro piezas de información como variables de instancia: un número de pieza (tipo String),
 la descripción de la pieza (tipo String), la cantidad de artículos de ese tipo que se van a comprar(tipo int)
 y el precio por artículo (double). Su clase debe tener un constructor que inicialice las cuatro variables de
 instancia. Proporcione un método establecer y un método obtener para cada variable de instancia.//listo
 Además, proporcione un método llamado obtenerMontoFactura, que calcule el monto de la factura
 (es decir, que multiplique la cantidad de artículos por el precio de cada uno) y después devuelva
 ese monto como un valor double. Si la cantidad no es positiva, debe establecerse en 0. Si el precio
 por artículo no es positivo, debe establecerse en 0.0. Escriba una aplicación de prueba llamada PruebaFactura,
 que demuestre las capacidades de la clase Factura.*/
public class Factura {
    /**Atributos de la Clase Factura*/
    private String numPieza;
    private String desPieza;
    private Integer cantidadAComprar;
    private Double precioArticulo;
    /**Constructor*/
    public Factura(String numPieza, String desPieza, Integer cantidadAComprar,  Double precioArticulo) {
        this.numPieza = numPieza;
        this.desPieza = desPieza;
        this.cantidadAComprar = cantidadAComprar;
        this.precioArticulo = precioArticulo;
    }
    /**Métodos*/
    /**Getters & Setters*/
    //Getters
    public String getNumPieza() {
        return numPieza;
    }
    public String getDesPieza() {
        return desPieza;
    }
    public Integer getCantidadAComprar() {
        return cantidadAComprar;
    }
    public Double getPrecioArticulo() {
        return precioArticulo;
    }
    //Setters
    public void setNumPieza(String numPieza) {
        this.numPieza = numPieza;
    }
    public void setDesPieza(String desPieza) {
        this.desPieza = desPieza;
    }
    public void setCantidadAComprar(Integer cantidadAComprar) {
        this.cantidadAComprar = cantidadAComprar;
    }
    public void setPrecioArticulo(Double precioArticulo) {
        this.precioArticulo = precioArticulo;
    }
    //Métodos Propios
    public Double obtenerMontoFactura(Integer cantAComprar, Double precio) {
        Double montoFactura;
        if (cantAComprar<0){
            cantAComprar = 0;
        } else if (precio <0) {
            precio = 0.0;
        }
        montoFactura = precio*cantAComprar;
        return montoFactura;
    }
}


