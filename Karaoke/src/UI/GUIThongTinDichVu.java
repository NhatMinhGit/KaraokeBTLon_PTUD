/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

/**
 *
 * @author Duong Ngo Manh
 */
public class GUIThongTinDichVu extends javax.swing.JFrame {

    /**
     * Creates new form GUIThongTinPhong
     */
    public GUIThongTinDichVu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblQuanLiThongTinDichVu = new javax.swing.JLabel();
        pnlThongTinDichVu = new javax.swing.JPanel();
        lblMaDichVu = new javax.swing.JLabel();
        lblTenDichVu = new javax.swing.JLabel();
        lblGiaBanDichVu = new javax.swing.JLabel();
        lblSoLuongDichVu = new javax.swing.JLabel();
        txtMaDichVu = new javax.swing.JTextField();
        txtTenDichVu = new javax.swing.JTextField();
        txtSoLuongDichVu = new javax.swing.JTextField();
        txtGiaBanDichVu = new javax.swing.JTextField();
        lblDonViTinh = new javax.swing.JLabel();
        cmbDonViTinhDichVu = new javax.swing.JComboBox<>();
        pnlChucNangQuanLiThongTinDichVu = new javax.swing.JPanel();
        lblTimDichVu = new javax.swing.JLabel();
        txtTimDichVu = new javax.swing.JTextField();
        btnThemThongTinDichVu = new javax.swing.JButton();
        btnLamMoiThongTinDichVu = new javax.swing.JButton();
        btnCapNhatThongTinDichVu = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        pnlDanhSachDichVu = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDanhSachDichVu = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnHeThong = new javax.swing.JMenu();
        mniTrangChu = new javax.swing.JMenuItem();
        mniTroGiup = new javax.swing.JMenuItem();
        mniDangXuat = new javax.swing.JMenuItem();
        mnDanhMuc = new javax.swing.JMenu();
        mniHoaDon = new javax.swing.JMenuItem();
        mniDichVu = new javax.swing.JMenuItem();
        mniKhuyenMai = new javax.swing.JMenuItem();
        mniKhachHang = new javax.swing.JMenuItem();
        mnDatPhong = new javax.swing.JMenu();
        mniDatPhong = new javax.swing.JMenuItem();
        mniDatPhongCho = new javax.swing.JMenuItem();
        mnThongKe = new javax.swing.JMenu();
        mniThongKeDanhThu = new javax.swing.JMenuItem();
        mniThongKeTheoKhachHang = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblQuanLiThongTinDichVu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblQuanLiThongTinDichVu.setText("QUẢN LÍ THÔNG TIN DỊCH VỤ");
        getContentPane().add(lblQuanLiThongTinDichVu, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 23, -1, -1));

        pnlThongTinDichVu.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "THÔNG TIN DỊCH VỤ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        lblMaDichVu.setText("Mã dịch vụ:");

        lblTenDichVu.setText("Tên dịch vụ:");

        lblGiaBanDichVu.setText("Giá bán:");

        lblSoLuongDichVu.setText("Số lượng:");

        txtMaDichVu.setText("DV001");

        txtTenDichVu.setText("Bia");

        txtSoLuongDichVu.setText("1");

        txtGiaBanDichVu.setText("20.000");
        txtGiaBanDichVu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGiaBanDichVuActionPerformed(evt);
            }
        });

        lblDonViTinh.setText("Đơn vị tính:");

        cmbDonViTinhDichVu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbDonViTinhDichVu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDonViTinhDichVuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlThongTinDichVuLayout = new javax.swing.GroupLayout(pnlThongTinDichVu);
        pnlThongTinDichVu.setLayout(pnlThongTinDichVuLayout);
        pnlThongTinDichVuLayout.setHorizontalGroup(
            pnlThongTinDichVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlThongTinDichVuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlThongTinDichVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTenDichVu)
                    .addComponent(lblMaDichVu)
                    .addComponent(lblSoLuongDichVu)
                    .addComponent(lblGiaBanDichVu)
                    .addComponent(lblDonViTinh))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlThongTinDichVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlThongTinDichVuLayout.createSequentialGroup()
                        .addGroup(pnlThongTinDichVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSoLuongDichVu)
                            .addComponent(txtMaDichVu)
                            .addComponent(txtTenDichVu)
                            .addComponent(txtGiaBanDichVu, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE))
                        .addGap(22, 22, 22))
                    .addGroup(pnlThongTinDichVuLayout.createSequentialGroup()
                        .addComponent(cmbDonViTinhDichVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pnlThongTinDichVuLayout.setVerticalGroup(
            pnlThongTinDichVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThongTinDichVuLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(pnlThongTinDichVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaDichVu)
                    .addComponent(txtMaDichVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlThongTinDichVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTenDichVu)
                    .addComponent(txtTenDichVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlThongTinDichVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSoLuongDichVu)
                    .addComponent(txtSoLuongDichVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlThongTinDichVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGiaBanDichVu, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGiaBanDichVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlThongTinDichVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDonViTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbDonViTinhDichVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(pnlThongTinDichVu, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 60, -1, -1));

        pnlChucNangQuanLiThongTinDichVu.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CHỨC NĂNG QUẢN LÍ THÔNG TIN DỊCH VỤ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        lblTimDichVu.setText("Tìm dịch vụ (nhập mã)");

        txtTimDichVu.setText("DV001");

        btnThemThongTinDichVu.setText("Thêm");

        btnLamMoiThongTinDichVu.setText("Làm mới");
        btnLamMoiThongTinDichVu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiThongTinDichVuActionPerformed(evt);
            }
        });

        btnCapNhatThongTinDichVu.setText("Cập nhật");

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-search-24.png"))); // NOI18N

        javax.swing.GroupLayout pnlChucNangQuanLiThongTinDichVuLayout = new javax.swing.GroupLayout(pnlChucNangQuanLiThongTinDichVu);
        pnlChucNangQuanLiThongTinDichVu.setLayout(pnlChucNangQuanLiThongTinDichVuLayout);
        pnlChucNangQuanLiThongTinDichVuLayout.setHorizontalGroup(
            pnlChucNangQuanLiThongTinDichVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlChucNangQuanLiThongTinDichVuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTimDichVu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTimDichVu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addGap(23, 23, 23))
            .addGroup(pnlChucNangQuanLiThongTinDichVuLayout.createSequentialGroup()
                .addGap(0, 8, Short.MAX_VALUE)
                .addComponent(btnThemThongTinDichVu, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnLamMoiThongTinDichVu, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnCapNhatThongTinDichVu, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );
        pnlChucNangQuanLiThongTinDichVuLayout.setVerticalGroup(
            pnlChucNangQuanLiThongTinDichVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlChucNangQuanLiThongTinDichVuLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(pnlChucNangQuanLiThongTinDichVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4)
                    .addGroup(pnlChucNangQuanLiThongTinDichVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTimDichVu, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblTimDichVu, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pnlChucNangQuanLiThongTinDichVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLamMoiThongTinDichVu, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCapNhatThongTinDichVu, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThemThongTinDichVu, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        getContentPane().add(pnlChucNangQuanLiThongTinDichVu, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 310, -1, -1));

        pnlDanhSachDichVu.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DANH SÁCH DỊCH VỤ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        tblDanhSachDichVu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã dịch vụ", "Tên dịch vụ", "Số lượng", "Giá bán", "Đơn vị tính"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDanhSachDichVu);

        javax.swing.GroupLayout pnlDanhSachDichVuLayout = new javax.swing.GroupLayout(pnlDanhSachDichVu);
        pnlDanhSachDichVu.setLayout(pnlDanhSachDichVuLayout);
        pnlDanhSachDichVuLayout.setHorizontalGroup(
            pnlDanhSachDichVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDanhSachDichVuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlDanhSachDichVuLayout.setVerticalGroup(
            pnlDanhSachDichVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDanhSachDichVuLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 137, Short.MAX_VALUE))
        );

        getContentPane().add(pnlDanhSachDichVu, new org.netbeans.lib.awtextra.AbsoluteConstraints(499, 60, 730, -1));

        mnHeThong.setText("Hệ Thống");

        mniTrangChu.setText("Trang chủ");
        mnHeThong.add(mniTrangChu);

        mniTroGiup.setText("Trợ giúp");
        mniTroGiup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniTroGiupActionPerformed(evt);
            }
        });
        mnHeThong.add(mniTroGiup);

        mniDangXuat.setText("Đăng xuất");
        mnHeThong.add(mniDangXuat);

        jMenuBar1.add(mnHeThong);

        mnDanhMuc.setText("Danh Mục");
        mnDanhMuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnDanhMucActionPerformed(evt);
            }
        });

        mniHoaDon.setText("Hóa đơn");
        mniHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniHoaDonActionPerformed(evt);
            }
        });
        mnDanhMuc.add(mniHoaDon);

        mniDichVu.setText("Dịch vụ");
        mniDichVu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDichVuActionPerformed(evt);
            }
        });
        mnDanhMuc.add(mniDichVu);

        mniKhuyenMai.setText("Khuyến mãi");
        mniKhuyenMai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniKhuyenMaiActionPerformed(evt);
            }
        });
        mnDanhMuc.add(mniKhuyenMai);

        mniKhachHang.setText("Khách hàng");
        mniKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniKhachHangActionPerformed(evt);
            }
        });
        mnDanhMuc.add(mniKhachHang);

        jMenuBar1.add(mnDanhMuc);

        mnDatPhong.setText("Đặt Phòng");

        mniDatPhong.setText("Đặt phòng");
        mniDatPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDatPhongActionPerformed(evt);
            }
        });
        mnDatPhong.add(mniDatPhong);

        mniDatPhongCho.setText("Đặt phòng chờ");
        mnDatPhong.add(mniDatPhongCho);

        jMenuBar1.add(mnDatPhong);

        mnThongKe.setText("Thống Kê");

        mniThongKeDanhThu.setText("Thống kê doanh thu");
        mniThongKeDanhThu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniThongKeDanhThuActionPerformed(evt);
            }
        });
        mnThongKe.add(mniThongKeDanhThu);

        mniThongKeTheoKhachHang.setText("Thống kê doanh thu theo khách hàng");
        mniThongKeTheoKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniThongKeTheoKhachHangActionPerformed(evt);
            }
        });
        mnThongKe.add(mniThongKeTheoKhachHang);

        jMenuBar1.add(mnThongKe);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniTroGiupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniTroGiupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mniTroGiupActionPerformed

    private void mniDichVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDichVuActionPerformed
        GUIThongTinDichVu ttdv = new GUIThongTinDichVu();
        ttdv.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mniDichVuActionPerformed

    private void mniKhuyenMaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniKhuyenMaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mniKhuyenMaiActionPerformed

    private void mniDatPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDatPhongActionPerformed
        // TODO add your handling code here:
        GUIThongTinDatPhong ttdp = new GUIThongTinDatPhong();
        ttdp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mniDatPhongActionPerformed

    private void mniThongKeTheoKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniThongKeTheoKhachHangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mniThongKeTheoKhachHangActionPerformed

    private void cmbDonViTinhDichVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDonViTinhDichVuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbDonViTinhDichVuActionPerformed

    private void txtGiaBanDichVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGiaBanDichVuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGiaBanDichVuActionPerformed

    private void btnLamMoiThongTinDichVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiThongTinDichVuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLamMoiThongTinDichVuActionPerformed

    private void mniKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniKhachHangActionPerformed
