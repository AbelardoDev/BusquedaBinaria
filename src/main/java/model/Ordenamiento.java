package model;

public class Ordenamiento {
    public int[] array = {5, 3, 8, 6, 9, 2, 7, 4, 1};

    public void exchange(int[] arreglo, int a, int b) {
        int temp = arreglo[a];
        arreglo[a] = arreglo[b];
        arreglo[b] = temp;
    }

    public int[] bubbleSort(int[] arreglo) {
        int n = arreglo.length;
        int[] temp = arreglo.clone();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (temp[j] > temp[j + 1]) {
                    exchange(temp, j, j + 1);
                }
            }
        }
        return temp;
    }

    public int[] exchangeSort(int [] arreglo) {
        int n = array.length;
        int[] temp = arreglo.clone();
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (temp[i] > temp[j]) {
                    exchange(temp, i, j);
                }
            }
        }
        return temp;
    }

    public int[] selectionSort(int[] arreglo) {
        int n = arreglo.length;
        int[] temp = arreglo.clone();
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (temp[j] < temp[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                exchange(temp, i, minIndex);
            }
        }
        return temp;
    }

    public int[] quickSort(int[] arreglo) {
        int n = arreglo.length;
        int[] temp = arreglo.clone();
        return temp;
    }

    public int[] shellSort(int[] arreglo) {
        int n = arreglo.length;
        int[] temp = arreglo.clone();
        return temp;
    }
}
