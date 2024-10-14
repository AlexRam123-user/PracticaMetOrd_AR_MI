import java.util.Arrays;

public class MetodosOrdenamientoDes {
    // Metodo Burbuja
    public int[] sortByBubbleDes(int[] arregloDes) {

        int tamanio = arregloDes.length;

        for (int i = 0; i < tamanio - 1; i++) {
            for (int j = 0; j < tamanio - i - 1; j++) {
                if (arregloDes[j] < arregloDes[j + 1]) {
                    int aux = arregloDes[j];
                    arregloDes[j] = arregloDes[j + 1];
                    arregloDes[j + 1] = aux;
                }
            }
        }
        return arregloDes;
    }

    public void printArregloBurDes(int[] arregloDes) {
        for (int elemento : arregloDes) {
            System.out.print("|" + elemento + "|");
        }
    }

    public int[] sortByBubbleDesProc(int[] arregloDes) {

        int tamanio = arregloDes.length;

        for (int i = 0; i < tamanio - 1; i++) {
            for (int j = 0; j < tamanio - i - 1; j++) {
                if (arregloDes[j] < arregloDes[j + 1]) {
                    int aux = arregloDes[j];
                    arregloDes[j] = arregloDes[j + 1];
                    arregloDes[j + 1] = aux;
                }
                System.out.println("Pos Menor: " + j + "  Pos i " + i);
            }
        }
        return arregloDes;
    }

    // Metodo Seleccion
    public int[] sortBySeleccionDes(int[] arreglo) {
        int tamanio = arreglo.length;

        for (int i = 0; i < tamanio; i++) {
            int indice = i;
            for (int j = i + 1; j < tamanio; j++) {
                if (arreglo[j] > arreglo[indice]) {
                    indice = j;
                }
            }
            int aux = arreglo[indice];
            arreglo[indice] = arreglo[i];
            arreglo[i] = aux;
        }
        return arreglo;
    }

    public void printArregloSelDes(int[] arreglo) {
        for (int elemento : arreglo) {
            System.out.print("|" + elemento + "|");
        }
    }

    public int[] sortBySeleccionDesProc(int[] arreglo) {
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
    public int[] sortInsertionDes(int[] arreglo) {
        int n = arreglo.length;
        for (int i = 1; i < n; i++) {
            int actual = arreglo[i];
            int j = i - 1;
            while (j >= 0 && arreglo[j] < actual) {
                arreglo[j + 1] = arreglo[j];
                j--;
            }
            arreglo[j + 1] = actual;
        }
        return arreglo;
    }

    public void printArregloInsDes(int[] arreglo) {
        for (int num : arreglo) {
            System.out.print("|" + num + "|");
        }
    }

    public int[] sortInsertionDesProc(int[] arreglo, boolean logs) {
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
    public int[] BurbujaAjusteDes(int[] arreglo) {
        int n = arreglo.length;
        boolean intercambio = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arreglo[j] < arreglo[j + 1]) {
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

    public void printArregloBurAjsteDes(int[] arreglo) {
        for (int num : arreglo) {
            System.out.print("|" + num + "|");
        }
    }

    public int[] BurbujaAjusteDesProc(int[] arreglo) {
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
