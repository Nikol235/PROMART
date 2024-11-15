import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.io.IOException;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
public class PROMART_JULIACA_FINAL {
    // arrylist de DUA
    ArrayList<String> Limpieza1 = new ArrayList<>();
    ArrayList<String> Limpieza2= new ArrayList<>();
    ArrayList<String> Limpieza3 = new ArrayList<>();
    ArrayList<String> Limpieza4 = new ArrayList<>();
    ArrayList<String> Limpieza5 = new ArrayList<>();
    double[] precio1 = {8};
    double[] precio2 = {11};
    double[] precio3 = {30};
    double[] precio4 = {31};
    double[] precio5 = {39.9};

    ArrayList<Double> subtotal_limpieza = new ArrayList<>();
    double igv, subtotal, totalpagar;
    ArrayList<Integer> carrito_limpieza1 = new ArrayList<>();
    ArrayList<Integer> carrito_limpieza2 = new ArrayList<>();
    ArrayList<Integer> carrito_limpieza3 = new ArrayList<>();
    ArrayList<Integer> carrito_limpieza4 = new ArrayList<>();
    ArrayList<Integer> carrito_limpieza5 = new ArrayList<>();
    int opcion, cantidad;
    private double  total,total_a_pagar=0,aumentar,vuelto,cant_de_dinero=0;
    private int cant_compra;
    private double pago,resto;
    private double precioPorProducto,cantidadtotal=0;
    private int cantidadProductos,i;
    private double cantidad_R, cantidadtotal_R=0;
    private double igv_R, subtotal_R, total_R = 0, vuelto_R;
    private int opcionn_R, opcion_Rr, opcion1_R;
    Scanner ncs = new Scanner(System.in);
    ArrayList<Integer> carritoGENERAL=new ArrayList<>();
    //OPCIONES DE REGRESO
    String volver[]={"Regresar","Menu principal"};
    ArrayList<Integer> carritoM=new ArrayList<>();
    //JARDINERIA
    String []JARDINERIA={
            "Deco jardin","Macetas, Mceteros y Platos","Macetas","Maceteros","|1|- Porta maceta Natural 19cm Casa del Jardín Orange --------------------------|- S/ 15.96 -|",
            "|2|- Maceta Redonda Estilo Piedra 15x15cm Con Plato - Color Aleatorio Reyplast -|- S/  9.90 -|","|1|- Maceta tejida con patas Casa del Jardín Orange ----------------------------|- S/ 15.96 -|",
            "|2|- Macetero alto triangular mediano Orange -----------------------------------|- S/ 27.92 -|"};
    double[] precioJardineria = {15.96, 9.90, 15.96, 27.92};
    ArrayList<Integer> carritoJardineria = new ArrayList<>();
    //OFICINA_Y_ESCOLAR
    //precioOFICINA_Y_ESCOLAR
    double []precioJadineria1= {15.96};
    double []precioJadineria2={27.92};
    double []precioJadineria3={18.00};
    double []precioJadineria4={61.00};
    double []precioJadineria5={38.90};
    double []precioJadineria6={119.99};
    double []precioJadineria7={87.00};
    double []precioJadineria8={4,90};
    double []precioJadineria9={1,70};
    double []precioJadineria10={10.00};
    double []precioJadineria11={12.40};
    double []precioJadineria12={37.90};
    ArrayList<Integer> carritoOFICINA_Y_ESCOLAR =new ArrayList<>();
    //INFANTIL
    double[] precioINFANTIL = {
            299.00,169.00,
            9.90,14.95,
            159.90,269.00,
            1499.0,49.0,

    };
    ArrayList<Integer> carritoINFANTIL = new ArrayList<>();
    public void menuprincipal() {
        this.logo();
        System.out.println("|----------------------------------------------------------------------------------------------------------------------------------|");
        System.out.println("|----------------------------------BIENVENIDO A PROMART----------------------------------------------------------------------------|");
        System.out.println("|-------------------------------------MENÚ PRINCIPAL-------------------------------------------------------------------------------|");
        System.out.println("""
                OPCIONES
                |--------------------------------------------------------------------------------------------|
                |1|- BLOG------------------------------------------------------------------------------------|
                |2|- CATEGORIAS------------------------------------------------------------------------------|
                |0|- SALIR DE PROMART------------------------------------------------------------------------|
                |--------------------------------------------------------------------------------------------|
                """);
        opcion = ncs.nextInt();
        switch (opcion) {
            case 1:
                this.blog();
                break;
            case 2:
                this.secciondecategorias();
                break;
            default:
                System.out.println("CERRANDO PROGRAMA........................................");
                break;
        }
    }

    public void secciondecategorias() {
        System.out.println("|--------------------------------------------------------------------------------------------|");
        System.out.println("_________CATEGORIAS________");
        System.out.println("""
                |--------------------------------------------------------------------------------------------|
                | 1|-  Muebles-------------------------------------------------------------------------------|
                | 2|-  Terrazas y aire libre-----------------------------------------------------------------|
                | 3|-  Organizacion y decohogar--------------------------------------------------------------|
                | 4|-  Baño----------------------------------------------------------------------------------|
                | 5|-  Cocina--------------------------------------------------------------------------------|
                | 6|-  Dormitorio----------------------------------------------------------------------------|
                | 7|-  Pisos y ceramicos---------------------------------------------------------------------|
                | 8|-  Herramientas--------------------------------------------------------------------------|
                | 9|-  Construccion--------------------------------------------------------------------------|
                |10|- Electricidad---------------------------------------------------------------------------|
                |11|- Gasfiteria-----------------------------------------------------------------------------|
                |12|- Iluminacion----------------------------------------------------------------------------|
                |13|- Pinturas y acabados--------------------------------------------------------------------|
                |14|- Ferreteria y puertas-------------------------------------------------------------------|
                |15|- Limpieza-------------------------------------------------------------------------------|
                |16|- Automotriz-----------------------------------------------------------------------------|
                |17|- Jardineria-----------------------------------------------------------------------------|
                |18|- Oficina y escolar----------------------------------------------------------------------|
                |19|- Infantil-------------------------------------------------------------------------------|
                |20|- Salud y deportes-----------------------------------------------------------------------|
                |21|- Mascotas-------------------------------------------------------------------------------|
                | 0|- menu principal-------------------------------------------------------------------------|
                |--------------------------------------------------------------------------------------------|
                |50| boleta general
                """);
        opcion = ncs.nextInt();
        switch (opcion) {
            case 50:

                break;
            case 1:
                this.muebles();
                break;
            case 2:
                this.Terrazas_y_aire_libre();
                break;
            case 3:
                this.organizacionYDecohogar();
                break;
            case 4:
                this.Baño();
                break;
            case 5:
                this.cocina();
                break;
            case 6:
                this.OPCIONDORMITORIOS();
                break;
            case 7:
                this.OPCIONPISOYCERAMICOS();
                break;
            case 8:
                this.HERRAMIENTAS();
                break;
            case 9:
                this.OPCIONCONSTRUCCION();
                break;
            case 10:
                this.ELECTRICIDAD();
                break;
            case 11:
                this.gasfiteria();
                break;
            case 12:
                this.iluminacion();
                break;
            case 13:
                this.pinturasyacabados();
                break;
            case 14:
                this.ferreteriaypuertas();
                break;
            case 15:
                this.limpieza();
                break;
            case 16:
                this.automotriz();
                break;
            case 17:
                this.seccion_de_JARDINERIA();
                break;
            case 18:
                this.seccion_de_OFICINA_Y_ESCOLAR();
                break;
            case 19:
                this.seccion_de_INFANTIL();
                break;
            case 20:
                this.seccion_de_SALUD_Y_DEPORTES();
                break;
            case 21:
                this.seccion_de_MASCOTAS();
                break;
            case 0:
                this.menuprincipal();
                break;
            default:
                break;
        }
    }

    // CODIGO DE GEMA
    class Carrito {
        private ArrayList<String> productos;
        private ArrayList<Double> precios ;
        private ArrayList<Integer> cantidades ;
        private ArrayList<String> categorias;
        private final double IGV = 0.18;

        public Carrito() {
            productos = new ArrayList<>();
            precios = new ArrayList<>();
            cantidades = new ArrayList<>();
            categorias = new ArrayList<>();
        }

        public void agregarProducto(String producto, double precio, int cantidad, String categoria) {
            productos.add(producto);
            precios.add(precio);
            cantidades.add(cantidad);
            categorias.add(categoria);
        }
        public void eliminarProducto(int index) {
            if (index >= 0 && index < productos.size()) {
                productos.remove(index);
                precios.remove(index);
                cantidades.remove(index);
                categorias.remove(index);
                System.out.println("Producto eliminado del carrito.");
            } else {
                System.out.println("Índice no válido.");
            }
        }
        public void mostrarCarrito() {
            System.out.println("\n================ BOLETA DE COMPRA ================");
            double total = 0;
            for (int i = 0; i < productos.size(); i++) {
                double precioTotal = precios.get(i) * cantidades.get(i);
                double precioConIGV = precioTotal + (precioTotal * IGV);
                total += precioConIGV;

                System.out.printf("%-2d | %-40s | Cantidad: %-3d | Precio c/IGV: %.2f$\n",
                        (i + 1), productos.get(i), cantidades.get(i), precioConIGV);
                System.out.println("--------------------------------------------------");
            }
            System.out.printf("TOTAL (incl. IGV): %.2f$\n", total);
            System.out.println("==================================================\n");
        }
        public double calcularTotal() {
            double total = 0;
            for (int i = 0; i < precios.size(); i++) {
                double precioTotal = precios.get(i) * cantidades.get(i);
                total += precioTotal + (precioTotal * IGV);
            }
            return total;
        }
    }

    private Carrito carrito = new Carrito();

    public double total() {
        igv = total * 0.18;
        subtotal = total - igv;
        System.out.println("SUBTOTAL " + subtotal);
        System.out.println("IGV " + igv);
        System.out.println("TOTAL A PAGAR " + total);
        System.out.println("--------------------------");
        return total;
    }
    public double vuelto() {
        System.out.println("Ingrese la cantidad a pagar:");
        pago = ncs.nextDouble();
        while (pago < 0) {
            System.out.println("No puede ingresar una cantidad negativa. Ingrese un valor válido:");
            pago = ncs.nextDouble();
        }
        vuelto = pago - total;

        if (vuelto < 0) {
            System.out.println("Falta pagar " + -(vuelto));
            System.out.println("Completa el monto a pagar:");
            this.confirmación();
            resto = ncs.nextDouble();
            while (resto < 0) {
                System.out.println("No puede ingresar una cantidad negativa. Ingrese un valor válido:");
                resto = ncs.nextDouble();
            }

            if (-(vuelto) == resto) {
                System.out.println("Pago Completado");
                this.agradecimiento();
                this.menuprincipal();
            } else if (-(vuelto) < resto) {
                System.out.println("Usted tiene de vuelto: " + (resto + vuelto));
            } else {
                System.out.println("Falta monetaria, deje ese objeto en su lugar.");
                this.confirmación();
                System.exit(0);
            }
        } else if (vuelto > 0) {
            System.out.println("Su vuelto es: " + vuelto);
            this.agradecimiento();
            this.confirmación();
        } else {
            System.out.println("Pago completo");
            this.agradecimiento();
            this.confirmación();
        }

        return vuelto;
    }
    public void confirmación(){
        System.out.println("¿DESEA COMPRAR OTRO ARTÍCULO?");
        System.out.println("|1|-SI --");
        System.out.println("|2|-NO --");
        int confirmacion=ncs.nextInt();
        switch(confirmacion){
            case 1:
                this.menuprincipal();
                break;
            case 2:
                System.out.println("GRACIAS POR SU VISITA");
                break;
            default:
                System.out.println("opción no valida");
        }
    }
    public void agregarProductos() {
        System.out.println("¿Cuántos productos llevará?");
        int cantidad = ncs.nextInt();
        while (cantidad <= 0) {
            System.out.println("No puede ingresar una cantidad INVALIDA. Ingrese un valor válido:");
            cantidad = ncs.nextInt();
        }
        cantidadProductos += cantidad;
        total = cantidadProductos * precioPorProducto;

        System.out.println("Cantidad de productos agregados: " + cantidadProductos);
        System.out.println("Total actualizado: " + total);
    }
    public void agradecimiento(){
        System.out.println("*****************************************");
        System.out.println("           G R A C I A S             ");
        System.out.println("       POR COMPRAR EN PROMART!         ");
        System.out.println("*****************************************");
    }

