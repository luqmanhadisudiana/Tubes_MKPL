/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mod3_pbo;

/**
 *
 * @author Hadi
 */
public class mahasiswa {
    String Nim, Nama;
    prodi Prodi;

    public String getNim() {
        return Nim;
    }

    public void setNim(String Nim) {
        this.Nim = Nim;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getProdi() {
        String nami = Prodi.name;
        String kode = Prodi.code;
        String gab = "[" + nami + "]"+" ("+ kode+")";
        return gab;
    }

    public void setProdi(prodi Prodi) {
        this.Prodi = Prodi;
    }
        
    public int getAngkatan(){
        char kodeAngkatan1 = Nim.charAt(4);
        char kodeAngkatan2 = Nim.charAt(5);
        
        String Angkatan1 = Character.toString(kodeAngkatan1);
        String Angkatan2 = Character.toString(kodeAngkatan2);
        
        String outputAKT = Angkatan1 + Angkatan2;
        
        int namaAKT = Integer.parseInt(outputAKT);
        return namaAKT;
    }   
    public void play(){
        System.out.print(" "+ getProdi());
        System.out.print(" "+getNim());
        System.out.print(" "+getNama()+" || ");
        System.out.print("Angkatan : "+getAngkatan());
    }
        
}
