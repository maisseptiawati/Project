/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coba2;

/**
 *
 * @author Ma'is
 */
import java.util.Scanner;
public class Coba2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String a   = "y" ;
      int poin   = 0 ;
      int jawab ;

      do {
        System.out.println ("Skor pertama anda adalah Nol");
        System.out.println ("Jika jawaban  anda benar Bertambah 1");
        System.out.println ("Jika jawaban  anda salah Dikurangi 1");
            Scanner scan = new Scanner (System.in);

        System.out.print(" 5 + 1 = ");
        jawab = scan.nextInt();
            if(jawab==6){
                System.out.println("jawaban Anda benar");
                System.out.print("poin Anda adalah :");
                System.out.println(poin+=1);}
 
            else {
                System.out.println("jawaban Anda salah");
                System.out.print("poin anda adalah : ");
                System.out.println(poin-=1);}
 
        System.out.print(" 6 : 2 = ");
        jawab = scan.nextInt();
            if(jawab==3){
                System.out.println("jawaban Anda benar");
                System.out.print("poin Anda adalah : ");
                System.out.println(poin+=1);}
 
            else {
                System.out.println("jawaban Anda salah");
                System.out.print("poin Anda adalah : ");
                System.out.println(poin-=1);}
   
        System.out.print(" 5 + 5 = ");
        jawab = scan.nextInt();
            if(jawab==10){
                System.out.println("jawaban Anda benar");
                System.out.print("poin Anda adalah : ");
                System.out.println(poin+=1);}
 
            else {
                System.out.println("jawaban Anda salah");
                System.out.print("poin Anda adalah : ");
                System.out.println(poin-=1);}
 
        System.out.print(" 5 x 5 = ");
        jawab = scan.nextInt();
            if(jawab==25){
                System.out.println("jawaban Anda benar");
                System.out.print("poin Anda adalah : ");
                System.out.println(poin+=1);}
 
            else {
                System.out.println("jawab Anda salah");
                System.out.print("poin Anda adalah : ");
                System.out.println(poin-=1);}
 
        System.out.print(" 12 + 8 = ");
        jawab = scan.nextInt();
            if(jawab==20){
                System.out.println("jawaban Anda benar");
                System.out.print("poin Anda adalah : ");
                System.out.println(poin+=1);}
 
            else {
                System.out.println("jawaban Anda salah");
                System.out.print("poin anda adalah : ");
                System.out.println(poin-=1);}
 
        System.out.print(" 4 x 4 = ");
        jawab = scan.nextInt();
            if(jawab==16){
                System.out.println("jawaban Anda benar");
                System.out.print("poin Anda adalah : ");
                System.out.println(poin+=1);}
 
            else {
                System.out.println("jawaban Anda salah");
                System.out.print("poin Anda adalah : ");
                System.out.println(poin-=1);}
 
        System.out.print(" 20 + 21 = ");
        jawab = scan.nextInt();
            if(jawab==41){
                System.out.println("jawaban Anda benar");
                System.out.print("poin Anda adalah : ");
                System.out.println(poin+=1);}
 
            else {
                 System.out.println("jawaban Anda salah");
                 System.out.print("poin Anda adalah : ");
                System.out.println(poin-=1);}

        System.out.print(" 10 + 65 = ");
        jawab = scan.nextInt();
            if(jawab==75){
                System.out.println("jawaban Anda benar");
                System.out.print("poin Anda adalah:");
                System.out.println(poin+=1);}
 
            else {
                System.out.println("jawaban Anda salah");
                System.out.print("poin Anda adalah : ");
                System.out.println(poin-=1);}
 
        System.out.print(" 100 - 25 = ");
        jawab = scan.nextInt();
            if(jawab==75){
                System.out.println("jawaban Andabenar");
                System.out.print("poin Anda adalah:");
                System.out.println(poin+=1);}
 
            else {
                System.out.println("jawaban Anda salah");
                System.out.print("poin Anda adalah : ");
                System.out.println(poin-=1);}
 
        System.out.print(" 12 + 7 = ");
        jawab = scan.nextInt();
            if(jawab==19){
                System.out.println("jawaban Anda benar");
                System.out.print("poin Anda adalah : ");
                System.out.println(poin+=1);}

            else {
                System.out.println("jawaban Anda salah");
                System.out.print("poin Anda adalah : ");
                System.out.println(poin-=1);}
                System.out.println("Jumlah poin Anda adalah " +poin);

            System.out.println("apakah Anda ingin mengulang ? (y/t)");
        a = scan.next();
      }while ("y".equals(a) );
  
    }
}
  
