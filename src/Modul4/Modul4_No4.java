package Modul4;

public class Modul4_No4 {
    public static void ShellSort(int[] arr) {
        int q = arr.length;
        int Y, U ;
        int jarak, p, w, kondisi;
        boolean Sudah = true;
        int temp;
        Y = 0;
        U = 0;
        jarak = q;
        
        while (jarak >= 1){
            jarak = jarak / 2;
            Sudah = true;
            while (Sudah) {
                Sudah = false;
                for (w = 0; w < q - jarak; w++){
                    p = w + jarak;
                    Y++;
                    if (arr[w]> arr[p]) {
                        temp = arr[w];
                        arr[w] = arr[p];
                        arr[p] = temp;
                        Sudah = true;
                    }
                }
            }
        }
    }
    
    public static void tampil(int data[]){
        for(int p=0;p<data.length;p++)
            System.out.print(data[p]+ " ");
        System.out.println();
    }
    
    public static void main(String[] args) {
        int D[] = {25, 7, 9, 13, 3};
        Modul4_No4.tampil(D);
        Modul4_No4.ShellSort(D);
        Modul4_No4.tampil(D);
        
        System.out.println("Fajriya Hasna Putri");
    }
    
}
