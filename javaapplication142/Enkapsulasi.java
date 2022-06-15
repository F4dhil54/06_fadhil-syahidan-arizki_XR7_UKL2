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
public class Enkapsulasi {
    private String nama;
    private String alamat;
    private String hobi;
    
    public String getNama() {
        return this.nama;
    }
    public String getAlamat() {
        return this.alamat;
    }
    public String gethobi() {
        return this.hobi;
    }


    public void ModifNama(String nama) {
        this.nama = nama;
    }
    public void ModifAlamat(String alamat) {
        this.alamat = alamat;
    }
    public void Modifhobi(String hobi) {
        this.hobi = hobi;
    }
}
    

