/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minmax2;

/**
 *
 * @author Ma'is
 */
import java.util.Scanner;
public class MinMax2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input=new Scanner (System.in);
        System.out.print("Masukan jumlah bilangan\t: ");
        int n= input.nextInt();
        int []a= new int [n];
        System.out.println("Masukan angka\t: ");
        for(int i=0;i<a.length;i++){
            a[i]=input.nextInt();}
        System.out.println("Angka anda adalah: ");
        for(int j=0;j<a.length;j++){
            System.out.println("Bilangan ke "+(j+1)+": "+a[j]);}
        System.out.println("");
        System.out.println("====================");
        int iMax = a[0];
        for(int i=1;i<a.length;i++){
            if(iMax < a[i]){
                iMax=a[i];}}
        int iMin=a[0];
        for(int i=1;i<a.length;i++){
            if(iMin>a[i]){
                iMin=a[i];}}
        System.out.println("\n");
        System.out.println("Nilai Maks\t: "+iMax+" ");
        System.out.println("Nilai Min\t: "+iMin+" ");
        int average;
        int total=0;
        for(int q=0;q<a.length;q++){
            total=total+a[q];}
        average=total/n;
        System.out.println("Rata-rata\t: "+average);  
        System.out.println("urutan bilangan dari kecil ke besar\t: ");
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(a[j]<a[i]){
                    int tmp=a[i];
                    a[i]=a[j];
                    a[j]=tmp;}}}
        for(int i=0;i<n;i++){
           System.out.print(a[i]+" ");}
        System.out.print("\n");
        System.out.println("Data yg ingin dicari\t: ");
        int index=input.nextInt();
        System.out.println("Nilai yang tertera\t: ");
        System.out.println(a[index-1]);              
        System.out.print("\n");
        System.out.println("urutan bilangan dari besar ke kecil\t: ");
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(a[j]>a[i]){
                int tmp=a[i];
                a[i]=a[j];
                a[j]=tmp;}}}
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");}
        System.out.print("\n");
        System.out.println("Data yg ingin dicari\t: ");
        index=input.nextInt();
        System.out.println("Nilai yang tertera\t: ");
        System.out.println(a[index-1]);
        }   
}
    