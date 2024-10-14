import java.util.Arrays;

public class MetodosOrdenamientoAsc {
    // Metodo Burbuja
    public int[] sortByBubble(int[] arreglo) {
        int tamanio = arreglo.length;

        for (int i = 0; i < tamanio; i++) {

            for (int j = i + 1; j < tamanio; j++) {
                if (arreglo[i] > arreglo[j]) {
                    int aux = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = aux;
                }
            }
        }
        return arreglo;
    }

    public void printArregloBurAsc(int[] arreglo) {
        for (int elemento : arreglo) {
            System.out.print("|" + elemento + "|");
        }
    }

    public int[] sortByBubbleProc(int[] arreglo) {
        int tamanio = arreglo.length;

        for (int i = 0; i < tamanio; i++) {
            for (int j = i + 1; j < tamanio; j++) {
                if (arreglo[i] > arreglo[j]) {
                    int aux = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = aux;
                }
                System.out.println("Pos Menor: " + i + "  Pos j: " + j);
            }
        }
        return arreglo;
    }

    // Metodo Seleccion
    public int[] sortBySeleccion(int[] arreglo) {
        int tamanio = arreglo.length;

        for (int i = 0; i < tamanio; i++) {
            int indice = i;
            for (int j = i + 1; j < tamanio; j++) {
                if (arreglo[j] < arreglo[indice]) {
                    indice = j;
                }
            }
            int aux = arreglo[indice];
            arreglo[indice] = arreglo[i];
            arreglo[i] = aux;
        }
        return arreglo;
    }

    public void printArregloSelAsc(int[] arreglo) {
        for (int elemento : arreglo) {
            System.out.print("|" + elemento + "|");
        }
    }

    public int[] sortBySeleccionProc(int[] arreglo) {
        int tamanio = arreglo.length;

        for (int i = 0; i < tamanio; i++) {
            int indice = i;
            for (int j = i + 1; j < tamanio; j++) {
                if (arreglo[j] < arreglo[indice]) {
                    indice = j;
                }
            }
            int aux = arreglo[indice];
            arreglo[indice] = arreglo[i];
            arreglo[i] = aux;

            System.out.println("Pos menor: "+i+"  aux: "+aux);
        }
        return arreglo;
    }

    // Metodo Insercion
    public int[] sortInsertion(int[] arreglo) {
        int n = arreglo.length;
        for (int i = 1; i < n; i++) {
            int actual = arreglo[i];
            int j = i - 1;
            while (j >= 0 && arreglo[j] > actual) {
                arreglo[j + 1] = arreglo[j];
                j--;
            }
            arreglo[j + 1] = actual;
        }
        return arreglo;
    }

    public void printArregloInsAsc(int[] arreglo) {
        for (int num : arreglo) {
            System.out.print("|" + num + "|");
        }
    }

    public int[] sortInsertionProc(int[] arreglo, boolean logs) {
        if (logs) {
            System.out.println("Arreglo original: " + Arrays.toString(arreglo));
        }
        int n = arreglo.length;
        for (int i = 1; i < n; i++) {
            if (logs) {
                System.out.println("Pasada número " + i);
            }
            int actual = arreglo[i];
            int j = i - 1;
            if (logs) {
                System.out.println("\ti=" + i + " j=" + j + " [i]=" + arreglo[i] + " [j]=" + arreglo[j]);
            }
            while (j >= 0 && arreglo[j] > actual) {
                if (logs) {
                    System.out.println("\t\tComparamos " + actual + " con " + arreglo[j]);
                }
                arreglo[j + 1] = arreglo[j];
                j--;
                if (logs) {
                    System.out.println("\t\t--------" + Arrays.toString(arreglo));
                }
            }
            arreglo[j + 1] = actual;
            if (logs) {
                System.out.println("\t--------" + Arrays.toString(arreglo));
            }
        }
        return arreglo;
    }

    // Metodo Burbuja con Ajuste
    public int[] BurbujaAjuste(int[] arreglo) {
        int n = arreglo.length;
        boolean intercambio = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                    intercambio = true;
                }
            }
            if (!intercambio) {
                break;
            }
        }
        return arreglo;
    }

    public void printArregloBurAjsteAsc(int[] arreglo) {
        for (int num : arreglo) {
            System.out.print("|" + num + "|");
        }
    }

    public int[] BurbujaAjusteProc(int[] arreglo) {
        int n = arreglo.length;
        boolean intercambio = false;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - 1 - i; j++) {
                System.out.println(" j=" + j + " [j]= " + arreglo[j] +
                        " j+1= " + j + 1 + " [j+1]= " + arreglo[j + 1]);
                if (arreglo[j] > arreglo[j + 1]) {
                    System.out.println("Si hay cambio");
                    // Intercambio
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                    intercambio = true;
                }
            }
            if (!intercambio) {
                break;
            }
        }
        return arreglo;
    }
}