//        GUIThongTinKhachHang ttkh = new GUIThongTinKhachHang();
//        ttkh.setVisible(true);
//        this.setVisible(false);
    }//GEN-LAST:event_mniKhachHangActionPerformed

    private void mnDanhMucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnDanhMucActionPerformed
        
    }//GEN-LAST:event_mnDanhMucActionPerformed

    private void mniHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniHoaDonActionPerformed
        GUIThongTinHoaDon tthd = new GUIThongTinHoaDon();
        tthd.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mniHoaDonActionPerformed

    private void mniThongKeDanhThuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniThongKeDanhThuActionPerformed
        GUIThongKeDoanhThu tkdt = new GUIThongKeDoanhThu();
        tkdt.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mniThongKeDanhThuActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUIThongTinPhong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIThongTinPhong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIThongTinPhong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIThongTinPhong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIThongTinDichVu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhatThongTinDichVu;
    private javax.swing.JButton btnLamMoiThongTinDichVu;
    private javax.swing.JButton btnThemThongTinDichVu;
    private javax.swing.JComboBox<String> cmbDonViTinhDichVu;
    private javax.swing.JButton jButton4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDonViTinh;
    private javax.swing.JLabel lblGiaBanDichVu;
    private javax.swing.JLabel lblMaDichVu;
    private javax.swing.JLabel lblQuanLiThongTinDichVu;
    private javax.swing.JLabel lblSoLuongDichVu;
    private javax.swing.JLabel lblTenDichVu;
    private javax.swing.JLabel lblTimDichVu;
    private javax.swing.JMenu mnDanhMuc;
    private javax.swing.JMenu mnDatPhong;
    private javax.swing.JMenu mnHeThong;
    private javax.swing.JMenu mnThongKe;
    private javax.swing.JMenuItem mniDangXuat;
    private javax.swing.JMenuItem mniDatPhong;
    private javax.swing.JMenuItem mniDatPhongCho;
    private javax.swing.JMenuItem mniDichVu;
    private javax.swing.JMenuItem mniHoaDon;
    private javax.swing.JMenuItem mniKhachHang;
    private javax.swing.JMenuItem mniKhuyenMai;
    private javax.swing.JMenuItem mniThongKeDanhThu;
    private javax.swing.JMenuItem mniThongKeTheoKhachHang;
    private javax.swing.JMenuItem mniTrangChu;
    private javax.swing.JMenuItem mniTroGiup;
    private javax.swing.JPanel pnlChucNangQuanLiThongTinDichVu;
    private javax.swing.JPanel pnlDanhSachDichVu;
    private javax.swing.JPanel pnlThongTinDichVu;
    private javax.swing.JTable tblDanhSachDichVu;
    private javax.swing.JTextField txtGiaBanDichVu;
    private javax.swing.JTextField txtMaDichVu;
    private javax.swing.JTextField txtSoLuongDichVu;
    private javax.swing.JTextField txtTenDichVu;
    private javax.swing.JTextField txtTimDichVu;
    // End of variables declaration//GEN-END:variables
}