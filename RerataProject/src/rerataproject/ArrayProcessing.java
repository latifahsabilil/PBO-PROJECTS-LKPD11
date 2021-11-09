/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rerataproject;

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;
public class ArrayProcessing {
    int[] dataBil = new int[100];
    
    int n;
    
    int max;
    int min;
    
    
    void input(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan banyaknya data (n) : ");
        this.n = input.nextInt();
        
        for(int i=0; i<n; i++){
           System.out.print("Masukkan bil ke-"+(i+1)+ " : "); 
           this.dataBil[i] = input.nextInt();
        }        
        
    }
    
    double hitungRerata(int[] data){
        double sum = 0;
        for(int i=0; i<this.n; i++){
            sum += data[i];
        }
        double rerata = sum/this.n;
        return rerata;
    }
    
    int cariMax(){
        max = this.dataBil[0];
        
        for(int i=0; i<this.n; i++){
            if(this.dataBil[i] > max){
                max = this.dataBil[i];                
            }
        }        
        return max;
    }
    
    int cariMin(){
        min = this.dataBil[0];
        
        for(int i=0; i<this.n; i++){
            if(this.dataBil[i] < min){
                min = this.dataBil[i];                
            }
        }        
        return min;
    }
    
    void output(){
        System.out.println("Rerata : " + this.hitungRerata(this.dataBil));
        System.out.println("Nilai maksimum : " + this.cariMax());
        System.out.println("Nilai minimum : " + this.cariMin());
    }     
}
