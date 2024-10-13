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
            System.out.print(num + ",");
        }
    }


    // Metodo Burbuja con Ajuste
    public int[] BurbujaAjuste(int[] arreglo) {
        int n = arreglo.length;
        boolean intercambio = false;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - 1 - i; j++) {
                // System.out.println(" j=" + j + " [j]= " + arreglo[j] +
                // " j+1= " + j + 1 + " [j+1]= " + arreglo[j + 1]);
                if (arreglo[j] > arreglo[j + 1]) {
                    // System.out.println("Si hay cambio");
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

    public void printArregloBurAjsteAsc(int[] arreglo) {
        for (int num : arreglo) {
            System.out.print("|" + num + "|");
        }
    }
}