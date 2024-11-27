/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Main {
    public static void main(String[] args) {
        Mahasiswa mh1 = new Mahasiswa("asep","123");
        Dosen d1 = new Dosen("ddd", "1234");
        Matakuliah m1 = new Matakuliah("sss", "333");
        
        Sistemnilai s1 = new Sistemnilai();
        
        s1.inputNilai(d1, mh1, m1, 90);
        s1.tampilkanNilai(mh1);
    }
}