    public void muebles() {
        System.out.println("\n---SECCIÓN MUEBLES---");
        System.out.println("""
                
                |1|-  Muebles de dormitorio--------------------------
                |2|-  Muebles de oficina ----------------------------
                |3|-  Muebles de cocina------------------------------
                |4|-  Regresar al menu principal----------------------
                """);
        System.out.print("Ingrese una opción: ");
        int mueblesOpcion = ncs.nextInt();
        switch (mueblesOpcion) {
            case 1:
                this.mueblesDormitorio();
                break;
            case 2:
                this.mueblesOficina();
                break;
            case 3:
                this.mueblesCocina();
                break;
            case 4:
                this.secciondecategorias();
                break;
            default:
                System.out.println("Opción no válida. Intente de nuevo.");
        }
    }
    public void mueblesDormitorio() {
        System.out.println("\n---MUEBLES DE DORMITORIO---");
        System.out.println("""
                
                |1|-  Roperos--------------------------
                |2|-  Cómodas--------------------------
                |3|-  Camarotes------------------------
                """);
        System.out.print("Ingrese una opción: ");
        int mueblesOpcion = ncs.nextInt();
        switch (mueblesOpcion) {
            case 1:
                this.roperos();
                break;
            case 2:
                this.comodas();
                break;
            case 3:
                this.Camarotes();
                break;
            default:
                System.out.println("Subopción no válida.");
        }
    }
    public void roperos() {
        System.out.println("\n---SECCIÓN DE ROPEROS---");
        System.out.println("""
                |1|-  Roperos Blancos---------------------------
                |2|-  Roperos con espejo------------------------
                |3|-  roperos con dos puertas-------------------
                """);
        System.out.print("Ingrese una opción: ");
        int roperosOpcion = ncs.nextInt();
        switch (roperosOpcion) {
            case 1:
                this.RoperosBlancos();
                break;
            case 2:
                this.RoperosEspejo();
                break;
            case 3:
                this.Roperos_dos_puetas();
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }
    public void RoperosBlancos() {
        System.out.println("""
                |--------------------------- ROPEROS BLANCOS------------------------------------|- Precio ---|
                |1|- Ropero Siena 6 puertas 2 cajones-------------------------------------------|- S/ 449 ---|
                |2|- Ropero Multiuso Cali Tamires 2 puertas 4 repisas --------------------------|- S/ 279 ---|
                """);
        int rp = ncs.nextInt();
        switch (rp) {
            case 1:
                System.out.println("Ha seleccionado: Ropero Siena 6 puertas 2 cajones (449$)");
                precioPorProducto=449;
                this.agregarProductos();
                this.total();
                this.vuelto();
                break;
            case 2:
                System.out.println("Ha seleccionado: Ropero Multiuso Cali Tamires 2 puertas 4 repisas (279$)");
                precioPorProducto = 279;
                this.agregarProductos();
                this.total();
                this.vuelto();
                break;
            default:
                System.out.println("Opción no valida");
        }
    }
    public void RoperosEspejo(){
        System.out.println("""
                |--------------------------- ROPEROS CON ESPEJO---------------------------------|- Precio ----|
                |1|- Ropero Viena 3 puertas corredizas + Espejo---------------------------------|- S/ 1049 ---|
                |2|- Ropero Capri 3 puertas + Espejo--------------------------------------------|- S/ 449- ---|
                """);
        int RE = ncs.nextInt();
        switch(RE){
            case 1 :
                System.out.println("Ha seleccionado: Ropero Viena 3 puertas corredizas + Espejo (1049$)");
                precioPorProducto=1049;
                this.agregarProductos();
                this.total();
                this.vuelto();
                break;
            case 2:
                System.out.println("Ha seleccionado: Ropero Capri 3 puertas + Espejo (449$)");
                precioPorProducto=449;
                this.agregarProductos();
                this.total();
                this.vuelto();
                break;
            default:
                System.out.println("Opcion no valida");
        }
    }
    public void Roperos_dos_puetas(){
        System.out.println("""
                |------------------------ROPEROS CON DOS PUERTAS--------------------------------|- Precio ----|
                |1|- Ropero Viena 3 puertas corredizas + Espejo---------------------------------|- S/ 279 ----|
                |2|- Ropero Capri 3 puertas + Espejo--------------------------------------------|- S/ 289 ----|
                """);
        int RDP = ncs.nextInt();
        switch(RDP){
            case 1:
                System.out.println("Ha seleccionado: Ropero Multiuso Cali Tamires (279$)");
                precioPorProducto=279;
                this.agregarProductos();
                this.total();
                this.vuelto();
                break;
            case 2:
                System.out.println("Ha seleccionado: Ropero Cali 2 puertas (289$)");
                precioPorProducto= 289;
                this.agregarProductos();
                this.total();
                this.vuelto();
                break;
            default:
                System.out.println("Opcion no valida");
        }
    }
    public void comodas() {
        System.out.println("\n---SECCIÓN DE COMODAS---");
        System.out.println("""               
                |1|-  Cómodas de plástico--------------------------
                |2|-  cómodas Blancas------------------------------
                |3|-  Cómodas marrones-----------------------------
                """);
        System.out.print("Ingrese una opción: ");
        int comodasOpcion = ncs.nextInt();
        switch (comodasOpcion) {
            case 1:
                this.ComodasPlástico();
                break;
            case 2:
                this.ComodasBlancas();
                break;
            case 3:
                this.ComodasMarrones();
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }
    public void ComodasPlástico(){
        System.out.println("""
                |---------------------------CÓMODAS DE PLÁSTICO---------------------------------|- Precio ----|
                |1|- Ropero Viena 3 puertas corredizas + Espejo---------------------------------|- S/ 839 ----|
                |2|- Ropero Capri 3 puertas + Espejo--------------------------------------------|- S/ 249 ----|
                """);
        int CP = ncs.nextInt();
        switch (CP){
            case 1:
                System.out.println("Ha seleccionado: Cómoda Kaia (839$)");
                precioPorProducto=839;
                this.agregarProductos();
                this.total();
                this.vuelto();
                break;
            case 2:
                System.out.println("Ha seleccionado: Cómoda Cali (249$)");
                precioPorProducto=249;
                this.agregarProductos();
                this.total();
                this.vuelto();
                break;
            default:
                System.out.println("OPpción no valida");
        }
    }
    public void ComodasBlancas(){
        System.out.println("""
                |--------------------------CÓMODAS BLANCAS------------------------|- Precio ----|
                |1|- Comoda Tocador Praga-----------------------------------------|- S/ 269 ----|
                |2|- Cómoda Cali--------------------------------------------------|- S/ 249 ----|
                """);
        int CB = ncs.nextInt();
        switch(CB){
            case 1:
                System.out.println("Ha seleccionado: Comoda Tocador Praga (269$)");
                precioPorProducto= 269;
                this.agregarProductos();
                this.total();
                this.vuelto();
                break;
            case 2:
                System.out.println("Ha seleccionado: Cómoda Cali (249$)");
                precioPorProducto=249;
                this.agregarProductos();
                this.total();
                this.vuelto();
                break;
            default:
                System.out.println("Opción no valida");
        }
    }
    public void ComodasMarrones(){
        System.out.println("""
                |------------------------CÓMODAS MARRONES----------------|- Precio ----|
                |1|- Cómoda Kaia-----------------------------------------|- S/ 839 ----|
                |2|- Cómoda Cali ----------------------------------------|- S/ 249 ----|
                """);
        int CM = ncs.nextInt();
        switch(CM){
            case 1:
                System.out.println("Ha seleccionado: Cómoda Kaia (839$)");
                precioPorProducto=839;
                this.agregarProductos();
                this.total();
                this.vuelto();
                break;
            case 2:
                System.out.println("Ha seleccionado: Cómoda Cali (249$)");
                precioPorProducto=249;
                this.agregarProductos();
                this.total();
                this.total();
                break;
            default:
                System.out.println("Opcion no valida");
        }
    }
    public void Camarotes(){
        System.out.println("-----SECCIÓN DE CAMAROTES-----");
        System.out.println("""               
                |1|-  Camarores de 1 plazas--------------------------
                |2|-  Camarotes de 2 plazas----------------------------
                """);
        int Ocamarotes= ncs.nextInt();
        switch(Ocamarotes){
            case 1:
                this.Camarores_1_plaza();
                break;
            case 2:
                this.Camarotes_2_plazas();
                break;
            default:
                System.out.println("Opción no valida");
        }
    }
    public void Camarores_1_plaza(){
        System.out.println("""
                |-------------------- CAMAROTES DE 1.5 PLAZAS-------------------------------------|- Precio --|
                |1|- Camarote 1 plaza ½ + colchón paraíso + gratis almohada-----------------------|- S/ 2699--|
                |2|- Camarote multifuncional con escritorio 1 plaza/1.5 plazas DMuebles Barcelona-|- S/ 3599--|
                """);
        int camarote1 = ncs.nextInt();
        switch (camarote1){
            case 1:
                System.out.println("Ha Seleccionado:" +
                        " Camarote 1 plaza ½ + colchón paraíso + gratis almohada (2699$)");
                precioPorProducto= 2699;
                this.agregarProductos();
                this.total();
                this.vuelto();
                break;
            case 2:
                System.out.println("Ha seleccionado:" +
                        " Camarote multifuncional con escritorio 1 plaza/1.5 plazas DMuebles Barcelona (3599$)");
                precioPorProducto= 3599;
                this.agregarProductos();
                this.total();
                this.vuelto();
                break;
            default:
                System.out.println("Opción no valida");
        }
    }
    public void Camarotes_2_plazas(){
        System.out.println("""
                |---------------------- CAMAROTES DE 2 PLAZAS-------------------------------------|- Precio --|
                |1|- Camarote 2 plazas FMuebles Husar con Organizador-----------------------------|- S/ 4599--|
                |2|- Camarote triple 2 plazas DMuebles Valladol con Cama Nido---------------------|- S/ 4599--|
                """);
        int camarote2 = ncs.nextInt();
        switch (camarote2){
            case 1:
                System.out.println("Ha Seleccionado:" +
                        " Camarote 2 plazas FMuebles Husar con Organizador (4599$)");
                precioPorProducto= 4599;
                this.agregarProductos();
                this.total();
                this.vuelto();
                break;
            case 2:
                System.out.println("Ha seleccionado:" +
                        " Camarote triple 2 plazas DMuebles Valladol con Cama Nido (4599$)");
                precioPorProducto= 4599;
                this.agregarProductos();
                this.total();
                this.vuelto();
                break;
            default:
                System.out.println("Opción no valida");
        }
    }
    public void mueblesOficina() {
        System.out.println("\n---MUEBLES DE OFICINA---");
        System.out.println("""
                |1|-  Sillas y Sillones de oficina------------------
                |2|-  Sillas Gamer----------------------------------
                |3|-  Escritorios------------------------------------
                """);
        System.out.print("Ingrese una opción: ");
        int  oficinaOpcion = ncs.nextInt();
        switch (oficinaOpcion) {
            case 1:
                this.SillasySillones();
                break;
            case 2:
                this.sillasGamer();
                break;
            case 3:
                this.Escritorios();
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }
    public void SillasySillones(){
        System.out.println("""
                |-------------------SILLAS Y SILLONES DE OFICINA------------------|- Precio ----|
                |1|- Silla de oficina giratoria Orange Tauro Negro----------------|- S/ 119 ----|
                |2|- Silla fija Estambul Negra Orange-----------------------------|- S/ 109 ----|
                """);
        int sillasysillones=ncs.nextInt();
        switch(sillasysillones){
            case 1:
                System.out.println("Ha seleccionado: Silla de oficina giratoria Orange Tauro Negro(119$)");
                precioPorProducto=119;
                this.agregarProductos();
                this.total();
                this.vuelto();
                break;
            case 2:
                System.out.println("Ha seleccionado: Silla fija Estambul Negra Orange(109)");
                precioPorProducto=109;
                this.agregarProductos();
                this.total();
                this.vuelto();
                break;
            default:
                System.out.println("Opción no valida");
        }
    }
    public void sillasGamer(){
        System.out.println("""
                |-------------------------SILLAS GAMER-----------------------------|- Precio ----|
                |1|- Silla Gamer Azul Orange---------------------------------------|- S/ 249 ----|
                |2|- Silla Gamer New Racing Pro Pu Cuero rojo/negro Orange---------|- S/ 399 ----|
                """);
        int sillasgamer=ncs.nextInt();
        switch(sillasgamer){
            case 1:
                System.out.println("Ha seleccionado: Silla Gamer Azul Orange(249$)");
                precioPorProducto=249;
                this.agregarProductos();
                this.total();
                this.vuelto();
                break;
            case 2:
                System.out.println("Ha seleccionado: " +
                        "Silla Gamer New Racing Pro Cuero rojo/negro Orange(399$)");
                precioPorProducto=399;
                this.agregarProductos();
                this.total();
                this.vuelto();
                break;
            default:
                System.out.println("Opción no valida");
        }
    }
    public void Escritorios(){
        System.out.println("-----ESCRITORIOS-----");
        System.out.println("""
                |1|-  Escritorios Gamer-----------------------------
                |2|-  Escritorios Vintage---------------------------
                |3|-  Escritorios Blancos---------------------------
                """);
        int escritorios = ncs.nextInt();
        switch (escritorios){
            case 1:
                this.EscritoriosGamer();
                break;
            case 2:
                this.EscritoriosVintage();
                break;
            case 3:
                this.EscritoriosBlancos();
                break;
            default:
                System.out.println("Opcion no valida");
        }
    }
    public void EscritoriosGamer(){
        System.out.println("""
                |----------------------ESCRITORIOS GAMER------------------------------|- Precio ----|
                |1|- Escritorio Gamer Sirion MDP negro/ Rojo Bonno--------------------|- S/ 499 ----|
                |2|- Escritorio Gamer Odin OfficeSpace--------------------------------|- S/ 699 ----|
                """);
        int EscritoriosGamer=ncs.nextInt();
        switch(EscritoriosGamer){
            case 1:
                System.out.println("Ha seleccionado: Escritorio Gamer Sirion MDP negro/ Rojo Bonno. (499$)");
                precioPorProducto=499;
                this.agregarProductos();
                this.total();
                this.vuelto();
                break;
            case 2:
                System.out.println("Ha seleccionado: Escritorio Gamer Odin OfficeSpace. (699$)");
                precioPorProducto=699;
                this.agregarProductos();
                this.total();
                this.vuelto();
                break;
            default:
                System.out.println("Opción no valida");
        }
    }
    public void EscritoriosVintage(){
        System.out.println("""
                |----------------------ESCRITORIOS VINTAGE------------------------------------|- Precio ----|
                |1|- Escritorio Organizador Vintage Mirandah Ventitas Home Duna y Blanco------|- S/ 540 ----|
                |2|- Escritorio Vintage Moderno Alice Alto 151cm------------------------------|- S/ 1950 ---|
                """);
        int EscritoriosGamer=ncs.nextInt();
        switch(EscritoriosGamer){
            case 1:
                System.out.println("Ha seleccionado:" +
                        "Escritorio Organizador Vintage Mirandah Ventitas Home Duna y Blanco (540$)");
                precioPorProducto=540;
                this.agregarProductos();
                this.total();
                this.vuelto();
                break;
            case 2:
                System.out.println("Ha seleccionado: Escritorio Vintage Moderno Alice Alto 151cm (1950$)");
                precioPorProducto=1950;
                this.agregarProductos();
                this.total();
                this.vuelto();
                break;
            default:
                System.out.println("Opción no valida");
        }

    }
    public void EscritoriosBlancos(){
        System.out.println("""
                |----------------------ESCRITORIOS BLANCOS--------------------------|- Precio ----|
                |1|- Escritorio Manaus MDP Blanco-----------------------------------|- S/ 249 ----|
                |2|- Escritorio astana Melamina Blanco------------------------------|- S/ 499 ----|
                """);
        int EscritoriosBlancos=ncs.nextInt();
        switch(EscritoriosBlancos){
            case 1:
                System.out.println("Ha seleccionado: Escritorio Manaus MDP Blanco. (249$)");
                precioPorProducto=249;
                this.agregarProductos();
                this.total();
                this.vuelto();
                break;
            case 2:
                System.out.println("Ha seleccionado: Escritorio astana Melamina Blanco (499$)");
                precioPorProducto=499;
                this.agregarProductos();
                this.total();
                this.vuelto();
                break;
            default:
                System.out.println("Opción no valida");
        }
    }
    public void mueblesCocina() {
        System.out.println("---MUEBLES DE COCINA---");
        System.out.println("""
                |1|-  Alacenas de Cocina-----------------------------
                |2|-  Tableros de Cocina-----------------------------
                """);
        int MuCocina=ncs.nextInt();
        switch(MuCocina){
            case 1:
                this.AlacenasCocina();
                break;
            case 2:
                this.tablerosCocina();
                break;
            default:
                System.out.println("Opción no valida");
        }
    }
    public void AlacenasCocina(){
        System.out.println("""
                |---------------------- ALACENAS DE COCINA------------------------------|- Precio ----|
                |1|- Mueble de cocina dalia MDP 60 cm Blanco Orange---------------------|- S/ 279 ----|
                |2|- Mueble de cocina Madison 90 cm Orange------------------------------|- S/ 419 ----|
                """);
        int alacenascocina=ncs.nextInt();
        switch(alacenascocina){
            case 1:
                System.out.println("Ha seleccionado: Mueble de cocina dalia MDP 60 cm Blanco Orange (279$)");
                precioPorProducto=279;
                this.agregarProductos();
                this.total();
                this.vuelto();
                break;
            case 2:
                System.out.println("Ha seleccionado: Mueble de cocina Madison 90 cm Orange (419$)");
                precioPorProducto=419;
                this.agregarProductos();
                this.total();
                this.vuelto();
                break;
            default:
                System.out.println("Opción no valida");
        }
    }
    public void tablerosCocina(){
        System.out.println("""
                |---------------------- TABLEROS DE COCINA---------------------------------|- Precio ----|
                |1|- Tablero mesada para a muebles Madrid----------------------------------|- S/ 249 ----|
                |2|- Tablero para Mueble de cocina Madesa 150 cm Gris----------------------|- S/ 269 ----|
                """);
        int Tableroscocina=ncs.nextInt();
        switch(Tableroscocina){
            case 1:
                System.out.println("Ha seleccionado: Tablero mesada para a muebles Madrid (249$)");
                precioPorProducto=249;
                this.agregarProductos();
                this.total();
                this.vuelto();
                break;
            case 2:
                System.out.println("Ha seleccionado: Tablero para Mueble de cocina Madesa 150 cm Gris (269$)");
                precioPorProducto=269;
                this.agregarProductos();
                this.total();
                this.vuelto();
                break;
            default:
                System.out.println("Opción no valida");
        }
    }

    public void Terrazas_y_aire_libre() {
        while (true) {
            System.out.println("\n--- Menú de PROMART JULIACA ---");
            System.out.println("1.- Ver Productos de Terraza");
            System.out.println("2.- Ver Sombrillas");
            System.out.println("3.- Ver Mesas de Exterior");
            System.out.println("4.- Mostrar Carrito");
            System.out.println("5.- Eliminar Producto del Carrito");
            System.out.println("6.- Pagar");
            System.out.println("7.- Imprimir boleta");
            System.out.println("8.- Salir");

            int opcion = ncs.nextInt();
            switch (opcion) {
                case 1:
                    this.seleccionarProductoDeCategoria("Terrazas");
                    break;
                case 2:
                    this.seleccionarProductoDeCategoria("Sombrillas");
                    break;
                case 3:
                    this.seleccionarProductoDeCategoria("Mesas Exterior");
                    break;
                case 4:
                    this.carrito.mostrarCarrito();
                    break;
                case 5:
                    this.eliminarProductoDelCarrito();
                    break;
                case 6:
                    this.realizarPago();
                    break;
                case 7:

                    break;
                case 8:
                    this.agradecimiento();
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
    public void realizarPago() {
        carrito.mostrarCarrito();
        double total = carrito.calcularTotal();
        System.out.printf("El total a pagar es: %.2f$\n", total);
        System.out.println("¿Está listo para realizar el pago? (sí = 1 / no = 0)");
        int confirmacion = ncs.nextInt();
        if (confirmacion == 1) {
            System.out.println("Ingrese el monto con el que pagará:");
            double pago = ncs.nextDouble();
            if (pago >= total) {
                double cambio = pago - total;
                System.out.printf("Pago exitoso. Su cambio es: %.2f$\n", cambio);
                this.agradecimiento();
                carrito = new Carrito();
            } else {
                System.out.println("Monto insuficiente. Por favor, intente nuevamente.");
            }
        } else {
            System.out.println("Operación cancelada. Puede seguir agregando productos.");
        }
    }
    public void seleccionarProductoDeCategoria(String categoria) {
        ArrayList<String> productos = obtenerProductosPorCategoria(categoria);
        ArrayList<Double> precios = obtenerPreciosPorCategoria(categoria);

        if (productos.isEmpty()) {
            System.out.println("Categoría no encontrada.");
            return;
        }
        System.out.println("\n-- Selección de Productos en " + categoria + " --");
        for (int i = 0; i < productos.size(); i++) {
            System.out.println((i + 1) + ". " + productos.get(i) + " - Precio: " + precios.get(i) + "$");
        }
        System.out.println("Seleccione el número del producto que desea agregar al carrito (0 para regresar):");
        int seleccion = ncs.nextInt();

        if (seleccion > 0 && seleccion <= productos.size()) {
            System.out.println("Ingrese la cantidad que desea agregar:");
            int cantidad = ncs.nextInt();
            carrito.agregarProducto(productos.get(seleccion - 1), precios.get(seleccion - 1), cantidad, categoria);
            System.out.println("Producto añadido al carrito: " + productos.get(seleccion - 1));
            carrito.mostrarCarrito();
        } else if (seleccion == 0) {
            System.out.println("Regresando al menú principal.");
        } else {
            System.out.println("Selección no válida.");
        }
    }
    public void eliminarProductoDelCarrito() {
        carrito.mostrarCarrito();
        System.out.println("Seleccione el número del producto que desea eliminar del carrito (0 para cancelar):");
        int indice = ncs.nextInt();
        if (indice > 0 && indice <= carrito.productos.size()) {
            carrito.eliminarProducto(indice - 1);
            carrito.mostrarCarrito();
        } else if (indice == 0) {
            System.out.println("Operación cancelada.");
        } else {
            System.out.println("Selección no válida.");
        }
    }
    ArrayList<String> obtenerProductosPorCategoria(String categoria) {
        ArrayList<String> productos = new ArrayList<>();

        switch (categoria) {
            case "Terrazas":
                productos.add("Juego De Terrazas Bistro Plus Mesa + 2 Sillas Marrón");
                productos.add("Set De Terraza Orange Palma: 2 Butacas + Mesa");
                break;
            case "Sombrillas":
                productos.add("Quitasol terraza lateral Aluminio rectangular 290x390cm Taupe Naterial");
                productos.add("Sombrilla de playa Airvent Uv Fp50 + gris Orange");
                break;
            case "Mesas Exterior":
                productos.add("Mesa catering plegable 150cm Orange");
                productos.add("Mesa de terraza Noa Vidrio + Ratan 80x80x66 Naterial");
                break;
        }
        return productos;
    }
    ArrayList<Double> obtenerPreciosPorCategoria(String categoria) {
        ArrayList<Double> precios = new ArrayList<>();
        switch (categoria) {
            case "Terrazas":
                precios.add(199.0);
                precios.add(699.0);
                break;
            case "Sombrillas":
                precios.add(899.0);
                precios.add(79.9);
                break;
            case "Mesas Exterior":
                precios.add(179.0);
                precios.add(399.0);
                break;
        }
        return precios;
    }


    public void organizacionYDecohogar() {
        System.out.println("-----ORGANIZACIÓN Y DECOHOGAR-----");
        System.out.println("""               
                |1|-  Decoración---------------------------------------
                |2|-  Productos en tendencia---------------------------
                |0|-  Regresar-----------------------------------------
                """);
        int organizacionDecohogar = ncs.nextInt();
        switch (organizacionDecohogar){
            case 1:
                this.Decoración();
                break;
            case 2:
                this.productos_en_tendencia();
                break;
            case 0:
                this.menuprincipal();
                break;
            default:
                System.out.println("Opcion no valida");
        }
    }
    public void Decoración(){
        System.out.println("-----DECORACIÓN------");
        System.out.println("""        
                        |1|- Espejos--------------------------
                        |2|- Alfombras y Tapetes------------------------
                        |3|- Velas y portavelas-------------------------
                        """);
        int decoración = ncs.nextInt();
        switch(decoración){
            case 1:
                this.espejos();
                break;
            case 2:
                this.alfombrasYTapetes();
                break;
            case 3:
                this.velasYPortavelas();
                break;
            default:
                System.out.println("opción no valida");
        }
    }
    public void espejos() {
        System.out.println("\n---ESPEJOS---");
        System.out.println("1.- Espejo básico 33.5x5cm (19$)");
        System.out.println("2.- Espejo rectangular dorado 30x120cm Orange (22$)");
        System.out.println("3.- Espejo Quetzal 194x94 Orange (219$)");
        System.out.print("Seleccione una opción: ");
        int espejos = ncs.nextInt();
        switch (espejos) {
            case 1:
                System.out.println("Ha seleccionado: Espejo básico 33.5x5cm (19$)");
                precioPorProducto=19;
                this.agregarProductos();
                this.total();
                this.vuelto();
                break;
            case 2:
                System.out.println("Ha seleccionado: Espejo rectangular dorado 30x120 cm Orange (22$)");
                precioPorProducto=22;
                this.agregarProductos();
                this.total();
                this.vuelto();
                break;
            case 3:
                System.out.println("Ha seleccionado: Espejo Quetzal 194x94 Orange (219$)");
                precioPorProducto=22;
                this.agregarProductos();
                this.total();
                this.vuelto();
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }
    public void alfombrasYTapetes() {
        System.out.println("\n---ALFOMBRAS Y TAPETES---");
        System.out.println("1.- Alfombra de exterior Cuadros Gris 230x160 Orange (229$)");
        System.out.println("2.- Alfombra de exterior rectangular Yute 90x150cm Orange (99.90$)");
        System.out.print("Seleccione una opción: ");
        int alfombras = ncs.nextInt();

        switch (alfombras) {
            case 1:
                System.out.println("Ha seleccionado: Alfombra de exterior Cuadros Gris (229$)");
                precioPorProducto=299;
                this.agregarProductos();
                this.total();
                this.vuelto();
                break;
            case 2:
                System.out.println("Ha seleccionado: Alfombra rectangular Yute (99.90$)");
                precioPorProducto=99.90;
                this.agregarProductos();
                this.total();
                this.vuelto();
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }
    public void velasYPortavelas() {
        System.out.println("\n---VELAS Y PORTAVELAS---");
        System.out.println("1.- Vela perfumada Misionera Tipo 24 x 2 unidades Amarillo (9.50$)");
        System.out.println("2.- Portavela Neutro 12 cm (19.95$)");
        System.out.print("Seleccione una opción: ");
        int velas = ncs.nextInt();
        switch (velas) {
            case 1:
                System.out.println("Ha seleccionado: Vela perfumada Misionera (9.50$)");
                precioPorProducto=9.50;
                this.agregarProductos();
                this.total();
                this.vuelto();
                break;
            case 2:
                System.out.println("Ha seleccionado: Portavela Neutro (19.95$)");
                precioPorProducto=19.95;
                this.agregarProductos();
                this.total();
                this.vuelto();
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }
    public void productos_en_tendencia(){
        System.out.println("-----PRODUCTOS EN TENDENCIA-----");
        System.out.println("""               
                |1|-  Retro----------------------------------------
                |2|-  Casa de aves---------------------------------
                |3|-  Persianas y Cortinas-------------------------
                |0|-  Regresar-------------------------------------
                """);
        System.out.println("Ingrese una opción");
        int ProductosTendencia= ncs.nextInt();
        switch(ProductosTendencia){
            case 1:
                this.retro();
                break;
            case 2:
                this.Casa_de_Aves();
                break;
            case 3:
                this.PersianasYCortinas();
            case 0:
                this.menuprincipal();
                break;
            default:
                System.out.println("Opción no valida");
        }
    }
    public void retro(){
        System.out.println("""
                |---------------------------- RETRO ------------------------------------------|- Precio ---|
                |1|- Globo Terráqueo Retro Mango De Madera 13.5cm Atmosphera -----------------|- S/ 31.90 -|
                |2|- Adorno Cerámico Diseño Hongo Del Jardín Orange --------------------------|- S/ 21.90 -|
                |0|- regresar
                """);
        System.out.print("Seleccione una opción: ");
        int retro = ncs.nextInt();
        switch(retro){
            case 1:
                System.out.println("Ha seleccionado:" +
                        " Globo Terráqueo Retro Mango De Madera 13.5cm Atmosphera o (31.90$)");
                precioPorProducto=31.30;
                this.agregarProductos();
                this.total();
                this.vuelto();
                break;
            case 2:
                System.out.println("Ha seleccionado: Adorno Cerámico Diseño Hongo Del Jardín Orange (21.90$)");
                precioPorProducto=21.90;
                agregarProductos();
                this.total();
                this.vuelto();
                break;
            case 0:
                this.productos_en_tendencia();
            default:
                System.out.println("Opción no valida");
        }
    }
    public void Casa_de_Aves(){
        System.out.println("--------CASA DE AVES-------");
        System.out.println("""               
                |1|-  Menaje y complementos---------------------------
                |2|-  Decoración--------------------------------------
                |0|-  Regresar----------------------------------------
                """);
        System.out.println("Ingrese una opción");
        int casaAves= ncs.nextInt();
        switch(casaAves){
            case 1:
                this.MenajesComplementos();
                break;
            case 2:
                this.decoracion();
                break;
            case 0:
                this.productos_en_tendencia();
                break;
            default:
                System.out.println("Opcion no valida");
        }
    }
    public void MenajesComplementos(){
        System.out.println("""
                |----------------------MENAJES Y COMPLEMENTOS------------------------------|- Precio --|
                |1|- Bowl Pájaro modelo 2 Casa de Aves Orange -----------------------------|- S/ 12 ---|
                |2|- Jarra Azul Casa de Aves Orange ---------------------------------------|- S/ 30 ---|
                |0|- regresar
                """);
        System.out.print("Seleccione una opción: ");
        int menajes = ncs.nextInt();
        switch(menajes){
            case 1:
                System.out.println("Ha seleccionado: Bowl Pájaro modelo 2 Casa de Aves Orange (12$)");
                precioPorProducto=12;
                this.agregarProductos();
                this.total();
                this.vuelto();
                break;
            case 2:
                System.out.println("Ha seleccionado: Jarra Azul Casa de Aves Orange(30$)");
                precioPorProducto=30;
                this.agregarProductos();
                this.total();
                this.vuelto();
                break;
            case 0:
                this.Casa_de_Aves();
                break;
            default:
                System.out.println("Opción no valida");
        }
    }
    public void decoracion(){
        System.out.println("""
                |----------------------DECORACIÓN---------------------------------------------|- Precio --|
                |1|- Alfombra piso de baño Diatomita 39x60cm Trend  --------------------------|- S/ 40 ---|
                |2|- Reloj de mesa Casa de Aves Orange  --------------------------------------|- S/ 30 ---|
                |0|- regresar
                """);
        System.out.print("Seleccione una opción: ");
        int deco=ncs.nextInt();
        switch(deco){
            case 1:
                System.out.println("Ha seleccionado: Alfombra piso de baño Diatomita 39x60cm Trend (40$)");
                precioPorProducto=40;
                this.agregarProductos();
                this.total();
                this.vuelto();
                break;
            case 2:
                System.out.println("Ha seleccionado: Reloj de mesa Casa de Aves Orange (30$)");
                precioPorProducto=30;
                this.agregarProductos();
                this.total();
                this.vuelto();
                break;
            case 0:
                this.Casa_de_Aves();
                break;
            default:
                System.out.println("Opcion no valida");
        }
    }
    public void PersianasYCortinas(){
        System.out.println("--------PERSIANAS Y CORTINAS-------");
        System.out.println("""               
                |1|-  Cortinas de tela------------------------------
                |2|-  Persiana--------------------------------------
                |0|-  Regresar--------------------------------------
                """);
        int PyC =ncs.nextInt();
        switch(PyC) {
            case 1:
                this.Cortinas_tela();
                break;
            case 2:
                this.PERCIANAS();
                break;
            case 0:
                this.productos_en_tendencia();
                break;
            default:
                System.out.println("Opción no valida");
        }
    }
    public void Cortinas_tela(){
        System.out.println("""
                |------------------------- CORTINAS DE TELA ---------------------------------|-- Precio ---|
                |1|- Cortina Listada Pasante Angora 1.40x25 Orange --------------------------|- S/ 40   ---|
                |2|- Cortina Ojalillo De Aluminio Jacquard Gris Niebla Orange ---------------|- S/ 125  ---|
                |0|- regresar
                """);
        System.out.println("Ingrese una opción");
        int cortinasTela=ncs.nextInt();
        switch (cortinasTela){
            case 1:
                System.out.println("Ha selecionado: Cortina Listada Pasante Angora 1.40x25 Orange(40$)");
                precioPorProducto=40;
                this.agregarProductos();
                this.total();
                this.vuelto();
                break;
            case 2:
                System.out.println("Ha seleccionado:Cortina Ojalillo De Aluminio Jacquard Gris Niebla Orange ");
                precioPorProducto=125;
                this.agregarProductos();
                this.total();
                this.vuelto();
                break;
            case 0:
                this.PersianasYCortinas();
                break;
            default:
                System.out.println("Opcion no valida");
        }
    }
    public void PERCIANAS(){
        System.out.println("""                
                |------------------------- PERCIANAS -----------------------------------------------|- Precio ---|
                |1|- Persiana horizontal PVC Blanco 100x165cm Orange -------------------------------|- S/ 40  ---|
                |2|- Persiana Roller Black Out Santos Poliéster 123,5/120x175cm Gris Mate Inspire---|- S/ 89  ---|
                |0|- regresar
                """);
        int persiana = ncs.nextInt();
        switch(persiana){
            case 1:
                System.out.println("Ha seleccionado: Persiana horizontal PVC Blanco 100x165cm Orange (40$)");
                precioPorProducto=40;
                this.agregarProductos();
                this.total();
                this.vuelto();
                break;
            case 2:
                System.out.println("Ha seleccionado: " +
                        "Persiana Roller Black Out Santos Poliéster 123,5/120x175cm Gris Mate Inspire (89$)");
                precioPorProducto=89;
                this.agregarProductos();
                this.total();
                this.vuelto();
                break;
            case 0:
                this.PersianasYCortinas();
                break;
            default:
                System.out.println("Opción no valida");
        }
    }

    public void Baño() {
        System.out.println("---------BAÑO---------");
        System.out.println("""             
                |1|- Combos de Baños----------------------
                |2|- Inodoros y Asientos------------------
                |3|- Lavatorios---------------------------
                |0|- Regresar-----------------------------
                """);
        int bano = ncs.nextInt();
        switch(bano){
            case 1:
                this.Combos_de_Baño();
                break;
            case 2:
                this.Inodoros_y_Asientos();
                break;
            case 3:
                this.Lavatorios();
                break;
            case 0:
                this.menuprincipal();
                break;
            default:
                System.out.println("Opcion no valida");
        }
    }
    public void Combos_de_Baño(){
        System.out.println("""             
                |1|- Combos de inodoro---------------------
                |2|- Sets de baño--------------------------
                |0|- Regresar------------------------------
                """);
        int combosBaño= ncs.nextInt();
        switch(combosBaño){
            case 1:
                this.combosDeInodoro();
                break;
            case 2:
                this.SetsBaño();
                break;
            case 0:
                this.Baño();
                break;
            default:
                System.out.println("Opción no valida");
        }
    }
    public void combosDeInodoro() {
        System.out.println("---COMBOS DE INODOROS---");
        System.out.println("1.- COMBO Trebol: Tanque para inodoro Rapid Jet Premium Blanco + Taza para inodoro Rapid Jet Plus Blanco (197.70$)");
        System.out.println("2.- COMBO Tanque Deca Omega Plus Blanco + Taza Deca Omega Plus Blanco (129$)");
        System.out.print("Seleccione una opción: ");
        int combosInodoro = ncs.nextInt();
        switch (combosInodoro) {
            case 1:
                System.out.println("Ha seleccionado: COMBO Trebol Rapid Jet (197.70$)");
                precioPorProducto=197.70;
                this.agregarProductos();
                this.total();
                this.vuelto();
                break;
            case 2:
                System.out.println("Ha seleccionado: COMBO Deca Omega Plus (129$)");
                precioPorProducto=129;
                this.agregarProductos();
                this.total();
                this.vuelto();
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }
    public void SetsBaño(){
        System.out.println("---SETS DE BAÑO---");
        System.out.println("1.- Set de baño Orange x4 piezas Nantes (73$)");
        System.out.println("2.- Set de baño Alamo x5 piezas Expambox (52$)");
        System.out.print("Seleccione una opción: ");
        int setsBaño = ncs.nextInt();
        switch (setsBaño) {
            case 1:
                System.out.println("Ha seleccionado: Set de baño Orange x4 piezas Nantes (73$)");
                precioPorProducto=73;
                this.agregarProductos();
                this.total();
                this.vuelto();
                break;
            case 2:
                System.out.println("Ha seleccionado: Set de baño Alamo x5 piezas Expambox (52$)");
                precioPorProducto=52;
                this.agregarProductos();
                this.total();
                this.vuelto();
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }
    public void Inodoros_y_Asientos(){
        System.out.println("-----INODOROS Y ASIENTOS");
        System.out.println("""             
                |1|- Inodoros One Pice-------------------------
                |2|- Inodoros de dos piezas--------------------
                |0|- regresar-------------------
                """);
        int inodorosAsientos= ncs.nextInt();
        switch(inodorosAsientos){
            case 1:
                this.Onepice();
                break;
            case 2:
                this.Inodoros_dos_piezas();
                break;
            case 0:
                this.Baño();
                break;
            default:
                System.out.println("Opción no valida");
        }
    }
    public void Onepice(){
        System.out.println("-----INODOROS ONE PICE");
        System.out.println("""             
                |1|- ITALGRIF---------------------
                |2|- TREBOL-----------------------
                |0|- regresar---------------------
                """);
        int onepice=ncs.nextInt();
        switch(onepice){
            case 1:
                this.ITALGRIF();
                break;
            case 2:
                this.TREBOL();
                break;
            case 0:
                this.Inodoros_y_Asientos();
                break;
            default:
                System.out.println("Opcion no valida");
        }
    }
    public void ITALGRIF(){
        System.out.println("""
                |------------------------- ITALGRIF -----------------------------------------------------------|- Precio-|
                |1|- COMBO Inodoro one piece Buzios Blanco + Lavatorio Aruba Blanco + Pedestal Vallarta Blanco-|- S/646 -|
                |2|- Inodoro One Piece Buzios botón superior + Asiento Vallarta Blanco Italgrif ---------------|- S/ 514-|
                |0|- regresar
                """);
        int italgrif= ncs.nextInt();
        switch(italgrif){
            case 1:
                System.out.println("Ha seleccionado: " +
                        "COMBO Inodoro one piece Buzios Blanco + Lavatorio Aruba Blanco + Pedestal Vallarta Blanco(646$)");
                precioPorProducto=646;
                this.agregarProductos();
                this.total();
                this.vuelto();
                break;
            case 2:
                System.out.println("Ha seleccionado:" +
                        "Inodoro One Piece Buzios botón superior + Asiento Vallarta Blanco Italgrif (514$) ");
                this.agregarProductos();
                this.total();
                this.vuelto();
                break;
            case 0:
                this.Onepice();
                break;
            default:
                System.out.println("Opcion no valida");
        }
    }
    public void TREBOL(){
        System.out.println("""
                |------------------------- TREBOL --------------------------------|- Precio --|
                |1|- One piece Balanz Blanco PD AS SD Trebol ---------------------|- S/ 479 --|
                |2|- Inodoro One piece Vita Blanco Trebol----------------------- -|- S/ 569 --|
                |0|- regresar
                """);
        int trebol=ncs.nextInt();
        switch(trebol){
            case 1:
                System.out.println("Ha seleccionado: One piece Balanz Blanco PD AS SD Trebol(479$)");
                precioPorProducto=479;
                this.agregarProductos();
                this.total();
                this.vuelto();
                break;
            case 2:
                System.out.println("Ha seleccionado: Inodoro One piece Vita Blanco Trebol(569$)");
                precioPorProducto=569;
                this.agregarProductos();
                this.total();
                this.vuelto();
                break;
            case 0:
                this.Onepice();
                break;
            default:
                System.out.println("Opcion no valida");
        }
    }
    public void Inodoros_dos_piezas(){
        System.out.println("""
                |---------------------------------INODOROS DOS PIEZAS-----------------------------------------------------|- Precio-|
                |1|- COMBO Trebol: Tanque para inodoro Rapid Jet Premium Blanco + Taza para inodoro Rapid Jet Plus Blanco-|- s/ 209 -|
                |2|- Sanitario Rapid Jet Plus Blanco Trebol --------------------------------------------------------------|- S/ 209-|
                |0|- regresar
                """);
        int dosPiezas=ncs.nextInt();
        switch(dosPiezas){
            case 1:
                System.out.println("Ha seleccionado:" +
                        "COMBO Trebol: Tanque para inodoro Rapid Jet Premium Blanco + Taza para inodoro Rapid Jet Plus Blanco(209$)");
                precioPorProducto=209;
                this.agregarProductos();
                this.total();
                this.vuelto();
                break;
            case 2 :
                System.out.println("Ha seleccionado: Sanitario Rapid Jet Plus Blanco Trebol(209$)");
                precioPorProducto=209;
                this.agregarProductos();
                this.total();
                this.vuelto();
                break;
            case 0:
                this.Inodoros_y_Asientos();
                break;
            default:
                System.out.println("Opcion no valida");
        }
    }
    public void Lavatorios(){
        System.out.println("---------LAVATORIOS---------");
        System.out.println("""             
                |1|- Lavatorios y pedestales-----------------
                |2|- Ovalines--------------------------------
                |0|- Regresar--------------------------------
                """);
        int lavatorios=ncs.nextInt();
        switch (lavatorios){
            case 1:
                this.Lavatorios_y_pedestales();
                break;
            case 2:
                this.Ovalines();
                break;
            case 0:
                this.Baño();
                break;
            default:
                System.out.println("Opcion no valida");
        }
    }
    public void Lavatorios_y_pedestales(){
        System.out.println("""
                |---------------------LAVATORIOS Y PEDESTALES--------------------------|- Precio --|
                |1|- Lavatorio Cancún Boné Italgrif -----------------------------------|- S/ 114 --|
                |2|- Pedestal Universal Blanco Trebol ------------------------------- -|- S/ 60  --|
                |0|- regresar
                """);
        int lavatorios=ncs.nextInt();
        switch (lavatorios){
            case 1:
                System.out.println("Ha seleccionado: Lavatorio Cancún Boné Italgrif  (114$)");
                precioPorProducto=114;
                this.agregarProductos();
                this.total();
                this.vuelto();
                break;
            case 2:
                System.out.println("Ha seleccionado: Pedestal Universal Blanco Trebol (60$)");
                precioPorProducto=60;
                this.agregarProductos();
                this.total();
                this.vuelto();
                break;
            case 0:
                this.Lavatorios();
                break;
            default:
                System.out.println("Opcion no valida");
        }
    }
    public void Ovalines(){
        System.out.println("""
                |---------------------OVALINES----------------------------------------|- Precio --|
                |1|- Ovalín rectangular Fv Carusso Blanco 46cm --- -------------------|- S/ 185 --|
                |2|- Ovalín circular Priano Negro Mate Trebol - ----------------------|- S/ 249 --|
                |0|- regresar
                """);
        int lavatorios=ncs.nextInt();
        switch (lavatorios){
            case 1:
                System.out.println("Ha seleccionado: Ovalín rectangular Fv Carusso Blanco 46cm (185$)");
                precioPorProducto=185;
                this.agregarProductos();
                this.total();
                this.vuelto();
                break;
            case 2:
                System.out.println("Ha seleccionado: Ovalín circular Priano Negro Mate Trebol (249$)");
                precioPorProducto=249;
                this.agregarProductos();
                this.total();
                this.vuelto();
                break;
            case 0:
                this.Lavatorios();
                break;
            default:
                System.out.println("Opcion no valida");
        }
    }

    public void cocina() {
        System.out.println("----COCINA----");
        System.out.println("""
            |1|-  Muebles de cocina --------------------------
            |2|-  Organizadores de cocina---------------------
            """);

        int cocina = ncs.nextInt();
        switch (cocina) {
            case 1:
                this.muebleCocina();
                break;
            case 2:
                this.organizadoresCocina();
                break;
            default:
                System.out.println("Opción no válida para Cocina.");
        }
    }
    public void muebleCocina() {
        System.out.println("-----MUEBLES DE COCINA------");
        System.out.println("""
        |1|- Reposteros de cocina modulares---------------
        """);

        int  CocinaMUebles = ncs.nextInt();
        switch (CocinaMUebles) {
            case 1:
                this.reposterosModulares();
                break;
            default:
                System.out.println("Opción no válida para CocinaMuebles.");
        }
    }
    public void reposterosModulares() {
        System.out.println("---Reposteros de cocina modulares---");
        System.out.println("""
        |1|-  Combos Modulares-------------------------
        """);

        int CModulares = ncs.nextInt();
        switch (CModulares) {
            case 1:
                this.combosModulares();
                break;
            default:
                System.out.println("Opción no válida para CModulares.");
        }
    }
    public void combosModulares() {
        System.out.println("""
        |1|- "Mueble de Cocina Modular Orange para Microondas con Cajonera 140cm Blanco/Rojo"
    """);
        int CM = ncs.nextInt();
        switch (CM) {
            case 1:
                System.out.println("Ha seleccionado: " +
                        "Mueble de Cocina Modular Orange para Microondas con Cajonera 140cm Blanco/Rojo(1839$)");
                precioPorProducto=1839;
                this.agregarProductos();
                this.total();
                this.vuelto();
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }
    public void organizadoresCocina() {
        System.out.println("----ORGANIZADORES DE COCINA----");
        System.out.println("""
        |1|- Fruteros y verduleros--------------------------
        """);

        int FT = ncs.nextInt();
        switch (FT) {
            case 1:
                this.fruterosVerduleros();
                break;
            default:
                System.out.println("Opción no válida para Organizadores de cocina.");
        }
    }
    public void fruterosVerduleros() {
        System.out.println("""
       |------------------------- Nombre del Producto ---------------------------------|- Precio ---|
       |1|- Organizador de frutas modular M Orange-------------------------------------|- S/ 28 ----|
       |2|- Organizador Slim 3 niveles con ruedas--------------------------------------|- S/ 9.90 --|
       """);

        int OF = ncs.nextInt();
        switch (OF) {
            case 1:
                System.out.println("Organizador de frutas modular M Orange-------------------------------------|- S/ 28 ----|");
                precioPorProducto=28;
                this.agregarProductos();
                this.total();
                this.vuelto();
                break;
            case 2:
                System.out.println("Organizador Slim 3 niveles con ruedas--------------------------------------|- S/  9.90 -|");
                precioPorProducto=9.90;
                this.agregarProductos();
                this.total();
                this.vuelto();
                break;
            default:
                System.out.println("Opción no válida para Organizadores de Frutas.");
        }
    }

    // FIN DE CODIGO DE GEMA
    // CODIGO DE YEYSON
    public void seccion_de_JARDINERIA() {
        System.out.println("|--------------------------------------------------------------------------------------------|");
        System.out.println("----------JARDINERIA----------");
        System.out.println("""
                |--------------------------------------------------------------------------------------------|""");
        System.out.println("1.- "+JARDINERIA[0]);
        System.out.println("2.- "+volver[0]);
        System.out.println("0.- "+volver[1]);
        System.out.println("|--------------------------------------------------------------------------------------------|");
        opcion = ncs.nextInt();
        switch (opcion) {
            case 1:
                this.DECOJARDIN();
                break;
            case 2:
                this.secciondecategorias();
                break;
            case 0:
                this.menuprincipal();
                break;
            default:
                break;
        }

    }

    public void DECOJARDIN() {
        System.out.println("|--------------------------------------------------------------------------------------------|");
        System.out.println("-----DECO JARDIN-----");
        System.out.println("""
                |--------------------------------------------------------------------------------------------|""");
        System.out.println("1.-"+JARDINERIA[1]);
        System.out.println("0.-"+volver[0]);
        System.out.println("|--------------------------------------------------------------------------------------------|");
        opcion = ncs.nextInt();
        switch (opcion) {
            case 1:
                this.Macetas_maceteros_y_platos();
                break;
            case 0:
                this.seccion_de_JARDINERIA();
                break;
            default:
                break;
        }
    }

    public void Macetas_maceteros_y_platos() {
        System.out.println("|--------------------------------------------------------------------------------------------|");
        System.out.println("JARDINERIA/Deco Jardin/Macetas, maceteros y platos");
        System.out.println("""
                |--------------------------------------------------------------------------------------------|""");
        for(i=2;i<4;i++){
            System.out.println((i-1)+".- "+JARDINERIA[i]);
        }
        System.out.println("0.- "+volver[0]);
        System.out.println("|--------------------------------------------------------------------------------------------|");
        opcion = ncs.nextInt();
        switch (opcion) {
            case 1:
                this.formapagomacetas_y_maceteros();
                break;
            case 2:
                this.formapagomacetas_y_maceteros();
                break;
            case 3:
                this.DECOJARDIN();
                break;
        }
    }

    public void Macetas() {
        System.out.println("""
                JARDINERIA / Deco Jardin / Macetas, maceteros y platos / Macetas
                |--------------------------------------------------------------------------------------------|
                |------------------------- Nombre del Producto ---------------------------------|- Precio ---|""");
        for(i=4;i<6;i++){
            System.out.println(JARDINERIA[i]);
        }
        System.out.println("0.- "+volver[0]);
        System.out.println("|--------------------------------------------------------------------------------------------|");
        opcion = ncs.nextInt();
        switch (opcion) {
            case 1:
                break;
            case 2:
                break;
            case 0:
                this.Macetas_maceteros_y_platos();
                break;
        }
    }

    public void Maceteros() {
        System.out.println("""
                JARDINERIA / Deco Jardin / Macetas, maceteros y platos / Macetas
                |--------------------------------------------------------------------------------------------|
                |------------------------- Nombre del Producto ---------------------------------|- Precio ---|""");
        for(i=6;i<8;i++){
            System.out.println(JARDINERIA[i]);
        }
        System.out.println("0.- "+volver[0]);
        System.out.println("|--------------------------------------------------------------------------------------------|");
        opcion = ncs.nextInt();
        switch (opcion) {
            case 1:
                break;
            case 2:
                break;
            case 0:
                this.Macetas_maceteros_y_platos();
                break;
        }
    }

    public double formapagomacetas_y_maceteros() {
        double total_a_pagar = 0;
        if (opcion == 1) {
            this.Macetas();
            this.cantidad_De_productos();
            if (opcion == 1) {
                igv = (cant_compra *precioJardineria[0]) * 0.18;
                subtotal = (cant_compra * precioJardineria[0]) - igv;
                this.pago_y_vuelto();
            } else if (opcion == 2) {
                igv = (cant_compra * precioJardineria[1]) * 0.18;
                subtotal = (cant_compra * precioJardineria[1]) - igv;
                this.pago_y_vuelto();
            } else {

            }
        } else if (opcion == 2) {
            this.Maceteros();
            this.cantidad_De_productos();
            if (opcion == 1) {
                igv = (cant_compra * precioJardineria[2]) * 0.18;
                subtotal = (cant_compra * precioJardineria[2]) - igv;
                this.pago_y_vuelto();
            } else if (opcion == 2) {
                igv = (cant_compra * precioJardineria[3]) * 0.18;
                subtotal = (cant_compra * precioJardineria[3]) - igv;
                this.pago_y_vuelto();
            } else {

            }
        } else {
            System.out.println("opcion no valida");
        }
        return total_a_pagar;
    }

    public void seccion_de_OFICINA_Y_ESCOLAR() {
        System.out.println("|--------------------------------------------------------------------------------------------|");
        System.out.println("----------OFICINA Y ESCOLAR-----------");
        System.out.println("""
                |--------------------------------------------------------------------------------------------|
                |1| Utiles de Escritorio y Oficina-----------------------------------------------------------|
                |2| Regresar---------------------------------------------------------------------------------|
                |0| Menu Principal---------------------------------------------------------------------------|
                |--------------------------------------------------------------------------------------------|
                """);
        opcion = ncs.nextInt();
        switch (opcion) {
            case 1:
                this.UTILES_DE_ESCRITORIO_Y_OFICNA();
                break;
            case 2:
                this.secciondecategorias();
                break;
            case 0:
                this.menuprincipal();
                break;
            default:
                break;
        }
    }

    public void UTILES_DE_ESCRITORIO_Y_OFICNA() {
        System.out.println("-----UTILES DE ESCRITORIOS Y OFICINA-----");
        System.out.println("""
                |--------------------------------------------------------------------------------------------|
                |1| Lapiceros y bolígrafos-------------------------------------------------------------------|
                |2| Agendas y libretas de notas--------------------------------------------------------------|
                |3| Calculadoras-----------------------------------------------------------------------------|
                |4| Etiquetas y micas------------------------------------------------------------------------|
                |5| Notas adhesivas--------------------------------------------------------------------------|
                |6| Papelería--------------------------------------------------------------------------------|
                |0| regresar---------------------------------------------------------------------------------|
                |--------------------------------------------------------------------------------------------|
                """);
        opcion = ncs.nextInt();
        switch (opcion) {
            case 1:
                this.forma_de_pago_UTILES_DE_ESCRITORIO_Y_OFICNA();
                break;
            case 2:
                this.forma_de_pago_UTILES_DE_ESCRITORIO_Y_OFICNA();
                break;
            case 3:
                this.forma_de_pago_UTILES_DE_ESCRITORIO_Y_OFICNA();
                break;
            case 4:
                this.forma_de_pago_UTILES_DE_ESCRITORIO_Y_OFICNA();
                break;
            case 5:
                this.forma_de_pago_UTILES_DE_ESCRITORIO_Y_OFICNA();
                break;
            case 6:
                this.forma_de_pago_UTILES_DE_ESCRITORIO_Y_OFICNA();
                break;
            case 0:
                this.seccion_de_OFICINA_Y_ESCOLAR();
                break;
            default:
                break;
        }
    }

    public void Lapiceros_y_bolígrafos() {
        System.out.println("OFICINA Y ESCOLAR / Utiles de Escritorio y Oficina / Lapiceros y bolígrafos");
        System.out.println("""
                |--------------------------------------------------------------------------------------------|
                |------------------------- Nombre del Producto ---------------------------------|- Precio ---|
                |1|- Lapicero CLASS&WORK Rainbow Paquete 3un -----------------------------------|- S/ 15.96 -|
                |2|- Lapicero de punta Redonda CLASS&WORK Tinta Líquida Sunset -----------------|- S/ 27.92 -|
                |0|- regresar
                """);
        opcion = ncs.nextInt();
        switch (opcion) {
            case 1:
                break;
            case 2:
                break;
            case 0:
                this.UTILES_DE_ESCRITORIO_Y_OFICNA();
                break;
            default:
                break;
        }
    }

    public void Agendas_y_libretas_de_notas() {
        System.out.println("OFICINA Y ESCOLAR / Utiles de Escritorio y Oficina / Agendas y libretas de notas");
        System.out.println("""
                |--------------------------------------------------------------------------------------------|
                |------------------------- Nombre del Producto ---------------------------------|- Precio ---|
                |1|- Diario A6 de Recetas / AMOR -----------------------------------------------|- S/ 18.00 -|
                |2|- Pack Ingenial Ariana: diario + libretas x 2 unds. -------------------------|- S/ 61.00 -|
                |0|- regresar
                """);
        opcion = ncs.nextInt();
        switch (opcion) {
            case 1:
                break;
            case 2:
                break;
            case 0:
                this.UTILES_DE_ESCRITORIO_Y_OFICNA();
                break;
            default:
                break;
        }
    }

    public void Calculadoras() {
        System.out.println("OFICINA Y ESCOLAR / Utiles de Escritorio y Oficina / Calculadoras");
        System.out.println("""
                |--------------------------------------------------------------------------------------------|
                |------------------------- Nombre del Producto ---------------------------------|- Precio ---|
                |1|- Calculadora Estilo Kuromi -------------------------------------------------|- S/ 38.90 -|
                |2|- Calculadora Casio Fx 991 es científica Azul -------------------------------|- S/119.99 -|
                |0|- regresar
                """);
        opcion = ncs.nextInt();
        switch (opcion) {
            case 1:
                break;
            case 2:
                break;
            case 0:
                this.UTILES_DE_ESCRITORIO_Y_OFICNA();
                break;
            default:
                break;
        }
    }

    public void Etiquetas_y_micas() {
        System.out.println("OFICINA Y ESCOLAR / Utiles de Escritorio y Oficina / Etiquetas y micas");
        System.out.println("""
                |--------------------------------------------------------------------------------------------|
                |------------------------- Nombre del Producto ---------------------------------|- Precio ---|
                |1|- Etiqueta Termica Adhesiva 3x2cm 2 Col Pack 3 Rollos -----------------------|- S/ 87.00 -|
                |2|- Figuras Adhesivas ARTI CREATIVO La Jungla Paquete 8un ---------------------|- S/  4.90 -|
                |0|- regresar
                """);
        opcion = ncs.nextInt();
        switch (opcion) {
            case 1:
                break;
            case 2:
                break;
            case 0:
                this.UTILES_DE_ESCRITORIO_Y_OFICNA();
                break;
            default:
                break;
        }
    }

    public void Notas_adhesivas() {
        System.out.println("OFICINA Y ESCOLAR / Utiles de Escritorio y Oficina / Notas adhesivas");
        System.out.println("""
                |--------------------------------------------------------------------------------------------|
                |------------------------- Nombre del Producto ---------------------------------|- Precio ---|
                |1|- Notas Adhesivas ARTESCO Sticky 75mm x 75mm Neón ---------------------------|- S/  1.70 -|
                |2|- Notas Adhesivas ARTESCO Colores Neón Paquete 500un ------------------------|- S/ 10.00 -|
                |0|- regresar
                """);
        opcion = ncs.nextInt();
        switch (opcion) {
            case 1:
                break;
            case 2:
                break;
            case 0:
                this.UTILES_DE_ESCRITORIO_Y_OFICNA();
                break;
            default:
                break;
        }
    }

    public void Papelería() {
        System.out.println("OFICINA Y ESCOLAR / Utiles de Escritorio y Oficina / Papeleria");
        System.out.println("""
                |--------------------------------------------------------------------------------------------|
                |------------------------- Nombre del Producto ---------------------------------|- Precio ---|
                |1|- Papel Bond CLASS & WORK A4 Paquete 500 Hojas ------------------------------|- S/ 12.40 -|
                |2|- Rollo de Papel Kraft Zeraus Packing 45cm x 50metros 75g -------------------|- S/ 37.90 -|
                |0|- regresar
                """);
        opcion = ncs.nextInt();
        switch (opcion) {
            case 1:
                break;
            case 2:
                break;
            case 0:
                this.UTILES_DE_ESCRITORIO_Y_OFICNA();
                break;
            default:
                break;
        }
    }

    public double forma_de_pago_UTILES_DE_ESCRITORIO_Y_OFICNA() {
        double total_a_pagar = 0;
        if (opcion == 1) {
            this.Lapiceros_y_bolígrafos();
            this.cantidad_De_productos();
            if (opcion == 1) {
                igv = (cant_compra * 15.96) * 0.18;
                subtotal = (cant_compra * 15.96) - igv;
                this.pago_y_vuelto();
            } else if (opcion == 2) {
                igv = (cant_compra * 27.92) * 0.18;
                subtotal = (cant_compra * 27.92) - igv;
                this.pago_y_vuelto();
            } else {

            }
        } else if (opcion == 2) {
            this.Agendas_y_libretas_de_notas();
            this.cantidad_De_productos();
            if (opcion == 1) {
                igv = (cant_compra * 18) * 0.18;
                subtotal = (cant_compra * 18) - igv;
                this.pago_y_vuelto();
            } else if (opcion == 2) {
                igv = (cant_compra * 61) * 0.18;
                subtotal = (cant_compra * 61) - igv;
                this.pago_y_vuelto();
            } else {

            }
        } else if (opcion == 3) {
            this.Calculadoras();
            this.cantidad_De_productos();
            if (opcion == 1) {
                igv = (cant_compra * 38.90) * 0.18;
                subtotal = (cant_compra * 38.90) - igv;
                this.pago_y_vuelto();
            } else if (opcion == 2) {
                igv = (cant_compra * 119.99) * 0.18;
                subtotal = (cant_compra * 119.99) - igv;
                this.pago_y_vuelto();
            } else {

            }
        } else if (opcion == 4) {
            this.Etiquetas_y_micas();
            this.cantidad_De_productos();
            if (opcion == 1) {
                igv = (cant_compra * 87) * 0.18;
                subtotal = (cant_compra * 87) - igv;
                this.pago_y_vuelto();
            } else if (opcion == 2) {
                igv = (cant_compra * 4.9) * 0.18;
                subtotal = (cant_compra * 4.9) - igv;
                this.pago_y_vuelto();
            } else {

            }
        } else if (opcion == 5) {
            this.Notas_adhesivas();
            this.cantidad_De_productos();
            if (opcion == 1) {
                igv = (cant_compra * 1.7) * 0.18;
                subtotal = (cant_compra * 1.7) - igv;
                this.pago_y_vuelto();
            } else if (opcion == 2) {
                igv = (cant_compra * 10) * 0.18;
                subtotal = (cant_compra * 10) - igv;
                this.pago_y_vuelto();
            } else {

            }
        } else if (opcion == 6) {
            this.Papelería();
            this.cantidad_De_productos();
            if (opcion == 1) {
                igv = (cant_compra * 12.4) * 0.18;
                subtotal = (cant_compra * 12.4) - igv;
                this.pago_y_vuelto();
            } else if (opcion == 2) {
                igv = (cant_compra * 37.9) * 0.18;
                subtotal = (cant_compra * 37.9) - igv;
                this.pago_y_vuelto();
            } else {

            }
        } else {
            System.out.println("opcion no valida");
        }
        return total_a_pagar;
    }

    public void seccion_de_INFANTIL() {
        System.out.println("|--------------------------------------------------------------------------------------------|");
        System.out.println("----------INFANTIL----------");
        System.out.println("""
                |--------------------------------------------------------------------------------------------|
                |1| seguridad infantil-----------------------------------------------------------------------|
                |2| Regresar---------------------------------------------------------------------------------|
                |0| Menu Principal---------------------------------------------------------------------------|
                |--------------------------------------------------------------------------------------------|
                """);
        opcion = ncs.nextInt();
        do {
            switch (opcion) {
                case 1:
                    this.SEGURIDAD_INFANTIL();
                    break;
                case 2:
                    this.secciondecategorias();
                    break;
                case 0:
                    this.menuprincipal();
                    break;
                default:
                    break;
            }
        }
        while (opcion == 2.1);
    }

    public void SEGURIDAD_INFANTIL() {
        System.out.println("|--------------------------------------------------------------------------------------------|");
        System.out.println("-----SEGURIDAD INFANTIL-----");
        System.out.println("""
                |--------------------------------------------------------------------------------------------|
                |1| Monitores para bebés---------------------------------------------------------------------|
                |2| Protectores de enchufe infantiles--------------------------------------------------------|
                |3| Rejas y mallas de seguridad infantiles---------------------------------------------------|
                |4| Sillas de auto para bebes----------------------------------------------------------------|
                |0| regresar---------------------------------------------------------------------------------|
                |--------------------------------------------------------------------------------------------|
                """);
        opcion = ncs.nextInt();
        switch (opcion) {
            case 1:
                this.forma_de_pago_INFANTILES();
                break;
            case 2:
                this.forma_de_pago_INFANTILES();
                break;
            case 3:
                this.forma_de_pago_INFANTILES();
                break;
            case 4:
                this.forma_de_pago_INFANTILES();
                break;
            case 0:
                this.seccion_de_INFANTIL();
                break;
            default:
                break;
        }
    }

    public void Monitores_para_bebés() {
        System.out.println("""
                INFANTIL / Seguridad Infantil / Monitores para bebés
                |--------------------------------------------------------------------------------------------|
                |------------------------- Nombre del Producto ---------------------------------|- Precio ---|
                |1|- Monitor LCD a color 2.4" Bebé VM2251 Vtech --------------------------------|- S/299.00 -|
                |2|- Monitor smart wifi para bebé NEXXT ----------------------------------------|- S/169.00 -|
                |0|- regresar
                """);
        opcion = ncs.nextInt();
        switch (opcion) {
            case 1:
                break;
            case 2:
                break;
            case 0:
                this.SEGURIDAD_INFANTIL();
                break;
            default:
                break;
        }
    }

    public void Protectores_de_enchufe_infantiles() {
        System.out.println("""
                INFANTIL / Seguridad Infantil / Protectores de enchufe infantiles
                |--------------------------------------------------------------------------------------------|
                |------------------------- Nombre del Producto ---------------------------------|- Precio ---|
                |1|- Protector enchufe recto (pack x 6) Inofix ---------------------------------|- S/  9.90 -|
                |2|- Protector Para Enchufe Safety 1St Ultra Clear -----------------------------|- S/ 14.95 -|
                |0|- regresar
                """);
        opcion = ncs.nextInt();
        switch (opcion) {
            case 1:
                break;
            case 2:
                break;
            case 0:
                this.SEGURIDAD_INFANTIL();
                break;
            default:
                break;
        }
    }

    public void Rejas_y_mallas_de_seguridad_infantiles() {
        System.out.println("""
                INFANTIL / Seguridad Infantil / Rejas y mallas de seguridad infantiles
                |--------------------------------------------------------------------------------------------|
                |------------------------- Nombre del Producto ---------------------------------|- Precio ---|
                |1|- Reja de seguridad de MDF plegable para bebés y mascotas L RRC -------------|- S/159.90 -|
                |2|- Reja de seguridad a presión para bebés y mascotas Happy Dino --------------|- S/269.00 -|
                |0|- regresar
                """);
        opcion = ncs.nextInt();
        switch (opcion) {
            case 1:
                break;
            case 2:
                break;
            case 0:
                this.SEGURIDAD_INFANTIL();
                break;
            default:
                break;
        }
    }

    public void Sillas_de_auto_para_bebes() {
        System.out.println("""
                INFANTIL / Seguridad Infantil / Sillas de auto para bebes
                |--------------------------------------------------------------------------------------------|
                |------------------------- Nombre del Producto ---------------------------------|- Precio ---|
                |1|- Silla de Auto para Bebe EBaby Conetta EB563-1 Negro -----------------------|- S/1,499. -|
                |2|- Juguete Pato Bailarín con Luces Recargable --------------------------------|- S/   49. -|
                |0|- regresar
                """);
        opcion = ncs.nextInt();
        switch (opcion) {
            case 1:
                break;
            case 2:
                break;
            case 0:
                this.SEGURIDAD_INFANTIL();
                break;
            default:
                break;
        }
    }

    public double forma_de_pago_INFANTILES() {
        double  total_a_pagar = 0;
        if (opcion == 1) {
            this.Monitores_para_bebés();
            this.cantidad_De_productos();
            if (opcion == 1) {
                igv = (cant_compra * 299) * 0.18;
                subtotal = (cant_compra * 299) - igv;
                this.pago_y_vuelto();
            } else if (opcion == 2) {
                igv = (cant_compra * 169) * 0.18;
                subtotal = (cant_compra * 169) - igv;
                this.pago_y_vuelto();
            } else {

            }
        } else if (opcion == 2) {
            this.Protectores_de_enchufe_infantiles();
            this.cantidad_De_productos();
            if (opcion == 1) {
                igv = (cant_compra * 9.9) * 0.18;
                subtotal = (cant_compra * 9.9) - igv;
                this.pago_y_vuelto();
            } else if (opcion == 2) {
                igv = (cant_compra * 14.95) * 0.18;
                subtotal = (cant_compra * 14.95) - igv;
                this.pago_y_vuelto();
            } else {

            }
        } else if (opcion == 3) {
            this.Rejas_y_mallas_de_seguridad_infantiles();
            this.cantidad_De_productos();
            if (opcion == 1) {
                igv = (cant_compra * 159.9) * 0.18;
                subtotal = (cant_compra * 159.9) - igv;
                this.pago_y_vuelto();
            } else if (opcion == 2) {
                igv = (cant_compra * 269) * 0.18;
                subtotal = (cant_compra * 269) - igv;
                this.pago_y_vuelto();
            } else {

            }
        } else if (opcion == 4) {
            this.Sillas_de_auto_para_bebes();
            this.cantidad_De_productos();
            if (opcion == 1) {
                igv = (cant_compra * 1499) * 0.18;
                subtotal = (cant_compra * 1499) - igv;
                this.pago_y_vuelto();
            } else if (opcion == 2) {
                igv = (cant_compra * 49) * 0.18;
                subtotal = (cant_compra * 49) - igv;
                this.pago_y_vuelto();
            } else {

            }
        } else {
            System.out.println("opcion no valida");
        }
        return total_a_pagar;
    }

    public void seccion_de_SALUD_Y_DEPORTES() {
        System.out.println("|--------------------------------------------------------------------------------------------|");
        System.out.println("-----SALUD Y DEPORTES-----");
        System.out.println("""
                |--------------------------------------------------------------------------------------------|
                |1| Cuidado de la Salud----------------------------------------------------------------------|
                |2| Regresar---------------------------------------------------------------------------------|
                |0| Menu Principal---------------------------------------------------------------------------|
                |--------------------------------------------------------------------------------------------|
                """);
        opcion = ncs.nextInt();
        do {
            switch (opcion) {
                case 1:
                    this.CUIDADO_DELA_SALUD();
                    break;
                case 2:
                    this.secciondecategorias();
                    break;
                case 0:
                    this.menuprincipal();
                    break;
                default:
                    break;
            }
        }
        while (opcion == 2.1);
    }

    public void CUIDADO_DELA_SALUD() {
        System.out.println("|--------------------------------------------------------------------------------------------|");
        System.out.println("-----CUIDADO DE LA SALUD-----");
        System.out.println("""
                |--------------------------------------------------------------------------------------------|
                |1| Alcohol----------------------------------------------------------------------------------|
                |2| Bloqueadores solares y repelentes--------------------------------------------------------|
                |3| Tapabocas y mascarillas------------------------------------------------------------------|
                |4| Protectores faciales---------------------------------------------------------------------|
                |5| Mochilas de emergencias y botiquines-----------------------------------------------------|
                |6| Mamelucos--------------------------------------------------------------------------------|
                |7| Guantes quirurgicos----------------------------------------------------------------------|
                |0| regresar---------------------------------------------------------------------------------|
                |--------------------------------------------------------------------------------------------|
                """);
        opcion = ncs.nextInt();
        switch (opcion) {
            case 1:
                this.seccion_de_pago_SALUD_Y_DEPORTES();
                break;
            case 2:
                this.seccion_de_pago_SALUD_Y_DEPORTES();
                break;
            case 3:
                this.seccion_de_pago_SALUD_Y_DEPORTES();
                break;
            case 4:
                this.seccion_de_pago_SALUD_Y_DEPORTES();
                break;
            case 5:
                this.seccion_de_pago_SALUD_Y_DEPORTES();
                break;
            case 6:
                this.seccion_de_pago_SALUD_Y_DEPORTES();
                break;
            case 7:
                this.seccion_de_pago_SALUD_Y_DEPORTES();
                break;
            case 0:
                this.seccion_de_SALUD_Y_DEPORTES();
                break;
            default:
                break;
        }
    }

    public void Alcohol() {
        System.out.println("""
                SALUD Y DEPORTES / Cuidado de la Salud / Alcohol
                |--------------------------------------------------------------------------------------------|
                |------------------------- Nombre del Producto ---------------------------------|- Precio ---|
                |1|- Alcohol Isopropílico al 53% Daryza 1lt ------------------------------------|- S/ 20.90 -|
                |2|- Alcohol Puro 96° 1 galon Alkofarma ----------------------------------------|- S/ 54.90 -|
                |0|- regresar
                """);
        opcion = ncs.nextInt();
        switch (opcion) {
            case 1:
                break;
            case 2:
                break;
            case 0:
                this.CUIDADO_DELA_SALUD();
                break;
            default:
                break;
        }
    }

    public void Bloqueadores_solares_y_repelentes() {
        System.out.println("""
                SALUD Y DEPORTES / Cuidado de la Salud / Bloqueadores solares
                |--------------------------------------------------------------------------------------------|
                |------------------------- Nombre del Producto ---------------------------------|- Precio ---|
                |1|- Bloqueador solar Spf 50 Fr 1000ml Palmera ---------------------------------|- S/129.90 -|
                |2|- Repelente en crema 60gr Off Family ----------------------------------------|- S/  9.90 -|
                |0|- regresar
                """);
        opcion = ncs.nextInt();
        switch (opcion) {
            case 1:
                break;
            case 2:
                break;
            case 0:
                this.CUIDADO_DELA_SALUD();
                break;
            default:
                break;
        }
    }

    public void Tapabocas_y_mascarillas() {
        System.out.println("""
                SALUD Y DEPORTES / Cuidado de la Salud / Tapa bocas
                |--------------------------------------------------------------------------------------------|
                |------------------------- Nombre del Producto ---------------------------------|- Precio ---|
                |1|- Respirador Kn95 Earloop Blanco x 15 unidades Leggera ----------------------|- S/  9.00 -|
                |2|- Mascarilla KN95 Negro x 15 unidades R&G -----------------------------------|- S/ 17.90 -|
                |0|- regresar
                
                """);
        opcion = ncs.nextInt();
        switch (opcion) {
            case 1:
                break;
            case 2:
                break;
            case 0:
                this.CUIDADO_DELA_SALUD();
                break;
            default:
                break;
        }
    }

    public void Protectores_faciales() {
        System.out.println("""
                SALUD Y DEPORTES / Cuidado de la Salud / Protectores faciales
                |--------------------------------------------------------------------------------------------|
                |------------------------- Nombre del Producto ---------------------------------|- Precio ---|
                |1|- Protector infantil de rostro Mono -----------------------------------------|- S/  0.50 -|
                |2|- Careta protectora anti-fog x1 unid ----------------------------------------|- S/  0.10 -|
                |0|- regresar
                """);
        opcion = ncs.nextInt();
        switch (opcion) {
            case 1:
                break;
            case 2:
                break;
            case 0:
                this.CUIDADO_DELA_SALUD();
                break;
            default:
                break;
        }
    }

    public void Mochilas_de_emergencias_y_botiquines() {
        System.out.println("""
                SALUD Y DEPORTES / Cuidado de la Salud / Mochilas de emergencias y botiquines
                |--------------------------------------------------------------------------------------------|
                |------------------------- Nombre del Producto ---------------------------------|- Precio ---|
                |1|- Botiquin Master Box N° 14 Polinplast --------------------------------------|- S/19.90  -|
                |2|- Botiquin Master Box N° 20 Polinplast --------------------------------------|- S/59.90  -|
                |0|- regresar
                """);
        opcion = ncs.nextInt();
        switch (opcion) {
            case 1:
                break;
            case 2:
                break;
            case 0:
                this.CUIDADO_DELA_SALUD();
                break;
            default:
                break;
        }
    }

    public void Mamelucos() {
        System.out.println("""
                SALUD Y DEPORTES / Cuidado de la Salud / Mamelucos
                |--------------------------------------------------------------------------------------------|
                |------------------------- Nombre del Producto ---------------------------------|- Precio ---|
                |1|- Buzo Gold Guard Sms Talla L Blanco 50gr x unid ----------------------------|- S/11.90  -|
                |2|- Mandilón Descartable 40g/m Pack x6 Unid R&G Talla L -----------------------|- S/48.00  -|
                |0|- regresar
                """);
        opcion = ncs.nextInt();
        switch (opcion) {
            case 1:
                break;
            case 2:
                break;
            case 0:
                this.CUIDADO_DELA_SALUD();
                break;
            default:
                break;
        }
    }

    public void Guantes_quirurgicos() {
        System.out.println("""
                SALUD Y DEPORTES / Cuidado de la Salud / Guntes quirurgicos
                |--------------------------------------------------------------------------------------------|
                |------------------------- Nombre del Producto ---------------------------------|- Precio ---|
                |1|- Guantes de Latex Lig Empolvados T-l X100 Leggera --------------------------|- S/24.90  -|
                |2|- Tocas Cofias Gorros Quirúrgicos Descartables por 100 und ------------------|- S/16.00  -|
                |0|- regresar
                """);
        opcion = ncs.nextInt();
        switch (opcion) {
            case 1:
                break;
            case 2:
                break;
            case 0:
                this.CUIDADO_DELA_SALUD();
                break;
            default:
                break;
        }
    }

    public double seccion_de_pago_SALUD_Y_DEPORTES() {
        double total, total_a_pagar = 0;
        if (opcion == 1) {
            this.Alcohol();
            this.cantidad_De_productos();
            if (opcion == 1) {
                igv = (cant_compra * 20.9) * 0.18;
                subtotal = (cant_compra * 20.9) - igv;
                this.pago_y_vuelto();
            } else if (opcion == 2) {
                igv = (cant_compra * 54.9) * 0.18;
                subtotal = (cant_compra * 54.9) - igv;
                this.pago_y_vuelto();
            } else {

            }
        } else if (opcion == 2) {
            this.Bloqueadores_solares_y_repelentes();
            this.cantidad_De_productos();
            if (opcion == 1) {
                igv = (cant_compra * 129.9) * 0.18;
                subtotal = (cant_compra * 129.9) - igv;
                this.pago_y_vuelto();
            } else if (opcion == 2) {
                igv = (cant_compra * 9.9) * 0.18;
                subtotal = (cant_compra * 9.9) - igv;
                this.pago_y_vuelto();
            } else {

            }
        } else if (opcion == 3) {
            this.Tapabocas_y_mascarillas();
            this.cantidad_De_productos();
            if (opcion == 1) {
                igv = (cant_compra * 9) * 0.18;
                subtotal = (cant_compra * 9) - igv;
                this.pago_y_vuelto();
            } else if (opcion == 2) {
                igv = (cant_compra * 17.9) * 0.18;
                subtotal = (cant_compra * 17.9) - igv;
                this.pago_y_vuelto();
            } else {

            }
        } else if (opcion == 4) {
            this.Protectores_faciales();
            this.cantidad_De_productos();
            if (opcion == 1) {
                igv = (cant_compra * 0.5) * 0.18;
                subtotal = (cant_compra * 0.5) - igv;
                this.pago_y_vuelto();
            } else if (opcion == 2) {
                igv = (cant_compra * 0.1) * 0.18;
                subtotal = (cant_compra * 0.1) - igv;
                this.pago_y_vuelto();
            } else {

            }
        } else if (opcion == 5) {
            this.Mochilas_de_emergencias_y_botiquines();
            this.cantidad_De_productos();
            if (opcion == 1) {
                igv = (cant_compra * 19.9) * 0.18;
                subtotal = (cant_compra * 19.9) - igv;
                this.pago_y_vuelto();
            } else if (opcion == 2) {
                igv = (cant_compra * 59.9) * 0.18;
                subtotal = (cant_compra * 59.9) - igv;
                this.pago_y_vuelto();
            } else {

            }
        } else if (opcion == 6) {
            this.Mamelucos();
            this.cantidad_De_productos();
            if (opcion == 1) {
                igv = (cant_compra * 11.9) * 0.18;
                subtotal = (cant_compra * 11.9) - igv;
                this.pago_y_vuelto();
            } else if (opcion == 2) {
                igv = (cant_compra * 48) * 0.18;
                subtotal = (cant_compra * 48) - igv;
                this.pago_y_vuelto();
            } else {

            }
        } else if (opcion == 7) {
            this.Guantes_quirurgicos();
            this.cantidad_De_productos();
            if (opcion == 1) {
                igv = (cant_compra * 24.9) * 0.18;
                subtotal = (cant_compra * 24.9) - igv;
                this.pago_y_vuelto();
            } else if (opcion == 2) {
                igv = (cant_compra * 16) * 0.18;
                subtotal = (cant_compra * 16) - igv;
                this.pago_y_vuelto();
            } else {
            }
        } else {
            System.out.println("opcion no valida");
        }
        return total_a_pagar;
    }

    public void seccion_de_MASCOTAS() {
        System.out.println("-----------MASCOTAS----------");
        System.out.println("""
                |--------------------------------------------------------------------------------------------|
                |1| Perros-----------------------------------------------------------------------------------|
                |2| Regresar---------------------------------------------------------------------------------|
                |0| Menu Principal---------------------------------------------------------------------------||
                |--------------------------------------------------------------------------------------------|
                """);
        opcion = ncs.nextInt();
        do {
            switch (opcion) {
                case 1:
                    this.PERROS();
                    break;
                case 2:
                    this.secciondecategorias();
                    break;
                case 0:
                    this.menuprincipal();
                    break;
                default:
                    break;
            }
        }
        while (opcion == 2.1);
    }

    public void PERROS() {
        System.out.println("|--------------------------------------------------------------------------------------------|");
        System.out.println("-----PERROS-----");
        System.out.println("""
                |--------------------------------------------------------------------------------------------|
                |1| Casas para perros------------------------------------------------------------------------|
                |2| Camas para perros------------------------------------------------------------------------|
                |3| Comida para perros-----------------------------------------------------------------------|
                |4| Juguetes para perros---------------------------------------------------------------------|
                |5| Platos y comedores para perros-----------------------------------------------------------|
                |6| Ropa para perros-------------------------------------------------------------------------|
                |7| Transportadores de perros----------------------------------------------------------------|
                |0| regresar---------------------------------------------------------------------------------|
                |--------------------------------------------------------------------------------------------|
                """);
        opcion = ncs.nextInt();
        switch (opcion) {
            case 1:
                this.seccion_de_pago_MASCOTAS();
                break;
            case 2:
                this.seccion_de_pago_MASCOTAS();
                break;
            case 3:
                this.seccion_de_pago_MASCOTAS();
                break;
            case 4:
                this.seccion_de_pago_MASCOTAS();
                break;
            case 5:
                this.seccion_de_pago_MASCOTAS();
                break;
            case 6:
                this.seccion_de_pago_MASCOTAS();
                break;
            case 7:
                this.seccion_de_pago_MASCOTAS();
                break;
            case 0:
                this.seccion_de_MASCOTAS();
                break;
            default:
                break;
        }
    }

    public void Casas_para_perros() {
        System.out.println("""
                MASCOTAS / Perros / Casas para perros
                |--------------------------------------------------------------------------------------------|
                |------------------------- Nombre del Producto ---------------------------------|- Precio ---|
                |1|- Mueble para Mascotas Pratt color Duna TU MESITA ---------------------------|- S/ 429.0 -|
                |2|- Mueble para Mascotas Rufus color Blanco TU MESITA -------------------------|- S/ 429.0 -|
                |0|- regresar
                """);
        opcion = ncs.nextInt();
        switch (opcion) {
            case 1:
                break;
            case 2:
                break;
            case 0:
                this.PERROS();
                break;
            default:
                break;
        }
    }

    public void Camas_para_perros() {
        System.out.println("""
                MASCOTAS / Perros / Camas para perros
                |--------------------------------------------------------------------------------------------|
                |------------------------- Nombre del Producto ---------------------------------|- Precio ---|
                |1|- Hogar para Mascotas Comodo Talla Mediana Y+Post-it adhesivos --------------|- S/279.90 -|
                |2|- Hogar para Mascotas Comodo y Util Grande Y+Post-it adhesivos --------------|- S/537.90 -|
                |0|- regresar
                """);
        opcion = ncs.nextInt();
        switch (opcion) {
            case 1:
                break;
            case 2:
                break;
            case 0:
                this.PERROS();
                break;
            default:
                break;
        }
    }

    public void Comida_para_perros() {
        System.out.println("""
                MASCOTAS / Perros / Comida para perros
                |--------------------------------------------------------------------------------------------|
                |------------------------- Nombre del Producto ---------------------------------|- Precio ---|
                |1|- Comida para Perros RAMBALA Adulto Clásico Doypack 800gr -------------------|- S/15.70  -|
                |2|- Comida para Perros ORIGO Pollo Doypack 10un -------------------------------|- S/10.90  -|
                |0|- regresar
                """);
        opcion = ncs.nextInt();
        switch (opcion) {
            case 1:
                break;
            case 2:
                break;
            case 0:
                this.PERROS();
                break;
            default:
                break;
        }
    }

    public void Juguetes_para_perros() {
        System.out.println("""
                MASCOTAS / Perros / Juguetes para perros
                |--------------------------------------------------------------------------------------------|
                |------------------------- Nombre del Producto ---------------------------------|- Precio ---|
                |1|- Juguete Varita Presa Aérea para Gatos Jackson Galaxy con Láser ------------|- S/199.90 -|
                |2|- Pelota de Plastico en Amarillo Talla L Y+Papel de Regalo ------------------|- S/43.90  -|
                |0|- regresar
                """);
        opcion = ncs.nextInt();
        switch (opcion) {
            case 1:
                break;
            case 2:
                break;
            case 0:
                this.PERROS();
                break;
            default:
                break;
        }
    }

    public void Platos_y_comedores_para_perros() {
        System.out.println("""
                MASCOTAS / Perros / Platos y comedores para perros
                |--------------------------------------------------------------------------------------------|
                |------------------------- Nombre del Producto ---------------------------------|- Precio ---|
                |1|- Comedero para macota Buttler gris -----------------------------------------|- S/45.50  -|
                |2|- Set de alimentación para perro San remo Sanremo ---------------------------|- S/44.50  -|
                |0|- regresar
                """);
        opcion = ncs.nextInt();
        switch (opcion) {
            case 1:
                break;
            case 2:
                break;
            case 0:
                this.PERROS();
                break;
            default:
                break;
        }
    }

    public void Ropa_para_perros() {
        System.out.println("""
                MASCOTAS / Perros / Ropa para perros
                |--------------------------------------------------------------------------------------------|
                |------------------------- Nombre del Producto ---------------------------------|- Precio ---|
                |1|- Camiseta Oficial Universitario Talla 2 Crema ------------------------------|- S/44.90  -|
                |2|- Camiseta Oficial Alianza Lima Talla 1 Azul --------------------------------|- S/39.90  -|
                |0|- regresar
                """);
        opcion = ncs.nextInt();
        switch (opcion) {
            case 1:
                break;
            case 2:
                break;
            case 0:
                this.PERROS();
                break;
            default:
                break;
        }
    }

    public void Transportadores_de_perros() {
        System.out.println("""
                MASCOTAS / Perros / Transportadores de perros
                |--------------------------------------------------------------------------------------------|
                |------------------------- Nombre del Producto ---------------------------------|- Precio ---|
                |1|- Transportadora Kennel Mediana con Bebedero --------------------------------|- S/99.90 -|
                |2|- Transportador Ideal para Perro L100 Plomo Oscuro Y+Stickers ---------------|- S/789.90 -|
                |0|- regresar
                """);
        opcion = ncs.nextInt();
        switch (opcion) {
            case 1:
                break;
            case 2:
                break;
            case 0:
                this.PERROS();
                break;
            default:
                break;
        }
    }

    public double seccion_de_pago_MASCOTAS() {
        double total_a_pagar = 0;
        if (opcion == 1) {
            this.Casas_para_perros();
            this.cantidad_De_productos();
            if (opcion == 1) {
                igv = (cant_compra * 429) * 0.18;
                subtotal = (cant_compra * 429) - igv;
                this.pago_y_vuelto();
            } else if (opcion == 2) {
                igv = (cant_compra * 429) * 0.18;
                subtotal = (cant_compra * 429) - igv;
                this.pago_y_vuelto();
            } else {

            }
        } else if (opcion == 2) {
            this.Camas_para_perros();
            this.cantidad_De_productos();
            if (opcion == 1) {
                igv = (cant_compra * 279.9) * 0.18;
                subtotal = (cant_compra * 279.9) - igv;
                this.pago_y_vuelto();
            } else if (opcion == 2) {
                igv = (cant_compra * 537.9) * 0.18;
                subtotal = (cant_compra * 537.9) - igv;
                this.pago_y_vuelto();
            } else {

            }
        } else if (opcion == 3) {
            this.Comida_para_perros();
            this.cantidad_De_productos();
            if (opcion == 1) {
                igv = (cant_compra * 15.7) * 0.18;
                subtotal = (cant_compra * 15.7) - igv;
                this.pago_y_vuelto();
            } else if (opcion == 2) {
                igv = (cant_compra * 10.9) * 0.18;
                subtotal = (cant_compra * 10.9) - igv;
                this.pago_y_vuelto();
            } else {

            }
        } else if (opcion == 4) {
            this.Juguetes_para_perros();
            this.cantidad_De_productos();
            if (opcion == 1) {
                igv = (cant_compra * 199.9) * 0.18;
                subtotal = (cant_compra * 199.9) - igv;
                this.pago_y_vuelto();
            } else if (opcion == 2) {
                igv = (cant_compra * 43.9) * 0.18;
                subtotal = (cant_compra * 43.9) - igv;
                this.pago_y_vuelto();
            } else {

            }
        } else if (opcion == 5) {
            this.Platos_y_comedores_para_perros();
            this.cantidad_De_productos();
            if (opcion == 1) {
                igv = (cant_compra * 45.5) * 0.18;
                subtotal = (cant_compra * 45.5) - igv;
                this.pago_y_vuelto();
            } else if (opcion == 2) {
                igv = (cant_compra * 44.5) * 0.18;
                subtotal = (cant_compra * 44.5) - igv;
                this.pago_y_vuelto();
            } else {

            }
        } else if (opcion == 6) {
            this.Ropa_para_perros();
            this.cantidad_De_productos();
            if (opcion == 1) {
                igv = (cant_compra * 44.9) * 0.18;
                subtotal = (cant_compra * 44.9) - igv;
                this.pago_y_vuelto();
            } else if (opcion == 2) {
                igv = (cant_compra * 39.9) * 0.18;
                subtotal = (cant_compra * 39.9) - igv;
                this.pago_y_vuelto();
            } else {

            }
        } else if (opcion == 7) {
            this.Transportadores_de_perros();
            this.cantidad_De_productos();
            if (opcion == 1) {
                igv = (cant_compra * 99.9) * 0.18;
                subtotal = (cant_compra * 99.9) - igv;
                this.pago_y_vuelto();
            } else if (opcion == 2) {
                igv = (cant_compra * 789.9) * 0.18;
                subtotal = (cant_compra * 789.9) - igv;
                this.pago_y_vuelto();
            } else {
            }
        } else {
            System.out.println("opcion no valida");
        }
        return total_a_pagar;
    }

    // FIN DE CODIGO DE YEYSON
    //CDIGO DE DUA
    public void gasfiteria() {
        System.out.println("TENEMOS LO SIGUIENTE:");
        System.out.println();
        System.out.println("""
                |---------------------------------------|
                 |1| Ver todo Accesorios de gasfiteria
                 |2| Sumideros y registros
                 |3| Otros accesorios de gasfitería
                 |0| salir al menu principal
                |---------------------------------------|
                """);
        opcion = ncs.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("TENEMOS LO SIGUIENTE");
                System.out.println();
                System.out.println("""
                        |---------------------------------------|
                        |1| Accesorios galvanizados
                        |0| salir al menu principal
                        |---------------------------------------|
                        """);
                opcion = ncs.nextInt();
                if (opcion == 1) {
                    System.out.println("TENEMOS:");
                    System.out.println();
                    System.out.println("""
                            |-------------------------------------------------|
                             |1| Niple galvanizado 1" x 1 1/2" Werken S/2.50
                             |0| salir al menu principal
                            |-------------------------------------------------|
                            """);
                    opcion = ncs.nextInt();
                    if (opcion == 1) {
                        System.out.println("Cuantas va a querer");
                        cant_compra = ncs.nextInt();
                        if (cant_compra > 0 && cant_compra <= 100) {
                            igv = (cant_compra * 2.5) * 0.18;
                            subtotal = (cant_compra * 2.5) - igv;
                            this.pago_y_vuelto();
                        } else if (cant_compra > 100) {
                            System.out.println("---- NO TENEMOS STOCK ----");
                            System.out.println();
                            this.menuprincipal();
                        } else {
                            System.out.println("|----CANCELAMOS SU COMPRA----|");
                            System.out.println();
                            this.menuprincipal();
                        }
                    } else if (opcion == 0) {
                        System.out.println("----RETROCEDIENDO----");
                        this.menuprincipal();
                    } else {
                        System.out.println("""
                                      |---OPCION NO VALIDA---|
                                |---REGRESANDO AL MENU PRINCIPAL---|
                                """);
                        System.out.println();
                        this.menuprincipal();
                    }
                } else if (opcion == 0) {
                    System.out.println("----RETROCEDIENDO----");
                    this.menuprincipal();
                } else {
                    System.out.println("""
                                  |---OPCION NO VALIDA---|
                            |---REGRESANDO AL MENU PRINCIPAL---|
                            """);
                    System.out.println();
                    this.menuprincipal();
                }
                break;
            case 2:
                System.out.println("TENEMOS:");
                System.out.println();
                System.out.println("""
                        |----------------------------------------------------|
                         |1| Válvula Anti-olores / Anti-insectos Coflex S/14
                         |0| salir al menu principal
                        |----------------------------------------------------|
                        """);
                opcion = ncs.nextInt();
                if (opcion == 1) {
                    System.out.println("Cuantas va a querer");
                    cant_compra = ncs.nextInt();
                    if (cant_compra > 0 && cant_compra <= 100) {
                        igv = (cant_compra * 14) * 0.18;
                        subtotal = (cant_compra * 14) - igv;
                        this.pago_y_vuelto();
                    } else if (cant_compra > 100) {
                        System.out.println("---- NO TENEMOS STOCK ----");
                        System.out.println();
                        this.menuprincipal();
                    } else {
                        System.out.println("|----CANCELAMOS SU COMPRA----|");
                        System.out.println();
                        this.menuprincipal();
                    }
                } else if (opcion == 0) {
                    System.out.println("----RETROCEDIENDO----");
                    this.menuprincipal();
                } else {
                    System.out.println("""
                                  |---OPCION NO VALIDA---|
                            |---REGRESANDO AL MENU PRINCIPAL---|
                            """);
                    System.out.println();
                    this.menuprincipal();
                }
                break;
            case 3:
                System.out.println("TENEMOS:");
                System.out.println();
                System.out.println("""
                        |----------------------------------------------------|
                         |1| Cinta teflón 1/2"x0.075mmx10mts Metusa S/1
                         |0| salir al menu principal
                        |----------------------------------------------------|
                        """);
                opcion = ncs.nextInt();
                if (opcion == 1) {
                    System.out.println("Cuantas va a querer");
                    cant_compra = ncs.nextInt();
                    if (cant_compra > 0 && cant_compra <= 100) {
                        igv = (cant_compra * 1) * 0.18;
                        subtotal = (cant_compra * 1) - igv;
                        this.pago_y_vuelto();
                    } else if (cant_compra > 100) {
                        System.out.println("---- NO TENEMOS STOCK ----");
                        System.out.println();
                        this.menuprincipal();
                    } else {
                        System.out.println("|----CANCELAMOS SU COMPRA----|");
                        System.out.println();
                        this.menuprincipal();
                    }
                } else if (opcion == 0) {
                    System.out.println("----RETROCEDIENDO----");
                    this.menuprincipal();
                } else {
                    System.out.println("""
                                  |---OPCION NO VALIDA---|
                            |---REGRESANDO AL MENU PRINCIPAL---|
                            """);
                    System.out.println();
                    this.menuprincipal();
                }
                break;
            case 0:
                System.out.println("----RETROCEDIENDO----");
                this.menuprincipal();
        }
    }

    public void iluminacion() {
        System.out.println("TENEMOS LO SIGUIENTE:");
        System.out.println();
        System.out.println(""" 
                |--------------------------------|
                 |1| Focos smart
                 |2| Plafones LED smart
                 |3| Tiras LED
                 |4| Interruptores inteligentes
                 |0| salir al menu principal
                |--------------------------------|
                """);
        opcion = ncs.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("TENEMOS:");
                System.out.println();
                System.out.println("""
                        |---------------------------------------------------------------------|
                         |1| Foco Led Xiaomi Smart Inteligente Color Google Home Alexa S/119
                         |0| salir al menu principal
                        |---------------------------------------------------------------------|
                        """);
                opcion = ncs.nextInt();
                if (opcion == 1) {
                    System.out.println("Cuantas va a querer");
                    cant_compra = ncs.nextInt();
                    if (cant_compra > 0 && cant_compra <= 100) {
                        igv = (cant_compra * 119) * 0.18;
                        subtotal = (cant_compra * 119) - igv;
                        this.pago_y_vuelto();
                    } else if (cant_compra > 100) {
                        System.out.println("---- NO TENEMOS STOCK ----");
                        System.out.println();
                        this.menuprincipal();
                    } else {
                        System.out.println("|----CANCELAMOS SU COMPRA----|");
                        System.out.println();
                        this.menuprincipal();
                    }
                } else if (opcion == 0) {
                    System.out.println("----RETROCEDIENDO----");
                    this.menuprincipal();
                } else {
                    System.out.println("""
                                  |---OPCION NO VALIDA---|
                            |---REGRESANDO AL MENU PRINCIPAL---|
                            """);
                    System.out.println();
                    this.menuprincipal();
                }
                break;
            case 2:
                System.out.println("TENEMOS:");
                System.out.println();
                System.out.println("""
                        |-----------------------------------------------------|
                         |1| Plafón smart led 48W Multicolor Lightech S/189
                         |0| salir al menu principal
                        |-----------------------------------------------------|
                        """);
                opcion = ncs.nextInt();
                if (opcion == 1) {
                    System.out.println("Cuantas va a querer");
                    cant_compra = ncs.nextInt();
                    if (cant_compra > 0 && cant_compra <= 100) {
                        igv = (cant_compra * 189) * 0.18;
                        subtotal = (cant_compra * 189) - igv;
                        this.pago_y_vuelto();
                    } else if (cant_compra > 100) {
                        System.out.println("---- NO TENEMOS STOCK ----");
                        System.out.println();
                        this.menuprincipal();
                    } else {
                        System.out.println("|----CANCELAMOS SU COMPRA----|");
                        System.out.println();
                        this.menuprincipal();
                    }
                } else if (opcion == 0) {
                    System.out.println("----RETROCEDIENDO----");
                    this.menuprincipal();
                } else {
                    System.out.println("""
                                  |---OPCION NO VALIDA---|
                            |---REGRESANDO AL MENU PRINCIPAL---|
                            """);
                    System.out.println();
                    this.menuprincipal();
                }
                break;
            case 3:
                System.out.println("TENEMOS:");
                System.out.println();
                System.out.println("""
                        |-----------------------------------------------------------------|
                         |1| Retroiluminación de TV Inteligente 55-65" RGBIC Nexxt S/279
                         |0| salir al menu principal
                        |-----------------------------------------------------------------|
                        """);
                opcion = ncs.nextInt();
                if (opcion == 1) {
                    System.out.println("Cuantas va a querer");
                    cant_compra = ncs.nextInt();
                    if (cant_compra > 0 && cant_compra <= 100) {
                        igv = (cant_compra * 279) * 0.18;
                        subtotal = (cant_compra * 279) - igv;
                        this.pago_y_vuelto();
                    } else if (cant_compra > 100) {
                        System.out.println("---- NO TENEMOS STOCK ----");
                        System.out.println();
                        this.menuprincipal();
                    } else {
                        System.out.println("|----CANCELAMOS SU COMPRA----|");
                        System.out.println();
                        this.menuprincipal();
                    }
                } else if (opcion == 0) {
                    System.out.println("----RETROCEDIENDO----");
                    this.menuprincipal();
                } else {

                }
                break;
            case 4:
                System.out.println("TENEMOS:");
                System.out.println();
                System.out.println("""
                        |------------------------------------------------------|
                         |1| Interruptor de 3 circuitos smart wifi Nexxt S/99
                         |0| salir al menu principal
                        |------------------------------------------------------|
                        """);
                opcion = ncs.nextInt();
                if (opcion == 1) {
                    System.out.println("Cuantas va a querer");
                    cant_compra = ncs.nextInt();
                    if (cant_compra > 0 && cant_compra <= 100) {
                        igv = (cant_compra * 99) * 0.18;
                        subtotal = (cant_compra * 99) - igv;
                        this.pago_y_vuelto();
                    } else if (cant_compra > 100) {
                        System.out.println("---- NO TENEMOS STOCK ----");
                        System.out.println();
                        this.menuprincipal();
                    } else {
                        System.out.println("|----CANCELAMOS SU COMPRA----|");
                        System.out.println();
                        this.menuprincipal();
                    }
                } else if (opcion == 0) {
                    System.out.println("----RETROCEDIENDO----");
                    this.menuprincipal();
                } else {
                    System.out.println("""
                                  |---OPCION NO VALIDA---|
                            |---REGRESANDO AL MENU PRINCIPAL---|
                            """);
                    System.out.println();
                    this.menuprincipal();
                }
                break;
        }
    }

    public void pinturasyacabados() {
        System.out.println("TENEMOS LO SIGUIENTE:");
        System.out.println();
        System.out.println("""
                |------------------------------|
                 |1| Pinturas Tekno
                 |2| Pinturas CPP
                 |3| Pinturas Pato
                 |4| Pinturas Vencedor
                 |5| Pinturas American Colors
                 |0| salir al menu principal
                |------------------------------|
                """);
        opcion = ncs.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("TENEMOS:");
                System.out.println();
                System.out.println("""
                        |----------------------------------------------------|
                         |1| Tekno latex teknocolor Blanco 1 galón S/95
                         |0| salir al menu principal
                        |----------------------------------------------------|
                        """);
                opcion = ncs.nextInt();
                if (opcion == 1) {
                    System.out.println("Cuantas va a querer");
                    cant_compra = ncs.nextInt();
                    if (cant_compra > 0 && cant_compra <= 100) {
                        igv = (cant_compra * 95) * 0.18;
                        subtotal = (cant_compra * 95) - igv;
                        this.pago_y_vuelto();
                    } else if (cant_compra > 100) {
                        System.out.println("---- NO TENEMOS STOCK ----");
                        System.out.println();
                        this.menuprincipal();
                    } else {
                        System.out.println("|----CANCELAMOS SU COMPRA----|");
                        System.out.println();
                        this.menuprincipal();
                    }
                } else if (opcion == 0) {
                    System.out.println("----RETROCEDIENDO----");
                    this.menuprincipal();
                } else {
                    System.out.println("""
                                  |---OPCION NO VALIDA---|
                            |---REGRESANDO AL MENU PRINCIPAL---|
                            """);
                    System.out.println();
                    this.menuprincipal();
                }
                break;
            case 2:
                System.out.println("TENEMOS:");
                System.out.println();
                System.out.println("""
                        |----------------------------------------------------|
                         |1| Latex Pato CPP Blanco 1 galón S/39
                         |0| salir al menu principal
                        |----------------------------------------------------|
                        """);
                opcion = ncs.nextInt();
                if (opcion == 1) {
                    System.out.println("Cuantas va a querer");
                    cant_compra = ncs.nextInt();
                    if (cant_compra > 0 && cant_compra <= 100) {
                        igv = (cant_compra * 39) * 0.18;
                        subtotal = (cant_compra * 39) - igv;
                        this.pago_y_vuelto();
                    } else if (cant_compra > 100) {
                        System.out.println("---- NO TENEMOS STOCK ----");
                        System.out.println();
                        this.menuprincipal();
                    } else {
                        System.out.println("|----CANCELAMOS SU COMPRA----|");
                        System.out.println();
                        this.menuprincipal();
                    }
                } else if (opcion == 0) {
                    System.out.println("----RETROCEDIENDO----");
                    this.menuprincipal();
                } else {
                    System.out.println("""
                                  |---OPCION NO VALIDA---|
                            |---REGRESANDO AL MENU PRINCIPAL---|
                            """);
                    System.out.println();
                    this.menuprincipal();
                }
                break;
            case 3:
                System.out.println("TENEMOS:");
                System.out.println();
                System.out.println("""
                        |----------------------------------------------------|
                         |1| Latex Pato CPP Rojo Teja 1 galón S/39
                         |0| salir al menu principal
                        |----------------------------------------------------|
                        """);
                opcion = ncs.nextInt();
                if (opcion == 1) {
                    System.out.println("Cuantas va a querer");
                    cant_compra = ncs.nextInt();
                    if (cant_compra > 0 && cant_compra <= 100) {
                        igv = (cant_compra * 39) * 0.18;
                        subtotal = (cant_compra * 39) - igv;
                        this.pago_y_vuelto();
                    } else if (cant_compra > 100) {
                        System.out.println("---- NO TENEMOS STOCK ----");
                        System.out.println();
                        this.menuprincipal();
                    } else {
                        System.out.println("|----CANCELAMOS SU COMPRA----|");
                        System.out.println();
                        this.menuprincipal();
                    }
                } else if (opcion == 0) {
                    System.out.println("----RETROCEDIENDO----");
                    this.menuprincipal();
                } else {
                    System.out.println("""
                                  |---OPCION NO VALIDA---|
                            |---REGRESANDO AL MENU PRINCIPAL---|
                            """);
                    System.out.println();
                    this.menuprincipal();
                }
                break;
            case 4:
                System.out.println("TENEMOS:");
                System.out.println();
                System.out.println("""
                        |-----------------------------------------------------------------------|
                         |1| Supermate antibacterial nuevo Blanco Decora 1 galón Vencedor S/95
                         |0| salir al menu principal
                        |-----------------------------------------------------------------------|
                        """);
                opcion = ncs.nextInt();
                if (opcion == 1) {
                    System.out.println("Cuantas va a querer");
                    cant_compra = ncs.nextInt();
                    if (cant_compra > 0 && cant_compra <= 100) {
                        igv = (cant_compra * 95) * 0.18;
                        subtotal = (cant_compra * 95) - igv;
                        this.pago_y_vuelto();
                    } else if (cant_compra > 100) {
                        System.out.println("---- NO TENEMOS STOCK ----");
                        System.out.println();
                        this.menuprincipal();
                    } else {
                        System.out.println("|----CANCELAMOS SU COMPRA----|");
                        System.out.println();
                        this.menuprincipal();
                    }
                } else if (opcion == 0) {
                    System.out.println("----RETROCEDIENDO----");
                    this.menuprincipal();
                } else {
                    System.out.println("""
                                  |---OPCION NO VALIDA---|
                            |---REGRESANDO AL MENU PRINCIPAL---|
                            """);
                    System.out.println();
                    this.menuprincipal();
                }
                break;
            case 5:
                System.out.println("TENEMOS:");
                System.out.println();
                System.out.println("""
                        |-----------------------------------------------------------------------|
                         |1| Pintura Latex American Colors Satinado Gris Clásico 1 galón S/129
                         |0| salir al menu principal
                        |-----------------------------------------------------------------------|
                        """);
                opcion = ncs.nextInt();
                if (opcion == 1) {
                    System.out.println("Cuantas va a querer");
                    cant_compra = ncs.nextInt();
                    if (cant_compra > 0 && cant_compra <= 100) {
                        igv = (cant_compra * 129) * 0.18;
                        subtotal = (cant_compra * 129) - igv;
                        this.pago_y_vuelto();
                    } else if (cant_compra > 100) {
                        System.out.println("---- NO TENEMOS STOCK ----");
                        System.out.println();
                        this.menuprincipal();
                    } else {
                        System.out.println("|----CANCELAMOS SU COMPRA----|");
                        System.out.println();
                        this.menuprincipal();
                    }
                } else if (opcion == 0) {
                    System.out.println("----RETROCEDIENDO----");
                    this.menuprincipal();
                } else {
                    System.out.println("""
                                  |---OPCION NO VALIDA---|
                            |---REGRESANDO AL MENU PRINCIPAL---|
                            """);
                    System.out.println();
                    this.menuprincipal();
                }
                break;
            case 0:
                System.out.println("----RETROCEDIENDO----");
                this.menuprincipal();
                break;
            default:
                System.out.println("opcion no valida");
                break;
        }
    }

    public void ferreteriaypuertas() {
        System.out.println("TENEMOS LO SIGUIENTE:");
        System.out.println();
        System.out.println("""
                |-----------------------------|
                 |1| Puertas contraplacadas
                 |2| Puertas de madera
                 |3| Puertas plegables
                 |4| Marcos para puertas
                 |0| salir al menu principal
                |-----------------------------|
                """);
        opcion = ncs.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("TENEMOS:");
                System.out.println();
                System.out.println("""
                        |-----------------------------------------------------------------|
                         |1| Puerta blanca contraplacada Palace 40x80x2.07 Dimfer S/229
                         |0| salir al menu principal
                        |-----------------------------------------------------------------|
                        """);
                opcion = ncs.nextInt();
                if (opcion == 1) {
                    System.out.println("Cuantas va a querer");
                    cant_compra = ncs.nextInt();
                    if (cant_compra > 0 && cant_compra <= 100) {
                        igv = (cant_compra * 229) * 0.18;
                        subtotal = (cant_compra * 229) - igv;
                        this.pago_y_vuelto();
                    } else if (cant_compra > 100) {
                        System.out.println("---- NO TENEMOS STOCK ----");
                        System.out.println();
                        this.menuprincipal();
                    } else {
                        System.out.println("|----CANCELAMOS SU COMPRA----|");
                        System.out.println();
                        this.menuprincipal();
                    }
                } else if (opcion == 0) {
                    System.out.println("----RETROCEDIENDO----");
                    this.menuprincipal();
                } else {
                    System.out.println("""
                                  |---OPCION NO VALIDA---|
                            |---REGRESANDO AL MENU PRINCIPAL---|
                            """);
                    System.out.println();
                    this.menuprincipal();
                }
                break;
            case 2:
                System.out.println("TENEMOS:");
                System.out.println();
                System.out.println("""
                        |-----------------------------------------------------------------|
                         |1| Puerta Hdf Decosint Square Blanca 40x800x2070 Dimfer S/119
                         |0| salir al menu principal
                        |-----------------------------------------------------------------|
                        """);
                opcion = ncs.nextInt();
                if (opcion == 1) {
                    System.out.println("Cuantas va a querer");
                    cant_compra = ncs.nextInt();
                    if (cant_compra > 0 && cant_compra <= 100) {
                        igv = (cant_compra * 119) * 0.18;
                        subtotal = (cant_compra * 119) - igv;
                        this.pago_y_vuelto();
                    } else if (cant_compra > 100) {
                        System.out.println("---- NO TENEMOS STOCK ----");
                        System.out.println();
                        this.menuprincipal();
                    } else {
                        System.out.println("|----CANCELAMOS SU COMPRA----|");
                        System.out.println();
                        this.menuprincipal();
                    }
                } else if (opcion == 0) {
                    System.out.println("----RETROCEDIENDO----");
                    this.menuprincipal();
                } else {
                    System.out.println("""
                                  |---OPCION NO VALIDA---|
                            |---REGRESANDO AL MENU PRINCIPAL---|
                            """);
                    System.out.println();
                    this.menuprincipal();
                }
                break;
            case 3:
                System.out.println("TENEMOS:");
                System.out.println();
                System.out.println("""
                        |-----------------------------------------------------------------|
                         |1| Puerta plegable Guayana Blanca 6mm 70x203cm Flexi Space S/39
                         |0| salir al menu principal
                        |-----------------------------------------------------------------|
                        """);
                opcion = ncs.nextInt();
                if (opcion == 1) {
                    System.out.println("Cuantas va a querer");
                    cant_compra = ncs.nextInt();
                    if (cant_compra > 0 && cant_compra <= 100) {
                        igv = (cant_compra * 39) * 0.18;
                        subtotal = (cant_compra * 39) - igv;
                        this.pago_y_vuelto();
                    } else if (cant_compra > 100) {
                        System.out.println("---- NO TENEMOS STOCK ----");
                        System.out.println();
                        this.menuprincipal();
                    } else {
                        System.out.println("|----CANCELAMOS SU COMPRA----|");
                        System.out.println();
                        this.menuprincipal();
                    }
                } else if (opcion == 0) {
                    System.out.println("----RETROCEDIENDO----");
                    this.menuprincipal();
                } else {
                    System.out.println("""
                                  |---OPCION NO VALIDA---|
                            |---REGRESANDO AL MENU PRINCIPAL---|
                            """);
                    System.out.println();
                    this.menuprincipal();
                }
                break;
            case 4:
                System.out.println("TENEMOS:");
                System.out.println();
                System.out.println("""
                        |----------------------------------------------------|
                         |1| Marco Pino Pre Acabado 32x60x2.13 Lucso S/85
                         |0| salir al menu principal
                        |----------------------------------------------------|
                        """);
                opcion = ncs.nextInt();
                if (opcion == 1) {
                    System.out.println("Cuantas va a querer");
                    cant_compra = ncs.nextInt();
                    if (cant_compra > 0 && cant_compra <= 100) {
                        igv = (cant_compra * 85) * 0.18;
                        subtotal = (cant_compra * 85) - igv;
                        this.pago_y_vuelto();
                    } else if (cant_compra > 100) {
                        System.out.println("---- NO TENEMOS STOCK ----");
                        System.out.println();
                        this.menuprincipal();
                    } else {
                        System.out.println("|----CANCELAMOS SU COMPRA----|");
                        System.out.println();
                        this.menuprincipal();
                    }
                } else if (opcion == 0) {
                    System.out.println("----RETROCEDIENDO----");
                    this.menuprincipal();
                } else {
                    System.out.println("""
                                  |---OPCION NO VALIDA---|
                            |---REGRESANDO AL MENU PRINCIPAL---|
                            """);
                    System.out.println();
                    this.menuprincipal();
                }
                break;
            case 0:
                System.out.println("----RETROCEDIENDO----");
                this.menuprincipal();
                break;
            default:
                System.out.println("opcion no valida");
        }
    }
    //ARRAYSLIST DDE ALLEX B.

    double cantidadfaltante,pagofinalFaltante,cambioFinal;
    double[] precio1Plaza = {657, 681, 1899};
    double[] precio2Plaza = {714, 647, 727, 833};
    ArrayList<String> Cama1Plazas = new ArrayList<>();
    ArrayList<String> Cama2plazas = new ArrayList<>();
    ArrayList<Double> subtotal_camas = new ArrayList<>();
    ArrayList<Integer> carrito_plaza1 = new ArrayList<>();
    ArrayList<Integer> carrito_plaza2 = new ArrayList<>();
    public PROMART_JULIACA_FINAL() {

        //-----------------------------------
        Cama1Plazas.add("Cama Medallón Ergo 1 plaza Paraiso S/ 657");
        Cama1Plazas.add("Cama Su Majestad 1 plaza Paraiso S/681");
        Cama1Plazas.add("Cama Americana Ozono 1 plaza Technodream S/ 1899");

        Cama2plazas.add("Dormitorio Consul 2 plazas con sofá cama Paraiso S/ 714");
        Cama2plazas.add("Cama Consul Black 2 plazas Paraiso S/647");
        Cama2plazas.add("Dormitorio Consul Black 2 plazas Paraiso S/727");
        Cama2plazas.add("Cama Paraiso Lifestyles Pocket 2 Plazas S/833");

        for (int i = 0; i < Cama1Plazas.size(); i++) {
            carrito_plaza1.add(0);
        }
        for (int i = 0; i < Cama2plazas.size(); i++) {
            carrito_plaza2.add(0);
            subtotal_camas.add(0.0);
        }
    }

    public void OPCIONDORMITORIOS() {
        System.out.println("---------Bienvenido a DORMITORIOS-----------");
        System.out.println("Marque alguna de las siguientes opciones");
        System.out.println(" 1.- Comprar 1 plazas");
        System.out.println(" 2.- Comprar 2 plazas");
        opcion = ncs.nextInt();
        ncs.nextLine();
        switch (opcion) {
            case 1:
                this.Comprar1PlazaCama();
                break;
            case 2:
                this.Comprar2plazacama();
                break;
            default:
                System.out.println("Opcion no válida");
                this.OPCIONDORMITORIOS();
                break;
        }
    }

    public void Comprar1PlazaCama() {
        System.out.println("CAMAS 1 PLAZA");
        System.out.println("Seleccione su producto a comprar");
        for (int i = 0; i < Cama1Plazas.size(); i++) {
            System.out.println("Opción " + (i + 1) + " : " + Cama1Plazas.get(i));
        }
        opcion = ncs.nextInt();
        ncs.nextLine();
        if (opcion >= 1 && opcion <= Cama1Plazas.size()) {
            System.out.println("¿Cuántos objetos comprará? Ingresa la cantidad");
            cantidad = ncs.nextInt();
            ncs.nextLine();
            carrito_plaza1.set(opcion - 1, carrito_plaza1.get(opcion - 1) + cantidad);
            System.out.println("Ud ha pedido " + carrito_plaza1.get(opcion - 1) + " camas de " + Cama1Plazas.get(opcion - 1));
            System.out.println("""
                    ELIJE UNA DE LAS OPCIONES:
                    1 AGREGAR MAS PRODUCTOS
                    2 PAGAR LOS PRODUCTOS AGREGADOS
                    3 MENU PRINCIPAL""");
            opcion = ncs.nextInt();
            ncs.nextLine();
            if (opcion == 1) {
                System.out.println("REGRESANDO PARA AGREGAR MAS PRODUCTOS");
                this.Comprar1PlazaCama();
            } else if (opcion == 2) {
                this.PagosM();
            } else if (opcion == 3) {
                this.OPCIONDORMITORIOS();
            } else {
                System.out.println("OPCION ERRONEA");
            }
        } else {
            System.out.println("OPCION ERRONEA");
            this.OPCIONDORMITORIOS();
        }
    }

    public void Comprar2plazacama() {
        System.out.println("CAMAS 2 PLAZA");
        System.out.println("Seleccione su menú a comprar");
        for (int i = 0; i < Cama2plazas.size(); i++) {
            System.out.println("Opción " + (i + 1) + " : " + Cama2plazas.get(i));
        }
        opcion = ncs.nextInt();
        ncs.nextLine();
        if (opcion >= 1 && opcion <= Cama2plazas.size()) {
            System.out.println("¿Cuántos comprará? Ingrese la cantidad");
            cantidad = ncs.nextInt();
            ncs.nextLine();
            carrito_plaza2.set(opcion - 1, carrito_plaza2.get(opcion - 1) + cantidad);
            subtotal_camas.set(opcion - 1, carrito_plaza2.get(opcion - 1) * precio2Plaza[opcion - 1]);
            System.out.println("Ud ha pedido " + carrito_plaza2.get(opcion - 1) + " camas de " + Cama2plazas.get(opcion - 1));
            System.out.println("""
                    ELIJE UNA DE LAS OPCIONES:
                    1 AGREGAR MAS PRODUCTOS
                    2 PAGAR LOS PRODUCTOS AGREGADOS
                    3 MENU PRINCIPAL""");
            opcion = ncs.nextInt();
            ncs.nextLine();
            if (opcion == 1) {
                System.out.println("REGRESANDO PARA AGREGAR MAS PRODUCTOS");
                this.Comprar2plazacama();
            } else if (opcion == 2) {
                this.Fpago();

            } else if (opcion == 3) {
                this.OPCIONDORMITORIOS();
            } else {
                System.out.println("OPCION NO VALIDA");
            }
        } else {
            System.out.println("Opción no válida");
            this.OPCIONDORMITORIOS();
        }
    }


    public double PagosM() {
        double cantidadTotalMenus = 0;
        System.out.println("---------BOLETA DE VENTA DETALLADO---------");
        System.out.println("CANTIDAD\tDESCRIPCIÓN\t\tTOTAL");

        for (int i = 0; i < Cama1Plazas.size(); i++) {
            int cantidad = carrito_plaza1.get(i);
            if (cantidad > 0) {
                double totalMenu = cantidad * precio1Plaza[i];
                System.out.printf("%d\t\t%s\t\t%.2f\n", cantidad, Cama1Plazas.get(i), totalMenu);
                cantidadTotalMenus += totalMenu;
            }
        }

        for (int i = 0; i < Cama2plazas.size(); i++) {
            int cantidad = carrito_plaza2.get(i);
            if (cantidad > 0) {
                double totalExtra = subtotal_camas.get(i);
                System.out.printf("%d\t\t%s\t\t%.2f\n", cantidad, Cama2plazas.get(i), totalExtra);
                cantidadTotalMenus += totalExtra;
            }
        }

        igv = cantidadTotalMenus * 0.18;
        subtotal = cantidadTotalMenus - igv;
        totalpagar = subtotal + igv;

        System.out.printf("\nSUBTOTAL: %.2f\n", subtotal);
        System.out.printf("IGV: %.2f\n", igv);
        System.out.printf("TOTAL A PAGAR: %.2f\n", totalpagar);
        this.FpagoM();
        generarboletaM();
        return totalpagar;
    }

    public double FpagoM(){
        Scanner invoker = new Scanner(System.in);

        System.out.println("INGRESA EL PAGO");
        int pago=invoker.nextInt();
        if(pago==totalpagar){
            System.out.println("*****************************************");
            System.out.println("           G R A C I A S             ");
            System.out.println("       POR COMPRAR EN PROMART!         ");
            System.out.println("*****************************************");
            this.generarboletaM();
            System.exit(0);

        }
        else if(pago<totalpagar){
            cantidadfaltante=totalpagar-pago;
            System.out.println("FALTA "+cantidadfaltante);
            System.out.println();
            System.out.println("AGREGA LOS "+cantidadfaltante+" o DEVUELVE LOS PRODUCTOS");
            pagofinalFaltante=invoker.nextInt();
            if(pagofinalFaltante==cantidadfaltante){
                System.out.println("*****************************************");
                System.out.println("           G R A C I A S             ");
                System.out.println("       POR COMPRAR EN PROMART!         ");
                System.out.println("*****************************************");
                System.out.println();
                this.generarboletaM();
            } else if (pagofinalFaltante<=0) {
                System.out.println("PAGO INVALIDO, CERRANDO PROGRAMA");


            } else if (pagofinalFaltante > cantidadfaltante) {
                cambioFinal = pagofinalFaltante - cantidadfaltante;
                System.out.println("su cambios es: " + cambioFinal + " GRACIAS POR COMPRAR EN PROMART");
            } else if (pagofinalFaltante < cantidadfaltante) {
                System.out.println("REGRESE LOS PRODUCTOS, LAS COSAS NO SON GRATIS");
            }
        }
        else if(pago>totalpagar) {
            vuelto=pago-totalpagar;
            System.out.println("SU CAMBIO ES:"+vuelto);
            System.out.println("*****************************************");
            System.out.println("           G R A C I A S             ");
            System.out.println("       POR COMPRAR EN PROMART!         ");
            System.out.println("*****************************************");
            this.generarboletaM();

        }
        System.exit(0);
        return total;
    }





    public void generarboletaM() {
        try (FileWriter fileWriter = new FileWriter("PROMARTBOLETA.txt")) {
            fileWriter.write("----BOLETA DE VENTA---------\n");
            fileWriter.write("CANTIDAD\tDESCRIPCIÓN\t\tTOTAL\n");

            for (int i = 0; i < Cama1Plazas.size(); i++) {
                int cantidad = carrito_plaza1.get(i);
                if (cantidad > 0) {
                    double totalMenu = cantidad * precio1Plaza[i];
                    fileWriter.write(String.format("%d\t\t%s\t\t%.2f\n", cantidad, Cama1Plazas.get(i), totalMenu));
                }
            }

            for (int i = 0; i < Cama2plazas.size(); i++) {
                int cantidad = carrito_plaza2.get(i);
                if (cantidad > 0) {
                    double totalExtra = subtotal_camas.get(i);
                    fileWriter.write(String.format("%d\t\t%s\t\t%.2f\n", cantidad, Cama2plazas.get(i), totalExtra));
                }
            }

            fileWriter.write(String.format("\nSUBTOTAL: %.2f\n", subtotal));
            fileWriter.write(String.format("IGV: %.2f\n", igv));
            fileWriter.write(String.format("TOTAL A PAGAR: %.2f\n", totalpagar));

            System.out.println("La boleta ha sido guardada en 'PROMARTBOLETA.txt'.");

        } catch (IOException e) {
            System.out.println("Ocurrió un error al escribir la boleta: " + e.getMessage());
        }

    }














    public void automotriz() {
        System.out.println("TENEMOS LO SIGUIENTE:");
        System.out.println();
        System.out.println("""
                |----------------------------------------|
                 |1| Infladores de llantas y accesorios  
                 |2| Llantas aro 13
                 |3| Llantas aro 14
                 |4| Llantas aro 15
                 |5| Llantas aro 16
                 |6| Llantas aro 17
                 |7| Llantas aro 18
                 |8| Llantas aro 19
                 |9| Llantas aro 20
                 |10| Llantas aro 21
                 |11| Llantas aro 22
                 |0| salir al menu principal
                |----------------------------------------|
                """);
        opcion = ncs.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("TENEMOS:");
                System.out.println();
                System.out.println("""
                        |------------------------------------------------------------|
                         |1| Tapones regulares para pitón x4 unidades Slime S/10.70
                         |0| salir al menu principal
                        |------------------------------------------------------------|
                        """);
                opcion = ncs.nextInt();
                if (opcion == 1) {
                    System.out.println("Cuantas va a querer");
                    cant_compra = ncs.nextInt();
                    if (cant_compra > 0 && cant_compra <= 100) {
                        igv = (cant_compra * 10.7) * 0.18;
                        subtotal = (cant_compra * 10.7) - igv;
                        this.pago_y_vuelto();
                    } else if (cant_compra > 100) {
                        System.out.println("---- NO TENEMOS STOCK ----");
                        System.out.println();
                        this.menuprincipal();
                    } else {
                        System.out.println("|----CANCELAMOS SU COMPRA----|");
                        System.out.println();
                        this.menuprincipal();
                    }
                } else if (opcion == 0) {
                    System.out.println("----RETROCEDIENDO----");
                    this.menuprincipal();
                } else {
                    System.out.println("""
                                  |---OPCION NO VALIDA---|
                            |---REGRESANDO AL MENU PRINCIPAL---|
                            """);
                    System.out.println();
                    this.menuprincipal();
                }
                break;
            case 2:
                System.out.println("TENEMOS:");
                System.out.println();
                System.out.println("""
                        |-----------------------------------------------------------|
                         |1| Llanta GOODYEAR Direction Touring 175/70R13 S/205.90
                         |0| salir al menu principal
                        |-----------------------------------------------------------|
                        """);
                opcion = ncs.nextInt();
                if (opcion == 1) {
                    System.out.println("Cuantas va a querer");
                    cant_compra = ncs.nextInt();
                    if (cant_compra > 0 && cant_compra <= 100) {
                        igv = (cant_compra * 205.9) * 0.18;
                        subtotal = (cant_compra * 205.9) - igv;
                        this.pago_y_vuelto();
                    } else if (cant_compra > 100) {
                        System.out.println("---- NO TENEMOS STOCK ----");
                        System.out.println();
                        this.menuprincipal();
                    } else {
                        System.out.println("|----CANCELAMOS SU COMPRA----|");
                        System.out.println();
                        this.menuprincipal();
                    }
                } else if (opcion == 0) {
                    System.out.println("----RETROCEDIENDO----");
                    this.menuprincipal();
                } else {
                    System.out.println("""
                                  |---OPCION NO VALIDA---|
                            |---REGRESANDO AL MENU PRINCIPAL---|
                            """);
                    System.out.println();
                    this.menuprincipal();
                }
                break;

            case 3:
                System.out.println("TENEMOS:");
                System.out.println();
                System.out.println("""
                        |--------------------------------------------------------|
                         |1| Llanta GOODYEAR Direction Tour 185/70R14 S/184.90
                         |0| salir al menu principal
                        |--------------------------------------------------------|
                        """);
                opcion = ncs.nextInt();
                if (opcion == 1) {
                    System.out.println("Cuantas va a querer");
                    cant_compra = ncs.nextInt();
                    if (cant_compra > 0 && cant_compra <= 100) {
                        igv = (cant_compra * 184.9) * 0.18;
                        subtotal = (cant_compra * 184.9) - igv;
                        this.pago_y_vuelto();
                    } else if (cant_compra > 100) {
                        System.out.println("---- NO TENEMOS STOCK ----");
                        System.out.println();
                        this.menuprincipal();
                    } else {
                        System.out.println("|----CANCELAMOS SU COMPRA----|");
                        System.out.println();
                        this.menuprincipal();
                    }
                } else if (opcion == 0) {
                    System.out.println("----RETROCEDIENDO----");
                    this.menuprincipal();
                } else {
                    System.out.println("""
                                  |---OPCION NO VALIDA---|
                            |---REGRESANDO AL MENU PRINCIPAL---|
                            """);
                    System.out.println();
                    this.menuprincipal();
                }
                break;
            case 4:
                System.out.println("TENEMOS:");
                System.out.println();
                System.out.println("""
                        |---------------------------------------------------------|
                         |1| Llanta GOODYEAR Direction Sport 195/65R15 S/304.90
                         |0| salir al menu principal
                        |---------------------------------------------------------|
                        """);
                opcion = ncs.nextInt();
                if (opcion == 1) {
                    System.out.println("Cuantas va a querer");
                    cant_compra = ncs.nextInt();
                    if (cant_compra > 0 && cant_compra <= 100) {
                        igv = (cant_compra * 304.9) * 0.18;
                        subtotal = (cant_compra * 304.9) - igv;
                        this.pago_y_vuelto();
                    } else if (cant_compra > 100) {
                        System.out.println("---- NO TENEMOS STOCK ----");
                        System.out.println();
                        this.menuprincipal();
                    } else {
                        System.out.println("|----CANCELAMOS SU COMPRA----|");
                        System.out.println();
                        this.menuprincipal();
                    }
                } else if (opcion == 0) {
                    System.out.println("----RETROCEDIENDO----");
                    this.menuprincipal();
                } else {
                    System.out.println("""
                                  |---OPCION NO VALIDA---|
                            |---REGRESANDO AL MENU PRINCIPAL---|
                            """);
                    System.out.println();
                    this.menuprincipal();
                }
                break;
            case 5:
                System.out.println("TENEMOS:");
                System.out.println();
                System.out.println("""
                        |---------------------------------------------------------------------|
                         |1| Llantas GOODYEAR 205/55R16 Direction Sport 91H Negro S/244.90
                         |0| salir al menu principal
                        |---------------------------------------------------------------------|
                        """);
                opcion = ncs.nextInt();
                if (opcion == 1) {
                    System.out.println("Cuantas va a querer");
                    cant_compra = ncs.nextInt();
                    if (cant_compra > 0 && cant_compra <= 100) {
                        igv = (cant_compra * 244.9) * 0.18;
                        subtotal = (cant_compra * 244.9) - igv;
                        this.pago_y_vuelto();
                    } else if (cant_compra > 100) {
                        System.out.println("---- NO TENEMOS STOCK ----");
                        System.out.println();
                        this.menuprincipal();
                    } else {
                        System.out.println("|----CANCELAMOS SU COMPRA----|");
                        System.out.println();
                        this.menuprincipal();
                    }
                } else if (opcion == 0) {
                    System.out.println("----RETROCEDIENDO----");
                    this.menuprincipal();
                } else {
                    System.out.println("""
                                  |---OPCION NO VALIDA---|
                            |---REGRESANDO AL MENU PRINCIPAL---|
                            """);
                    System.out.println();
                    this.menuprincipal();
                }
                break;
            case 6:
                System.out.println("TENEMOS:");
                System.out.println();
                System.out.println("""
                        |---------------------------------------------------------------|
                         |1| Llanta 245/65R17 General Tire Grabber At 111H S/512.90
                         |0| salir al menu principal
                        |---------------------------------------------------------------|
                        """);
                opcion = ncs.nextInt();
                if (opcion == 1) {
                    System.out.println("Cuantas va a querer");
                    cant_compra = ncs.nextInt();
                    if (cant_compra > 0 && cant_compra <= 100) {
                        igv = (cant_compra * 512.9) * 0.18;
                        subtotal = (cant_compra * 512.9) - igv;
                        this.pago_y_vuelto();
                    } else if (cant_compra > 100) {
                        System.out.println("---- NO TENEMOS STOCK ----");
                        System.out.println();
                        this.menuprincipal();
                    } else {
                        System.out.println("|----CANCELAMOS SU COMPRA----|");
                        System.out.println();
                        this.menuprincipal();
                    }
                } else if (opcion == 0) {
                    System.out.println("----RETROCEDIENDO----");
                    this.menuprincipal();
                } else {
                    System.out.println("""
                                  |---OPCION NO VALIDA---|
                            |---REGRESANDO AL MENU PRINCIPAL---|
                            """);
                    System.out.println();
                    this.menuprincipal();
                }
                break;
            case 7:
                System.out.println("TENEMOS:");
                System.out.println();
                System.out.println("""
                        |---------------------------------------------------------------------------|
                         |1| Llanta Rydanz Raleigh R06 265/60R18 para Toyota, Ford, Jeep S/437.90
                         |0| salir al menu principal
                        |---------------------------------------------------------------------------|
                        """);
                opcion = ncs.nextInt();
                if (opcion == 1) {
                    System.out.println("Cuantas va a querer");
                    cant_compra = ncs.nextInt();
                    if (cant_compra > 0 && cant_compra <= 100) {
                        igv = (cant_compra * 437.9) * 0.18;
                        subtotal = (cant_compra * 437.9) - igv;
                        this.pago_y_vuelto();
                    } else if (cant_compra > 100) {
                        System.out.println("---- NO TENEMOS STOCK ----");
                        System.out.println();
                        this.menuprincipal();
                    } else {
                        System.out.println("|----CANCELAMOS SU COMPRA----|");
                        System.out.println();
                        this.menuprincipal();
                    }
                } else if (opcion == 0) {
                    System.out.println("----RETROCEDIENDO----");
                    this.menuprincipal();
                } else {
                    System.out.println("""
                                  |---OPCION NO VALIDA---|
                            |---REGRESANDO AL MENU PRINCIPAL---|
                            """);
                    System.out.println();
                    this.menuprincipal();
                }
                break;

            case 8:
                System.out.println("TENEMOS:");
                System.out.println();
                System.out.println("""
                        |----------------------------------------------------|
                         |1| Llanta Pirelli P Zero 235/35ZR19 87Y S/1590.90
                         |0| salir al menu principal
                        |----------------------------------------------------|
                        """);
                opcion = ncs.nextInt();
                if (opcion == 1) {
                    System.out.println("Cuantas va a querer");
                    cant_compra = ncs.nextInt();
                    if (cant_compra > 0 && cant_compra <= 100) {
                        igv = (cant_compra * 1590.9) * 0.18;
                        subtotal = (cant_compra * 1590.9) - igv;
                        this.pago_y_vuelto();
                    } else if (cant_compra > 100) {
                        System.out.println("---- NO TENEMOS STOCK ----");
                        System.out.println();
                        this.menuprincipal();
                    } else {
                        System.out.println("|----CANCELAMOS SU COMPRA----|");
                        System.out.println();
                        this.menuprincipal();
                    }
                } else if (opcion == 0) {
                    System.out.println("----RETROCEDIENDO----");
                    this.menuprincipal();
                } else {
                    System.out.println("""
                                  |---OPCION NO VALIDA---|
                            |---REGRESANDO AL MENU PRINCIPAL---|
                            """);
                    System.out.println();
                    this.menuprincipal();
                }
                break;
            case 9:
                System.out.println("TENEMOS:");
                System.out.println();
                System.out.println("""
                        |----------------------------------------------------|
                         |1| Llanta 235/35Zr20 Pirelli Pzero 88Y S/2293.90
                         |0| salir al menu principal
                        |----------------------------------------------------|
                        """);
                opcion = ncs.nextInt();
                if (opcion == 1) {
                    System.out.println("Cuantas va a querer");
                    cant_compra = ncs.nextInt();
                    if (cant_compra > 0 && cant_compra <= 100) {
                        igv = (cant_compra * 2293.9) * 0.18;
                        subtotal = (cant_compra * 2293.9) - igv;
                        this.pago_y_vuelto();
                    } else if (cant_compra > 100) {
                        System.out.println("---- NO TENEMOS STOCK ----");
                        System.out.println();
                        this.menuprincipal();
                    } else {
                        System.out.println("|----CANCELAMOS SU COMPRA----|");
                        System.out.println();
                        this.menuprincipal();
                    }
                } else if (opcion == 0) {
                    System.out.println("----RETROCEDIENDO----");
                    this.menuprincipal();
                } else {
                    System.out.println("""
                                  |---OPCION NO VALIDA---|
                            |---REGRESANDO AL MENU PRINCIPAL---|
                            """);
                    System.out.println();
                    this.menuprincipal();
                }
                break;
            case 10:
                System.out.println("TENEMOS:");
                System.out.println();
                System.out.println("""
                        |------------------------------------------------------|
                         |1| CLlanta 295/40Zr21 Pirelli Pzero 111Y S/2620.90
                         |0| salir al menu principal
                        |------------------------------------------------------|
                        """);
                opcion = ncs.nextInt();
                if (opcion == 1) {
                    double m = 2620.9;
                    System.out.println("Cuantas va a querer");
                    cant_compra = ncs.nextInt();
                    if (cant_compra > 0 && cant_compra <= 100) {
                        igv = (cant_compra * 2620.9) * 0.18;
                        subtotal = (cant_compra * 2620.9) - igv;
                        this.pago_y_vuelto();
                    } else if (cant_compra > 100) {
                        System.out.println("---- NO TENEMOS STOCK ----");
                        System.out.println();
                        this.menuprincipal();
                    } else {
                        System.out.println("|----CANCELAMOS SU COMPRA----|");
                        System.out.println();
                        this.menuprincipal();
                    }
                } else if (opcion == 0) {
                    System.out.println("----RETROCEDIENDO----");
                    this.menuprincipal();
                } else {
                    System.out.println("""
                                  |---OPCION NO VALIDA---|
                            |---REGRESANDO AL MENU PRINCIPAL---|
                            """);
                    System.out.println();
                    this.menuprincipal();
                }
                break;
            case 11:
                System.out.println("TENEMOS:");
                System.out.println();
                System.out.println("""
                        |---------------------------------------------------------------|
                         |1| Llanta Pirelli Scorpion Zero AS 265/40R22 106Y S/2927.90
                         |0| salir al menu principal
                        |---------------------------------------------------------------|
                        """);
                opcion = ncs.nextInt();
                if (opcion == 1) {
                    System.out.println("Cuantas va a querer");
                    cant_compra = ncs.nextInt();
                    if (cant_compra > 0 && cant_compra <= 100) {
                        igv = (cant_compra * 2927.9) * 0.18;
                        subtotal = (cant_compra * 2927.9) - igv;
                        this.pago_y_vuelto();
                    } else if (cant_compra > 100) {
                        System.out.println("---- NO TENEMOS STOCK ----");
                        System.out.println();
                        this.menuprincipal();
                    } else {
                        System.out.println("|----CANCELAMOS SU COMPRA----|");
                        System.out.println();
                        this.menuprincipal();
                    }
                } else if (opcion == 0) {
                    System.out.println("----RETROCEDIENDO----");
                    this.menuprincipal();
                } else {
                    System.out.println("""
                                  |---OPCION NO VALIDA---|
                            |---REGRESANDO AL MENU PRINCIPAL---|
                            """);
                    System.out.println();
                    this.menuprincipal();
                }
                break;
            case 0:
                System.out.println("----RETROCEDIENDO----");
                this.menuprincipal();
                break;
            default:
                System.out.println("opcion no valida");
        }
    }
    public void PROMARTWA() {
        Limpieza1.add("Limpiador Cif Anti Hongos Doypack 450ml S/8");
        Limpieza2.add("Paño de microfibra 40x40cm 6 unidades Orange S/11");
        Limpieza3.add("Limpiavidrios Sapolio 5lt S/30");
        Limpieza4.add("Limpiador piso madera y laminado 700ml Binner S/31");
        Limpieza5.add("Cloro en pastillas para piscinas 1 kg | 5 pastillas de 200 gr Pluschlor S/39.90");

        for (int i = 0; i < Limpieza1.size(); i++) {
            carrito_limpieza1.add(0);
        }
        for (int i = 0; i < Limpieza2.size(); i++) {
            carrito_limpieza2.add(0);
        }
        for (int i = 0; i < Limpieza3.size(); i++) {
            carrito_limpieza3.add(0);
        }
        for (int i = 0; i < Limpieza4.size(); i++) {
            carrito_limpieza4.add(0);
        }
        for (int i = 0; i < Limpieza5.size(); i++) {
            carrito_limpieza5.add(0);
            subtotal_limpieza.add(0.0);
        }
    }
    public void limpieza() {
        System.out.println("-------------------------------------");
        System.out.println("TENEMOS LO SIGUIENTE:");
        System.out.println(" |1|.- Limpieza de baños");
        System.out.println(" |2|.- Limpieza de cocinas");
        System.out.println(" |3|.- Limpieza de sala y comedor");
        System.out.println(" |4|.- Limpieza de pisos");
        System.out.println(" |5|.- Limpieza de piscinas");
        System.out.println("--------------------------------------");
        opcion = ncs.nextInt();
        ncs.nextLine();
        switch (opcion) {
            case 1:
                this.ComprarLimpieza1();
                break;
            case 2:
                this.ComprarLimpieza2();
                break;
            case 3:
                this.ComprarLimpieza3();
                break;
            case 4:
                this.ComprarLimpieza4();
                break;
            case 5:
                this.ComprarLimpieza5();
                break;
            default:
                System.out.println("Opcion no válida");
                this.limpieza();
                break;
        }
    }
    public void ComprarLimpieza1() {
        for (int i = 0; i < Limpieza1.size(); i++) {
            System.out.println("Opción " + (i + 1) + " : " + Limpieza1.get(i));
        }
        opcion = ncs.nextInt();
        ncs.nextLine();
        if (opcion >= 1 && opcion <= Limpieza1.size()) {
            System.out.println("¿Cuántos objetos comprará? Ingresa la cantidad");
            cantidad = ncs.nextInt();
            ncs.nextLine();
            carrito_limpieza1.set(opcion - 1, carrito_limpieza1.get(opcion - 1) + cantidad);
            System.out.println("Ud ha pedido " + carrito_limpieza1.get(opcion - 1) + " productos de " + Limpieza1.get(opcion - 1));
            System.out.println("""
                    ---------------------------------------
                    ELIJE UNA DE LAS OPCIONES:
                    1 AGREGAR MAS PRODUCTOS
                    2 PAGAR LOS PRODUCTOS AGREGADOS
                    3 MENU PRINCIPAL
                    ---------------------------------------""");
            opcion = ncs.nextInt();
            ncs.nextLine();
            if (opcion == 1) {
                System.out.println("REGRESANDO PARA AGREGAR MAS PRODUCTOS");
                this.limpieza();
            } else if (opcion == 2) {
                this.pagometodo();
            } else if (opcion == 3) {
                this.secciondecategorias();
            } else {
                System.out.println("OPCION ERRONEA");
            }
        } else {
            System.out.println("OPCION ERRONEA");
            this.limpieza();
        }
    }
    public void ComprarLimpieza2() {
        for (int i = 0; i < Limpieza2.size(); i++) {
            System.out.println("Opción " + (i + 1) + " : " + Limpieza2.get(i));
        }
        opcion = ncs.nextInt();
        ncs.nextLine();
        if (opcion >= 1 && opcion <= Limpieza2.size()) {
            System.out.println("¿Cuántos comprará? Ingrese la cantidad");
            cantidad = ncs.nextInt();
            ncs.nextLine();
            carrito_limpieza2.set(opcion - 1, carrito_limpieza2.get(opcion - 1) + cantidad);
            System.out.println("Ud ha pedido " + carrito_limpieza2.get(opcion - 1) + " productos de " + Limpieza2.get(opcion - 1));
            System.out.println("""
                    -------------------------------------
                    ELIJE UNA DE LAS OPCIONES:
                    1 AGREGAR MAS PRODUCTOS
                    2 PAGAR LOS PRODUCTOS AGREGADOS
                    3 MENU PRINCIPAL
                    -------------------------------------""");
            opcion = ncs.nextInt();
            ncs.nextLine();
            if (opcion == 1) {
                System.out.println("REGRESANDO PARA AGREGAR MAS PRODUCTOS");
                this.limpieza();
            } else if (opcion == 2) {
                this.pagometodo();
            } else if (opcion == 3) {
                this.secciondecategorias();
            } else {
                System.out.println("OPCION NO VALIDA");
            }
        } else {
            System.out.println("Opción no válida");
            this.limpieza();
        }
    }
    public void ComprarLimpieza3() {
        for (int i = 0; i < Limpieza3.size(); i++) {
            System.out.println("Opción " + (i + 1) + " : " + Limpieza3.get(i));
        }
        opcion = ncs.nextInt();
        ncs.nextLine();
        if (opcion >= 1 && opcion <= Limpieza3.size()) {
            System.out.println("¿Cuántos comprará? Ingrese la cantidad");
            cantidad = ncs.nextInt();
            ncs.nextLine();
            carrito_limpieza3.set(opcion - 1, carrito_limpieza3.get(opcion - 1) + cantidad);
            System.out.println("Ud ha pedido " + carrito_limpieza3.get(opcion - 1) + " productos de " + Limpieza3.get(opcion - 1));
            System.out.println("""
                    -------------------------------------
                    ELIJE UNA DE LAS OPCIONES:
                    1 AGREGAR MAS PRODUCTOS
                    2 PAGAR LOS PRODUCTOS AGREGADOS
                    3 MENU PRINCIPAL
                    -------------------------------------""");
            opcion = ncs.nextInt();
            ncs.nextLine();
            if (opcion == 1) {
                System.out.println("REGRESANDO PARA AGREGAR MAS PRODUCTOS");
                this.limpieza();
            } else if (opcion == 2) {
                this.pagometodo();
            } else if (opcion == 3) {
                this.secciondecategorias();
            } else {
                System.out.println("OPCION NO VALIDA");
            }
        } else {
            System.out.println("Opción no válida");
            this.limpieza();
        }
    }
    public void ComprarLimpieza4() {
        for (int i = 0; i < Limpieza4.size(); i++) {
            System.out.println("Opción " + (i + 1) + " : " + Limpieza4.get(i));
        }
        opcion = ncs.nextInt();
        ncs.nextLine();
        if (opcion >= 1 && opcion <= Limpieza4.size()) {
            System.out.println("¿Cuántos comprará? Ingrese la cantidad");
            cantidad = ncs.nextInt();
            ncs.nextLine();
            carrito_limpieza4.set(opcion - 1, carrito_limpieza4.get(opcion - 1) + cantidad);
            System.out.println("Ud ha pedido " + carrito_limpieza4.get(opcion - 1) + " productos de " + Limpieza4.get(opcion - 1));
            System.out.println("""
                    --------------------------------------
                    ELIJE UNA DE LAS OPCIONES:
                    1 AGREGAR MAS PRODUCTOS
                    2 PAGAR LOS PRODUCTOS AGREGADOS
                    3 MENU PRINCIPAL
                    --------------------------------------""");
            opcion = ncs.nextInt();
            ncs.nextLine();
            if (opcion == 1) {
                System.out.println("REGRESANDO PARA AGREGAR MAS PRODUCTOS");
                this.limpieza();
            } else if (opcion == 2) {
                this.pagometodo();
            } else if (opcion == 3) {
                this.secciondecategorias();
            } else {
                System.out.println("OPCION NO VALIDA");
            }
        } else {
            System.out.println("Opción no válida");
            this.limpieza();
        }
    }
    public void ComprarLimpieza5() {
        for (int i = 0; i < Limpieza5.size(); i++) {
            System.out.println("Opción " + (i + 1) + " : " + Limpieza5.get(i));
        }
        opcion = ncs.nextInt();
        ncs.nextLine();
        if (opcion >= 1 && opcion <= Limpieza5.size()) {
            System.out.println("¿Cuántos comprará? Ingrese la cantidad");
            cantidad = ncs.nextInt();
            ncs.nextLine();
            carrito_limpieza5.set(opcion - 1, carrito_limpieza5.get(opcion - 1) + cantidad);

            subtotal_limpieza.set(opcion - 1, carrito_limpieza5.get(opcion - 1) * precio5[opcion - 1]);
            System.out.println("Ud ha pedido " + carrito_limpieza2.get(opcion - 1) + " productos de" + Limpieza5.get(opcion - 1));
            System.out.println("""
                    -------------------------------------
                    ELIJE UNA DE LAS OPCIONES:
                    |1| AGREGAR MAS PRODUCTOS
                    |2| PAGAR LOS PRODUCTOS AGREGADOS
                    |3| MENU PRINCIPAL
                    -------------------------------------""");
            opcion = ncs.nextInt();
            ncs.nextLine();
            if (opcion == 1) {
                System.out.println("REGRESANDO PARA AGREGAR MAS PRODUCTOS");
                this.limpieza();
            } else if (opcion == 2) {
                this.pagometodo();
            }
            else if (opcion == 3) {
                this.secciondecategorias();
            } else {
                System.out.println("OPCION NO VALIDA");
            }
        } else {
            System.out.println("Opción no válida");
            this.limpieza();
        }
    }
    public double pagometodo() {
        this.Pagos();
        System.out.println("--------------------------------");
        System.out.println("ELIGE EL METODO DE PAGO:");
        System.out.println("|1| PAGO AL CONTADO");
        System.out.println("|2| PAGO CON TARJETA");
        System.out.println("|3|  MENU PRINCIPAL");
        System.out.println("--------------------------------");
        int metodoPago = ncs.nextInt();
        ncs.nextLine();

        if (metodoPago == 1) {
            System.out.println("INGRESA EL PAGO EN EFECTIVO");
            int pago = ncs.nextInt();
            if (pago == totalpagar) {
                System.out.println("***************");
                System.out.println("           G R A C I A S             ");
                System.out.println("       POR COMPRAR EN PROMART!         ");
                System.out.println("***************");
                this.generarboleta();
                System.exit(0);

            } else if (pago < totalpagar) {
                double cantidadfaltante = totalpagar - pago;
                System.out.println("FALTA " + cantidadfaltante);
                System.out.println("AGREGA LOS " + cantidadfaltante + " o DEVUELVE LOS PRODUCTOS");
                int pagofinalFaltante = ncs.nextInt();
                if (pagofinalFaltante == cantidadfaltante) {
                    System.out.println("***************");
                    System.out.println("           G R A C I A S             ");
                    System.out.println("       POR COMPRAR EN PROMART!         ");
                    System.out.println("***************");
                    this.generarboleta();
                } else if (pagofinalFaltante <= 0) {
                    System.out.println("PAGO INVALIDO, CERRANDO PROGRAMA");
                } else if (pagofinalFaltante > cantidadfaltante) {
                    double cambioFinal = pagofinalFaltante - cantidadfaltante;
                    System.out.println("Su cambio es: " + cambioFinal + " GRACIAS POR COMPRAR EN PROMART");
                } else if (pagofinalFaltante < cantidadfaltante) {
                    System.out.println("REGRESE LOS PRODUCTOS, LAS COSAS NO SON GRATIS");
                }
            } else if (pago > totalpagar) {
                double vuelto = pago - totalpagar;
                System.out.println("SU CAMBIO ES:" + vuelto);
                System.out.println("***************");
                System.out.println("           G R A C I A S             ");
                System.out.println("       POR COMPRAR EN PROMART!         ");
                System.out.println("***************");
                this.generarboleta();

            }
            else {
                System.out.println("opcion no valida");
            }
        }
        else if (metodoPago == 2) {
            System.out.println("---------------------------------------------------");
            System.out.println("INGRESA LOS DETALLES DE TU TARJETA:");
            System.out.println("NUMERO DE TARJETA (16 DIGITOS POR FAVOR):");
            String numeroTarjeta = ncs.nextLine();
            System.out.println("FECHA DE EXPIRACION (MM/AA):");
            String fechaExpiracion = ncs.nextLine();
            System.out.println("CODIGO DE SEGURIDAD (CVV):");
            String codigoSeguridad = ncs.nextLine();
            System.out.println("----------------------------------------------------");


            if (numeroTarjeta.length() == 16 && fechaExpiracion.matches("\\d{2}/\\d{2}") && codigoSeguridad.length() == 3) {
                System.out.println("Los datos de la tarjeta son válidos.");
                System.out.println("Pago procesado con éxito.");
                System.out.println("***************");
                System.out.println("           G R A C I A S             ");
                System.out.println("       POR COMPRAR EN PROMART!         ");
                System.out.println("***************");
                this.generarboleta();
                System.exit(0);
            } else {
                System.out.println("Los datos de la tarjeta no son válidos. Intenta de nuevo.");
                this.pagometodo();
            }
        } else if (metodoPago == 3) {
            this.menuprincipal();
        }
        else {
            System.out.println("Método de pago no válido. Por favor, elige una opción válida.");
            this.pagometodo();
        }

        return totalpagar;
    }
    public double Pagos() {
        double cantidadTotalMenus = 0;

        for (int i = 0; i < Limpieza1.size(); i++) {
            int cantidad = carrito_limpieza1.get(i);
            if (cantidad > 0) {
                double totalMenu = cantidad * precio1[i];
                System.out.printf("%d\t\t%s\t\t%.2f\n", cantidad, Limpieza1.get(i), totalMenu);
                cantidadTotalMenus += totalMenu;
            }
        }
        for (int i = 0; i < Limpieza2.size(); i++) {
            int cantidad = carrito_limpieza2.get(i);
            if (cantidad > 0) {
                double totalMenu = cantidad * precio2[i];
                System.out.printf("%d\t\t%s\t\t%.2f\n", cantidad, Limpieza2.get(i), totalMenu);
                cantidadTotalMenus += totalMenu;
            }
        }
        for (int i = 0; i < Limpieza3.size(); i++) {
            int cantidad = carrito_limpieza3.get(i);
            if (cantidad > 0) {
                double totalMenu = cantidad * precio3[i];
                System.out.printf("%d\t\t%s\t\t%.2f\n", cantidad, Limpieza3.get(i), totalMenu);
                cantidadTotalMenus += totalMenu;
            }
        }
        for (int i = 0; i < Limpieza4.size(); i++) {
            int cantidad = carrito_limpieza4.get(i);
            if (cantidad > 0) {
                double totalMenu = cantidad * precio4[i];
                System.out.printf("%d\t\t%s\t\t%.2f\n", cantidad, Limpieza4.get(i), totalMenu);
                cantidadTotalMenus += totalMenu;
            }
        }
        for (int i = 0; i < Limpieza5.size(); i++) {
            int cantidad = carrito_limpieza5.get(i);
            if (cantidad > 0) {
                double totalExtra = subtotal_limpieza.get(i);
                System.out.printf("%d\t\t%s\t\t%.2f\n", cantidad, Limpieza5.get(i), totalExtra);
                cantidadTotalMenus += totalExtra;
            }
        }

        igv = cantidadTotalMenus * 0.18;
        subtotal = cantidadTotalMenus - igv;
        totalpagar = subtotal + igv;

        return cantidadTotalMenus;
    }
    public void generarboleta() {
        System.out.printf("\nSUBTOTAL: %.2f\n", subtotal);
        System.out.printf("IGV: %.2f\n", igv);
        System.out.printf("TOTAL A PAGADO: %.2f\n", totalpagar);
        try (FileWriter fileWriter = new FileWriter("PROMARTBOLETA.txt")) {
            fileWriter.write("----BOLETA DE VENTA---------\n");
            fileWriter.write("CANTIDAD\tDESCRIPCIÓN\t\tTOTAL\n");

            for (int i = 0; i < Limpieza1.size(); i++) {
                int cantidad = carrito_limpieza1.get(i);
                if (cantidad > 0) {
                    double totalMenu = cantidad * precio1[i];
                    fileWriter.write(String.format("%d\t\t%s\t\t%.2f\n", cantidad, Limpieza1.get(i), totalMenu));
                }
            }
            for (int i = 0; i < Limpieza2.size(); i++) {
                int cantidad = carrito_limpieza2.get(i);
                if (cantidad > 0) {
                    double totalMenu = cantidad * precio2[i];
                    fileWriter.write(String.format("%d\t\t%s\t\t%.2f\n", cantidad, Limpieza2.get(i), totalMenu));
                }
            }
            for (int i = 0; i < Limpieza3.size(); i++) {
                int cantidad = carrito_limpieza3.get(i);
                if (cantidad > 0) {
                    double totalMenu = cantidad * precio3[i];
                    fileWriter.write(String.format("%d\t\t%s\t\t%.2f\n", cantidad, Limpieza3.get(i), totalMenu));
                }
            }
            for (int i = 0; i < Limpieza4.size(); i++) {
                int cantidad = carrito_limpieza4.get(i);
                if (cantidad > 0) {
                    double totalMenu = cantidad * precio4[i];
                    fileWriter.write(String.format("%d\t\t%s\t\t%.2f\n", cantidad, Limpieza4.get(i), totalMenu));
                }
            }
            for (int i = 0; i < Limpieza5.size(); i++) {
                int cantidad = carrito_limpieza5.get(i);
                if (cantidad > 0) {
                    double totalExtra = subtotal_limpieza.get(i);
                    fileWriter.write(String.format("%d\t\t%s\t\t%.2f\n", cantidad, Limpieza5.get(i), totalExtra));
                }
            }

            fileWriter.write(String.format("\nSUBTOTAL: %.2f\n", subtotal));
            fileWriter.write(String.format("IGV: %.2f\n", igv));
            fileWriter.write(String.format("TOTAL A PAGAR: %.2f\n", totalpagar));

            System.out.println("LA BOLETA SE HA GUARDADO EN: 'PROMARTBOLETA.txt'.");

        } catch (IOException e) {
            System.out.println("Ocurrió un error al escribir la boleta: " + e.getMessage());
        }
    }


    //FIN DE CODIGO DE DUA
    //VUELTO DE YEYSON
    public void pago_y_vuelto(){
        total_a_pagar=igv+subtotal;
        System.out.println("|--------------------------------------------------------------------------------------------|");
        System.out.println("CANTIDAD "+cant_compra);
        System.out.println("subtotal "+subtotal);
        System.out.println("IGV "+igv);
        System.out.println("TOTAL A PAGAR " + total_a_pagar);
        System.out.println("""
                |--------------------------------------------------------------------------------------------|
                ELIGA UNA OPCION
                |--------------------------------------------------------------------------------------------|
                |1| PAGAR -----------------------------------------------------------------------------------|
                |2| MENU PRINCIPAL---------------------------------------------------------------------------|
                |--------------------------------------------------------------------------------------------|
                """);
        opcion= ncs.nextInt();
        switch (opcion) {
            case 0:
                System.out.println("""
                        |1| Ir a mi carrito.
                        |2| Ver mas productos.
                        |0| Menu principal
                        """);
                opcion= ncs.nextInt();
                switch (opcion){
                    case 1:
                        this.CARRITO();
                        break;
                    case 2:
                        this.secciondecategorias();
                        break;
                    case 0:
                        this.menuprincipal();
                        break;
                    default:
                        System.out.println("opcion no valida");
                        break;
                }
                break;
            case 1:
                this.PAGAR();
                break;
            case 2:
                this.menuprincipal();
                break;
            default:
                break;
        }
    }
    public void PAGAR(){
        System.out.println("|--------------------------------------------------------------------------------------------|");
        System.out.println("ingrese lo que va a pagar es soles por favor-------------------------------------------------|");
        cant_de_dinero=ncs.nextDouble();
        if (cant_de_dinero<total_a_pagar&&cant_de_dinero>=0){
            vuelto=total_a_pagar-cant_de_dinero;
            System.out.println("|--------------------------------------------------------------------------------------------|");
            System.out.println("A UD le falta aumentar "+(vuelto)+" soles");
            System.out.println("¿CUANTO VA A AUMENTAR?-----------------------------------------------------------------------|");
            aumentar= ncs.nextDouble();
            if(aumentar>vuelto&&aumentar!=0){
                total=aumentar-(-vuelto);
                System.out.println("""
                                |--------------------------------------------------------------------------------------------|
                                Espere.......................................................................................|
                                |--------------------------------------------------------------------------------------------|
                                """);
                System.out.println("|--------------------------------------------------------------------------------------------|");
                System.out.println("GRACIAS POR COMPLETAR");
                this.boleta_de_venta();
                System.out.println("|--------------------------------------------------------------------------------------------|");
                System.out.println("*****************************************");
                System.out.println("           G R A C I A S                 ");
                System.out.println("       POR COMPRAR EN PROMART!           ");
                System.out.println("*****************************************");
                System.out.println("|--------------------------------------------------------------------------------------------|");
                System.out.println("¿Va a hacer mas compras?---------------------------------------------------------------------|");
            }
            else if(aumentar==0){
                System.out.println("ud no aumento nada");
                System.out.println("¿Va a hacer compras?");
            }
            else if(aumentar<vuelto){
                System.out.println("CANCELAMOS SU COMPRA");
                System.out.println("¿Va a hacer compras?");
            }
            else{
            }
        }
        else if (cant_de_dinero>total_a_pagar){
            System.out.println("""
                            Espere....................................
                            """);
            vuelto=cant_de_dinero-total_a_pagar;
            total=vuelto;
            this.boleta_de_venta();
            System.out.println("|--------------------------------------------------------------------------------------------|");
            System.out.println("*****************************************");
            System.out.println("           G R A C I A S                 ");
            System.out.println("       POR COMPRAR EN PROMART!           ");
            System.out.println("*****************************************");
            System.out.println("|--------------------------------------------------------------------------------------------|");
            System.out.println("¿Va a hacer mas compras?---------------------------------------------------------------------|");
        }
        else if (cant_de_dinero==total_a_pagar){
            this.boleta_de_venta();
            System.out.println("|--------------------------------------------------------------------------------------------|");
            System.out.println("*****************************************");
            System.out.println("           G R A C I A S                 ");
            System.out.println("       POR COMPRAR EN PROMART!           ");
            System.out.println("*****************************************");
            System.out.println("|--------------------------------------------------------------------------------------------|");
            System.out.println("¿Va a hacer mas compras?---------------------------------------------------------------------|");
        }
        else if (cant_de_dinero<0){
            System.out.println("dinero imaginario??");
            System.out.println("¿Va a hacer compras?");
        }
        else{
            System.out.println("opcion no valida");
        }
        System.out.println("""
                        |--------------------------------------------------------------------------------------------|
                        |1| SI---------------------------------------------------------------------------------------|
                        |2| NO---------------------------------------------------------------------------------------|
                        |--------------------------------------------------------------------------------------------|
                        """);
        opcion= ncs.nextInt();
        switch (opcion){
            case 1:
                this.secciondecategorias();
                break;
            case 2:
                System.out.println("|--------------------------------------------------------------------------------------------|");
                System.out.println("*****************************************");
                System.out.println("           G R A C I A S                 ");
                System.out.println("       POR COMPRAR EN PROMART!           ");
                System.out.println("*****************************************");
                System.out.println("|--------------------------------------------------------------------------------------------|");
                break;
            default:
                break;
        }
    }

    public void CARRITO() {

        System.out.println("""
                System.out.println(""
                |1| Pagar.
                |2| Ver mas productos.
                |0| Menu principal
                """);
        opcion= ncs.nextInt();
        switch (opcion){
            case 1:
                this.PAGAR();
                break;
            case 2:
                this.secciondecategorias();
                break;
            case 0:
                break;
            default:
                break;
        }

    }

    public void cantidad_De_productos(){
        System.out.println("|--------------------------------------------------------------------------------------------|");
        System.out.println("Cuantas va a querer--------------------------------------------------------------------------|");
        System.out.println("|--------------------------------------------------------------------------------------------|");
        cant_compra = ncs.nextInt();
        //indice para el carrito
        carritoM.add(cant_compra);
    }

    public void boleta_de_venta(){
        System.out.println("|-------------------------------------BOLETA DE VENTA----------------------------------------|");
        System.out.println("|--------------------------------------------------------------------------------------------|");
        System.out.println("|---------------------------------------------------------------------------------");
        System.out.println("|---------------------------------------------------------------------------------"+carritoM.get((carritoM.size()-1)));
        System.out.println("CANTIDAD ........................................................................."+cant_compra);
        System.out.println("SUBTOTAL ........................................................................."+subtotal);
        System.out.println("IGV .............................................................................."+igv);
        System.out.println("TOTAL A PAGAR ...................................................................."+total_a_pagar);
        System.out.println("VUELTO ..........................................................................."+total);
        System.out.println("|--------------------------------------------------------------------------------------------|");
    }

    public void ExportarBoleta(){
        try(FileWriter Editor=new FileWriter("PROMART.txt")){
            Editor.write("-----Boleta de Venta-----");
            Editor.write("CANTIDAD\tDESCRIPCIÓN\t\tTOTAL\n");
            this.boleta_de_venta();
        }
        catch (IOException e) {
            System.out.println("Ocurrió un error al escribir la boleta: " + e.getMessage());
        }
    }
    //CODIGO DE ALEX

    //--

    public void HERRAMIENTAS() {
        do {
//HERRAMIENTAS
            System.out.println("TENEMOS LAS SIGUIENTES HERRAMIENTAS");
            System.out.println();
            System.out.println("""
                    (1). ESCALERAS DE ALUMINIO METAL Y  FIBRA
                    (2). ESCALERAS DE MADERA
                    (3). ESCALERAS TELESCOPICAS
                    (0). RETROCEDER""");
            System.out.println("ELIJE UNA DE LAS SIGUIENTES OPCIONES: ");
            opcion_Rr = ncs.nextInt();
            switch (opcion_Rr) {
                case 1://1 ESCALERAS DE ALUMINIO METAL Y  FIBRA
                    do {
                        System.out.println("""
                                (1). Escalera Tijera de Acero 4 pasos Werken S/179
                                (2). Escalera tijera aluminio 05 pasos S/306
                                (3). Escalera tijera aluminio 4 pasos 120kg Botafogo S/299
                                (4). Escalera tijera aluminio 5 pasos 120kg Botafogo S/329
                                (5). Escalera metal de 3 pasos M&m S/139
                                (0). retroceder
                                """);
                        System.out.print("ELIJA UNA OPCION: ");
                        opcion1_R = ncs.nextInt();
                        switch (opcion1_R) {
                            case 1:
                                total_R =179;
                                System.out.println("Usted selecciono Escalera Tijera de Acero 4 pasos Werken S/179 ");
                                this.IgvPagos();
                                break;
                            case 2:
                                total_R =306;
                                System.out.println("Usted selecciono Escalera tijera aluminio 05 pasos S/306");
                                this.IgvPagos();
                                break;
                            case 3:
                                total_R =299;
                                System.out.println("Usted selecciono Escalera tijera aluminio 4 pasos 120kg Botafogo S/299");
                                this.IgvPagos();
                                break;
                            case 4:
                                total_R =329;
                                System.out.println("Usted selecciono Escalera tijera aluminio 5 pasos 120kg Botafogo S/329");
                                this.IgvPagos();
                                break;
                            case 5:
                                total_R =139;
                                System.out.println("Usted selecciono Escalera metal de 3 pasos M&m S/ 139");
                                this.IgvPagos();
                                break;
                            case 0:
                                System.out.println();
                                System.out.println("Retrocediendo al menú anterior.......");
                                System.out.println();
                                break;
                            default:
                                System.out.println("selecciona solo las opciones disponibles");
                        }
                        System.out.println("TOTAL ACTUAL DE COMPRA " + total_R);
                        System.out.println();
                    }
                    while (opcion1_R != 0);
                    System.out.println("TIENES QUE PAGAR UN TOTAL DE " + total_R);
                    System.out.println();
                    break;


                case 2://ESCALERAS DE MADERA
                    do {
                        System.out.println("""
                                (1). Escalera Tijera de madera 8 pasos Iforest S/129
                                (2). Escalera Tijera de madera 10 pasos Iforest S/150
                                (3). Escalera Steps Tijera de madera 6 pasos Iforest S/125
                                (0). Retroceder
                                """);
                        System.out.println("elije una opcion");
                        opcion1_R = ncs.nextInt();
                        switch (opcion1_R) {
                            case 1:
                                total_R =129;
                                System.out.println("Usted selecciono Escalera Tijera de madera 8 pasos Iforest S/129");
                                this.IgvPagos();
                                break;
                            case 2:
                                total_R =150;
                                System.out.println("Usted selecciono Escalera Tijera de madera 10 pasos Iforest S/150");
                                this.IgvPagos();
                                break;
                            case 3:
                                total_R =125;
                                System.out.println("Usted selecciono Escalera Steps Tijera de madera 6 pasos Iforest S/125");
                                this.IgvPagos();
                                break;
                            case 0:
                                System.out.println("Retrocediendo al menú anterior.......");
                                break;
                            default:
                                System.out.println("selecciona solo las opciones disponibles");
                        }
                        System.out.println("TOTAL ACTUAL DE COMPRA " + total_R);
                        System.out.println();
                    }
                    while (opcion1_R != 0);
                    System.out.println("TIENES QUE PAGAR UN TOTAL DE " + total_R);
                    System.out.println();
                    break;

                case 3://ESCALERAS TELESCOPICAS
                    do {
                        System.out.println("""
                                (1). Escalera telescópica 24 pasos Now Laders S/1,643
                                (2). Escalera Telescópica Aluminio 24 pasos Jumbor S/669
                                (3). Escalera Telescopica 20 peldaños Soporta 175Kg Truper 16758 S/789
                                (4). Escalera telescopica 28 peldaños soporta 150kg truper 16748 S/999
                                (5). Escalera telescópica 20 peldaños, fibra de vidrio DIELECTRICO Truper S/1,199
                                (0). Retroceder
                                """);
                        System.out.println("elija una de las opciones");
                        opcion1_R = ncs.nextInt();
                        switch (opcion1_R) {
                            case 1:
                                total_R =1643;
                                System.out.println("Usted seleccionó Escalera telescópica 24 pasos Now Laders S/1643");
                                this.IgvPagos();
                                break;
                            case 2:
                                total_R =669;
                                System.out.println("Usted seleccionó Escalera Telescópica Aluminio 24 pasos Jumbor S/669");
                                this.IgvPagos();
                                break;
                            case 3:
                                total_R =789;
                                System.out.println("Usted seleccionó Escalera Telescopica 20 peldaños Soporta 175Kg Truper S/789 S/789");
                                this.IgvPagos();
                                break;
                            case 4:
                                total_R =999;
                                System.out.println("Usted seleccionó Escalera telescopica 28 peldaños soporta 150kg truper S/999 ");
                                this.IgvPagos();
                                break;
                            case 5:
                                total_R =1199;
                                System.out.println("Usted seleccionó Escalera telescópica 20 peldaños, fibra de vidrio DIELECTRICO Truper S/1199");
                                this.IgvPagos();
                                break;
                            case 0:
                                System.out.println("Retrocediendo al menú anterior.......");
                                break;
                            default:
                                System.out.println("selecciona solo las opciones disponibles");
                        }
                        System.out.println("TOTAL ACTUAL DE COMPRA " + total_R);
                        System.out.println();
                    }
                    while (opcion1_R != 0);
                    System.out.println("TIENES QUE PAGAR UN TOTAL DE " + total_R);
                    System.out.println();
                    break;
            }
        }
        while (opcion_Rr != 0);
        System.out.println("Retrocediendo al menú anterior.......");
    }

    public void OPCIONCONSTRUCCION() {

        do {
//Construccion

            System.out.println("TENEMOS ESTAS HERRAMIENTAS PARA CONSTRUCCION");
            System.out.println();
            System.out.println("""
                    (1). PALAS Y PICOS
                    (2). CARRETILLAS
                    (3). OTRAS HERRAMIENTAS DE CONSTRUCCION
                    (0). SALIR""");
            System.out.println("ELIJE UNA DE LAS SIGUIENTES OPCIONES: ");
            opcion_Rr = ncs.nextInt();
            switch (opcion_Rr) {
                case 1://palas y picos
                    do {
                        System.out.println("""
                                (1). Pala de punta 1kg Kamasa S/44
                                (2). Pico Construcción 5 Mango 90cm Tramontina S/89
                                (3). Pala punta huevo con mango 2kg Tramontina S/61
                                (4). Lampa Punta Huevo con mango 1.2kg Tramontina S/27
                                (0). Retroceder
                                """);
                        System.out.print("ELIJA UNA OPCION: ");
                        opcion1_R = ncs.nextInt();
                        switch (opcion1_R) {
                            case 1:
                                total_R =44;
                                System.out.println("Usted selecciono Pala de punta 1kg Kamasa S/44");
                                this.IgvPagos();
                                break;
                            case 2:
                                total_R =89;
                                System.out.println("Usted seleccionó Pico Construcción 5 Mango 90cm Tramontina S/89");
                                this.IgvPagos();
                                break;
                            case 3:
                                total_R =61;
                                System.out.println("Usted seleccionó Pala punta huevo con mango 2kg Tramontina S/61");
                                this.IgvPagos();
                                break;
                            case 4:
                                total_R =27;
                                System.out.println("Usted seleccionó Lampa Punta Huevo con mango 1.2kg Tramontina S/27");
                                this.IgvPagos();
                                break;
                            case 0:
                                System.out.println();
                                System.out.println("Retrocediendo al menú anterior.......");
                                System.out.println();
                                break;
                            default:
                                System.out.println("selecciona solo las opciones disponibles");
                        }
                        System.out.println("TOTAL ACTUAL DE COMPRA " + total_R);
                        System.out.println();
                    }
                    while (opcion1_R != 0);
                    System.out.println("TIENES QUE PAGAR UN TOTAL DE " + total_R);
                    System.out.println();
                    break;


                case 2://CARRETILLAS
                    do {
                        System.out.println("""
                                (1). Carretilla Buggy 5.5P3 80 litros llanta normal Werken S/119
                                (2). Carretilla CAT-50ND Truper S/238
                                (3). Carretilla Buggy para Niños Tolva Plastica 54x38cm Naranja Truper 10440 S/95
                                (4). Carretilla Buggy 100 Litros 6 Ft3 580 Kg Truper 11776 S/309
                                (0). Salir
                                """);
                        System.out.println("elije una opcion");
                        opcion1_R = ncs.nextInt();
                        switch (opcion1_R) {
                            case 1:
                                total_R =119;
                                System.out.println("Usted seleccionó Carretilla Buggy 5.5P3 80 litros llanta normal Werken S/119");
                                this.IgvPagos();
                                break;
                            case 2:
                                total_R =238;
                                System.out.println("Usted seleccionó Carretilla CAT-50ND Truper S/238");
                                this.IgvPagos();
                                break;
                            case 3:
                                total_R =95;
                                System.out.println("Usted seleccionó Carretilla Buggy para Niños Tolva Plastica 54x38cm Naranja Truper 10440 S/95");
                                this.IgvPagos();
                                break;
                            case 4:
                                total_R =309;
                                System.out.println("Carretilla Buggy 100 Litros 6 Ft3 580 Kg Truper 11776 S/309");
                                this.IgvPagos();
                                break;
                            case 0:
                                System.out.println("Retrocediendo al menú anterior.......");
                                break;
                            default:
                                System.out.println("selecciona solo las opciones disponibles");
                        }
                        System.out.println("TOTAL ACTUAL DE COMPRA " + total_R);
                        System.out.println();
                    }
                    while (opcion1_R != 0);
                    System.out.println("TIENES QUE PAGAR UN TOTAL DE " + total_R);
                    System.out.println();
                    break;

                case 3://OTRAS HERRAMIENTAS DE CONSTRUCCION
                    do {
                        System.out.println("""
                                (1). Balde de plástico Naranja Flexible 40 litros Rubi S/49
                                (2). Tortol 3/8" x 14" Major S/4
                                (3). Comba Octavada 1.5Kg Tramontina S/29
                                (4). Cortador de 18 de cable y alambre Truper S/122
                                (5). Barreta Corrugada 1"X1.50m Major S/42
                                (0). Retroceder
                                """);
                        System.out.println("elija una de las opciones");
                        opcion1_R = ncs.nextInt();
                        switch (opcion1_R) {
                            case 1:
                                total_R =49;
                                System.out.println("Usted seleccionó Balde de plástico Naranja Flexible 40 litros Rubi S/49");
                                this.IgvPagos();
                                break;
                            case 2:
                                total_R =4;
                                System.out.println("Usted seleccionó Tortol 3/8\" x 14\" Major S/4");
                                this.IgvPagos();
                                break;
                            case 3:
                                total_R =29;
                                System.out.println("Usted seleccionó Comba Octavada 1.5Kg Tramontina S/29");
                                this.IgvPagos();
                                break;
                            case 4:
                                total_R =122;
                                System.out.println("Usted seleccionó Cortador de 18 de cable y alambre Truper S/122");
                                this.IgvPagos();
                                break;
                            case 5:
                                total_R =42;
                                System.out.println("Usted selecciono Barreta Corrugada 1\"X1.50m Major S/42");
                                this.IgvPagos();
                                break;
                            case 0:
                                System.out.println("Retrocediendo al menú anterior.......");
                                break;
                            default:
                                System.out.println("selecciona solo las opciones disponibles");
                        }
                        System.out.println("TOTAL ACTUAL DE COMPRA " + total_R);
                        System.out.println();
                    }
                    while (opcion1_R != 0);
                    System.out.println("TIENES QUE PAGAR UN TOTAL DE " + total_R);
                    System.out.println();
                    break;
            }
        }
        while (opcion_Rr != 0);
        System.out.println("Retrocediendo al menú anterior.......");
    }

    public void ELECTRICIDAD() {
        do {
//ELECTRICIDD

            System.out.println("TENEMOS ESTAS OPCIONES DE VENTA EN CATEGORIA DE ELECTRICIDAD");
            System.out.println();
            System.out.println("""
                    (1). EXTENSIONES DOMESTICAS
                    (2). EXTENSIONES INDUSTRIALES
                    (0). RETROCEDER""");
            System.out.println("ELIJE UNA DE LAS SIGUIENTES OPCIONES: ");
            opcion_Rr = ncs.nextInt();
            switch (opcion_Rr) {
                case 1://EXTENSIONES DOMESTICAS
                    do {
                        System.out.println("""
                                (1). Extensión 4 tomas 2 puertos USB 2m Werken S/27
                                (2). Extensión cuadro 3 tomas 1 USB 1 Tipo C Negra Werken S/69
                                (3). Extensión 4 tomas Universal + Tierra 2 USB Bticino S/128
                                (4). Extensión Universal 5 tomas + L/T Bticino S/83
                                (5). Extensión eléctrica 3 toma corriente 50ft Kamasa S/33
                                (0). RETROCEDER
                                """);
                        System.out.print("ELIJA UNA OPCION: ");
                        opcion1_R = ncs.nextInt();
                        switch (opcion1_R) {
                            case 1:
                                total_R =27;
                                System.out.println("Usted seleccionó Extensión 4 tomas 2 puertos USB 2m Werken S/27");
                                this.IgvPagos();
                                break;
                            case 2:
                                total_R =69;
                                System.out.println("Usted seleccionó Extensión cuadro 3 tomas 1 USB 1 Tipo C Negra Werken S/69");
                                this.IgvPagos();
                                break;
                            case 3:
                                total_R =128;
                                System.out.println("Usted seleccionó Extensión 4 tomas Universal + Tierra 2 USB Bticino S/128");
                                this.IgvPagos();
                                break;
                            case 4:
                                total_R =83;
                                System.out.println("Usted selecciono Extensión Universal 5 tomas + L/T Bticino S/83");
                                this.IgvPagos();
                                break;
                            case 5:
                                total_R =33;
                                System.out.println("Usted selecciono Extensión eléctrica 3 toma corriente 50ft Kamasa S/33");
                                this.IgvPagos();
                                break;

                            case 0:
                                System.out.println();
                                System.out.println("Retrocediendo al menú anterior.......");
                                System.out.println();
                                break;
                            default:
                                System.out.println("selecciona solo las opciones disponibles");
                        }
                        System.out.println("TOTAL ACTUAL DE COMPRA " + total_R);
                        System.out.println();
                    }
                    while (opcion1_R != 0);
                    System.out.println("TIENES QUE PAGAR UN TOTAL DE " + total_R);
                    System.out.println();
                    break;


                case 2://EXTENSIONES INDUSTRIALES
                    do {
                        System.out.println("""
                                (1). Extensión 1 toma tierra 3x12AWG 5m Werken S/79
                                (2). Extensión 3 tomas tierra 3x18awg 5m Werken S/32
                                (3). Extensión 3 tomas tierra 3x18awg 7m Werken S/42
                                (4). Extensión 1 toma tierra 3x18awg 5m Werken S/29
                                (5). Extensión Uso Rudo Naranja 8mts Calibre 2X16 FP0111 Fulgore S/23
                                (0). Salir
                                """);
                        System.out.println("elije una opcion");
                        opcion1_R = ncs.nextInt();
                        switch (opcion1_R) {
                            case 1:
                                total_R =79;
                                System.out.println("Usted seleccionó Extensión 1 toma tierra 3x12AWG 5m Werken S/79");
                                this.IgvPagos();
                                break;
                            case 2:
                                total_R =32;
                                System.out.println("Usted seleccionó Extensión 3 tomas tierra 3x18awg 5m Werken S/32");
                                this.IgvPagos();
                                break;
                            case 3:
                                total_R =42;
                                System.out.println("Usted seleccionó CExtensión 3 tomas tierra 3x18awg 7m Werken S/42");
                                this.IgvPagos();
                                break;
                            case 4:
                                total_R =29;
                                System.out.println("Usted seleccionó Extensión 1 toma tierra 3x18awg 5m Werken S/29");
                                this.IgvPagos();
                                break;

                            case 5:
                                total_R =23;
                                System.out.println("Usted seleccionó Extensión Uso Rudo Naranja 8mts Calibre 2X16 FP0111 Fulgore S/23");
                                this.IgvPagos();
                                break;

                            case 0:
                                System.out.println("Retrocediendo al menú anterior.......");
                                break;
                            default:
                                System.out.println("selecciona solo las opciones disponibles");
                        }
                        System.out.println("TOTAL ACTUAL DE COMPRA " + total_R);
                        System.out.println();
                    }
                    while (opcion1_R != 0);
                    System.out.println("TIENES QUE PAGAR UN TOTAL DE " + total_R);
                    System.out.println();
                    break;
            }
        }
        while (opcion_Rr != 0);
        System.out.println("Retrocediendo al menú anterior.......");
    }

    public void OPCIONPISOYCERAMICOS() {
        do {
//Pisos vinílicos y pegamentos

            System.out.println("TENEMOS ESTAS OPCIONES DE PISOS VINILICOS Y PEGAMENTOS ");
            System.out.println();
            System.out.println("""
                    (1). PISOS VINILICOS
                    (2). CUBREPISOS Y PISO BUSES
                    (3). PEGAMENTOS PARA PISOS VINILICOS
                    (0). RETROCEDER""");
            System.out.println("ELIJE UNA DE LAS SIGUIENTES OPCIONES: ");
            opcion_Rr = ncs.nextInt();
            switch (opcion_Rr) {
                case 1://1 PISOS VINILICOS
                    do {
                        System.out.println("""
                                (1). Piso vinílico Teca 1mm - Venta por m2 Klipenn S/31
                                (2). Piso vinílico Pisopak French Oak Ii 1mm - Venta por m2 S/31
                                (3). Piso Vinílico Palisandro Wood 1.6mm - Venta por m2 Klipe S/27
                                (4). Piso Flex Familia Hickory 1mm - Venta por m2 Lg Floors S/32
                                (5). Piso Fresno Beige 1.5mm - Venta por m2 Pisopak S/41
                                (0). RETROCEDER
                                """);
                        System.out.print("ELIJA UNA OPCION: ");
                        opcion1_R = ncs.nextInt();
                        switch (opcion1_R) {
                            case 1:
                                total_R =31;
                                System.out.println("Usted selecciono Piso vinílico Teca 1mm - Venta por m2 Klipenn  S/31");
                                this.IgvPagos();
                                break;
                            case 2:
                                total_R =31;
                                System.out.println("Usted seleccionó Piso vinílico Pisopak French Oak Ii 1mm - Venta por m2 S/31");
                                this.IgvPagos();
                                break;
                            case 3:
                                total_R =27;
                                System.out.println("Usted seleccionó Piso Vinílico Palisandro Wood 1.6mm - Venta por m2 Klipe S/27");
                                this.IgvPagos();
                                break;
                            case 4:
                                total_R =32;
                                System.out.println("Usted seleccionó Piso Flex Familia Hickory 1mm - Venta por m2 Lg Floors S/32");
                                this.IgvPagos();
                                break;
                            case 5:
                                total_R =41;
                                System.out.println("Usted seleccionó Piso Fresno Beige 1.5mm - Venta por m2 Pisopak S/41");
                                this.IgvPagos();
                                break;
                            case 0:
                                System.out.println();
                                System.out.println("Retrocediendo al menú anterior.......");
                                System.out.println();
                                break;
                            default:
                                System.out.println("selecciona solo las opciones disponibles");
                        }
                        System.out.println("TOTAL ACTUAL DE COMPRA " + total_R);
                        System.out.println();
                    }
                    while (opcion1_R != 0);
                    System.out.println("TIENES QUE PAGAR UN TOTAL DE " + total_R);
                    System.out.println();
                    break;


                case 2://CUBREPISOS Y PISO BUSES
                    do {
                        System.out.println("""
                                (1). Cubrepiso Vinoleum acanalado 2mm - Venta por m2 Pisopak S/34
                                (2). Cubrepiso pisobus Gris 2.16mm - Venta por m2 Pisopak S/34
                                (3). Piso vinílico Pisobus 3mm Marrón - Venta por m2 Pisopak S/32
                                (0). Retroceder
                                """);
                        System.out.println("elije una opcion");
                        opcion1_R = ncs.nextInt();
                        switch (opcion1_R) {
                            case 1:
                                total_R =34;
                                System.out.println("Usted seleccionó Cubrepiso Vinoleum acanalado 2mm - Venta por m2 Pisopak S/34");
                                this.IgvPagos();
                                break;
                            case 2:
                                total_R =34;
                                System.out.println("Usted seleccionó comprar Cubrepiso pisobus Gris 2.16mm - Venta por m2 Pisopak S/34");
                                this.IgvPagos();
                                break;
                            case 3:
                                total_R =32;
                                System.out.println("Usted seleccionó Piso vinílico Pisobus 3mm Marrón - Venta por m2 Pisopak S/32");
                                this.IgvPagos();
                                break;
                            case 0:
                                System.out.println("Retrocediendo al menú anterior.......");
                                break;
                            default:
                                System.out.println("selecciona solo las opciones disponibles");
                        }
                        System.out.println("TOTAL ACTUAL DE COMPRA " + total_R);
                        System.out.println();
                    }
                    while (opcion1_R != 0);
                    System.out.println("TIENES QUE PAGAR UN TOTAL DE " + total_R);
                    System.out.println();
                    break;

                case 3://PEGAMENTOS PARA PISOS VINILICOS
                    do {
                        System.out.println("""
                                (1). Pegamento para rollos 1 galón Pisopak S/73
                                (2). Formipega 1 galón Pisopak S/102
                                (0). Retroceder
                                """);
                        System.out.println("elija una de las opciones");
                        opcion1_R = ncs.nextInt();
                        switch (opcion1_R) {
                            case 1:
                                total_R =73;
                                System.out.println("Usted seleccionó Pegamento para rollos 1 galón Pisopak S/73");
                                this.IgvPagos();
                                break;

                            case 2:
                                total_R =102;
                                System.out.println("Usted seleccionó Formipega 1 galón Pisopak S/102");
                                this.IgvPagos();
                                break;
                            case 0:
                                System.out.println("Retrocediendo al menú anterior.......");
                                break;
                            default:
                                System.out.println("selecciona solo las opciones disponibles");
                        }
                        System.out.println("TOTAL ACTUAL DE COMPRA " + total_R);
                        System.out.println();
                    }
                    while (opcion1_R != 0);
                    System.out.println("TIENES QUE PAGAR UN TOTAL DE " + total_R);
                    System.out.println();
                    break;
            }
        }
        while (opcion_Rr != 0);
        System.out.println("Retrocediendo al menú anterior.......");
    }
    public double Fpago(){
        System.out.println("INGRESA EL PAGO");
        int pago= ncs.nextInt();
        if(pago== total_R){
            System.out.println("*****************************************");
            System.out.println("           G R A C I A S             ");
            System.out.println("       POR COMPRAR EN PROMART!         ");
            System.out.println("*****************************************");
            this.BoletaDeVenta();
        }
        else if(pago<=0){
            System.out.println("pago invalido");
            cantidad_R =0;
            this.secciondecategorias();
        }
        else if(pago< total_R){
            System.out.println("*****FONDOS INSUFICIENTES*****");
            System.out.println();
            System.out.println("REGRESANDO A MENU PRINCIPAL.....");
            System.out.println();
            cantidad_R =0;
            this.secciondecategorias();
            System.out.println();

        }
        else if(pago> total_R) {
            vuelto_R =pago- total_R;
            System.out.println("SU CAMBIO ES:"+ vuelto_R);
            System.out.println("*******************************************************");
            System.out.println("           G R A C I A S             ");
            System.out.println("       POR COMPRAR EN PROMART!         ");
            System.out.println("*******************************************************");
            this.BoletaDeVenta();

        }
        System.exit(0);
        return total_R;
    }

    public double IgvPagos(){
        System.out.println("¿Cuantos productos va comprar? ");
        cantidadtotal_R = ncs.nextInt();
        if (cantidadtotal_R <=0) {
            System.out.println("CANTIDAD INVALIDA, REGRESANDO AL MENU PRINCIPAL");
            cantidadtotal_R =0;
            this.secciondecategorias();
        }
        cantidad_R = cantidadtotal_R + cantidad_R;
        total_R = total_R * cantidad_R;
        System.out.println("_______________________________________________________");
        System.out.println("Total de Productos Seleccionados: "+ cantidad_R);
        igv_R = (total_R) * 0.18;
        subtotal_R = (total_R) - igv_R;
        total_R = subtotal_R + igv_R;
        System.out.println("_______________________________________________________");
        System.out.println("              TOTAL A PAGAR " + total_R);
        System.out.println("_______________________________________________________");
        System.out.println();
        System.out.println();
        System.out.println("""
                                        SELECCIONE UNA DE LAS OPCIONES:
                                        OPCION (1): IR A PAGAR PRODUCTO
                                        OPCION (2): IR A MENU PRINCIPAL Y DESCARTAR PRODUCTOS
                                        OPCION (0): SALIR DE PROMART""");
        System.out.println("selecciona una de las opciones disponibles");
        opcionn_R = ncs.nextInt();
        switch (opcionn_R) {
            case 1:
                this.Fpago();
                break;
            case 2:
                System.out.println("**********VOLVIENDO AL MENU PRINCIPAL**********");
                cantidad_R =0;
                this.secciondecategorias();
                break;
            default:
                System.out.println("opcion no valida");
                System.exit(0);
        }
        return total_R;
    }

    public Double BoletaDeVenta(){
        igv_R = (total_R) * 0.18;
        subtotal_R = (total_R) - igv_R;
        total_R = subtotal_R + igv_R;
        System.out.println("-----------------BOLETA DE VENTA-----------------------");
        System.out.println("              SUBTOTAL " + subtotal_R);
        System.out.println("              IGV " + igv_R);
        System.out.println("              TOTAL A PAGAR " + total_R);
        System.out.println("_______________________________________________________");
        System.out.println("         Total de Productos comprados: "+ cantidad_R);
        System.out.println("_______________________________________________________");
        System.out.println();
        return total_R;
    }






    //FIN CODIGO RONALD ALEX

    public void logo(){
        System.out.println("""
                           X                                                                                                                         \s
                         XXXXX                                                                                                                       \s
                       XXXXXXXXXX  XXX                                                                                                               \s
                     XXXXXXXXXXXXXXXXXX     XXXXXXXXXX   XXXXXXXXXXX      XXXXXXXXX     XXXXX      XXXXX      XXXXXX      XXXXXXXXXXX  XXXXXXXXXXXXXX\s
                   XXXXXXXX xXXXXXXXXXX     XXXXXXXXXXX  XXXXXXXXXXXX   XXXXXXXXXXXXX   XXXXXXX   XXXXXX      XXXXXX      XXXXXXXXXXXX XXXXXXXXXXXXXX\s
                 xXXXXXXX     XXXXXXXXX     XXXXX  XXXXX XXXXX  XXXXX  XXXXXX   XXXXXX  XXXXXXXX XXXXXXX     XXXXXXXX     XXXXX  XXXXX     XXXXX     \s
                 XXXXXX          XXXXXX     XXXXXXXXXXXX XXXXXXXXXXXX  XXXXX     XXXXX  XXXXXXXXXXXXXXXX    XXXX  XXXX    XXXXXXXXXXXX     XXXXX     \s
                  XXx              XXX      XXXXXXXXXXX  XXXXXXXXXXX   XXXXX     XXXXX  XXXXXXXXXXXXXXXX   XXXX    XXXX   XXXXXXXXXXX      XXXXX     \s
                   XXXXXXXXXXXXXXXXXX       XXXXXXXXX    XXXXX XXXXXX   XXXXX   XXXXXX  XXXXX XXXX XXXXX   XXXXXXXXXXXXX  XXXXX XXXXXX     XXXXX     \s
                  XXXXXXXXXXXXXXXXXXXX      XXXXX        XXXXX  XXXXXX  XXXXXXXXXXXXX   XXXXX      XXXXX  XXXXXXXXXXXXXX  XXXXX  XXXXXX    XXXXX     \s
                  XXXXXXXXXXXXXXXXXXXX      XXXXX        XXXXX   XXXXXX   XXXXXXXXX     XXXXX      XXXXX XXXXXX    XXXXXX XXXXX   XXXXXX   XXXXX     \s
                """);
    }
    public void blog() {
        System.out.println("----------BLOG-----------");
        System.out.println();
        System.out.println("""
                |1| ¿Cómo instalar un foco con sensor de movimiento?
                |2| ¿Cómo instalar un lavadero de cocina?
                |3| Mantenimiento de impresoras: ¿Cómo hacerlo?
                |0| regresar al munu principal
                """);
        opcion = ncs.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("""
                        Paso 1: Reúne los materiales y herramientas necesarias
                        Paso 2: Desmonta el foco anterior
                        Paso 3: Prepara el nuevo foco con sensor de movimiento
                        Paso 4: Conecta los cables
                        Paso 5: Fija el foco con sensor de movimiento
                        Paso 6: Configura el sensor de movimiento
                        Paso 7: Restaura la electricidad y prueba el foco
                        
                        ¿desea regresar?
                        |1| SI
                        |2| NO
                        """);
                opcion= ncs.nextInt();
                switch (opcion){
                    case 1:
                        this.blog();
                        break;
                    case 2:
                        System.out.println("MUCHAS GRACIAS POR CONFIRMAR");
                        break;
                    default:
                        break;
                }
                break;
            case 2:
                this.lavadora_cocina();
                switch (opcion) {
                    case 1:
                        System.out.println("""
                                ------------------------------------1. Instalación de lavaderos de concreto.------------------------------------|
                                
                                Preparación: Es fundamental recordar que el lavadero se instala antes de colocar el cerámico.
                                             Asegúrate de que el mueble de concreto esté completamente nivelado y limpio.
                                
                                Fijación: Para fijar el lavadero al mueble de concreto, se puede utilizar masilla plástica o una mezcla de cemento.
                                          Las ranuras del lavadero ayudarán en el anclaje al momento de fijarlo.
                                
                                Acabado: Una vez que el lavadero esté fijo, procede a instalar el cerámico al ras del mueble.
                                         Al fraguar el filo del lavadero, este quedará unido al cerámico, proporcionando un acabado más estético y un sellado efectivo.
                                """);
                        this.blog();
                        break;
                    case 2:
                        System.out.println("""
                                ------------------------------------2. Instalación de lavaderos post formado y/o melamina------------------------------------
                                
                                Nivelación: Verifica que la superficie donde se instalará el lavadero esté completamente nivelada. Decide la orientación del escurridero.
                                
                                Corte: Realiza un corte en la encimera a 1.5” hacia dentro, considerando el diámetro del lavadero para que quede la pestaña donde repose.
                                
                                Empaquetadura: Instala la empaquetadura Compriband en todo el contorno recortado del tablero.
                                
                                Ajustadores: Fija los ajustadores en el espacio previamente perforado con una broca paleta de 7/8.
                                
                                Accesorios: Instala los accesorios que vienen con el lavadero, como el desagüe y la canastilla, luego la trampa y la grifería.
                                
                                Finalización: Retira el folio de protección de color azul, y el lavadero estará listo para usar.
                                
                                """);
                        this.blog();
                        break;
                    case 3:
                        System.out.println("""
                                ------------------------------------3. Instalación de lavadero para granito y/o cuarzo------------------------------------
                                Selección del modelo: Elige uno de los modelos de lavaderos diseñados para tableros de granito o cuarzo,
                                                      que no tenga marcos ni relieves.
                                
                                Fijación: Pega el borde posterior del lavadero con sikaflex y sella a la base de concreto.
                                          Posteriormente, cubre la instalación con el tablero de granito o cuarzo elegido.
                                
                                Acabado: En este tipo de instalación, solo se visualizará la poza en profundidad, sin ningún tipo de marco o borde,
                                         lo que proporciona un aspecto limpio y elegante.
                                """);
                        this.blog();
                        break;
                    case 0:
                        this.blog();
                        break;
                    default:
                        break;
                }
                break;
            case 3:
                System.out.println("""
                        PASO 1. Reúne los materiales y herramientas necesarios
                        PASO 2. Apaga y desconecta la impresora
                        PASO 3. Limpieza externa
                        PASO 4. Limpieza interna
                        PASO 5. Limpieza de los rodillos
                        PASO 6. Revisión de los cartuchos y cabezales de impresión
                        PASO 7. Prueba de funcionamiento
                        
                        ¿desea regresar?
                        |1| SI
                        |2| NO
                        """);
                opcion= ncs.nextInt();
                switch (opcion){
                    case 1:
                        this.blog();
                        break;
                    case 2:
                        System.out.println("MUCHAS GRACIAS POR CONFIRMAR");
                        break;
                    default:
                        break;
                }
                break;
            case 0:
                this.menuprincipal();
                break;
            default:
                break;
        }
    }
    public void lavadora_cocina() {
        System.out.println("""
                |1| Lavadero para concreto de cocina
                |2| Lavadero para post formado y/o melamina
                |3| Lavadero para granito y/o cuarzo
                |0| regresar
                """);
        opcion = ncs.nextInt();
    }
    //FIN DE CODIGO //


    public static void main(String[]args) {
        PROMART_JULIACA_FINAL XD = new PROMART_JULIACA_FINAL();
        XD.PROMARTWA();
        XD.menuprincipal();
    }
}

