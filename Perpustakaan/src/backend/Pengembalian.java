package backend;

import java.sql.*;
import java.util.ArrayList;

public class Pengembalian {
    private int idPengembalian;
    private Peminjaman peminjaman;
    private String tanggalKembali;
    private double denda;

    // Constructor
    public Pengembalian() {}

    public Pengembalian(Peminjaman peminjaman, String tanggalKembali, double denda) {
        this.peminjaman = peminjaman;
        this.tanggalKembali = tanggalKembali;
        this.denda = denda;
    }

    // Getter and Setter
    public int getIdPengembalian() {
        return idPengembalian;
    }

    public void setIdPengembalian(int idPengembalian) {
        this.idPengembalian = idPengembalian;
    }

    public Peminjaman getPeminjaman() {
        return peminjaman;
    }

    public void setPeminjaman(Peminjaman peminjaman) {
        this.peminjaman = peminjaman;
    }

    public String getTanggalKembali() {
        return tanggalKembali;
    }

    public void setTanggalKembali(String tanggalKembali) {
        this.tanggalKembali = tanggalKembali;
    }

    public double getDenda() {
        return denda;
    }

    public void setDenda(double denda) {
        this.denda = denda;
    }

    // Save data
    public void save() {
        if (getById(peminjaman.getIdPeminjaman()) == null) { // Check if the record does not exist
            String query = "INSERT INTO pengembalian (idpeminjaman, tanggalkembali, denda) VALUES (" 
                    + this.peminjaman.getIdPeminjaman() + ", '" 
                    + this.tanggalKembali + "', " 
                    + this.denda + ")";
            this.idPengembalian = DBHelper.insertQueryGetId(query);
        } else {
            String query = "UPDATE pengembalian SET tanggalkembali = '" + this.tanggalKembali 
                    + "', denda = " + this.denda 
                    + " WHERE idpeminjaman = " + this.peminjaman.getIdPeminjaman();
            DBHelper.executeQuery(query);
        }
    }

    // Get data by ID
    public Pengembalian getById(int idPeminjaman) {
        Pengembalian pengembalian = null;
        String query = "SELECT * FROM pengembalian WHERE idpeminjaman = " + idPeminjaman;
        ResultSet rs = DBHelper.selectQuery(query);
        try {
            if (rs.next()) {
                pengembalian = new Pengembalian();
                pengembalian.setIdPengembalian(rs.getInt("idpengembalian"));
                pengembalian.setPeminjaman(new Peminjaman().getById(rs.getInt("idpeminjaman")));
                pengembalian.setTanggalKembali(rs.getString("tanggalkembali"));
                pengembalian.setDenda(rs.getDouble("denda"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return pengembalian;
    }

    // Get all data
    public ArrayList<Pengembalian> getAll() {
        ArrayList<Pengembalian> listPengembalian = new ArrayList<>();
        String query = "SELECT * FROM pengembalian";
        ResultSet rs = DBHelper.selectQuery(query);

        try {
            while (rs.next()) {
                Pengembalian pengembalian = new Pengembalian();
                pengembalian.setIdPengembalian(rs.getInt("idpengembalian"));
                pengembalian.setPeminjaman(new Peminjaman().getById(rs.getInt("idpeminjaman")));
                pengembalian.setTanggalKembali(rs.getString("tanggalkembali"));
                pengembalian.setDenda(rs.getDouble("denda"));

                listPengembalian.add(pengembalian);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listPengembalian;
    }

    // Delete data
    public void delete() {
        String query = "DELETE FROM pengembalian WHERE idpengembalian = " + this.idPengembalian;
        DBHelper.executeQuery(query);
    }
}
