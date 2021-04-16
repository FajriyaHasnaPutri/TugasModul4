package Modul4;

public class Modul4_No3 {
    public static void SelectionSort(int[] C) {
        int smallIndex;
        int pass, e, m = C.length;
        int temp;
        
        for (pass = 0; pass < m - 1; pass++) {
            smallIndex = pass;
            for (e = pass + 1; e < m; e++) {
                if (C[e]< C[smallIndex]) {
                    smallIndex = e;
                }
            }
            temp = C[pass]; 
            C[pass] = C[smallIndex];
            C[smallIndex] = temp;
        }
    }
    
    public static void Tampil(int data[]) {
        for (int r = 0; r < data. length; r++) {
            System.out.print(data[r] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int C[] = {25, 7, 9, 13, 3};
        Modul4_No3.Tampil(C);
        Modul4_No3.SelectionSort(C);
        Modul4_No3.Tampil(C);
        
        System.out.println("Fajriya Hasna Putri");
    }
    
}
