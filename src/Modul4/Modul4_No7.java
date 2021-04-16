package Modul4;

import java.util.Scanner;

public class Modul4_No7 {
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
    
    public static void main(String[] args){
        int A[] = {25, 7, 9, 13, 3};
            int search;
        boolean ketemu = false;
        Scanner scan = new Scanner(System.in);
        System.out.println("Isi data adalah: ");
        Tampil(A);
        
        System.out.println("Isi data setelah disorting: ");
        InsertionSort(A);
        Tampil(A);
        
        System.out.println("");
        
        System.out.print("Masukan data yang dicari: ");
        search = scan.nextInt();
        
        for (int i = 0; i < A.length; i++){
        if (search == A[i]){
            ketemu = true;
            System.out.print("Data " + search +"berada pada index ke- " +i);
        }
        
        
    }
    System.out.println();
    
    if(ketemu == true){
        System.out.println("Data ditemukan");
    }else{
        System.out.println("Data tidak ditemukan");
    }
            System.out.println("Fajriya Hasna Putri");
    }
}
