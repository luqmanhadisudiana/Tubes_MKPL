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
public class MOD3_PBO {
    

    public static void main(String[] args) {
        prodi pr1 = new prodi ();
        pr1.setCode("SE");
        pr1.setName("Rekayasa Perangkat Lunak");

        
        prodi pr2 = new prodi ();
        pr2.setCode("IT");
        pr2.setName("Teknologi Informasi");
        
        
        mahasiswa mhs = new mahasiswa();
        mhs.setNim("1302191234");
        mhs.setNama("Eren Yeager");
        mhs.setProdi(pr1);
       
        
        mahasiswa mhs2 = new mahasiswa();
        mhs2.setNim("1303205555");
        mhs2.setNama("Armin Arlert");
        mhs2.setProdi(pr2);
        
        mahasiswa mhs3 = new mahasiswa();
        mhs3.setNim("1302990001");
        mhs3.setNama("Mikasa Ackerman");
        mhs3.setProdi(pr1);
        
        System.out.print("mhs1 : ");
        mhs.play();
        System.out.println(" ");
        System.out.print("mhs2 : ");
        mhs2.play();
        System.out.println(" ");
        System.out.print("mhs3 : ");
        mhs3.play();
        System.out.println(" ");
    }

}
