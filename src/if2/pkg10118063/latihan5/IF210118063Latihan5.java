/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if2.pkg10118063.latihan5;

/**
 *
 * @author 
 * NAMA   : Naufal Asha
 * KELAS  : IF-2
 * NIM    : 10118063
 */
public class IF210118063Latihan5 {
    int jumlahKambing = 80;
    
    public void getJumlahKambing() {
        System.out.println("Jumlah Kambing: " +jumlahKambing);
    }
    public void tambahKambing() {
        jumlahKambing = jumlahKambing + 19;
        System.out.println("Jumlah Kambing Setelah Ditambah: " +jumlahKambing);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IF210118063Latihan5 kambingSusu = new IF210118063Latihan5();
        
        //Menampilkan jumlah kambing yang ada saat first run
        kambingSusu.getJumlahKambing();
        
        //Menambah kambing
        kambingSusu.tambahKambing();
        
        //Menampilkan Jumlah Kambing
        kambingSusu.getJumlahKambing();
        
    }
    
}
