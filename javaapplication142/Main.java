/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication142;

/**
 *
 * @author LENOVO
 */
public class Main extends Enkapsulasi {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Enkapsulasi objek = new Enkapsulasi();
        objek.ModifNama("fadhil");
         objek.ModifAlamat("malang");
         objek.Modifhobi("sepakbola");
          System.out.println("Nama : " + objek.getNama());
          System.out.println("Alamat : " + objek.getAlamat());
          System.out.println("hobi : " + objek.gethobi());
    }
}
    

