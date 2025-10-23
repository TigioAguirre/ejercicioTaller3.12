import java.util.Scanner;

public class pruebaFactura {
    public static void main(String[] args) {
    /**Creación de Objeto Factura*/
    Factura f1 = new Factura("","",0,0.0);
    //Creación de Scanner para leer Datos
    Scanner sc = new Scanner(System.in);
    int repetirPrograma=1;
    do{
        /**Leer los datos del objeto Factura*/
        System.out.println("Introduzca el Número de la Pieza: ");
        f1.setNumPieza(sc.nextLine());
        System.out.println("Introduza la Descripción de la Pieza: ");
        f1.setDesPieza(sc.nextLine());
        System.out.println("Introduzca la cantidad a Comprar de la pieza: ");
        f1.setCantidadAComprar(sc.nextInt());
        sc.nextLine();
        System.out.println("Introduzca el precio del Artículo: ");
        f1.setPrecioArticulo(sc.nextDouble());
        System.out.println("------DETALLE FACTURA------");
        System.out.println("Número de la Pieza:"+f1.getNumPieza());
        System.out.println("Descripción: ");
        System.out.println(f1.getDesPieza());
        System.out.println("Cantidad:"+f1.getCantidadAComprar()+"  Precio:"+f1.getPrecioArticulo());
        System.out.println(f1.obtenerMontoFactura(f1.getCantidadAComprar(),f1.getPrecioArticulo()));
        System.out.println("¿Desea repetir el programa?(Si, presione 0|No, cualquier numero)");
        repetirPrograma=sc.nextInt();
        sc.nextLine();
        System.out.println("----------------------------------");
            }while(repetirPrograma==0);
        System.out.println("---------Fin del Programa---------");
    }}