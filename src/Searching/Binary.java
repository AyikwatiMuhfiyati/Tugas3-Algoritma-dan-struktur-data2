package Searching;
import java.util.Scanner;
public class Binary {
    public static void main (String[]args){
        int A [] ={2,4,6,8,10,12,14,16,18,20};
        int search;
        int Indeks1 = 0;//0
        int Indeks2 = A.length-1;
        int ketemu=0;
        int data=0;
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan data yang akan dicari");
        search=scan.nextInt();
        System.out.println();
        
        System.out.println("Isi dri Data adalah :");
        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
        System.out.println("");
        System.out.println("");
        
        while((Indeks1 <=Indeks2 &&(ketemu ==0))){
            data = (Indeks1 + Indeks2)/2;
            System.out.println("Indeks data :"+data);
            if(search == A[data]){
                ketemu = 1;
                System.out.println();
                System.out.println("Data" + search + "ada pada indeks ke-"+data);
                
            }
            else{
                if(search < A[data]){
                    System.out.println("Cari di sebelah kiri");
                    Indeks2 = data-1;
                    System.out.println("Cari di sebelah kanan"+"\n");
                }
            }
            if(ketemu == 1)
                System.out.println("keterangan : Data ditemukan"+"\n");
            else
                System.out.println("keterangan : Data tidak ditemukan"+"\n");
        }
        System.out.println();
        System.out.println("Ayikwati Muhfiyati");
        
    }
    
}
