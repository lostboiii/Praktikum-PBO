package backend;

import java.sql.*;
import java.util.ArrayList;

public class Peminjaman {
    private int idPeminjaman;
    private Anggota anggota;
    private Buku buku;
    private String tanggalPinjam;
    private String tanggalKembali;

    // Constructor
    public Peminjaman() {}

    public Peminjaman(Anggota anggota, Buku buku, String tanggalPinjam, String tanggalKembali) {
        this.anggota = anggota;
        this.buku = buku;
        this.tanggalPinjam = tanggalPinjam;
        this.tanggalKembali = tanggalKembali;
    }

    // Getter and Setter
    public int getIdPeminjaman() {
        return idPeminjaman;
    }

    public void setIdPeminjaman(int idPeminjaman) {
        this.idPeminjaman = idPeminjaman;
    }

    public Anggota getAnggota() {
        return anggota;
    }

    public void setAnggota(Anggota anggota) {
        this.anggota = anggota;
    }

    public Buku getBuku() {
        return buku;
    }

    public void setBuku(Buku buku) {
        this.buku = buku;
    }

    public String getTanggalPinjam() {
        return tanggalPinjam;
    }

    public void setTanggalPinjam(String tanggalPinjam) {
        this.tanggalPinjam = tanggalPinjam;
    }

    public String getTanggalKembali() {
        return tanggalKembali;
    }

    public void setTanggalKembali(String tanggalKembali) {
        this.tanggalKembali = tanggalKembali;
    }

    // Get data by ID
    public Peminjaman getById(int id) {
        Peminjaman peminjaman = null;
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM peminjaman WHERE idpeminjaman = " + id);

        try {
            if (rs.next()) {
                peminjaman = new Peminjaman();
                peminjaman.setIdPeminjaman(rs.getInt("idpeminjaman"));
                peminjaman.setAnggota(new Anggota().getById(rs.getInt("idanggota")));
                peminjaman.setBuku(new Buku().getById(rs.getInt("idbuku")));
                peminjaman.setTanggalPinjam(rs.getString("tanggalpinjam"));
                peminjaman.setTanggalKembali(rs.getString("tanggalkembali"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return peminjaman;
    }

    // Get all data
    public ArrayList<Peminjaman> getAll() {
        ArrayList<Peminjaman> listPeminjaman = new ArrayList<>();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM peminjaman");

        try {
            while (rs.next()) {
                Peminjaman peminjaman = new Peminjaman();
                peminjaman.setIdPeminjaman(rs.getInt("idpeminjaman"));
                peminjaman.setAnggota(new Anggota().getById(rs.getInt("idanggota")));
                peminjaman.setBuku(new Buku().getById(rs.getInt("idbuku")));
                peminjaman.setTanggalPinjam(rs.getString("tanggalpinjam"));
                peminjaman.setTanggalKembali(rs.getString("tanggalkembali"));

                listPeminjaman.add(peminjaman);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listPeminjaman;
    }

    // Save data
   public void save() {
    if (getById(idPeminjaman) == null) { // Check if the record does not exist
        String query = "INSERT INTO peminjaman (idanggota, idbuku, tanggalpinjam, tanggalkembali) VALUES ("
                + this.getAnggota().getIdanggota() + ", "
                + this.getBuku().getIdbuku() + ", '"
                + this.getTanggalPinjam() + "', "
                + (this.getTanggalKembali() != null ? "'" + this.getTanggalKembali() + "'" : "NULL") + ")";
        this.idPeminjaman = DBHelper.insertQueryGetId(query);
    } else {
        String query = "UPDATE peminjaman SET idanggota = " + this.getAnggota().getIdanggota()
                + ", idbuku = " + this.getBuku().getIdbuku()
                + ", tanggalpinjam = '" + this.getTanggalPinjam() + "', "
                + "tanggalkembali = " + (this.getTanggalKembali() != null ? "'" + this.getTanggalKembali() + "'" : "NULL")
                + " WHERE idpeminjaman = " + this.idPeminjaman;
        DBHelper.executeQuery(query);
    }
}


    // Delete data
    public void delete() {
        String query = "DELETE FROM peminjaman WHERE idpeminjaman = " + this.idPeminjaman;
        DBHelper.executeQuery(query);
    }
}
