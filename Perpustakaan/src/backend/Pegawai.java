package backend;

import java.sql.ResultSet;
import java.util.ArrayList;

public class Pegawai {
    private int idPegawai;
    private String nama;
    private String alamat;
    private String noTelp;
    private String jabatan;
    private String username;
    private String password;

    public Pegawai() {
    }

    public Pegawai(String nama, String alamat, String noTelp, String jabatan, String username, String password) {
        this.nama = nama;
        this.alamat = alamat;
        this.noTelp = noTelp;
        this.jabatan = jabatan;
        this.username = username;
        this.password = password;
    }

    // Getters and Setters
    public int getIdPegawai() {
        return idPegawai;
    }

    public void setIdPegawai(int idPegawai) {
        this.idPegawai = idPegawai;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Pegawai getById(int id) {
        Pegawai pegawai = new Pegawai();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM pegawai WHERE idpegawai = '" + id + "'");

        try {
            while (rs.next()) {
                pegawai.setIdPegawai(rs.getInt("idpegawai"));
                pegawai.setNama(rs.getString("nama"));
                pegawai.setAlamat(rs.getString("alamat"));
                pegawai.setNoTelp(rs.getString("notelp"));
                pegawai.setJabatan(rs.getString("jabatan"));
                pegawai.setUsername(rs.getString("username"));
                pegawai.setPassword(rs.getString("password"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pegawai;
    }

   public ArrayList<Pegawai> getAll() {
        ArrayList<Pegawai> ListPegawai = new ArrayList<>();

        ResultSet rs = DBHelper.selectQuery("SELECT * FROM pegawai");

        try {
            while (rs.next()) {
                Pegawai peg = new Pegawai();
                peg.setIdPegawai(rs.getInt("idpegawai"));
                peg.setNama(rs.getString("nama"));
                peg.setAlamat(rs.getString("alamat"));
                peg.setNoTelp(rs.getString("notelp"));
                peg.setJabatan(rs.getString("jabatan"));
                peg.setUsername(rs.getString("username"));
                peg.setPassword(rs.getString("password"));

                ListPegawai.add(peg);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListPegawai;
    }

    public void save() {
        if (getById(idPegawai).getIdPegawai() == 0) {
            String SQL = "INSERT INTO pegawai (nama, alamat, notelp, jabatan, username, password) VALUES ('"
                    + this.nama + "', '"
                    + this.alamat + "', '"
                    + this.noTelp + "', '"
                    + this.jabatan + "', '"
                    + this.username + "', '"
                    + this.password + "')";

            this.idPegawai = DBHelper.insertQueryGetId(SQL);
        } else {
            String SQL = "UPDATE pegawai SET "
                    + "nama = '" + this.nama + "', "
                    + "alamat = '" + this.alamat + "', "
                    + "notelp = '" + this.noTelp + "', "
                    + "jabatan = '" + this.jabatan + "', "
                    + "username = '" + this.username + "', "
                    + "password = '" + this.password + "' "
                    + "WHERE idpegawai = '" + this.idPegawai + "'";
            DBHelper.executeQuery(SQL);
        }
    }

    public void delete() {
        String SQL = "DELETE FROM pegawai WHERE idpegawai = '" + this.idPegawai + "'";
        DBHelper.executeQuery(SQL);
    }
     public ArrayList<Pegawai> search(String keyword) {
        ArrayList<Pegawai> listPegawai = new ArrayList<>();
        String sql = "SELECT * FROM pegawai WHERE " +
                     "nama LIKE '%" + keyword + "%' " +
                     "OR alamat LIKE '%" + keyword + "%'";
        
        try {
            ResultSet rs = DBHelper.selectQuery(sql); // Asumsi DBHelper sudah ada
            while (rs.next()) {
                Pegawai pegawai = new Pegawai();
                pegawai.setIdPegawai(rs.getInt("idpegawai"));
                pegawai.setNama(rs.getString("nama"));
                pegawai.setAlamat(rs.getString("alamat"));
                pegawai.setNoTelp(rs.getString("notelp"));
                pegawai.setJabatan(rs.getString("jabatan"));
                pegawai.setUsername(rs.getString("username"));
                pegawai.setPassword(rs.getString("password"));
                listPegawai.add(pegawai);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return listPegawai;
    }
}

