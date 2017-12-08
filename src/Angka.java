/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Angka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int bil1 = 10;
    
    byte bil2= (byte) bil1; // --> di casting
    
        System.out.println("Byte 2= : " +bil2);
        
        byte b = 3;
        short s = 34;
        int i = 56;
        long l = 123;
//semuanya bil bulat
        // TODO code application logic here

s=b;
l=i;
i=s;
l=b;

    }

}
