import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CATEGORIAS {
    Scanner ncs = new Scanner(System.in);
    double[] precio = {10, 0.18};
    double igv, subtotal, totalpagar;
    int opcion, cantidad;

    //NICOL
    ArrayList<String> productos_Espejos = new ArrayList<>();
    ArrayList<String> productos_Alfombras = new ArrayList<>();

    ArrayList<String> productos_Velas = new ArrayList<>();
    ArrayList<String> productos_Menaje = new ArrayList<>();

    ArrayList<String> productos_Almacenamiento = new ArrayList<>();
    ArrayList<String> productos_Retro = new ArrayList<>();

    ArrayList<String> productos_CasaAves = new ArrayList<>();

    // PRECIOS
    double[] precio_Espejos = {19, 22, 219};
    double[] precio_Alfombras = {229, 99.90};
    double[] precio_Velas = {9.50, 19.95};
    double[] precio_Menaje = {12, 25};
    double[] precio_Almacenamiento = {39.90, 49.90};
    double[] precio_Retro = {31.90, 21.90};
    double[] precio_CasaAves = {12, 30};
    // CARRITOS
    ArrayList<Integer> carrito_Espejos = new ArrayList<>();
    ArrayList<Integer> carrito_Alfombras = new ArrayList<>();
    ArrayList<Integer> carrito_Velas = new ArrayList<>();
    ArrayList<Integer> carrito_Menaje = new ArrayList<>();
    ArrayList<Integer> carrito_Almacenamiento = new ArrayList<>();
    ArrayList<Integer> carrito_Retro = new ArrayList<>();
    ArrayList<Integer> carrito_CasaAves = new ArrayList<>();

    //SUBTOTAL
    ArrayList<Double> subtotal_NICOL = new ArrayList<>();
    ArrayList<Double> subtotal_NICOL_2 = new ArrayList<>();
    ArrayList<Double> subtotal_NICOL_3 = new ArrayList<>();
    ArrayList<Double> subtotal_NICOL_4 = new ArrayList<>();
    ArrayList<Double> subtotal_NICOL_5 = new ArrayList<>();
    ArrayList<Double> subtotal_NICOL_6 = new ArrayList<>();
    ArrayList<Double> subtotal_NICOL_7 = new ArrayList<>();

    //ARRAYLIST DE MASCOTAS
    ArrayList<String> productos_MASCOTAS = new ArrayList<>();
    ArrayList<String> productos_MASCOTAS_2 = new ArrayList<>();

    ArrayList<String> productos_MASCOTAS_3 = new ArrayList<>();
    ArrayList<String> productos_MASCOTAS_4 = new ArrayList<>();

    ArrayList<String> productos_MASCOTAS_5 = new ArrayList<>();
    ArrayList<String> productos_MASCOTAS_6 = new ArrayList<>();

    ArrayList<String> productos_MASCOTAS_7 = new ArrayList<>();

    double[] precio_MASCOTAS = { 429.0, 429.0};
    double[] precio_MASCOTAS_2 = {279.90, 537.90 };
    double[] precio_MASCOTAS_3 = {15.70, 10.90};
    double[] precio_MASCOTAS_4 = {199.90, 43.90};
    double[] precio_MASCOTAS_5 = {45.50, 44.50};
    double[] precio_MASCOTAS_6 = {44.90, 39.90};
    double[] precio_MASCOTAS_7 = {99.90, 789.90};

    ArrayList<Integer> carrito_MASCOTAS = new ArrayList<>();
    ArrayList<Integer> carrito_MASCOTAS_2 = new ArrayList<>();
    ArrayList<Integer> carrito_MASCOTAS_3 = new ArrayList<>();
    ArrayList<Integer> carrito_MASCOTAS_4 = new ArrayList<>();
    ArrayList<Integer> carrito_MASCOTAS_5 = new ArrayList<>();
    ArrayList<Integer> carrito_MASCOTAS_6 = new ArrayList<>();
    ArrayList<Integer> carrito_MASCOTAS_7 = new ArrayList<>();

    ArrayList<Double> subtotal_MASCOTAS = new ArrayList<>();
    ArrayList<Double> subtotal_MASCOTAS_2 = new ArrayList<>();
    ArrayList<Double> subtotal_MASCOTAS_3 = new ArrayList<>();
    ArrayList<Double> subtotal_MASCOTAS_4 = new ArrayList<>();
    ArrayList<Double> subtotal_MASCOTAS_5 = new ArrayList<>();
    ArrayList<Double> subtotal_MASCOTAS_6 = new ArrayList<>();
    ArrayList<Double> subtotal_MASCOTAS_7 = new ArrayList<>();

    //ARRAYLIST DE JARDINERIA
    ArrayList<String> productos_JARDINERIA = new ArrayList<>();
    ArrayList<String> productos_JARDINERIA_2 = new ArrayList<>();

    double[] precio_JARDINERIA = {15.96, 9.90};
    double[] precio_JARDINERIA_2 = {15.96, 27.92};

    ArrayList<Integer> carrito_JARDINERIA = new ArrayList<>();
    ArrayList<Integer> carrito_JARDINERIA_2 = new ArrayList<>();

    ArrayList<Double> subtotal_JARDINERIA = new ArrayList<>();
    ArrayList<Double> subtotal_JARDINERIA_2 = new ArrayList<>();

    //ARRAYLIST DE SALUD Y DEPORTE
    ArrayList<String> productos_SALUD = new ArrayList<>();
    ArrayList<String> productos_SALUD_2 = new ArrayList<>();

    ArrayList<String> productos_SALUD_3 = new ArrayList<>();
    ArrayList<String> productos_SALUD_4 = new ArrayList<>();

    ArrayList<String> productos_SALUD_5 = new ArrayList<>();
    ArrayList<String> productos_SALUD_6 = new ArrayList<>();

    ArrayList<String> productos_SALUD_7 = new ArrayList<>();

    double[] precio_SALUD = {15.96, 27.92};
    double[] precio_SALUD_2 = {18.0, 61.0};
    double[] precio_SALUD_3 = {38.90, 119.99};
    double[] precio_SALUD_4 = {87.00, 4.90};
    double[] precio_SALUD_5 = {1.70, 10.0};
    double[] precio_SALUD_6 = {12.40, 37.90};
    double[] precio_SALUD_7 = {12.40, 37.90};

    ArrayList<Integer> carrito_SALUD = new ArrayList<>();
    ArrayList<Integer> carrito_SALUD_2 = new ArrayList<>();
    ArrayList<Integer> carrito_SALUD_3 = new ArrayList<>();
    ArrayList<Integer> carrito_SALUD_4 = new ArrayList<>();
    ArrayList<Integer> carrito_SALUD_5 = new ArrayList<>();
    ArrayList<Integer> carrito_SALUD_6 = new ArrayList<>();
    ArrayList<Integer> carrito_SALUD_7 = new ArrayList<>();

    ArrayList<Double> subtotal_SALUD = new ArrayList<>();
    ArrayList<Double> subtotal_SALUD_2 = new ArrayList<>();
    ArrayList<Double> subtotal_SALUD_3 = new ArrayList<>();
    ArrayList<Double> subtotal_SALUD_4 = new ArrayList<>();
    ArrayList<Double> subtotal_SALUD_5 = new ArrayList<>();
    ArrayList<Double> subtotal_SALUD_6 = new ArrayList<>();
    ArrayList<Double> subtotal_SALUD_7 = new ArrayList<>();


    //ARRAYLIST DE OFICINA Y ESCOLAR
    ArrayList<String> productos_OFICINA = new ArrayList<>();
    ArrayList<String> productos_OFICINA_2 = new ArrayList<>();

    ArrayList<String> productos_OFICINA_3 = new ArrayList<>();
    ArrayList<String> productos_OFICINA_4 = new ArrayList<>();

    ArrayList<String> productos_OFICINA_5 = new ArrayList<>();
    ArrayList<String> productos_OFICINA_6 = new ArrayList<>();

    double[] precio_OFICINA = {20.90, 54.90};
    double[] precio_OFICINA_2 = {129.90, 9.90};
    double[] precio_OFICINA_3 = { 9.00, 17.90};
    double[] precio_OFICINA_4 = {0.50, 0.10};
    double[] precio_OFICINA_5 = {19.90, 59.90};
    double[] precio_OFICINA_6 = {11.90, 48.00};

    ArrayList<Integer> carrito_OFICINA = new ArrayList<>();
    ArrayList<Integer> carrito_OFICINA_2 = new ArrayList<>();
    ArrayList<Integer> carrito_OFICINA_3 = new ArrayList<>();
    ArrayList<Integer> carrito_OFICINA_4 = new ArrayList<>();
    ArrayList<Integer> carrito_OFICINA_5 = new ArrayList<>();
    ArrayList<Integer> carrito_OFICINA_6 = new ArrayList<>();

    ArrayList<Double> subtotal_OFICINA = new ArrayList<>();
    ArrayList<Double> subtotal_OFICINA_2 = new ArrayList<>();
    ArrayList<Double> subtotal_OFICINA_3 = new ArrayList<>();
    ArrayList<Double> subtotal_OFICINA_4 = new ArrayList<>();
    ArrayList<Double> subtotal_OFICINA_5 = new ArrayList<>();
    ArrayList<Double> subtotal_OFICINA_6 = new ArrayList<>();


    //ARRAYLIST DE DORMITORIO___________________________________________________________________
    ArrayList<String> productos_DORMITORIO = new ArrayList<>();
    ArrayList<String> productos_DORMITORIO_2 = new ArrayList<>();

    double[] precio_DORMITORIO = {657, 681, 1899};
    double[] precio_DORMITORIO_2 = {714, 647, 727, 833};

    ArrayList<Integer> carrito_DORMITORIO = new ArrayList<>();
    ArrayList<Integer> carrito_DORMITORIO_2 = new ArrayList<>();

    ArrayList<Double> subtotal_DORMITORIO = new ArrayList<>();
    ArrayList<Double> subtotal_DORMITORIO_2 = new ArrayList<>();

    //ARRAYLIST DE LIMPIEZA____________________________________________________________________

    ArrayList<String> Limpieza1 = new ArrayList<>();
    ArrayList<String> Limpieza2 = new ArrayList<>();
    ArrayList<String> Limpieza3 = new ArrayList<>();
    ArrayList<String> Limpieza4 = new ArrayList<>();
    ArrayList<String> Limpieza5 = new ArrayList<>();

    double[] precio1 = {8};
    double[] precio2 = {11};
    double[] precio3 = {30};
    double[] precio4 = {31};
    double[] precio5 = {39.9};

    ArrayList<Double> subtotal_limpieza = new ArrayList<>();
    ArrayList<Integer> carrito_limpieza1 = new ArrayList<>();
    ArrayList<Integer> carrito_limpieza2 = new ArrayList<>();
    ArrayList<Integer> carrito_limpieza3 = new ArrayList<>();
    ArrayList<Integer> carrito_limpieza4 = new ArrayList<>();
    ArrayList<Integer> carrito_limpieza5 = new ArrayList<>();


    //-----------------------------------------------------------------------------------------
    //CARRITO GENERAL
    ArrayList<Integer> carrito = new ArrayList<>();
    //-----------------------------------------------------------------------------------------


    public CATEGORIAS() {
        //NICOL
        productos_Espejos.add("Espejo básico 33.5x5cm");
        productos_Espejos.add("Espejo rectangular dorado 30x120cm");
        productos_Espejos.add("Espejo Quetzal 194x94 Orange");

        productos_Alfombras.add("Alfombra de exterior Cuadros Gris 230x160 Orange");
        productos_Alfombras.add("Alfombra de exterior rectangular Yute 90x150cm Orange");

        productos_Velas.add("Vela perfumada Misionera Tipo 24 x 2 unidades Amarillo");
        productos_Velas.add("Portavela Neutro 12 cm");

        // Organización - Subcategorías
        productos_Menaje.add("Set de utensilios de cocina Orange");
        productos_Menaje.add("Tuppers herméticos de vidrio 3 unidades");

        productos_Almacenamiento.add("Cajas de plástico apilables 10L");
        productos_Almacenamiento.add("Organizador de ropa 5 divisiones");

        // Productos en Tendencia - Subcategorías
        productos_Retro.add("Globo Terráqueo Retro Mango De Madera");
        productos_Retro.add("Adorno Cerámico Diseño Hongo Del Jardín");

        productos_CasaAves.add("Bowl Pájaro modelo 2 Casa de Aves Orange");
        productos_CasaAves.add("Jarra Azul Casa de Aves Orange");

        //MASCOTAS
        productos_MASCOTAS.add("Mueble para Mascotas Pratt color Duna TU MESITA");
        productos_MASCOTAS.add("Mueble para Mascotas Rufus color Blanco TU MESITA");

        productos_MASCOTAS_2.add("Hogar para Mascotas Comodo Talla Mediana Y+Post-it adhesivos");
        productos_MASCOTAS_2.add("Hogar para Mascotas Comodo y Util Grande Y+Post-it adhesivos");

        productos_MASCOTAS_3.add("Comida para Perros RAMBALA Adulto Clásico Doypack 800gr");
        productos_MASCOTAS_3.add("Comida para Perros ORIGO Pollo Doypack 10un");

        productos_MASCOTAS_4.add("Juguete Varita Presa Aérea para Gatos Jackson Galaxy con Láser");
        productos_MASCOTAS_4.add("Pelota de Plastico en Amarillo Talla L Y+Papel de Regalo");

        productos_MASCOTAS_5.add("Comedero para macota Buttler gris");
        productos_MASCOTAS_5.add("Set de alimentación para perro San remo Sanremo");

        productos_MASCOTAS_6.add("Camiseta Oficial Universitario Talla 2 Crema");
        productos_MASCOTAS_6.add("Camiseta Oficial Alianza Lima Talla 1 Azul");

        productos_MASCOTAS_7.add("Transportadora Kennel Mediana con Bebedero");
        productos_MASCOTAS_7.add("Transportador Ideal para Perro L100 Plomo Oscuro Y+Stickers");


        //JARDINERIA
        productos_JARDINERIA.add("Porta maceta Natural 19cm Casa del Jardín Orange");
        productos_JARDINERIA.add("Maceta Redonda Estilo Piedra 15x15cm Con Plato - Color Aleatorio Reyplast");

        productos_JARDINERIA_2.add("Maceta tejida con patas Casa del Jardín Orange");
        productos_JARDINERIA_2.add("Macetero alto triangular mediano Orange");


        //SALUD Y DEPORTES
        productos_SALUD.add("Alcohol Isopropílico al 53% Daryza 1lt");
        productos_SALUD.add("Alcohol Puro 96° 1 galon Alkofarma");

        productos_SALUD_2.add("Bloqueador solar Spf 50 Fr 1000ml Palmera");
        productos_SALUD_2.add("Repelente en crema 60gr Off Family");

        productos_SALUD_3.add("Respirador Kn95 Earloop Blanco x 15 unidades Leggera");
        productos_SALUD_3.add("Mascarilla KN95 Negro x 15 unidades R&G");

        productos_SALUD_4.add("Protector infantil de rostro Mono");
        productos_SALUD_4.add("Careta protectora anti-fog x1 unid");

        productos_SALUD_5.add("Botiquin Master Box N° 14 Polinplast");
        productos_SALUD_5.add("Botiquin Master Box N° 20 Polinplast");

        productos_SALUD_6.add("Buzo Gold Guard Sms Talla L Blanco 50gr x unid");
        productos_SALUD_6.add("Mandilón Descartable 40g/m Pack x6 Unid R&G Talla L");

        productos_SALUD_7.add("Guantes de Latex Lig Empolvados T-l X100 Leggera");
        productos_SALUD_7.add("Tocas Cofias Gorros Quirúrgicos Descartables por 100 und");



        //OFICINA Y ESCOLAR
        productos_OFICINA.add("Lapicero CLASS&WORK Rainbow Paquete 3un");
        productos_OFICINA.add("Lapicero de punta Redonda CLASS&WORK Tinta Líquida Sunset");

        productos_OFICINA_2.add("Diario A6 de Recetas / AMOR");
        productos_OFICINA_2.add("Pack Ingenial Ariana: diario + libretas x 2 unds.");

        productos_OFICINA_3.add("Calculadora Estilo Kuromi");
        productos_OFICINA_3.add("Calculadora Casio Fx 991 es científica Azul");

        productos_OFICINA_4.add("Etiqueta Termica Adhesiva 3x2cm 2 Col Pack 3 Rollos");
        productos_OFICINA_4.add("Figuras Adhesivas ARTI CREATIVO La Jungla Paquete 8un");

        productos_OFICINA_5.add("Notas Adhesivas ARTESCO Sticky 75mm x 75mm Neón");
        productos_OFICINA_5.add("Notas Adhesivas ARTESCO Colores Neón Paquete 500un");

        productos_OFICINA_6.add("Papel Bond CLASS & WORK A4 Paquete 500 Hojas");
        productos_OFICINA_6.add("Rollo de Papel Kraft Zeraus Packing 45cm x 50metros 75g");

        //DORMITORIO
        productos_DORMITORIO.add("Cama Medallón Ergo 1 plaza Paraiso ");
        productos_DORMITORIO.add("Cama Su Majestad 1 plaza Paraiso ");
        productos_DORMITORIO.add("Cama Americana Ozono 1 plaza Technodream ");

        productos_DORMITORIO_2.add("Dormitorio Consul 2 plazas con sofá cama Paraiso ");
        productos_DORMITORIO_2.add("Cama Consul Black 2 plazas Paraiso ");
        productos_DORMITORIO_2.add("Dormitorio Consul Black 2 plazas Paraiso ");
        productos_DORMITORIO_2.add("Cama Paraiso Lifestyles Pocket 2 Plazas ");

        //LIMPIEZA
        Limpieza1.add("Limpiador Cif Anti Hongos Doypack 450ml S/8");
        Limpieza2.add("Paño de microfibra 40x40cm 6 unidades Orange S/11");
        Limpieza3.add("Limpiavidrios Sapolio 5lt S/30");
        Limpieza4.add("Limpiador piso madera y laminado 700ml Binner S/31");
        Limpieza5.add("Cloro en pastillas para piscinas 1 kg | 5 pastillas de 200 gr Pluschlor S/39.90");

        //FOR DE NICOL
        for (int i = 0; i < productos_Espejos.size(); i++) {
            carrito_Espejos.add(0);
            subtotal_NICOL.add(0.0);
        }
        for (int i = 0; i < productos_Alfombras.size(); i++) {
            carrito_Alfombras.add(0);
            subtotal_NICOL_2.add(0.0);
        }
        for (int i = 0; i < productos_Velas.size(); i++) {
            carrito_Velas.add(0);
            subtotal_NICOL_3.add(0.0);
        }
        for (int i = 0; i < productos_Menaje.size(); i++) {
            carrito_Menaje.add(0);
            subtotal_NICOL_4.add(0.0);
        }
        for (int i = 0; i < productos_Almacenamiento.size(); i++) {
            carrito_Almacenamiento.add(0);
            subtotal_NICOL_5.add(0.0);
        }
        for (int i = 0; i < productos_Retro.size(); i++) {
            carrito_Retro.add(0);
            subtotal_NICOL_6.add(0.0);
        }
        for (int i = 0; i < productos_CasaAves.size(); i++) {
            carrito_CasaAves.add(0);
            subtotal_NICOL_7.add(0.0);
        }


        //FOR DE MASCOTAS
        for (int i = 0; i < productos_MASCOTAS.size(); i++) {
            carrito_MASCOTAS.add(0);
            subtotal_MASCOTAS.add(0.0);
        }
        for (int i = 0; i < productos_MASCOTAS_2.size(); i++) {
            carrito_MASCOTAS_2.add(0);
            subtotal_MASCOTAS_2.add(0.0);
        }
        for (int i = 0; i < productos_MASCOTAS_3.size(); i++) {
            carrito_MASCOTAS_3.add(0);
            subtotal_MASCOTAS_3.add(0.0);
        }
        for (int i = 0; i < productos_MASCOTAS_4.size(); i++) {
            carrito_MASCOTAS_4.add(0);
            subtotal_MASCOTAS_4.add(0.0);
        }
        for (int i = 0; i < productos_MASCOTAS_5.size(); i++) {
            carrito_MASCOTAS_5.add(0);
            subtotal_MASCOTAS_5.add(0.0);
        }
        for (int i = 0; i < productos_MASCOTAS_6.size(); i++) {
            carrito_MASCOTAS_6.add(0);
            subtotal_MASCOTAS_6.add(0.0);
        }
        for (int i = 0; i < productos_MASCOTAS_7.size(); i++) {
            carrito_MASCOTAS_7.add(0);
            subtotal_MASCOTAS_7.add(0.0);
        }
        //FOR DE JARDINERIA
        for (int i = 0; i < productos_JARDINERIA.size(); i++) {
            carrito_JARDINERIA.add(0);
            subtotal_JARDINERIA.add(0.0);
        }
        for (int i = 0; i < productos_JARDINERIA_2.size(); i++) {
            carrito_JARDINERIA_2.add(0);
            subtotal_JARDINERIA_2.add(0.0);
        }

        //FOR DE SALUD Y DEPORTES
        for (int i = 0; i < productos_SALUD.size(); i++) {
            carrito_SALUD.add(0);
            subtotal_SALUD.add(0.0);
        }
        for (int i = 0; i < productos_SALUD_2.size(); i++) {
            carrito_SALUD_2.add(0);
            subtotal_SALUD_2.add(0.0);
        }
        for (int i = 0; i < productos_SALUD_3.size(); i++) {
            carrito_SALUD_3.add(0);
            subtotal_SALUD_3.add(0.0);
        }
        for (int i = 0; i < productos_SALUD_4.size(); i++) {
            carrito_SALUD_4.add(0);
            subtotal_SALUD_4.add(0.0);
        }
        for (int i = 0; i < productos_SALUD_5.size(); i++) {
            carrito_SALUD_5.add(0);
            subtotal_SALUD_5.add(0.0);
        }
        for (int i = 0; i < productos_SALUD_6.size(); i++) {
            carrito_SALUD_6.add(0);
            subtotal_SALUD_6.add(0.0);
        }
        for (int i = 0; i < productos_SALUD_7.size(); i++) {
            carrito_SALUD_7.add(0);
            subtotal_SALUD_7.add(0.0);
        }


        //FOR DE OFICINA ESCOLAR
        for (int i = 0; i < productos_OFICINA.size(); i++) {
            carrito_OFICINA.add(0);
            subtotal_OFICINA.add(0.0);
        }
        for (int i = 0; i < productos_OFICINA_2.size(); i++) {
            carrito_OFICINA_2.add(0);
            subtotal_OFICINA_2.add(0.0);
        }
        for (int i = 0; i < productos_OFICINA_3.size(); i++) {
            carrito_OFICINA_3.add(0);
            subtotal_OFICINA_3.add(0.0);
        }
        for (int i = 0; i < productos_OFICINA_4.size(); i++) {
            carrito_OFICINA_4.add(0);
            subtotal_OFICINA_4.add(0.0);
        }
        for (int i = 0; i < productos_OFICINA_5.size(); i++) {
            carrito_OFICINA_5.add(0);
            subtotal_OFICINA_5.add(0.0);
        }
        for (int i = 0; i < productos_OFICINA_6.size(); i++) {
            carrito_OFICINA_6.add(0);
            subtotal_OFICINA_6.add(0.0);
        }


        //FOR DE DORMITORIO
        //for (int i = 0; i < menu.size(); i++) {
        //    carrito.add(0);
        //}
        for (int i = 0; i < productos_DORMITORIO.size(); i++) {
            carrito_DORMITORIO.add(0);
            subtotal_DORMITORIO.add(0.0);
        }
        for (int i = 0; i < productos_DORMITORIO_2.size(); i++) {
            carrito_DORMITORIO_2.add(0);
            subtotal_DORMITORIO_2.add(0.0);
        }

        //FOR DE LIMPIEZA
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

        //--------------------------------------------------------------------------------------------------------------
    }
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
                |1|- Organizacion y decohogar--------------------------------------------------------------|
                |2|- Limpieza-------------------------------------------------------------------------------|
                |3|- Jardineria-----------------------------------------------------------------------------|
                |4|- Oficina y escolar----------------------------------------------------------------------|
                |5|- Salud y deportes-----------------------------------------------------------------------|
                |6|- Mascotas-------------------------------------------------------------------------------|
                |7|- Dormitorio-------------------------------------------------------------------------------| 
                |0|- menu principal-------------------------------------------------------------------------|
                |--------------------------------------------------------------------------------------------|
                """);
        opcion = ncs.nextInt();
        switch (opcion) {
            case 1:
                this.MenuPrincipalDecohogar();
                break;
            case 2:
                this.OPCION_LIMPIEZA();
                break;
            case 3:
                this.seccion_de_JARDINERIA();
                break;
            case 4:
                this.seccion_de_OFICINA_Y_ESCOLAR();
                break;
            case 5:
                this.seccion_de_SALUD_Y_DEPORTES();
                break;
            case 6:
                this.seccion_de_MASCOTAS();
                break;
            case 7:
                this.OPCION_DORMITORIOS();
                break;
            case 0:
                this.menuprincipal();
                break;
            default:
                this.secciondecategorias();
                break;
        }
    }

    //------------------------------------------------------------------------------------------------------------------
    public void OPCION_DORMITORIOS(){
        System.out.println("Marque alguna de las siguientes opciones");
        System.out.println(" 1.- Comprar 1 plazas");
        System.out.println(" 2.- Comprar 2 plazas");
        opcion = ncs.nextInt();
        ncs.nextLine();
        switch (opcion) {
            case 1:
                this.Comprar_DOMITORIO();
                break;
            case 2:
                this.Comprar_DOMITORIO_2();
                break;
            default:
                System.out.println("Opcion no válida");
                this.secciondecategorias();
                break;
        }
    }
    public void OPCION_LIMPIEZA(){
        System.out.println("TENENMOS LO SIGUIENTE:");
        System.out.println(" |1|.- Limpieza de baños");
        System.out.println(" |2|.- Limpieza de cocinas");
        System.out.println(" |3|.- Limpieza de sala y comedor");
        System.out.println(" |4|.- Limpieza de pisos");
        System.out.println(" |5|.- Limpieza de piscinas");
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
                break;
        }
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
                this.comprar_OFICINA();
                break;
            case 2:
                this.comprar_OFICINA_2();
                break;
            case 3:
                this.comprar_OFICINA_3();

                break;
            case 4:
                this.comprar_OFICINA_4();

                break;
            case 5:
                this.comprar_OFICINA_5();

                break;
            case 6:
                this.comprar_OFICINA_6();

                break;
            case 0:
                this.seccion_de_OFICINA_Y_ESCOLAR();
                break;
            default:
                break;
        }
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
                this.comprar_SALUD();
                break;
            case 2:
                this.comprar_SALUD_2();
                break;
            case 3:
                this.comprar_SALUD_3();
                break;
            case 4:
                this.comprar_SALUD_4();
                break;
            case 5:
                this.comprar_SALUD_5();
                break;
            case 6:
                this.comprar_SALUD_6();
                break;
            case 7:
                this.comprar_SALUD_7();
                break;
            case 0:
                this.seccion_de_SALUD_Y_DEPORTES();
                break;
            default:
                break;
        }
    }
    public void seccion_de_JARDINERIA() {
        System.out.println("----------JARDINERIA----------");
        System.out.println("""
                
                |1|- Deco jardin----------------------
                |2|- Regresar-------------------------
                |0|- Menu Principal-------------------
                """);
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
    public void DECOJARDIN(){
        System.out.println("-----DECO JARDIN-----");
        System.out.println("""
                
                |1|- macetas, maceteros y platos------
                |0|- regresar-------------------------
                """);
        opcion=ncs.nextInt();
        switch(opcion){
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
    public void Macetas_maceteros_y_platos(){
        System.out.println("JARDINERIA/Deco Jardin/Macetas, maceteros y platos");
        System.out.println("""
                        
                        |1|- Macetas--------------------------
                        |2|- Maceteros------------------------
                        |0|- Regresar-------------------------
                        """);
        opcion= ncs.nextInt();
        switch(opcion){
            case 1:
                this.comprar_MACETAS();
                break;
            case 2:
                this.comprar_MACETAS_2();
                break;
            case 3:
                this.DECOJARDIN();
                break;
        }
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
                this.comprar_MASCOTAS();
                break;
            case 2:
                this.comprar_MASCOTAS_2();
                break;
            case 3:
                this.comprar_MASCOTAS_3();
                break;
            case 4:
                this.comprar_MASCOTAS_4();
                break;
            case 5:
                this.comprar_MASCOTAS_5();
                break;
            case 6:
                this.comprar_MASCOTAS_6();
                break;
            case 7:
                this.comprar_MASCOTAS_7();
                break;
            case 0:
                this.seccion_de_MASCOTAS();
                break;
            default:
                break;
        }
    }
    public void MenuPrincipalDecohogar() {
        System.out.println("---------ORGANIZACIÓN Y DECOHOGAR-----------");
        System.out.println("Seleccione una categoría:");
        System.out.println(" 1.- Decoración");
        System.out.println(" 2.- Organización");
        System.out.println(" 3.- Productos en tendencia");
        System.out.println(" 0.- Regresar al menú principal");

        int opcion = ncs.nextInt();
        ncs.nextLine();
        switch (opcion) {
            case 1:
                this.MenuDecoracion();
                break;
            case 2:
                this.MenuOrganizacion();
                break;
            case 3:
                this.MenuTendencia();
                break;
            case 0:
                System.out.println("Regresando al menú principal...");
                break;
            default:
                System.out.println("Opción no válida.");
                this.MenuPrincipalDecohogar();
        }
    }
    public void MenuDecoracion() {
        System.out.println("-----DECORACIÓN-----");
        System.out.println("Seleccione una subcategoría:");
        System.out.println(" 1.- Espejos");
        System.out.println(" 2.- Alfombras y Tapetes");
        System.out.println(" 3.- Velas y Portavelas");
        System.out.println(" 0.- Regresar al menú anterior");
        int opcion = ncs.nextInt();
        ncs.nextLine();
        switch (opcion) {
            case 1:
                this.comprar_ESPEJOS();
                break;
            case 2:
                this.comprar_ALFOMBRAS();
                break;
            case 3:
                this.comprar_VELAS();
                break;
            case 0:
                this.MenuPrincipalDecohogar();
                break;
            default:
                System.out.println("Opción no válida.");
                this.MenuDecoracion();
        }
    }
    public void MenuOrganizacion() {
        System.out.println("-----ORGANIZACIÓN-----");
        System.out.println("Seleccione una subcategoría:");
        System.out.println(" 1.- Menaje de cocina");
        System.out.println(" 2.- Almacenamiento");
        System.out.println(" 0.- Regresar al menú anterior");
        int opcion = ncs.nextInt();
        ncs.nextLine();
        switch (opcion) {
            case 1:
                this.comprar_MENAJE();
                break;
            case 2:
                this.comprar_ALMACENAMIENTO();
                break;
            case 0:
                this.MenuPrincipalDecohogar();
                break;
            default:
                System.out.println("Opción no válida.");
                this.MenuOrganizacion();
        }
    }
    public void MenuTendencia() {
        System.out.println("-----PRODUCTOS EN TENDENCIA-----");
        System.out.println("Seleccione una subcategoría:");
        System.out.println(" 1.- Retro");
        System.out.println(" 2.- Casa de Aves");
        System.out.println(" 0.- Regresar al menú anterior");
        int opcion = ncs.nextInt();
        ncs.nextLine();
        switch (opcion) {
            case 1:
                this.comprar_RETRO();
                break;
            case 2:
                this.comprar_CASA_AVES();
                break;
            case 0:
                this.MenuPrincipalDecohogar();
                break;
            default:
                System.out.println("Opción no válida.");
                this.MenuTendencia();
        }
    }
    public void comprar_ESPEJOS(){
        System.out.println("Seleccione su PRODUCTO a comprar");
        for (int i = 0; i < productos_Espejos.size(); i++) {
            System.out.println("Opción " + (i + 1) + " : " + productos_Espejos.get(i)+"                 S/"+precio_Espejos[i]);
        }
        System.out.println("Opción 0 : regresar");
        opcion = ncs.nextInt();
        ncs.nextLine();
        if (opcion >= 1 && opcion <= productos_Espejos.size()) {
            System.out.println("¿Cuántos objetos comprará? Ingresa la cantidad");
            cantidad = ncs.nextInt();
            ncs.nextLine();
            carrito_Espejos.set(opcion - 1, carrito_Espejos.get(opcion - 1) + cantidad);
            System.out.println("Ud ha pedido " + carrito_Espejos.get(opcion - 1) + " productos de " + productos_Espejos.get(opcion - 1));
            this.OPCIONES();
        }else if(opcion==0){
            System.out.println("regresando......................................................");
            this.MenuPrincipalDecohogar();
        } else {
            System.out.println("OPCION ERRONEA");
            this.secciondecategorias();
        }
    }
    public void comprar_ALFOMBRAS(){
        System.out.println("Seleccione su PRODUCTO a comprar");
        for (int i = 0; i < productos_Alfombras.size(); i++) {
            System.out.println("Opción " + (i + 1) + " : " + productos_Alfombras.get(i)+"                 S/"+precio_Alfombras[i]);
        }
        System.out.println("Opción 0 : regresar");
        opcion = ncs.nextInt();
        ncs.nextLine();
        if (opcion >= 1 && opcion <= productos_Alfombras.size()) {
            System.out.println("¿Cuántos objetos comprará? Ingresa la cantidad");
            cantidad = ncs.nextInt();
            ncs.nextLine();
            carrito_Alfombras.set(opcion - 1, carrito_Alfombras.get(opcion - 1) + cantidad);
            System.out.println("Ud ha pedido " + carrito_Alfombras.get(opcion - 1) + " productos de " + productos_Alfombras.get(opcion - 1));
            this.OPCIONES();
        }else if(opcion==0){
            System.out.println("regresando......................................................");
            this.MenuPrincipalDecohogar();
        } else {
            System.out.println("OPCION ERRONEA");
            this.secciondecategorias();
        }
    }
    public void comprar_VELAS(){
        System.out.println("Seleccione su PRODUCTO a comprar");
        for (int i = 0; i < productos_Velas.size(); i++) {
            System.out.println("Opción " + (i + 1) + " : " + productos_Velas.get(i)+"                 S/"+precio_Velas[i]);
        }
        System.out.println("Opción 0 : regresar");
        opcion = ncs.nextInt();
        ncs.nextLine();
        if (opcion >= 1 && opcion <= productos_Velas.size()) {
            System.out.println("¿Cuántos objetos comprará? Ingresa la cantidad");
            cantidad = ncs.nextInt();
            ncs.nextLine();
            carrito_Velas.set(opcion - 1, carrito_Velas.get(opcion - 1) + cantidad);
            System.out.println("Ud ha pedido " + carrito_Velas.get(opcion - 1) + " productos de " + productos_Velas.get(opcion - 1));
            this.OPCIONES();
        }else if(opcion==0){
            System.out.println("regresando......................................................");
            this.MenuPrincipalDecohogar();
        } else {
            System.out.println("OPCION ERRONEA");
            this.secciondecategorias();
        }
    }
    public void comprar_MENAJE(){
        System.out.println("Seleccione su PRODUCTO a comprar");
        for (int i = 0; i < productos_Menaje.size(); i++) {
            System.out.println("Opción " + (i + 1) + " : " + productos_Menaje.get(i)+"                 S/"+precio_Menaje[i]);
        }
        System.out.println("Opción 0 : regresar");
        opcion = ncs.nextInt();
        ncs.nextLine();
        if (opcion >= 1 && opcion <= productos_Menaje.size()) {
            System.out.println("¿Cuántos objetos comprará? Ingresa la cantidad");
            cantidad = ncs.nextInt();
            ncs.nextLine();
            carrito_Menaje.set(opcion - 1, carrito_Menaje.get(opcion - 1) + cantidad);
            System.out.println("Ud ha pedido " + carrito_Menaje.get(opcion - 1) + " productos de " + productos_Menaje.get(opcion - 1));
            this.OPCIONES();
        }else if(opcion==0){
            System.out.println("regresando......................................................");
            this.MenuPrincipalDecohogar();
        } else {
            System.out.println("OPCION ERRONEA");
            this.secciondecategorias();
        }
    }
    public void comprar_ALMACENAMIENTO(){
        System.out.println("Seleccione su PRODUCTO a comprar");
        for (int i = 0; i < productos_Almacenamiento.size(); i++) {
            System.out.println("Opción " + (i + 1) + " : " + productos_Almacenamiento.get(i)+"                 S/"+precio_Almacenamiento[i]);
        }
        System.out.println("Opción 0 : regresar");
        opcion = ncs.nextInt();
        ncs.nextLine();
        if (opcion >= 1 && opcion <= productos_Almacenamiento.size()) {
            System.out.println("¿Cuántos objetos comprará? Ingresa la cantidad");
            cantidad = ncs.nextInt();
            ncs.nextLine();
            carrito_Almacenamiento.set(opcion - 1, carrito_Almacenamiento.get(opcion - 1) + cantidad);
            System.out.println("Ud ha pedido " + carrito_Almacenamiento.get(opcion - 1) + " productos de " + productos_Almacenamiento.get(opcion - 1));
            this.OPCIONES();
        }else if(opcion==0){
            System.out.println("regresando......................................................");
            this.MenuPrincipalDecohogar();
        } else {
            System.out.println("OPCION ERRONEA");
            this.secciondecategorias();
        }
    }
    public void comprar_RETRO(){
        System.out.println("Seleccione su PRODUCTO a comprar");
        for (int i = 0; i < productos_Espejos.size(); i++) {
            System.out.println("Opción " + (i + 1) + " : " + productos_Espejos.get(i)+"                 S/"+precio_Retro[i]);
        }
        System.out.println("Opción 0 : regresar");
        opcion = ncs.nextInt();
        ncs.nextLine();
        if (opcion >= 1 && opcion <= productos_Retro.size()) {
            System.out.println("¿Cuántos objetos comprará? Ingresa la cantidad");
            cantidad = ncs.nextInt();
            ncs.nextLine();
            carrito_Retro.set(opcion - 1, carrito_Retro.get(opcion - 1) + cantidad);
            System.out.println("Ud ha pedido " + carrito_Retro.get(opcion - 1) + " productos de " + productos_Retro.get(opcion - 1));
            this.OPCIONES();
        }else if(opcion==0){
            System.out.println("regresando......................................................");
            this.MenuPrincipalDecohogar();
        } else {
            System.out.println("OPCION ERRONEA");
            this.secciondecategorias();
        }
    }
    public void comprar_CASA_AVES(){
        System.out.println("Seleccione su PRODUCTO a comprar");
        for (int i = 0; i < productos_CasaAves.size(); i++) {
            System.out.println("Opción " + (i + 1) + " : " + productos_CasaAves.get(i)+"                 S/"+precio_CasaAves[i]);
        }
        System.out.println("Opción 0 : regresar");
        opcion = ncs.nextInt();
        ncs.nextLine();
        if (opcion >= 1 && opcion <= productos_CasaAves.size()) {
            System.out.println("¿Cuántos objetos comprará? Ingresa la cantidad");
            cantidad = ncs.nextInt();
            ncs.nextLine();
            carrito_CasaAves.set(opcion - 1, carrito_CasaAves.get(opcion - 1) + cantidad);
            System.out.println("Ud ha pedido " + carrito_Espejos.get(opcion - 1) + " productos de " + productos_CasaAves.get(opcion - 1));
            this.OPCIONES();
        }else if(opcion==0){
            System.out.println("regresando......................................................");
            this.MenuPrincipalDecohogar();
        } else {
            System.out.println("OPCION ERRONEA");
            this.secciondecategorias();
        }
    }

    public void comprar_MASCOTAS(){
        System.out.println("Seleccione su PRODUCTO a comprar");
        for (int i = 0; i < productos_MASCOTAS.size(); i++) {
            System.out.println("Opción " + (i + 1) + " : " + productos_MASCOTAS.get(i)+"                 S/"+precio_MASCOTAS[i]);
        }
        System.out.println("Opción 0 : regresar");
        opcion = ncs.nextInt();
        ncs.nextLine();
        if (opcion >= 1 && opcion <= productos_MASCOTAS.size()) {
            System.out.println("¿Cuántos objetos comprará? Ingresa la cantidad");
            cantidad = ncs.nextInt();
            ncs.nextLine();
            carrito_MASCOTAS.set(opcion - 1, carrito_MASCOTAS.get(opcion - 1) + cantidad);
            System.out.println("Ud ha pedido " + carrito_MASCOTAS.get(opcion - 1) + " productos de " + productos_MASCOTAS.get(opcion - 1));
            this.OPCIONES();
        }else if(opcion==0){
            System.out.println("regresando......................................................");
            this.PERROS();
        } else {
            System.out.println("OPCION ERRONEA");
            this.secciondecategorias();
        }
    }
    public void comprar_MASCOTAS_2(){
        System.out.println("Seleccione su PRODUCTO a comprar");
        for (int i = 0; i < productos_MASCOTAS_2.size(); i++) {
            System.out.println("Opción " + (i + 1) + " : " + productos_MASCOTAS_2.get(i)+"                 S/"+precio_MASCOTAS_2[i]);
        }
        System.out.println("Opción 0 : regresar");
        opcion = ncs.nextInt();
        ncs.nextLine();
        if (opcion >= 1 && opcion <= productos_MASCOTAS_2.size()) {
            System.out.println("¿Cuántos objetos comprará? Ingresa la cantidad");
            cantidad = ncs.nextInt();
            ncs.nextLine();
            carrito_MASCOTAS_2.set(opcion - 1, carrito_MASCOTAS_2.get(opcion - 1) + cantidad);
            System.out.println("Ud ha pedido " + carrito_MASCOTAS_2.get(opcion - 1) + " productos de " + productos_MASCOTAS_2.get(opcion - 1));
            this.OPCIONES();
        }else if(opcion==0){
            System.out.println("regresando......................................................");
            this.PERROS();
        } else {
            System.out.println("OPCION ERRONEA");
            this.secciondecategorias();
        }
    }
    public void comprar_MASCOTAS_3(){
        System.out.println("Seleccione su PRODUCTO a comprar");
        for (int i = 0; i < productos_MASCOTAS_3.size(); i++) {
            System.out.println("Opción " + (i + 1) + " : " + productos_MASCOTAS_3.get(i)+"                 S/"+precio_MASCOTAS_3[i]);
        }
        System.out.println("Opción 0 : regresar");
        opcion = ncs.nextInt();
        ncs.nextLine();
        if (opcion >= 1 && opcion <= productos_MASCOTAS_3.size()) {
            System.out.println("¿Cuántos objetos comprará? Ingresa la cantidad");
            cantidad = ncs.nextInt();
            ncs.nextLine();
            carrito_MASCOTAS_3.set(opcion - 1, carrito_MASCOTAS_3.get(opcion - 1) + cantidad);
            System.out.println("Ud ha pedido " + carrito_MASCOTAS_3.get(opcion - 1) + " productos de " + productos_MASCOTAS_3.get(opcion - 1));
            this.OPCIONES();
        }else if(opcion==0){
            System.out.println("regresando......................................................");
            this.PERROS();
        } else {
            System.out.println("OPCION ERRONEA");
            this.secciondecategorias();
        }
    }
    public void comprar_MASCOTAS_4(){
        System.out.println("Seleccione su PRODUCTO a comprar");
        for (int i = 0; i < productos_MASCOTAS_4.size(); i++) {
            System.out.println("Opción " + (i + 1) + " : " + productos_MASCOTAS_2.get(i)+"                 S/"+precio_MASCOTAS_4[i]);
        }
        System.out.println("Opción 0 : regresar");
        opcion = ncs.nextInt();
        ncs.nextLine();
        if (opcion >= 1 && opcion <= productos_MASCOTAS_4.size()) {
            System.out.println("¿Cuántos objetos comprará? Ingresa la cantidad");
            cantidad = ncs.nextInt();
            ncs.nextLine();
            carrito_MASCOTAS_4.set(opcion - 1, carrito_MASCOTAS_4.get(opcion - 1) + cantidad);
            System.out.println("Ud ha pedido " + carrito_MASCOTAS_4.get(opcion - 1) + " productos de " + productos_MASCOTAS_4.get(opcion - 1));
            this.OPCIONES();
        }else if(opcion==0){
            System.out.println("regresando......................................................");
            this.PERROS();
        } else {
            System.out.println("OPCION ERRONEA");
            this.secciondecategorias();
        }
    }
    public void comprar_MASCOTAS_5(){
        System.out.println("Seleccione su PRODUCTO a comprar");
        for (int i = 0; i < productos_MASCOTAS_5.size(); i++) {
            System.out.println("Opción " + (i + 1) + " : " + productos_MASCOTAS_5.get(i)+"                 S/"+precio_MASCOTAS_5[i]);
        }
        System.out.println("Opción 0 : regresar");
        opcion = ncs.nextInt();
        ncs.nextLine();
        if (opcion >= 1 && opcion <= productos_MASCOTAS_5.size()) {
            System.out.println("¿Cuántos objetos comprará? Ingresa la cantidad");
            cantidad = ncs.nextInt();
            ncs.nextLine();
            carrito_MASCOTAS_5.set(opcion - 1, carrito_MASCOTAS_5.get(opcion - 1) + cantidad);
            System.out.println("Ud ha pedido " + carrito_MASCOTAS_5.get(opcion - 1) + " productos de " + productos_MASCOTAS_5.get(opcion - 1));
            this.OPCIONES();
        }else if(opcion==0){
            System.out.println("regresando......................................................");
            this.PERROS();
        } else {
            System.out.println("OPCION ERRONEA");
            this.secciondecategorias();
        }
    }
    public void comprar_MASCOTAS_6(){
        System.out.println("Seleccione su PRODUCTO a comprar");
        for (int i = 0; i < productos_MASCOTAS_6.size(); i++) {
            System.out.println("Opción " + (i + 1) + " : " + productos_MASCOTAS_6.get(i)+"                 S/"+precio_MASCOTAS_6[i]);
        }
        System.out.println("Opción 0 : regresar");
        opcion = ncs.nextInt();
        ncs.nextLine();
        if (opcion >= 1 && opcion <= productos_MASCOTAS_6.size()) {
            System.out.println("¿Cuántos objetos comprará? Ingresa la cantidad");
            cantidad = ncs.nextInt();
            ncs.nextLine();
            carrito_MASCOTAS_6.set(opcion - 1, carrito_MASCOTAS_6.get(opcion - 1) + cantidad);
            System.out.println("Ud ha pedido " + carrito_MASCOTAS_6.get(opcion - 1) + " productos de " + productos_MASCOTAS_6.get(opcion - 1));
            this.OPCIONES();
        }else if(opcion==0){
            System.out.println("regresando......................................................");
            this.PERROS();
        } else {
            System.out.println("OPCION ERRONEA");
            this.secciondecategorias();
        }
    }
    public void comprar_MASCOTAS_7(){
        System.out.println("Seleccione su PRODUCTO a comprar");
        for (int i = 0; i < productos_MASCOTAS_7.size(); i++) {
            System.out.println("Opción " + (i + 1) + " : " + productos_MASCOTAS_7.get(i)+"                 S/"+precio_MASCOTAS_7[i]);
        }
        System.out.println("Opción 0 : regresar");
        opcion = ncs.nextInt();
        ncs.nextLine();
        if (opcion >= 1 && opcion <= productos_MASCOTAS_7.size()) {
            System.out.println("¿Cuántos objetos comprará? Ingresa la cantidad");
            cantidad = ncs.nextInt();
            ncs.nextLine();
            carrito_MASCOTAS_7.set(opcion - 1, carrito_MASCOTAS_7.get(opcion - 1) + cantidad);
            System.out.println("Ud ha pedido " + carrito_MASCOTAS_7.get(opcion - 1) + " productos de " + productos_MASCOTAS_7.get(opcion - 1));
            this.OPCIONES();
        }else if(opcion==0){
            System.out.println("regresando......................................................");
            this.PERROS();
        } else {
            System.out.println("OPCION ERRONEA");
            this.secciondecategorias();
        }
    }

    //------------------------------------------------------------------------------------------------------------------
    public void comprar_MACETAS(){
        System.out.println("Seleccione su PRODUCTO a comprar");
        for (int i = 0; i < productos_JARDINERIA.size(); i++) {
            System.out.println("Opción " + (i + 1) + " : " + productos_JARDINERIA.get(i)+"                 S/"+precio_JARDINERIA[i]);
        }
        System.out.println("Opción 0 : regresar");
        opcion = ncs.nextInt();
        ncs.nextLine();
        if (opcion >= 1 && opcion <= productos_JARDINERIA.size()) {
            System.out.println("¿Cuántos objetos comprará? Ingresa la cantidad");
            cantidad = ncs.nextInt();
            ncs.nextLine();
            carrito_JARDINERIA.set(opcion - 1, carrito_JARDINERIA.get(opcion - 1) + cantidad);
            System.out.println("Ud ha pedido " + carrito_JARDINERIA.get(opcion - 1) + " productos de " + productos_JARDINERIA.get(opcion - 1));
            this.OPCIONES();
        }else if(opcion==0){
            System.out.println("regresando......................................................");
            this.Macetas_maceteros_y_platos();
        } else {
            System.out.println("OPCION ERRONEA");
            this.secciondecategorias();
        }
    }
    public void comprar_MACETAS_2(){
        System.out.println("Seleccione su PRODUCTO a comprar");
        for (int i = 0; i < productos_JARDINERIA_2.size(); i++) {
            System.out.println("Opción " + (i + 1) + " : " + productos_JARDINERIA_2.get(i)+"                 S/"+precio_JARDINERIA_2[i]);
        }
        System.out.println("Opción 0 : regresar");
        opcion = ncs.nextInt();
        ncs.nextLine();
        if (opcion >= 1 && opcion <= productos_JARDINERIA_2.size()) {
            System.out.println("¿Cuántos objetos comprará? Ingresa la cantidad");
            cantidad = ncs.nextInt();
            ncs.nextLine();
            carrito_JARDINERIA_2.set(opcion - 1, carrito_JARDINERIA_2.get(opcion - 1) + cantidad);
            System.out.println("Ud ha pedido " + carrito_JARDINERIA_2.get(opcion - 1) + " productos de " + productos_JARDINERIA_2.get(opcion - 1));
            this.OPCIONES();
        }else if(opcion==0){
            System.out.println("regresando......................................................");
            this.Macetas_maceteros_y_platos();
        } else {
            System.out.println("OPCION ERRONEA");
            this.secciondecategorias();
        }
    }
    public void comprar_SALUD(){
        System.out.println("Seleccione su PRODUCTO a comprar");
        for (int i = 0; i < productos_SALUD.size(); i++) {
            System.out.println("Opción " + (i + 1) + " : " + productos_SALUD.get(i)+"                 S/"+precio_SALUD[i]);
        }
        System.out.println("Opción 0 : regresar");
        opcion = ncs.nextInt();
        ncs.nextLine();
        if (opcion >= 1 && opcion <= productos_SALUD.size()) {
            System.out.println("¿Cuántos objetos comprará? Ingresa la cantidad");
            cantidad = ncs.nextInt();
            ncs.nextLine();
            carrito_SALUD.set(opcion - 1, carrito_SALUD.get(opcion - 1) + cantidad);
            System.out.println("Ud ha pedido " + carrito_SALUD.get(opcion - 1) + " productos de " + productos_SALUD.get(opcion - 1));
            this.OPCIONES();
        }else if(opcion==0){
            System.out.println("regresando......................................................");
            this.CUIDADO_DELA_SALUD();
        } else {
            System.out.println("OPCION ERRONEA");
            this.secciondecategorias();
        }
    }
    public void comprar_SALUD_2(){
        System.out.println("Seleccione su PRODUCTO a comprar");
        for (int i = 0; i < productos_SALUD_2.size(); i++) {
            System.out.println("Opción " + (i + 1) + " : " + productos_SALUD_2.get(i)+"                 S/"+precio_SALUD_2[i]);
        }
        System.out.println("Opción 0 : regresar");
        opcion = ncs.nextInt();
        ncs.nextLine();
        if (opcion >= 1 && opcion <= productos_SALUD_2.size()) {
            System.out.println("¿Cuántos objetos comprará? Ingresa la cantidad");
            cantidad = ncs.nextInt();
            ncs.nextLine();
            carrito_SALUD_2.set(opcion - 1, carrito_SALUD_2.get(opcion - 1) + cantidad);
            System.out.println("Ud ha pedido " + carrito_SALUD_2.get(opcion - 1) + " productos de " + productos_SALUD_2.get(opcion - 1));
            this.OPCIONES();
        }else if(opcion==0){
            System.out.println("regresando......................................................");
            this.CUIDADO_DELA_SALUD();
        } else {
            System.out.println("OPCION ERRONEA");
            this.secciondecategorias();
        }

    }
    public void comprar_SALUD_3(){
        System.out.println("Seleccione su PRODUCTO a comprar");
        for (int i = 0; i < productos_SALUD_3.size(); i++) {
            System.out.println("Opción " + (i + 1) + " : " + productos_SALUD_3.get(i)+"                 S/"+precio_SALUD_3[i]);
        }
        System.out.println("Opción 0 : regresar");
        opcion = ncs.nextInt();
        ncs.nextLine();
        if (opcion >= 1 && opcion <= productos_SALUD_3.size()) {
            System.out.println("¿Cuántos objetos comprará? Ingresa la cantidad");
            cantidad = ncs.nextInt();
            ncs.nextLine();
            carrito_SALUD_3.set(opcion - 1, carrito_SALUD_3.get(opcion - 1) + cantidad);
            System.out.println("Ud ha pedido " + carrito_SALUD_3.get(opcion - 1) + " productos de " + productos_SALUD_3.get(opcion - 1));
            this.OPCIONES();
        }else if(opcion==0){
            System.out.println("regresando......................................................");
            this.CUIDADO_DELA_SALUD();
        } else {
            System.out.println("OPCION ERRONEA");
            this.secciondecategorias();
        }

    }
    public void comprar_SALUD_4(){
        System.out.println("Seleccione su PRODUCTO a comprar");
        for (int i = 0; i < productos_SALUD_4.size(); i++) {
            System.out.println("Opción " + (i + 1) + " : " + productos_SALUD_4.get(i)+"                 S/"+precio_SALUD_4[i]);
        }
        System.out.println("Opción 0 : regresar");
        opcion = ncs.nextInt();
        ncs.nextLine();
        if (opcion >= 1 && opcion <= productos_SALUD_4.size()) {
            System.out.println("¿Cuántos objetos comprará? Ingresa la cantidad");
            cantidad = ncs.nextInt();
            ncs.nextLine();
            carrito_SALUD_4.set(opcion - 1, carrito_SALUD_4.get(opcion - 1) + cantidad);
            System.out.println("Ud ha pedido " + carrito_SALUD_4.get(opcion - 1) + " productos de " + productos_SALUD_4.get(opcion - 1));
            this.OPCIONES();
        }else if(opcion==0){
            System.out.println("regresando......................................................");
            this.CUIDADO_DELA_SALUD();
        } else {
            System.out.println("OPCION ERRONEA");
            this.secciondecategorias();
        }

    }
    public void comprar_SALUD_5(){
        System.out.println("Seleccione su PRODUCTO a comprar");
        for (int i = 0; i < productos_SALUD_5.size(); i++) {
            System.out.println("Opción " + (i + 1) + " : " + productos_SALUD_5.get(i)+"                 S/"+precio_SALUD_5[i]);
        }
        System.out.println("Opción 0 : regresar");
        opcion = ncs.nextInt();
        ncs.nextLine();
        if (opcion >= 1 && opcion <= productos_SALUD_5.size()) {
            System.out.println("¿Cuántos objetos comprará? Ingresa la cantidad");
            cantidad = ncs.nextInt();
            ncs.nextLine();
            carrito_SALUD_5.set(opcion - 1, carrito_SALUD_5.get(opcion - 1) + cantidad);
            System.out.println("Ud ha pedido " + carrito_SALUD_5.get(opcion - 1) + " productos de " + productos_SALUD_5.get(opcion - 1));
            this.OPCIONES();
        }else if(opcion==0){
            System.out.println("regresando......................................................");
            this.CUIDADO_DELA_SALUD();
        } else {
            System.out.println("OPCION ERRONEA");
            this.secciondecategorias();
        }

    }
    public void comprar_SALUD_6(){
        System.out.println("Seleccione su PRODUCTO a comprar");
        for (int i = 0; i < productos_SALUD_6.size(); i++) {
            System.out.println("Opción " + (i + 1) + " : " + productos_SALUD_6.get(i)+"                 S/"+precio_SALUD_6[i]);
        }
        System.out.println("Opción 0 : regresar");
        opcion = ncs.nextInt();
        ncs.nextLine();
        if (opcion >= 1 && opcion <= productos_SALUD_6.size()) {
            System.out.println("¿Cuántos objetos comprará? Ingresa la cantidad");
            cantidad = ncs.nextInt();
            ncs.nextLine();
            carrito_SALUD_6.set(opcion - 1, carrito_SALUD_6.get(opcion - 1) + cantidad);
            System.out.println("Ud ha pedido " + carrito_SALUD_6.get(opcion - 1) + " productos de " + productos_SALUD_6.get(opcion - 1));
            this.OPCIONES();
        }else if(opcion==0){
            System.out.println("regresando......................................................");
            this.CUIDADO_DELA_SALUD();
        } else {
            System.out.println("OPCION ERRONEA");
            this.secciondecategorias();
        }

    }
    public void comprar_SALUD_7(){
        System.out.println("Seleccione su PRODUCTO a comprar");
        for (int i = 0; i < productos_SALUD_7.size(); i++) {
            System.out.println("Opción " + (i + 1) + " : " + productos_SALUD_7.get(i)+"                 S/"+precio_SALUD_7[i]);
        }
        System.out.println("Opción 0 : regresar");
        opcion = ncs.nextInt();
        ncs.nextLine();
        if (opcion >= 1 && opcion <= productos_SALUD_7.size()) {
            System.out.println("¿Cuántos objetos comprará? Ingresa la cantidad");
            cantidad = ncs.nextInt();
            ncs.nextLine();
            carrito_SALUD_7.set(opcion - 1, carrito_SALUD_7.get(opcion - 1) + cantidad);
            System.out.println("Ud ha pedido " + carrito_SALUD_7.get(opcion - 1) + " productos de " + productos_SALUD_7.get(opcion - 1));
            this.OPCIONES();
        }else if(opcion==0){
            System.out.println("regresando......................................................");
            this.CUIDADO_DELA_SALUD();
        } else {
            System.out.println("OPCION ERRONEA");
            this.secciondecategorias();
        }

    }


    public void comprar_OFICINA(){
        System.out.println("Seleccione su PRODUCTO a comprar");
        for (int i = 0; i < productos_OFICINA.size(); i++) {
            System.out.println("Opción " + (i + 1) + " : " + productos_OFICINA.get(i)+"                 S/"+precio_OFICINA[i]);
        }
        System.out.println("Opción 0 : regresar");
        opcion = ncs.nextInt();
        ncs.nextLine();
        if (opcion >= 1 && opcion <= productos_OFICINA.size()) {
            System.out.println("¿Cuántos objetos comprará? Ingresa la cantidad");
            cantidad = ncs.nextInt();
            ncs.nextLine();
            carrito_OFICINA.set(opcion - 1, carrito_OFICINA.get(opcion - 1) + cantidad);
            System.out.println("Ud ha pedido " + carrito_OFICINA.get(opcion - 1) + " productos de " + productos_OFICINA.get(opcion - 1));
            this.OPCIONES();
        }else if(opcion==0){
            System.out.println("regresando......................................................");
            this.UTILES_DE_ESCRITORIO_Y_OFICNA();
        } else {
            System.out.println("OPCION ERRONEA");
            this.secciondecategorias();
        }
    }
    public void comprar_OFICINA_2(){
        System.out.println("Seleccione su PRODUCTO a comprar");
        for (int i = 0; i < productos_OFICINA_2.size(); i++) {
            System.out.println("Opción " + (i + 1) + " : " + productos_OFICINA_2.get(i)+"                 S/"+precio_OFICINA_2[i]);
        }
        opcion = ncs.nextInt();
        ncs.nextLine();
        if (opcion >= 1 && opcion <= productos_OFICINA_2.size()) {
            System.out.println("¿Cuántos objetos comprará? Ingresa la cantidad");
            cantidad = ncs.nextInt();
            ncs.nextLine();
            carrito_OFICINA_2.set(opcion - 1, carrito_OFICINA_2.get(opcion - 1) + cantidad);
            System.out.println("Ud ha pedido " + carrito_OFICINA_2.get(opcion - 1) + " productos de " + productos_OFICINA_2.get(opcion - 1));
            this.OPCIONES();
        }else if(opcion==0){
            System.out.println("regresando......................................................");
            this.UTILES_DE_ESCRITORIO_Y_OFICNA();
        } else {
            System.out.println("OPCION ERRONEA");
            this.secciondecategorias();
        }
    }
    public void comprar_OFICINA_3(){
        System.out.println("Seleccione su PRODUCTO a comprar");
        for (int i = 0; i < productos_OFICINA_3.size(); i++) {
            System.out.println("Opción " + (i + 1) + " : " + productos_OFICINA_3.get(i)+"                 S/"+precio_OFICINA_3[i]);
        }
        opcion = ncs.nextInt();
        ncs.nextLine();
        if (opcion >= 1 && opcion <= productos_OFICINA_3.size()) {
            System.out.println("¿Cuántos objetos comprará? Ingresa la cantidad");
            cantidad = ncs.nextInt();
            ncs.nextLine();
            carrito_OFICINA_3.set(opcion - 1, carrito_OFICINA_3.get(opcion - 1) + cantidad);
            System.out.println("Ud ha pedido " + carrito_OFICINA_3.get(opcion - 1) + " productos de " + productos_OFICINA_3.get(opcion - 1));
            this.OPCIONES();
        }else if(opcion==0){
            System.out.println("regresando......................................................");
            this.UTILES_DE_ESCRITORIO_Y_OFICNA();
        } else {
            System.out.println("OPCION ERRONEA");
            this.secciondecategorias();
        }
    }
    public void comprar_OFICINA_4(){
        System.out.println("Seleccione su PRODUCTO a comprar");
        for (int i = 0; i < productos_OFICINA_4.size(); i++) {
            System.out.println("Opción " + (i + 1) + " : " + productos_OFICINA_4.get(i)+"                 S/"+precio_OFICINA_4[i]);
        }
        opcion = ncs.nextInt();
        ncs.nextLine();
        if (opcion >= 1 && opcion <= productos_OFICINA_4.size()) {
            System.out.println("¿Cuántos objetos comprará? Ingresa la cantidad");
            cantidad = ncs.nextInt();
            ncs.nextLine();
            carrito_OFICINA_4.set(opcion - 1, carrito_OFICINA_4.get(opcion - 1) + cantidad);
            System.out.println("Ud ha pedido " + carrito_OFICINA_4.get(opcion - 1) + " productos de " + productos_OFICINA_4.get(opcion - 1));
            this.OPCIONES();
        }else if(opcion==0){
            System.out.println("regresando......................................................");
            this.UTILES_DE_ESCRITORIO_Y_OFICNA();
        } else {
            System.out.println("OPCION ERRONEA");
            this.secciondecategorias();
        }
    }
    public void comprar_OFICINA_5(){
        System.out.println("Seleccione su PRODUCTO a comprar");
        for (int i = 0; i < productos_OFICINA_5.size(); i++) {
            System.out.println("Opción " + (i + 1) + " : " + productos_OFICINA_5.get(i)+"                 S/"+precio_OFICINA_5[i]);
        }
        opcion = ncs.nextInt();
        ncs.nextLine();
        if (opcion >= 1 && opcion <= productos_OFICINA.size()) {
            System.out.println("¿Cuántos objetos comprará? Ingresa la cantidad");
            cantidad = ncs.nextInt();
            ncs.nextLine();
            carrito_OFICINA_5.set(opcion - 1, carrito_OFICINA_5.get(opcion - 1) + cantidad);
            System.out.println("Ud ha pedido " + carrito_OFICINA_5.get(opcion - 1) + " productos de " + productos_OFICINA_5.get(opcion - 1));
            this.OPCIONES();
        }else if(opcion==0){
            System.out.println("regresando......................................................");
            this.UTILES_DE_ESCRITORIO_Y_OFICNA();
        } else {
            System.out.println("OPCION ERRONEA");
            this.secciondecategorias();
        }
    }
    public void comprar_OFICINA_6(){
        System.out.println("Seleccione su PRODUCTO a comprar");
        for (int i = 0; i < productos_OFICINA_6.size(); i++) {
            System.out.println("Opción " + (i + 1) + " : " + productos_OFICINA_6.get(i)+"                 S/"+precio_OFICINA_6[i]);
        }
        opcion = ncs.nextInt();
        ncs.nextLine();
        if (opcion >= 1 && opcion <= productos_OFICINA_6.size()) {
            System.out.println("¿Cuántos objetos comprará? Ingresa la cantidad");
            cantidad = ncs.nextInt();
            ncs.nextLine();
            carrito_OFICINA_6.set(opcion - 1, carrito_OFICINA_6.get(opcion - 1) + cantidad);
            System.out.println("Ud ha pedido " + carrito_OFICINA_6.get(opcion - 1) + " productos de " + productos_OFICINA_6.get(opcion - 1));
            this.OPCIONES();
        }else if(opcion==0){
            System.out.println("regresando......................................................");
            this.UTILES_DE_ESCRITORIO_Y_OFICNA();
        } else {
            System.out.println("OPCION ERRONEA");
            this.secciondecategorias();
        }
    }



    public void Comprar_DOMITORIO() {
        System.out.println("Seleccione su PRODUCTO a comprar");
        for (int i = 0; i < productos_DORMITORIO.size(); i++) {
            System.out.println("Opción " + (i + 1) + " : " + productos_DORMITORIO.get(i)+"                 S/"+precio_DORMITORIO[i]);
        }
        opcion = ncs.nextInt();
        ncs.nextLine();
        if (opcion >= 1 && opcion <= productos_DORMITORIO.size()) {
            System.out.println("¿Cuántos objetos comprará? Ingresa la cantidad");
            cantidad = ncs.nextInt();
            ncs.nextLine();
            carrito_DORMITORIO.set(opcion - 1, carrito_DORMITORIO.get(opcion - 1) + cantidad);
            System.out.println("Ud ha pedido " + carrito_DORMITORIO.get(opcion - 1) + " productos de " + productos_DORMITORIO.get(opcion - 1));
            this.OPCIONES();
        } else {
            System.out.println("OPCION ERRONEA");
            this.secciondecategorias();
        }
    }


    public void Comprar_DOMITORIO_2() {
        System.out.println("Seleccione su PRODUCTO a comprar");
        //--------------------------

        for (int i = 0; i < productos_DORMITORIO_2.size(); i++) {
            System.out.println("Opción " + (i + 1) + " : " + productos_DORMITORIO_2.get(i)+"                 S/"+precio_DORMITORIO_2[i]);
        }
        opcion = ncs.nextInt();
        ncs.nextLine();
        if (opcion >= 1 && opcion <= productos_DORMITORIO_2.size()) {
            System.out.println("¿Cuántos objetos comprará? Ingresa la cantidad");
            cantidad = ncs.nextInt();
            ncs.nextLine();
            carrito_DORMITORIO_2.set(opcion - 1, carrito_DORMITORIO_2.get(opcion - 1) + cantidad);
            System.out.println("Ud ha pedido " + carrito_DORMITORIO_2.get(opcion - 1) + " productos de " + productos_DORMITORIO_2.get(opcion - 1));
            this.OPCIONES();
        } else {
            System.out.println("OPCION ERRONEA");
            this.secciondecategorias();
        }

    }



    //LIMPIEZA----------------------------------------------------------------------------------------------------------
    public void ComprarLimpieza1() {
        for (int i = 0; i < Limpieza1.size(); i++) {
            System.out.println("Opción " + (i + 1) + " : " + Limpieza1.get(i)+"                 S/"+precio1[i]);
        }
        opcion = ncs.nextInt();
        ncs.nextLine();
        if (opcion >= 1 && opcion <= Limpieza1.size()) {
            System.out.println("¿Cuántos objetos comprará? Ingresa la cantidad");
            cantidad = ncs.nextInt();
            ncs.nextLine();
            carrito_limpieza1.set(opcion - 1, carrito_limpieza1.get(opcion - 1) + cantidad);
            System.out.println("Ud ha pedido " + carrito_limpieza1.get(opcion - 1) + " productos de " + Limpieza1.get(opcion - 1));
            this.OPCIONES();
        } else {
            System.out.println("OPCION ERRONEA");
            this.secciondecategorias();
        }
    }
    public void ComprarLimpieza2() {
        for (int i = 0; i < Limpieza2.size(); i++) {
            System.out.println("Opción " + (i + 1) + " : " + Limpieza2.get(i)+"                 S/"+precio2[i]);
        }
        opcion = ncs.nextInt();
        ncs.nextLine();
        if (opcion >= 1 && opcion <= Limpieza2.size()) {
            System.out.println("¿Cuántos comprará? Ingrese la cantidad");
            cantidad = ncs.nextInt();
            ncs.nextLine();
            carrito_limpieza2.set(opcion - 1, carrito_limpieza2.get(opcion - 1) + cantidad);
            System.out.println("Ud ha pedido " + carrito_limpieza2.get(opcion - 1) + " productos de " + Limpieza2.get(opcion - 1));
            this.OPCIONES();
        } else {
            System.out.println("Opción no válida");
            this.secciondecategorias();
        }
    }
    public void ComprarLimpieza3() {
        for (int i = 0; i < Limpieza3.size(); i++) {
            System.out.println("Opción " + (i + 1) + " : " + Limpieza3.get(i)+"                 S/"+precio3[i]);
        }
        opcion = ncs.nextInt();
        ncs.nextLine();
        if (opcion >= 1 && opcion <= Limpieza3.size()) {
            System.out.println("¿Cuántos comprará? Ingrese la cantidad");
            cantidad = ncs.nextInt();
            ncs.nextLine();
            carrito_limpieza3.set(opcion - 1, carrito_limpieza3.get(opcion - 1) + cantidad);
            System.out.println("Ud ha pedido " + carrito_limpieza3.get(opcion - 1) + " productos de " + Limpieza3.get(opcion - 1));
            this.OPCIONES();
        } else {
            System.out.println("Opción no válida");
            this.secciondecategorias();
        }
    }
    public void ComprarLimpieza4() {
        for (int i = 0; i < Limpieza4.size(); i++) {
            System.out.println("Opción " + (i + 1) + " : " + Limpieza4.get(i)+"                 S/"+precio4[i]);
        }
        opcion = ncs.nextInt();
        ncs.nextLine();
        if (opcion >= 1 && opcion <= Limpieza4.size()) {
            System.out.println("¿Cuántos comprará? Ingrese la cantidad");
            cantidad = ncs.nextInt();
            ncs.nextLine();
            carrito_limpieza4.set(opcion - 1, carrito_limpieza4.get(opcion - 1) + cantidad);
            System.out.println("Ud ha pedido " + carrito_limpieza4.get(opcion - 1) + " productos de " + Limpieza4.get(opcion - 1));
            this.OPCIONES();
        } else {
            System.out.println("Opción no válida");
            this.secciondecategorias();
        }
    }
    public void ComprarLimpieza5() {
        for (int i = 0; i < Limpieza5.size(); i++) {
            System.out.println("Opción " + (i + 1) + " : " + Limpieza5.get(i)+"                 S/"+precio5[i]);
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
            this.OPCIONES();
        } else {
            System.out.println("Opción no válida");
            this.secciondecategorias();
        }
    }

    public double pagometodo() {
        this.Pagos();
        System.out.println("Elige el método de pago:");
        System.out.println("|1| Pago en efectivo");
        System.out.println("|2| Pago con tarjeta");
        System.out.println("|3|  menu principal");
        int metodoPago = ncs.nextInt();
        ncs.nextLine();

        if (metodoPago == 1) {
            System.out.println("INGRESA EL PAGO EN EFECTIVO");
            int pago = ncs.nextInt();
            if (pago == totalpagar) {
                System.out.println("*************************************");
                System.out.println("*           G R A C I A S           *");
                System.out.println("*       POR COMPRAR EN PROMART!     *");
                System.out.println("*************************************");
                this.ImprimirBoleta();
                System.exit(0);

            } else if (pago < totalpagar) {
                double cantidadfaltante = totalpagar - pago;
                System.out.println("FALTA " + cantidadfaltante);
                System.out.println("AGREGA LOS " + cantidadfaltante + " o DEVUELVE LOS PRODUCTOS");
                int pagofinalFaltante = ncs.nextInt();
                if (pagofinalFaltante == cantidadfaltante) {
                    System.out.println("*************************************");
                    System.out.println("*           G R A C I A S           *");
                    System.out.println("*       POR COMPRAR EN PROMART!     *");
                    System.out.println("*************************************");
                    System.out.println("***************");
                    this.ImprimirBoleta();
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
                System.out.println("*************************************");
                System.out.println("*           G R A C I A S           *");
                System.out.println("*       POR COMPRAR EN PROMART!     *");
                System.out.println("*************************************");
                this.ImprimirBoleta();

            }
            else {
                System.out.println("opcion no validfa");
            }
        }
        else if (metodoPago == 2) {
            System.out.println("INGRESA LOS DATOS DE TU TARJETA:");
            System.out.println("Número de tarjeta que este tenga 16 digitos:");
            String numeroTarjeta = ncs.nextLine();
            System.out.println("Fecha de expiración (MM/AA):");
            String fechaExpiracion = ncs.nextLine();
            System.out.println("Código de seguridad (CVV):");
            String codigoSeguridad = ncs.nextLine();


            if (numeroTarjeta.length() == 16 && fechaExpiracion.matches("\\d{2}/\\d{2}") && codigoSeguridad.length() == 3) {
                System.out.println("Los datos de la tarjeta son válidos.");
                System.out.println("Pago procesado con éxito.");
                System.out.println("*************************************");
                System.out.println("*           G R A C I A S           *");
                System.out.println("*       POR COMPRAR EN PROMART!     *");
                System.out.println("*************************************");
                this.ImprimirBoleta();
                System.exit(0);
            } else {
                System.out.println("Los datos de la tarjeta no son válidos. Intenta de nuevo.");
                this.pagometodo();
            }
        } else if (metodoPago == 3) {
            this.secciondecategorias();
        }
        else {
            System.out.println("Método de pago no válido. Por favor, elige una opción válida.");
            this.pagometodo();
        }

        return totalpagar;
    }
    public double Pagos() {
        double cantidadTotal = 0;
        System.out.println("----BOLETA DE VENTA---------");
        System.out.println("CANTIDAD\tDESCRIPCIÓN\t\tTOTAL");

        //NICOL
        for (int i = 0; i < productos_Espejos.size(); i++) {
            int cantidad = carrito_Espejos.get(i);
            if (cantidad > 0) {
                double total = cantidad * precio_Espejos[i];
                System.out.printf("%d\t\t%s\t\t%.2f\n", cantidad, productos_Espejos.get(i), total);
                cantidadTotal += total;
            }
        }
        for (int i = 0; i < productos_Alfombras.size(); i++) {
            int cantidad = carrito_Alfombras.get(i);
            if (cantidad > 0) {
                double total = cantidad * precio_Alfombras[i];
                System.out.printf("%d\t\t%s\t\t%.2f\n", cantidad, productos_Alfombras.get(i), total);
                cantidadTotal += total;
            }
        }
        for (int i = 0; i < productos_Velas.size(); i++) {
            int cantidad = carrito_Velas.get(i);
            if (cantidad > 0) {
                double total = cantidad * precio_Velas[i];
                System.out.printf("%d\t\t%s\t\t%.2f\n", cantidad, productos_Velas.get(i), total);
                cantidadTotal += total;
            }
        }
        for (int i = 0; i < productos_Menaje.size(); i++) {
            int cantidad = carrito_Menaje.get(i);
            if (cantidad > 0) {
                double total = cantidad * precio_Menaje[i];
                System.out.printf("%d\t\t%s\t\t%.2f\n", cantidad, productos_Menaje.get(i), total);
                cantidadTotal += total;
            }
        }
        for (int i = 0; i < productos_Almacenamiento.size(); i++) {
            int cantidad = carrito_Almacenamiento.get(i);
            if (cantidad > 0) {
                double total = cantidad * precio_Almacenamiento[i];
                System.out.printf("%d\t\t%s\t\t%.2f\n", cantidad, productos_Almacenamiento.get(i), total);
                cantidadTotal += total;
            }
        }
        for (int i = 0; i < productos_Retro.size(); i++) {
            int cantidad = carrito_Retro.get(i);
            if (cantidad > 0) {
                double total = cantidad * precio_Retro[i];
                System.out.printf("%d\t\t%s\t\t%.2f\n", cantidad, productos_Retro.get(i), total);
                cantidadTotal += total;
            }
        }
        for (int i = 0; i < productos_CasaAves.size(); i++) {
            int cantidad = carrito_CasaAves.get(i);
            if (cantidad > 0) {
                double total = cantidad * precio_CasaAves[i];
                System.out.printf("%d\t\t%s\t\t%.2f\n", cantidad, productos_CasaAves.get(i), total);
                cantidadTotal += total;
            }
        }


        //MASCOTAS
        for (int i = 0; i < productos_MASCOTAS.size(); i++) {
            int cantidad = carrito_MASCOTAS.get(i);
            if (cantidad > 0) {
                double total = cantidad * precio_MASCOTAS[i];
                System.out.printf("%d\t\t%s\t\t%.2f\n", cantidad, productos_MASCOTAS.get(i), total);
                cantidadTotal += total;
            }
        }
        for (int i = 0; i < productos_MASCOTAS_2.size(); i++) {
            int cantidad = carrito_MASCOTAS_2.get(i);
            if (cantidad > 0) {
                double total = cantidad * precio_MASCOTAS_2[i];
                System.out.printf("%d\t\t%s\t\t%.2f\n", cantidad, productos_MASCOTAS_2.get(i), total);
                cantidadTotal += total;
            }
        }
        for (int i = 0; i < productos_MASCOTAS_3.size(); i++) {
            int cantidad = carrito_MASCOTAS_3.get(i);
            if (cantidad > 0) {
                double total = cantidad * precio_MASCOTAS_3[i];
                System.out.printf("%d\t\t%s\t\t%.2f\n", cantidad, productos_MASCOTAS_3.get(i), total);
                cantidadTotal += total;
            }
        }
        for (int i = 0; i < productos_MASCOTAS_4.size(); i++) {
            int cantidad = carrito_MASCOTAS_4.get(i);
            if (cantidad > 0) {
                double total = cantidad * precio_MASCOTAS_4[i];
                System.out.printf("%d\t\t%s\t\t%.2f\n", cantidad, productos_MASCOTAS_4.get(i), total);
                cantidadTotal += total;
            }
        }
        for (int i = 0; i < productos_MASCOTAS_5.size(); i++) {
            int cantidad = carrito_MASCOTAS_5.get(i);
            if (cantidad > 0) {
                double total = cantidad * precio_MASCOTAS_5[i];
                System.out.printf("%d\t\t%s\t\t%.2f\n", cantidad, productos_MASCOTAS_5.get(i), total);
                cantidadTotal += total;
            }
        }
        for (int i = 0; i < productos_MASCOTAS_6.size(); i++) {
            int cantidad = carrito_MASCOTAS_6.get(i);
            if (cantidad > 0) {
                double total = cantidad * precio_MASCOTAS_6[i];
                System.out.printf("%d\t\t%s\t\t%.2f\n", cantidad, productos_MASCOTAS_6.get(i), total);
                cantidadTotal += total;
            }
        }
        for (int i = 0; i < productos_MASCOTAS_7.size(); i++) {
            int cantidad = carrito_MASCOTAS_7.get(i);
            if (cantidad > 0) {
                double total = cantidad * precio_MASCOTAS_7[i];
                System.out.printf("%d\t\t%s\t\t%.2f\n", cantidad, productos_MASCOTAS_7.get(i), total);
                cantidadTotal += total;
            }
        }

        //JARDINERIA
        for (int i = 0; i < productos_JARDINERIA.size(); i++) {
            int cantidad = carrito_JARDINERIA.get(i);
            if (cantidad > 0) {
                double total = cantidad * precio_JARDINERIA[i];
                System.out.printf("%d\t\t%s\t\t%.2f\n", cantidad, productos_JARDINERIA.get(i), total);
                cantidadTotal += total;
            }
        }
        for (int i = 0; i < productos_JARDINERIA_2.size(); i++) {
            int cantidad = carrito_JARDINERIA_2.get(i);
            if (cantidad > 0) {
                double total = cantidad * precio_JARDINERIA_2[i];
                System.out.printf("%d\t\t%s\t\t%.2f\n", cantidad, productos_JARDINERIA_2.get(i), total);
                cantidadTotal += total;
            }
        }

        //SALUD Y DEPORTES
        for (int i = 0; i < productos_SALUD.size(); i++) {
            int cantidad = carrito_SALUD.get(i);
            if (cantidad > 0) {
                double total = cantidad * precio_SALUD[i];
                System.out.printf("%d\t\t%s\t\t%.2f\n", cantidad, productos_SALUD.get(i), total);
                cantidadTotal += total;
            }
        }
        for (int i = 0; i < productos_SALUD_2.size(); i++) {
            int cantidad = carrito_SALUD_2.get(i);
            if (cantidad > 0) {
                double total = cantidad * precio_SALUD_2[i];
                System.out.printf("%d\t\t%s\t\t%.2f\n", cantidad, productos_SALUD_2.get(i), total);
                cantidadTotal += total;
            }
        }
        for (int i = 0; i < productos_SALUD_3.size(); i++) {
            int cantidad = carrito_SALUD_3.get(i);
            if (cantidad > 0) {
                double total = cantidad * precio_SALUD_3[i];
                System.out.printf("%d\t\t%s\t\t%.2f\n", cantidad, productos_SALUD_3.get(i), total);
                cantidadTotal += total;
            }
        }
        for (int i = 0; i < productos_SALUD_4.size(); i++) {
            int cantidad = carrito_SALUD_4.get(i);
            if (cantidad > 0) {
                double total = cantidad * precio_SALUD_4[i];
                System.out.printf("%d\t\t%s\t\t%.2f\n", cantidad, productos_SALUD_4.get(i), total);
                cantidadTotal += total;
            }
        }
        for (int i = 0; i < productos_SALUD_5.size(); i++) {
            int cantidad = carrito_SALUD_5.get(i);
            if (cantidad > 0) {
                double total = cantidad * precio_SALUD_5[i];
                System.out.printf("%d\t\t%s\t\t%.2f\n", cantidad, productos_SALUD_5.get(i), total);
                cantidadTotal += total;
            }
        }
        for (int i = 0; i < productos_SALUD_6.size(); i++) {
            int cantidad = carrito_SALUD_6.get(i);
            if (cantidad > 0) {
                double total = cantidad * precio_SALUD_6[i];
                System.out.printf("%d\t\t%s\t\t%.2f\n", cantidad, productos_SALUD_6.get(i), total);
                cantidadTotal += total;
            }
        }
        for (int i = 0; i < productos_SALUD_7.size(); i++) {
            int cantidad = carrito_SALUD_7.get(i);
            if (cantidad > 0) {
                double total = cantidad * precio_SALUD_7[i];
                System.out.printf("%d\t\t%s\t\t%.2f\n", cantidad, productos_SALUD_7.get(i), total);
                cantidadTotal += total;
            }
        }

        //OFICINA ESCOLAR
        for (int i = 0; i < productos_OFICINA.size(); i++) {
            int cantidad = carrito_OFICINA.get(i);
            if (cantidad > 0) {
                double total = cantidad * precio_OFICINA[i];
                System.out.printf("%d\t\t%s\t\t%.2f\n", cantidad, productos_OFICINA.get(i), total);
                cantidadTotal += total;
            }
        }
        for (int i = 0; i < productos_OFICINA_2.size(); i++) {
            int cantidad = carrito_OFICINA_2.get(i);
            if (cantidad > 0) {
                double total = cantidad * precio_OFICINA_2[i];
                System.out.printf("%d\t\t%s\t\t%.2f\n", cantidad, productos_OFICINA_2.get(i), total);
                cantidadTotal += total;
            }
        }
        for (int i = 0; i < productos_OFICINA_3.size(); i++) {
            int cantidad = carrito_OFICINA_3.get(i);
            if (cantidad > 0) {
                double total = cantidad * precio_OFICINA_3[i];
                System.out.printf("%d\t\t%s\t\t%.2f\n", cantidad, productos_OFICINA_3.get(i), total);
                cantidadTotal += total;
            }
        }
        for (int i = 0; i < productos_OFICINA_4.size(); i++) {
            int cantidad = carrito_OFICINA_4.get(i);
            if (cantidad > 0) {
                double total = cantidad * precio_OFICINA_4[i];
                System.out.printf("%d\t\t%s\t\t%.2f\n", cantidad, productos_OFICINA_4.get(i), total);
                cantidadTotal += total;
            }
        }
        for (int i = 0; i < productos_OFICINA_5.size(); i++) {
            int cantidad = carrito_OFICINA_5.get(i);
            if (cantidad > 0) {
                double total = cantidad * precio_OFICINA_5[i];
                System.out.printf("%d\t\t%s\t\t%.2f\n", cantidad, productos_OFICINA_5.get(i), total);
                cantidadTotal += total;
            }
        }
        for (int i = 0; i < productos_OFICINA_6.size(); i++) {
            int cantidad = carrito_OFICINA_6.get(i);
            if (cantidad > 0) {
                double total = cantidad * precio_OFICINA_6[i];
                System.out.printf("%d\t\t%s\t\t%.2f\n", cantidad, productos_OFICINA_6.get(i), total);
                cantidadTotal += total;
            }
        }

        //DORMITORIO
        for (int i = 0; i < productos_DORMITORIO.size(); i++) {
            int cantidad = carrito_DORMITORIO.get(i);
            if (cantidad > 0) {
                double total = cantidad * precio_DORMITORIO[i];
                System.out.printf("%d\t\t%s\t\t%.2f\n", cantidad, productos_DORMITORIO.get(i), total);
                cantidadTotal += total;
            }
        }


        for (int i = 0; i < productos_DORMITORIO_2.size(); i++) {
            int cantidad = carrito_DORMITORIO_2.get(i);
            if (cantidad > 0) {
                double total = cantidad * precio_DORMITORIO_2[i];
                System.out.printf("%d\t\t%s\t\t%.2f\n", cantidad, productos_DORMITORIO_2.get(i), total);
                cantidadTotal += total;
            }
        }


        //LIMPIEZA---------------------------------------------------------------------------

        for (int i = 0; i < Limpieza1.size(); i++) {
            int cantidad = carrito_limpieza1.get(i);
            if (cantidad > 0) {
                double total = cantidad * precio1[i];
                System.out.printf("%d\t\t%s\t\t%.2f\n", cantidad, Limpieza1.get(i), total);
                cantidadTotal += total;
            }
        }
        for (int i = 0; i < Limpieza2.size(); i++) {
            int cantidad = carrito_limpieza2.get(i);
            if (cantidad > 0) {
                double total = cantidad * precio2[i];
                System.out.printf("%d\t\t%s\t\t%.2f\n", cantidad, Limpieza2.get(i), total);
                cantidadTotal += total;
            }
        }
        for (int i = 0; i < Limpieza3.size(); i++) {
            int cantidad = carrito_limpieza3.get(i);
            if (cantidad > 0) {
                double total = cantidad * precio3[i];
                System.out.printf("%d\t\t%s\t\t%.2f\n", cantidad, Limpieza3.get(i), total);
                cantidadTotal += total;
            }
        }
        for (int i = 0; i < Limpieza4.size(); i++) {
            int cantidad = carrito_limpieza4.get(i);
            if (cantidad > 0) {
                double total = cantidad * precio4[i];
                System.out.printf("%d\t\t%s\t\t%.2f\n", cantidad, Limpieza4.get(i), total);
                cantidadTotal += total;
            }
        }
        for (int i = 0; i < Limpieza5.size(); i++) {
            int cantidad = carrito_limpieza5.get(i);
            if (cantidad > 0) {
                double total = subtotal_limpieza.get(i);
                System.out.printf("%d\t\t%s\t\t%.2f\n", cantidad, Limpieza5.get(i), total);
                cantidadTotal += total;
            }
        }

        igv = cantidadTotal * precio[1];
        subtotal = cantidadTotal - igv;
        totalpagar = subtotal + igv;

        System.out.printf("\nSUBTOTAL: %.2f\n", subtotal);
        System.out.printf("IGV: %.2f\n", igv);
        System.out.printf("TOTAL A PAGAR: %.2f\n", totalpagar);

        return cantidadTotal;
    }


    public void ImprimirBoleta() {
        try (FileWriter fileWriter = new FileWriter("boleta.txt")) {
            fileWriter.write("----BOLETA DE VENTA---------\n");
            fileWriter.write("CANTIDAD\tDESCRIPCIÓN\t\tTOTAL\n");
            for (int i = 0; i < productos_Espejos.size(); i++) {
                int cantidad = carrito_Espejos.get(i);
                if (cantidad > 0) {
                    double total = cantidad * precio_Espejos[i];
                    fileWriter.write(String.format("%d\t\t%s\t\t%.2f\n", cantidad, productos_Espejos.get(i), total));
                }
            }
            for (int i = 0; i < productos_Alfombras.size(); i++) {
                int cantidad = carrito_Alfombras.get(i);
                if (cantidad > 0) {
                    double total = cantidad * precio_Alfombras[i];
                    fileWriter.write(String.format("%d\t\t%s\t\t%.2f\n", cantidad, productos_Alfombras.get(i), total));
                }
            }
            for (int i = 0; i < productos_Velas.size(); i++) {
                int cantidad = carrito_Velas.get(i);
                if (cantidad > 0) {
                    double total = cantidad * precio_Velas[i];
                    fileWriter.write(String.format("%d\t\t%s\t\t%.2f\n", cantidad, productos_Velas.get(i), total));
                }
            }
            for (int i = 0; i < productos_Menaje.size(); i++) {
                int cantidad = carrito_Menaje.get(i);
                if (cantidad > 0) {
                    double total = cantidad * precio_Menaje[i];
                    fileWriter.write(String.format("%d\t\t%s\t\t%.2f\n", cantidad, productos_Menaje.get(i), total));
                }
            }
            for (int i = 0; i < productos_Almacenamiento.size(); i++) {
                int cantidad = carrito_Almacenamiento.get(i);
                if (cantidad > 0) {
                    double total = cantidad * precio_Almacenamiento[i];
                    fileWriter.write(String.format("%d\t\t%s\t\t%.2f\n", cantidad, productos_Almacenamiento.get(i), total));
                }
            }
            for (int i = 0; i < productos_Retro.size(); i++) {
                int cantidad = carrito_Retro.get(i);
                if (cantidad > 0) {
                    double total = cantidad * precio_Retro[i];
                    fileWriter.write(String.format("%d\t\t%s\t\t%.2f\n", cantidad, productos_Retro.get(i), total));
                }
            }
            for (int i = 0; i < productos_CasaAves.size(); i++) {
                int cantidad = carrito_CasaAves.get(i);
                if (cantidad > 0) {
                    double total = cantidad * precio_CasaAves[i];
                    fileWriter.write(String.format("%d\t\t%s\t\t%.2f\n", cantidad, productos_CasaAves.get(i), total));
                }
            }


            //BOLETA DE MASCOTAS
            for (int i = 0; i < productos_MASCOTAS.size(); i++) {
                int cantidad = carrito_MASCOTAS.get(i);
                if (cantidad > 0) {
                    double total = cantidad * precio_MASCOTAS[i];
                    fileWriter.write(String.format("%d\t\t%s\t\t%.2f\n", cantidad, productos_MASCOTAS.get(i), total));
                }
            }
            for (int i = 0; i < productos_MASCOTAS_2.size(); i++) {
                int cantidad = carrito_MASCOTAS_2.get(i);
                if (cantidad > 0) {
                    double total = cantidad * precio_MASCOTAS_2[i];
                    fileWriter.write(String.format("%d\t\t%s\t\t%.2f\n", cantidad, productos_MASCOTAS_2.get(i), total));
                }
            }
            for (int i = 0; i < productos_MASCOTAS_3.size(); i++) {
                int cantidad = carrito_MASCOTAS_3.get(i);
                if (cantidad > 0) {
                    double total = cantidad * precio_MASCOTAS_3[i];
                    fileWriter.write(String.format("%d\t\t%s\t\t%.2f\n", cantidad, productos_MASCOTAS_3.get(i), total));
                }
            }
            for (int i = 0; i < productos_MASCOTAS_4.size(); i++) {
                int cantidad = carrito_MASCOTAS_4.get(i);
                if (cantidad > 0) {
                    double total = cantidad * precio_MASCOTAS_4[i];
                    fileWriter.write(String.format("%d\t\t%s\t\t%.2f\n", cantidad, productos_MASCOTAS_4.get(i), total));
                }
            }for (int i = 0; i < productos_MASCOTAS_5.size(); i++) {
                int cantidad = carrito_MASCOTAS_5.get(i);
                if (cantidad > 0) {
                    double total = cantidad * precio_MASCOTAS_5[i];
                    fileWriter.write(String.format("%d\t\t%s\t\t%.2f\n", cantidad, productos_MASCOTAS_5.get(i), total));
                }
            }for (int i = 0; i < productos_MASCOTAS_6.size(); i++) {
                int cantidad = carrito_MASCOTAS_6.get(i);
                if (cantidad > 0) {
                    double total = cantidad * precio_MASCOTAS_6[i];
                    fileWriter.write(String.format("%d\t\t%s\t\t%.2f\n", cantidad, productos_MASCOTAS_6.get(i), total));
                }
            }
            for (int i = 0; i < productos_MASCOTAS_7.size(); i++) {
                int cantidad = carrito_MASCOTAS_7.get(i);
                if (cantidad > 0) {
                    double total = cantidad * precio_MASCOTAS_7[i];
                    fileWriter.write(String.format("%d\t\t%s\t\t%.2f\n", cantidad, productos_MASCOTAS_7.get(i), total));
                }
            }


            //BOLETA DE JARDINERIA
            for (int i = 0; i < productos_JARDINERIA.size(); i++) {
                int cantidad = carrito_JARDINERIA.get(i);
                if (cantidad > 0) {
                    double total = cantidad * precio_JARDINERIA[i];
                    fileWriter.write(String.format("%d\t\t%s\t\t%.2f\n", cantidad, productos_JARDINERIA.get(i), total));
                }
            }
            for (int i = 0; i < productos_JARDINERIA_2.size(); i++) {
                int cantidad = carrito_JARDINERIA_2.get(i);
                if (cantidad > 0) {
                    double total = cantidad * precio_JARDINERIA_2[i];
                    fileWriter.write(String.format("%d\t\t%s\t\t%.2f\n", cantidad, productos_JARDINERIA_2.get(i), total));
                }
            }

            //BOLETA SALUD Y DEPORTES
            for (int i = 0; i < productos_SALUD.size(); i++) {
                int cantidad = carrito_SALUD.get(i);
                if (cantidad > 0) {
                    double total = cantidad * precio_SALUD[i];
                    fileWriter.write(String.format("%d\t\t%s\t\t%.2f\n", cantidad, productos_SALUD.get(i), total));
                }
            }
            for (int i = 0; i < productos_SALUD_2.size(); i++) {
                int cantidad = carrito_SALUD_2.get(i);
                if (cantidad > 0) {
                    double total = cantidad * precio_SALUD_2[i];
                    fileWriter.write(String.format("%d\t\t%s\t\t%.2f\n", cantidad, productos_SALUD_2.get(i), total));
                }
            }
            for (int i = 0; i < productos_SALUD_3.size(); i++) {
                int cantidad = carrito_SALUD_3.get(i);
                if (cantidad > 0) {
                    double total = cantidad * precio_SALUD_3[i];
                    fileWriter.write(String.format("%d\t\t%s\t\t%.2f\n", cantidad, productos_SALUD_3.get(i), total));
                }
            }
            for (int i = 0; i < productos_SALUD_4.size(); i++) {
                int cantidad = carrito_SALUD_4.get(i);
                if (cantidad > 0) {
                    double total = cantidad * precio_SALUD_4[i];
                    fileWriter.write(String.format("%d\t\t%s\t\t%.2f\n", cantidad, productos_SALUD_4.get(i), total));
                }
            }
            for (int i = 0; i < productos_SALUD_5.size(); i++) {
                int cantidad = carrito_SALUD_5.get(i);
                if (cantidad > 0) {
                    double total = cantidad * precio_SALUD_5[i];
                    fileWriter.write(String.format("%d\t\t%s\t\t%.2f\n", cantidad, productos_SALUD_5.get(i), total));
                }
            }
            for (int i = 0; i < productos_SALUD_6.size(); i++) {
                int cantidad = carrito_SALUD_6.get(i);
                if (cantidad > 0) {
                    double total = cantidad * precio_SALUD_6[i];
                    fileWriter.write(String.format("%d\t\t%s\t\t%.2f\n", cantidad, productos_SALUD_6.get(i), total));
                }
            }
            for (int i = 0; i < productos_SALUD_7.size(); i++) {
                int cantidad = carrito_SALUD_7.get(i);
                if (cantidad > 0) {
                    double total = cantidad * precio_SALUD_7[i];
                    fileWriter.write(String.format("%d\t\t%s\t\t%.2f\n", cantidad, productos_SALUD_7.get(i), total));
                }
            }


            //BOLETA DE OFICINA Y ESCOLAR
            for (int i = 0; i < productos_OFICINA.size(); i++) {
                int cantidad = carrito_OFICINA.get(i);
                if (cantidad > 0) {
                    double total = cantidad * precio_OFICINA[i];
                    fileWriter.write(String.format("%d\t\t%s\t\t%.2f\n", cantidad, productos_OFICINA.get(i), total));
                }
            }
            for (int i = 0; i < productos_OFICINA_2.size(); i++) {
                int cantidad = carrito_OFICINA_2.get(i);
                if (cantidad > 0) {
                    double total = cantidad * precio_OFICINA_2[i];
                    fileWriter.write(String.format("%d\t\t%s\t\t%.2f\n", cantidad, productos_OFICINA_2.get(i), total));
                }
            }
            for (int i = 0; i < productos_OFICINA_3.size(); i++) {
                int cantidad = carrito_OFICINA_3.get(i);
                if (cantidad > 0) {
                    double total = cantidad * precio_OFICINA_3[i];
                    fileWriter.write(String.format("%d\t\t%s\t\t%.2f\n", cantidad, productos_OFICINA_3.get(i), total));
                }
            }
            for (int i = 0; i < productos_OFICINA_4.size(); i++) {
                int cantidad = carrito_OFICINA_4.get(i);
                if (cantidad > 0) {
                    double total = cantidad * precio_OFICINA_4[i];
                    fileWriter.write(String.format("%d\t\t%s\t\t%.2f\n", cantidad, productos_OFICINA_4.get(i), total));
                }
            }
            for (int i = 0; i < productos_OFICINA_5.size(); i++) {
                int cantidad = carrito_OFICINA_5.get(i);
                if (cantidad > 0) {
                    double total = cantidad * precio_OFICINA_5[i];
                    fileWriter.write(String.format("%d\t\t%s\t\t%.2f\n", cantidad, productos_OFICINA_5.get(i), total));
                }
            }
            for (int i = 0; i < productos_OFICINA_6.size(); i++) {
                int cantidad = carrito_OFICINA_6.get(i);
                if (cantidad > 0) {
                    double total = cantidad * precio_OFICINA_6[i];
                    fileWriter.write(String.format("%d\t\t%s\t\t%.2f\n", cantidad, productos_OFICINA_6.get(i), total));
                }
            }


            //BOLETA DE DORMITORIOS
            for (int i = 0; i < productos_DORMITORIO.size(); i++) {
                int cantidad = carrito_DORMITORIO.get(i);
                if (cantidad > 0) {
                    double total = cantidad * precio_DORMITORIO[i];
                    fileWriter.write(String.format("%d\t\t%s\t\t%.2f\n", cantidad, productos_DORMITORIO.get(i), total));
                }
            }
            for (int i = 0; i < productos_DORMITORIO_2.size(); i++) {
                int cantidad = carrito_DORMITORIO_2.get(i);
                if (cantidad > 0) {
                    double total = cantidad * precio_DORMITORIO_2[i];
                    fileWriter.write(String.format("%d\t\t%s\t\t%.2f\n", cantidad, productos_DORMITORIO_2.get(i), total));
                }
            }


            //BOLETA DE LIMPIEZA

            for (int i = 0; i < Limpieza1.size(); i++) {
                int cantidad = carrito_limpieza1.get(i);
                if (cantidad > 0) {
                    double total = cantidad * precio1[i];
                    fileWriter.write(String.format("%d\t\t%s\t\t%.2f\n", cantidad, Limpieza1.get(i), total));
                }
            }
            for (int i = 0; i < Limpieza2.size(); i++) {
                int cantidad = carrito_limpieza2.get(i);
                if (cantidad > 0) {
                    double total = cantidad * precio2[i];
                    fileWriter.write(String.format("%d\t\t%s\t\t%.2f\n", cantidad, Limpieza2.get(i), total));
                }
            }
            for (int i = 0; i < Limpieza3.size(); i++) {
                int cantidad = carrito_limpieza3.get(i);
                if (cantidad > 0) {
                    double total = cantidad * precio3[i];
                    fileWriter.write(String.format("%d\t\t%s\t\t%.2f\n", cantidad, Limpieza3.get(i), total));
                }
            }
            for (int i = 0; i < Limpieza4.size(); i++) {
                int cantidad = carrito_limpieza4.get(i);
                if (cantidad > 0) {
                    double total = cantidad * precio4[i];
                    fileWriter.write(String.format("%d\t\t%s\t\t%.2f\n", cantidad, Limpieza4.get(i), total));
                }
            }
            for (int i = 0; i < Limpieza5.size(); i++) {
                int cantidad = carrito_limpieza5.get(i);
                if (cantidad > 0) {
                    double total = subtotal_limpieza.get(i);
                    fileWriter.write(String.format("%d\t\t%s\t\t%.2f\n", cantidad, Limpieza5.get(i), total));
                }
            }

            fileWriter.write(String.format("\nSUBTOTAL: %.2f\n", subtotal));
            fileWriter.write(String.format("IGV: %.2f\n", igv));
            fileWriter.write(String.format("TOTAL A PAGAR: %.2f\n", totalpagar));

            System.out.println("La boleta ha sido guardada en 'boleta.txt'.");

        }
        catch (IOException e) {
            System.out.println("Ocurrió un error al escribir la boleta: " + e.getMessage());
        }
    }

    public double VerCarrito() {
        double carritos = 0;
        System.out.println("---------OBJETOS SELECCIONADOS EN CARRITO---------");
        System.out.println("CANTIDAD\tDESCRIPCIÓN\t\tTOTAL");

        //CARRITO DE NICOL
        for (int i = 0; i < productos_Espejos.size(); i++) {
            int cantidad = carrito_Espejos.get(i);
            if (cantidad > 0) {
                double total = cantidad * precio_Espejos[i];
                System.out.printf("%d\t\t%s\t\t%.2f\n", cantidad, productos_Espejos.get(i), total);
                carritos += total;
            }
        }
        for (int i = 0; i < productos_Alfombras.size(); i++) {
            int cantidad = carrito_Alfombras.get(i);
            if (cantidad > 0) {
                double total = cantidad * precio_Alfombras[i];
                System.out.printf("%d\t\t%s\t\t%.2f\n", cantidad, productos_Alfombras.get(i), total);
                carritos += total;
            }
        }
        for (int i = 0; i < productos_Velas.size(); i++) {
            int cantidad = carrito_Velas.get(i);
            if (cantidad > 0) {
                double total = cantidad * precio_Velas[i];
                System.out.printf("%d\t\t%s\t\t%.2f\n", cantidad, productos_Velas.get(i), total);
                carritos += total;
            }
        }
        for (int i = 0; i < productos_Menaje.size(); i++) {
            int cantidad = carrito_Menaje.get(i);
            if (cantidad > 0) {
                double total = cantidad * precio_Menaje[i];
                System.out.printf("%d\t\t%s\t\t%.2f\n", cantidad, productos_Menaje.get(i), total);
                carritos += total;
            }
        }
        for (int i = 0; i < productos_Almacenamiento.size(); i++) {
            int cantidad = carrito_Almacenamiento.get(i);
            if (cantidad > 0) {
                double total = cantidad * precio_Almacenamiento[i];
                System.out.printf("%d\t\t%s\t\t%.2f\n", cantidad, productos_Almacenamiento.get(i), total);
                carritos += total;
            }
        }
        for (int i = 0; i < productos_Retro.size(); i++) {
            int cantidad = carrito_Retro.get(i);
            if (cantidad > 0) {
                double total = cantidad * precio_Retro[i];
                System.out.printf("%d\t\t%s\t\t%.2f\n", cantidad, productos_Retro.get(i), total);
                carritos += total;
            }
        }
        for (int i = 0; i < productos_CasaAves.size(); i++) {
            int cantidad = carrito_CasaAves.get(i);
            if (cantidad > 0) {
                double total = cantidad * precio_CasaAves[i];
                System.out.printf("%d\t\t%s\t\t%.2f\n", cantidad, productos_CasaAves.get(i), total);
                carritos += total;
            }
        }

        //CARRITO DE MASCOTAS
        for (int i = 0; i < productos_MASCOTAS.size(); i++) {
            int cantidad = carrito_MASCOTAS.get(i);
            if (cantidad > 0) {
                double total = cantidad * precio_MASCOTAS[i];
                System.out.printf("%d\t\t%s\t\t%.2f\n", cantidad, productos_MASCOTAS.get(i), total);
                carritos += total;
            }
        }
        for (int i = 0; i < productos_MASCOTAS_2.size(); i++) {
            int cantidad = carrito_MASCOTAS_2.get(i);
            if (cantidad > 0) {
                double total = cantidad * precio_MASCOTAS_2[i];
                System.out.printf("%d\t\t%s\t\t%.2f\n", cantidad, productos_MASCOTAS_2.get(i), total);
                carritos += total;
            }
        }
        for (int i = 0; i < productos_MASCOTAS_3.size(); i++) {
            int cantidad = carrito_MASCOTAS_3.get(i);
            if (cantidad > 0) {
                double total = cantidad * precio_MASCOTAS_3[i];
                System.out.printf("%d\t\t%s\t\t%.2f\n", cantidad, productos_MASCOTAS_3.get(i), total);
                carritos += total;
            }
        }
        for (int i = 0; i < productos_MASCOTAS_4.size(); i++) {
            int cantidad = carrito_MASCOTAS_4.get(i);
            if (cantidad > 0) {
                double total = cantidad * precio_MASCOTAS_4[i];
                System.out.printf("%d\t\t%s\t\t%.2f\n", cantidad, productos_MASCOTAS_4.get(i), total);
                carritos += total;
            }
        }
        for (int i = 0; i < productos_MASCOTAS_5.size(); i++) {
            int cantidad = carrito_MASCOTAS_5.get(i);
            if (cantidad > 0) {
                double total = cantidad * precio_MASCOTAS_5[i];
                System.out.printf("%d\t\t%s\t\t%.2f\n", cantidad, productos_MASCOTAS_5.get(i), total);
                carritos += total;
            }
        }
        for (int i = 0; i < productos_MASCOTAS_6.size(); i++) {
            int cantidad = carrito_MASCOTAS_6.get(i);
            if (cantidad > 0) {
                double total = cantidad * precio_MASCOTAS_6[i];
                System.out.printf("%d\t\t%s\t\t%.2f\n", cantidad, productos_MASCOTAS_6.get(i), total);
                carritos += total;
            }
        }
        for (int i = 0; i < productos_MASCOTAS_7.size(); i++) {
            int cantidad = carrito_MASCOTAS_7.get(i);
            if (cantidad > 0) {
                double total = cantidad * precio_MASCOTAS_7[i];
                System.out.printf("%d\t\t%s\t\t%.2f\n", cantidad, productos_MASCOTAS_7.get(i), total);
                carritos += total;
            }
        }

        //CARRITO DE JARDINEERIA
        for (int i = 0; i < productos_JARDINERIA.size(); i++) {
            int cantidad = carrito_JARDINERIA.get(i);
            if (cantidad > 0) {
                double total = cantidad * precio_JARDINERIA[i];
                System.out.printf("%d\t\t%s\t\t%.2f\n", cantidad, productos_JARDINERIA.get(i), total);
                carritos += total;
            }
        }
        for (int i = 0; i < productos_JARDINERIA_2.size(); i++) {
            int cantidad = carrito_JARDINERIA_2.get(i);
            if (cantidad > 0) {
                double total = cantidad * precio_JARDINERIA_2[i];
                System.out.printf("%d\t\t%s\t\t%.2f\n", cantidad, productos_JARDINERIA_2.get(i), total);
                carritos += total;
            }
        }

        //CARRITO DE SALUD Y DEPORTE
        for (int i = 0; i < productos_SALUD.size(); i++) {
            int cantidad = carrito_SALUD.get(i);
            if (cantidad > 0) {
                double total = cantidad * precio_SALUD[i];
                System.out.printf("%d\t\t%s\t\t%.2f\n", cantidad, productos_SALUD.get(i), total);
                carritos += total;
            }
        }
        for (int i = 0; i < productos_SALUD_2.size(); i++) {
            int cantidad = carrito_SALUD_2.get(i);
            if (cantidad > 0) {
                double total = cantidad * precio_SALUD_2[i];
                System.out.printf("%d\t\t%s\t\t%.2f\n", cantidad, productos_SALUD_2.get(i), total);
                carritos += total;
            }
        }
        for (int i = 0; i < productos_SALUD_3.size(); i++) {
            int cantidad = carrito_SALUD_3.get(i);
            if (cantidad > 0) {
                double total = cantidad * precio_SALUD_3[i];
                System.out.printf("%d\t\t%s\t\t%.2f\n", cantidad, productos_SALUD_3.get(i), total);
                carritos += total;
            }
        }
        for (int i = 0; i < productos_SALUD_4.size(); i++) {
            int cantidad = carrito_SALUD_4.get(i);
            if (cantidad > 0) {
                double total = cantidad * precio_SALUD_4[i];
                System.out.printf("%d\t\t%s\t\t%.2f\n", cantidad, productos_SALUD_4.get(i), total);
                carritos += total;
            }
        }
        for (int i = 0; i < productos_SALUD_5.size(); i++) {
            int cantidad = carrito_SALUD_5.get(i);
            if (cantidad > 0) {
                double total = cantidad * precio_SALUD_5[i];
                System.out.printf("%d\t\t%s\t\t%.2f\n", cantidad, productos_SALUD_5.get(i), total);
                carritos += total;
            }
        }
        for (int i = 0; i < productos_SALUD_6.size(); i++) {
            int cantidad = carrito_SALUD_6.get(i);
            if (cantidad > 0) {
                double total = cantidad * precio_SALUD_6[i];
                System.out.printf("%d\t\t%s\t\t%.2f\n", cantidad, productos_SALUD_6.get(i), total);
                carritos += total;
            }
        }
        for (int i = 0; i < productos_SALUD_7.size(); i++) {
            int cantidad = carrito_SALUD_7.get(i);
            if (cantidad > 0) {
                double total = cantidad * precio_SALUD_7[i];
                System.out.printf("%d\t\t%s\t\t%.2f\n", cantidad, productos_SALUD_7.get(i), total);
                carritos += total;
            }
        }
        //CARRITO DE OFICINA Y ESCOLAR
        for (int i = 0; i < productos_OFICINA.size(); i++) {
            int cantidad = carrito_OFICINA.get(i);
            if (cantidad > 0) {
                double totalMenu = cantidad * precio_OFICINA[i];
                System.out.printf("%d\t\t%s\t\t%.2f\n", cantidad, productos_OFICINA.get(i), totalMenu);
                carritos += totalMenu;
            }
        }
        for (int i = 0; i < productos_OFICINA_2.size(); i++) {
            int cantidad = carrito_OFICINA_2.get(i);
            if (cantidad > 0) {
                double totalMenu = cantidad * precio_OFICINA_2[i];
                System.out.printf("%d\t\t%s\t\t%.2f\n", cantidad, productos_OFICINA_2.get(i), totalMenu);
                carritos += totalMenu;
            }
        }
        for (int i = 0; i < productos_OFICINA_3.size(); i++) {
            int cantidad = carrito_OFICINA_3.get(i);
            if (cantidad > 0) {
                double totalMenu = cantidad * precio_OFICINA_3[i];
                System.out.printf("%d\t\t%s\t\t%.2f\n", cantidad, productos_OFICINA_3.get(i), totalMenu);
                carritos += totalMenu;
            }
        }
        for (int i = 0; i < productos_OFICINA_4.size(); i++) {
            int cantidad = carrito_OFICINA_4.get(i);
            if (cantidad > 0) {
                double totalMenu = cantidad * precio_OFICINA_4[i];
                System.out.printf("%d\t\t%s\t\t%.2f\n", cantidad, productos_OFICINA_4.get(i), totalMenu);
                carritos += totalMenu;
            }
        }
        for (int i = 0; i < productos_OFICINA_5.size(); i++) {
            int cantidad = carrito_OFICINA_5.get(i);
            if (cantidad > 0) {
                double totalMenu = cantidad * precio_OFICINA_5[i];
                System.out.printf("%d\t\t%s\t\t%.2f\n", cantidad, productos_OFICINA_5.get(i), totalMenu);
                carritos += totalMenu;
            }
        }
        for (int i = 0; i < productos_OFICINA_6.size(); i++) {
            int cantidad = carrito_OFICINA_6.get(i);
            if (cantidad > 0) {
                double totalMenu = cantidad * precio_OFICINA_6[i];
                System.out.printf("%d\t\t%s\t\t%.2f\n", cantidad, productos_OFICINA_6.get(i), totalMenu);
                carritos += totalMenu;
            }
        }

        //CARRITO DE DORMITORIO
        for (int i = 0; i < productos_DORMITORIO.size(); i++) {
            int cantidad = carrito_DORMITORIO.get(i);
            if (cantidad > 0) {
                double totalCAMAS = cantidad * precio_DORMITORIO[i];
                System.out.printf("%d\t\t%s\t\t%.2f\n", cantidad, productos_DORMITORIO.get(i), totalCAMAS);
                carritos += totalCAMAS;
            }
        }

        for (int i = 0; i < productos_DORMITORIO_2.size(); i++) {
            int cantidad = carrito_DORMITORIO_2.get(i);
            if (cantidad > 0) {
                double totalCamas = cantidad * precio_DORMITORIO_2[i];
                System.out.printf("%d\t\t%s\t\t%.2f\n", cantidad, productos_DORMITORIO_2.get(i), totalCamas);
                carritos += totalCamas;
            }
        }
        //CARRITO DE LIMPIEZA
        for (int i = 0; i < Limpieza1.size(); i++) {
            int cantidad = carrito_limpieza1.get(i);
            if (cantidad > 0) {
                double totalMenu = cantidad * precio1[i];
                System.out.printf("%d\t\t%s\t\t%.2f\n", cantidad, Limpieza1.get(i), totalMenu);
                carritos += totalMenu;
            }
        }
        for (int i = 0; i < Limpieza2.size(); i++) {
            int cantidad = carrito_limpieza2.get(i);
            if (cantidad > 0) {
                double totalMenu = cantidad * precio2[i];
                System.out.printf("%d\t\t%s\t\t%.2f\n", cantidad, Limpieza2.get(i), totalMenu);
                carritos += totalMenu;
            }
        }
        for (int i = 0; i < Limpieza3.size(); i++) {
            int cantidad = carrito_limpieza3.get(i);
            if (cantidad > 0) {
                double totalMenu = cantidad * precio3[i];
                System.out.printf("%d\t\t%s\t\t%.2f\n", cantidad, Limpieza3.get(i), totalMenu);
                carritos += totalMenu;
            }
        }
        for (int i = 0; i < Limpieza4.size(); i++) {
            int cantidad = carrito_limpieza4.get(i);
            if (cantidad > 0) {
                double totalMenu = cantidad * precio4[i];
                System.out.printf("%d\t\t%s\t\t%.2f\n", cantidad, Limpieza4.get(i), totalMenu);
                carritos += totalMenu;
            }
        }
        for (int i = 0; i < Limpieza5.size(); i++) {
            int cantidad = carrito_limpieza5.get(i);
            if (cantidad > 0) {
                double totalExtra = subtotal_limpieza.get(i);
                System.out.printf("%d\t\t%s\t\t%.2f\n", cantidad, Limpieza5.get(i), totalExtra);
                carritos += totalExtra;
            }
        }

        System.out.println("""
                selecicona una de las opciones 
                1: menu principal
                2: pagar
                3: regresar al menu de compra
                """);
        opcion=ncs.nextInt();
        ncs.nextLine();
        switch(opcion){
            case 1:
                this.menuprincipal();
                break;
            case 2:
                this.pagometodo();
                break;
            case 3:
                this.menuprincipal();
                break;

            default:
                this.secciondecategorias();
        }

        return totalpagar;
    }
    public void OPCIONES(){
        System.out.println("""
                    ELIJE UNA DE LAS OPCIONES:
                    |1| AGREGAR MAS PRODUCTOS
                    |2| PAGAR LOS PRODUCTOS AGREGADOS
                    |3| VER CARRITO
                    |0| MENU PRINCIPAL""");
        opcion = ncs.nextInt();
        ncs.nextLine();
        if (opcion == 1) {
            System.out.println("REGRESANDO PARA AGREGAR MAS PRODUCTOS");
            this.secciondecategorias();
        } else if (opcion == 2) {
            this.pagometodo();
        } else if (opcion == 3) {
            this.VerCarrito();
        } else if (opcion == 0) {
            this.menuprincipal();
        } else {
            System.out.println("OPCION NO VALIDA");
        }
    }
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

    public static void main(String[] args) {
        CATEGORIAS papanoel = new CATEGORIAS();
        papanoel.menuprincipal();
    }
}
