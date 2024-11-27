
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Sistemnilai {
    
  public List<Nilai> daftarNilai;

    public Sistemnilai() {
        this.daftarNilai = new ArrayList<>();
    }

    public void inputNilai(Dosen dosen, Mahasiswa mahasiswa, Matakuliah mataKuliah, int nilai) {
        Nilai nilaiBaru = new Nilai(mahasiswa, mataKuliah, nilai);
        daftarNilai.add(nilaiBaru);
        System.out.println("Nilai berhasil diinputkan oleh dosen " + dosen.getNama());
    }

    public void tampilkanNilai(Mahasiswa mahasiswa) {
        System.out.println("Nilai untuk mahasiswa " + mahasiswa.getNama() + ":");
        for (Nilai nilai : daftarNilai) {
            if (nilai.getMhs().getID().equals(mahasiswa.getID())) {
                System.out.println(nilai.getMk().getNama() + ": " + nilai.getNilai());
            }
        }
    }
}
