import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        MetodosOrdenamientoAsc moAsc = new MetodosOrdenamientoAsc();
        MetodosOrdenamientoDes moDes = new MetodosOrdenamientoDes();

        Scanner sc = new Scanner(System.in);
        System.out.println("Menu Principal: ");
        System.out.println("1. Ingrese un arreglo");
        System.out.println("2. Ordenar Arreglo");
        System.out.println("0. Salir");

        int opcion = sc.nextInt();

        int tamanio = leerEnteroValido(sc, "Ingrese el tamaño de su arreglo", false);

        int[] arreglo = new int[tamanio];

        switch (opcion) {
            case 1:
                for (int i = 0; i < tamanio; i++) {
                    System.out.print("Ingrese el valor para " + (i + 1) + ": ");
                    while (!sc.hasNextInt()) {
                        System.out.println("Ingrese correctamente un número entero:");
                        sc.next();
                    }
                    arreglo[i] = sc.nextInt();
                }
                System.out.println();

            case 2:
                System.out.println("Escoja un Metodo de Ordenamiento");
                System.out.println("1. Metodo Burbuja");
                System.out.println("2. Metodo Seleccion");
                System.out.println("3. Metodo Insercion");
                System.out.println("4. Metodo Burbuja con Ajuste");
                System.out.println("0. Regresar al Menu Principal");

                int mEscogido = sc.nextInt();

                //Metodo Burbuja
                if (mEscogido == 1) {
                    System.out.println("\nEscoja Ascendente o Descendente");
                    System.out.println("1. Ascendente");
                    System.out.println("2. Descendente");

                    int opcionOrden = sc.nextInt();
                    System.out.println();
                    if (opcionOrden == 1) {
                        System.out.println("Metodo Burbuja (Asc):");
                        int[] arregloOrdenado = moAsc.sortByBubble(arreglo);
                        moAsc.printArregloBurAsc(arregloOrdenado);
                    }
                    if (opcionOrden == 2) {
                        System.out.println("Metodo Burbuja (Des):");
                        int[] arregloOrdenado = moDes.sortByBubbleDes(arreglo);
                        moDes.printArregloBurDes(arregloOrdenado);
                    }
                }
                //Metodo Seleccion
                if (mEscogido == 2) {
                    System.out.println("\nEscoja Ascendente o Descendente");
                    System.out.println("1. Ascendente");
                    System.out.println("2. Descendente");

                    int opcionOrden = sc.nextInt();
                    System.out.println();

                    if(opcionOrden == 1){
                        System.out.println("Metodo Seleccion (Asc):");
                        int[] arregloOrdenado = moAsc.sortBySeleccion(arreglo);
                        moAsc.printArregloSelAsc(arregloOrdenado);
                    }
                    if(opcionOrden == 2){
                        System.out.println("Metodo Seleccion (Des):");
                        int[] arregloOrdenado = moDes.sortBySeleccionDes(arreglo);
                        moDes.printArregloSelDes(arregloOrdenado);
                    }
                }
                //Metodo Insercion
                if(mEscogido == 3){
                    System.out.println("\nEscoja Ascendente o Descendente");
                    System.out.println("1. Ascendente");
                    System.out.println("2. Descendente");

                    int opcionOrden = sc.nextInt();
                    System.out.println();

                    if(opcionOrden == 1){
                        System.out.println("Metodo Insercion (Asc):");
                        int[] arregloOrdenado = moAsc.sortInsertion(arreglo);
                        moAsc.printArregloInsAsc(arregloOrdenado);
                    }
                    if(opcionOrden == 2){

                    }
                }
                //Metodo Burbuja con Ajuste
                if(mEscogido == 4){
                    System.out.println("\nEscoja Ascendente o Descendente");
                    System.out.println("1. Ascendente");
                    System.out.println("2. Descendente");

                    int opcionOrden = sc.nextInt();
                    System.out.println();

                    if(opcionOrden == 1){
                        System.out.println("Metodo Burbuja con Ajuste (Asc):");
                        int[] arregloOrdenado = moAsc.BurbujaAjuste(arreglo);
                        moAsc.printArregloBurAjsteAsc(arregloOrdenado);
                    }
                    if(opcionOrden == 2){

                    }
                }
                break;

            case 0:
                System.out.println("Saliendo del programa.");
                break;

            default:
                System.out.println("Opción no válida.");
                break;
        }

        sc.close();
    }

    public static int leerEnteroValido(Scanner sc, String mensaje, boolean permitirNegativos) {
        int numero;
        do {
            System.out.println(mensaje);
            while (!sc.hasNextInt()) {
                System.out.println("Ingrese correctamente un número entero:");
                sc.next();
            }
            numero = sc.nextInt();

            if (!permitirNegativos && numero < 0) {
                System.out.println("No se permiten números negativos. Ingrese un número entero positivo");
            }
        } while (!permitirNegativos && numero < 0);

        return numero;
    }
}
