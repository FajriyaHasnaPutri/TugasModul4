package Modul4;

public class Modul4_No2 {
    public static void BubbleSort(int[] B){
        int k=1, l, n = B.length;
        int temp;
        while (k<n){
            l = n-1 ;
            while(l>=k){
                if (B[l-1]>B[l]){
                    temp = B[l];
                    B[l] = B[l-1];
                    B[l-1] = temp;
                }
                l = l - 1;
            }
            k = k +1;
        }
    }
    
    public static void Tampil(int data[]) {
        for (int k = 0; k < data.length; k++) {
            System.out.print(data[k] + " ");
        }
        System.out.println();
    }
    
    
    public static void main(String[] args) {
        int B[] = {25, 7, 9, 13, 3};
        Modul4_No2.Tampil(B);
        Modul4_No2.BubbleSort(B);
        Modul4_No2.Tampil(B);
        
        System.out.println("Fajriya Hasna Putri");
        
    }
}
