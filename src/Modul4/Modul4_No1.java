package Modul4;
public class Modul4_No1 {
    
    public static void InsertionSort(int[] A){
        for (int i = 1; i < A.length; i++) {
            int key = A[i];
            int j = i - 1;
            while ((j >=0) && (A[j] > key)) {
                
                A[j + 1] = A[j];
                j--;
            }
            A[j + 1] = key;
        }
    }
    
    public static void Tampil(int data[]) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
    System.out.println();
    }
    
    public static void main(String[] args) {
        int A[] = {25, 7, 9, 13, 3};
        Modul4_No1.Tampil(A);
        Modul4_No1.InsertionSort(A);
        Modul4_No1.Tampil(A);
        
        System.out.println("Fajriya Hasna Putri");
    }
}
