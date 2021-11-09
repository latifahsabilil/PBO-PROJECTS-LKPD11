/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplearraylist;

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;
import java.util.ArrayList;
import static java.util.Collections.binarySearch;

public class arrayList {
    
    int menu;
    
    ArrayList<String> array = new ArrayList<>();
    
    void tambah() {
        Scanner tambah = new Scanner(System.in);
        
        System.out.print("Masukkan data string: ");
        array.add(tambah.nextLine());
        System.out.println("Daftar string dalam array list:" + array);
    }
    
    void cari() {
        Scanner cari = new Scanner(System.in);
        
        System.out.print("String yang mau dicari: ");       
        String src = cari.nextLine();
        
        if(binarySearch(array, src) > -1){
            System.out.println("String " + src + " ada di index ke " + binarySearch(array,src) +" di dalam data");
        } else {
            System.out.println("String " + src + " tidak ada dalam data");
        }
        
    }
    void hapus() {
        Scanner hapus = new Scanner(System.in);
        
        System.out.print("String yang ingin dihapus: ");
        
        String del = hapus.nextLine();
        if(binarySearch(array, del) > -1){
            
            array.remove(binarySearch(array, del));
            System.out.println("String " + del + " sudah dihapus didalam data");
            
        } else {
            System.out.println("String " + del + " tidak ada dalam data");
        }
        
    }
    
    void tampil() {
        System.out.println("Daftar string dalam array list:" + array);
    }
    
    void keluar(){
        System.exit(0);
    }
    
    void input(){
        while(true){
            
            System.out.println("1.Tambah data");
            System.out.println("2.Cari Data");
            System.out.println("3.Hapus Data");
            System.out.println("4.Tampil Data");
            System.out.println("5.Keluar");
            
            Scanner input = new Scanner(System.in);
            System.out.print("Pilih nomor berapa : ");
            this.menu = input.nextInt();

            switch (menu) {
                case 1:
                    tambah();
                    break;
                    
                case 2:
                    cari();
                    break;
                
                case 3:
                    hapus();
                    break;
                    
                case 4:
                    tampil();
                    break;
                    
                case 5:
                    keluar();
            }
            
        }
    }
    
    
}
