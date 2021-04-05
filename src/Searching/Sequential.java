package Searching;
import java.util.Scanner;

public class Sequential {
    public static void main (String[] args){
        String data[]= {"Galileo","Archimedes","Alkhawarizmi","Aljabar","Nama Mahasiswa","Tesla"};
        String search;
        
        Scanner scan = new Scanner (System.in);
        System.out.print("Masukkan data yang ingin dicari : ");
        search = scan.nextLine();
        System.out.println();
        
        System.out.print("Isi dari data adalah :");
                for(int i=0;i<data.length;i++){
                    System.out.print(data[i]+" ");
                }
                
                System.out.println("");
                
                for(int i=0;i<data.length;i++){
                    
            if(search.equalsIgnoreCase(data[i])){
                System.out.print("Data" + search + "ada pada indeks ke -"+i);
                break;
                
                }
            }
                System.out.println("\n");
                System.out.println();
        System.out.println("Ayikwati Muhfiyati");
      }
    }
