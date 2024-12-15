package frontend;

import backend.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmPengembalian extends javax.swing.JFrame {

    public FrmPengembalian() {
        initComponents();
        tampilkanDataPengembalian();
        kosongkanForm();
    }

    private void kosongkanForm() {
        txtIdPengembalian.setText("0");
        txtIdPeminjaman.setText("");
        txtTanggalKembali.setText("");
        txtDenda.setText("");
    }

    private void tampilkanDataPengembalian() {
        String[] kolom = {"ID", "Peminjaman", "Tanggal Kembali", "Denda"};
        ArrayList<Pengembalian> list = new Pengembalian().getAll();
        Object rowData[] = new Object[4];

        tblPengembalian.setModel(new DefaultTableModel(new Object[][]{}, kolom));

        for (Pengembalian p : list) {
            rowData[0] = p.getIdPengembalian();
            rowData[1] = p.getPeminjaman().getIdPeminjaman(); // Menampilkan ID Peminjaman
            rowData[2] = p.getTanggalKembali();
            rowData[3] = p.getDenda();

            ((DefaultTableModel) tblPengembalian.getModel()).addRow(rowData);
        }
    }

    private void simpanPengembalian() {
        String idPeminjaman = txtIdPeminjaman.getText();
        String tanggalKembali = txtTanggalKembali.getText();
        double denda = Double.parseDouble(txtDenda.getText());

        Peminjaman peminjaman = new Peminjaman().getById(Integer.parseInt(idPeminjaman));

        if (peminjaman != null) {
            Pengembalian pengembalian = new Pengembalian(peminjaman, tanggalKembali, denda);
            pengembalian.save();
            JOptionPane.showMessageDialog(null, "Pengembalian berhasil disimpan.");
            tampilkanDataPengembalian();
            kosongkanForm();
        } else {
            JOptionPane.showMessageDialog(null, "Peminjaman tidak ditemukan.");
        }
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPengembalian = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtIdPengembalian = new javax.swing.JTextField();
        txtIdPeminjaman = new javax.swing.JTextField();
        txtTanggalKembali = new javax.swing.JTextField();
        txtDenda = new javax.swing.JTextField();
        jButtonSimpan = new javax.swing.JButton();
        jButtonHapus = new javax.swing.JButton();
        jButtonTambahBaru = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ID Pengembalian");

        jLabel2.setText("ID Peminjaman");

        jLabel3.setText("Tanggal Kembali");

        jLabel4.setText("Denda");

        txtIdPengembalian.setEditable(false);

        jButtonSimpan.setText("Simpan");
        jButtonSimpan.addActionListener(evt -> simpanPengembalian());

        jButtonHapus.setText("Hapus");
        jButtonHapus.addActionListener(evt -> hapusPengembalian());

        jButtonTambahBaru.setText("Tambah Baru");
        jButtonTambahBaru.addActionListener(evt -> kosongkanForm());

        tblPengembalian.setModel(new javax.swing.table.DefaultTableModel(
            new Object[][] {},
            new String[] {"ID", "Peminjaman", "Tanggal Kembali", "Denda"}
        ));
        jScrollPane2.setViewportView(tblPengembalian);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonSimpan)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jButtonTambahBaru))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonHapus)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtIdPengembalian)
                                    .addComponent(txtIdPeminjaman)
                                    .addComponent(txtTanggalKembali)
                                    .addComponent(txtDenda, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE))
                                .addGap(18, 18, 18))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIdPengembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIdPeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTanggalKembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(jButtonSimpan)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonTambahBaru)
                    .addComponent(jButtonHapus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }

    private void hapusPengembalian() {
        String idPengembalian = txtIdPengembalian.getText();
        Pengembalian pengembalian = new Pengembalian();
        pengembalian.setIdPengembalian(Integer.parseInt(idPengembalian));
        pengembalian.delete();
        JOptionPane.showMessageDialog(null, "Pengembalian berhasil dihapus.");
        tampilkanDataPengembalian();
        kosongkanForm();
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new FrmPengembalian().setVisible(true));
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButtonSimpan;
    private javax.swing.JButton jButtonHapus;
    private javax.swing.JButton jButtonTambahBaru;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblPengembalian;
    private javax.swing.JTextField txtIdPeminjaman;
    private javax.swing.JTextField txtTanggalKembali;
    private javax.swing.JTextField txtDenda;
    private javax.swing.JTextField txtIdPengembalian;
    // End of variables declaration                   
}
