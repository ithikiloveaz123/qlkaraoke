/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import connect.Connect;
import dao.KhachHang_DAO;
import entity.ChucVu;
import entity.KhachHang;
import entity.NhanVien;

/**
 *
 * @author dell
 */
public class JPanel_DMKhachHang extends javax.swing.JPanel {
	private KhachHang_DAO khachHang_DAO;
	private DefaultTableModel model;

    /**
     * Creates new form Panel1
     */
    public JPanel_DMKhachHang() {
        initComponents();
        tblKhachHang.getTableHeader().setFont(new Font("Segoe UI", Font.PLAIN, 18));
        model = (DefaultTableModel) tblKhachHang.getModel();
		try {
			Connect.getInstance().connect();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		khachHang_DAO = new KhachHang_DAO();
		DocDuLieuDatabaseVaoTable();
        txtMaKH.setText(khachHang_DAO.getMaKH());
    }
    
    public static JTable getTblKH() {
    	return tblKhachHang;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlThongTinKH = new javax.swing.JPanel();
        lblMaKH = new javax.swing.JLabel();
        txtMaKH = new javax.swing.JTextField();
        lblGioiTinh = new javax.swing.JLabel();
        lblTenKH = new javax.swing.JLabel();
        txtTenKH = new javax.swing.JTextField();
        lblSDT = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        cboGioiTinh = new javax.swing.JComboBox<>();
        pnlSuKien = new javax.swing.JPanel();
        btnCapNhat = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnXoaTrang = new javax.swing.JButton();
        pnlDanhSachKH = new javax.swing.JPanel();
        scr = new javax.swing.JScrollPane();
        tblKhachHang = new javax.swing.JTable();

        pnlThongTinKH.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông Tin Khách Hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 20))); // NOI18N
        pnlThongTinKH.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lblMaKH.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblMaKH.setText("Mã KH:");

        txtMaKH.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtMaKH.setMinimumSize(new java.awt.Dimension(50, 35));

        lblGioiTinh.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblGioiTinh.setText("Giới Tính:");

        lblTenKH.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTenKH.setText("Tên KH:");

        txtTenKH.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtTenKH.setMinimumSize(new java.awt.Dimension(50, 35));

        lblSDT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblSDT.setText("Số Điện Thoại:");

        txtSDT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtSDT.setMinimumSize(new java.awt.Dimension(50, 35));

        cboGioiTinh.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cboGioiTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));
        cboGioiTinh.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cboGioiTinh.setMinimumSize(new java.awt.Dimension(50, 35));

        javax.swing.GroupLayout pnlThongTinKHLayout = new javax.swing.GroupLayout(pnlThongTinKH);
        pnlThongTinKH.setLayout(pnlThongTinKHLayout);
        pnlThongTinKHLayout.setHorizontalGroup(
            pnlThongTinKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThongTinKHLayout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addGroup(pnlThongTinKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblMaKH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblGioiTinh, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlThongTinKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboGioiTinh, 0, 407, Short.MAX_VALUE)
                    .addComponent(txtMaKH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(110, 110, 110)
                .addGroup(pnlThongTinKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblSDT, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                    .addComponent(lblTenKH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlThongTinKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSDT, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
                    .addComponent(txtTenKH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(295, 295, 295))
        );
        pnlThongTinKHLayout.setVerticalGroup(
            pnlThongTinKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThongTinKHLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(pnlThongTinKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(pnlThongTinKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        btnCapNhat.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnCapNhat.setBackground(new Color(0,191,255));
        btnCapNhat.setIcon(new javax.swing.ImageIcon("icon/CN-icon.png")); // NOI18N
        btnCapNhat.setText("Cập Nhật");
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });

        btnXoa.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnXoa.setBackground(new Color(0,191,255));
        btnXoa.setIcon(new javax.swing.ImageIcon("icon/Xoa_icon.png")); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnThem.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnThem.setBackground(new Color(0,191,255));
        btnThem.setIcon(new javax.swing.ImageIcon("icon/Them_icon.png")); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoaTrang.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnXoaTrang.setBackground(new Color(0,191,255));
        btnXoaTrang.setIcon(new javax.swing.ImageIcon("icon/XT_icon.png")); // NOI18N
        btnXoaTrang.setText("Xóa Trắng");
        btnXoaTrang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaTrangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlSuKienLayout = new javax.swing.GroupLayout(pnlSuKien);
        pnlSuKien.setLayout(pnlSuKienLayout);
        pnlSuKienLayout.setHorizontalGroup(
            pnlSuKienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSuKienLayout.createSequentialGroup()
                .addContainerGap(323, Short.MAX_VALUE)
                .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                .addComponent(btnCapNhat, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 146, Short.MAX_VALUE)
                .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                .addComponent(btnXoaTrang, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                .addContainerGap(325, Short.MAX_VALUE))
        );
        pnlSuKienLayout.setVerticalGroup(
            pnlSuKienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSuKienLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pnlSuKienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(btnCapNhat, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(btnXoaTrang, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)))
        );

        pnlDanhSachKH.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh Sách Khách Hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 20))); // NOI18N
        pnlDanhSachKH.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        tblKhachHang.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tblKhachHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Mã Khách Hàng", "Tên Khách Hàng", "Giới Tính", "Số Điện Thoại"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblKhachHang.setRowHeight(30);
        tblKhachHang.getTableHeader().setBackground(new Color(255, 127, 0));
        tblKhachHang.setShowHorizontalLines(true);
        tblKhachHang.setShowVerticalLines(true);
        scr.setViewportView(tblKhachHang);

        javax.swing.GroupLayout pnlDanhSachKHLayout = new javax.swing.GroupLayout(pnlDanhSachKH);
        pnlDanhSachKH.setLayout(pnlDanhSachKHLayout);
        pnlDanhSachKHLayout.setHorizontalGroup(
            pnlDanhSachKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(pnlDanhSachKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(scr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1569, Short.MAX_VALUE))
        );
        pnlDanhSachKHLayout.setVerticalGroup(
            pnlDanhSachKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 466, Short.MAX_VALUE)
            .addGroup(pnlDanhSachKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(scr, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlThongTinKH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlDanhSachKH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlSuKien, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlThongTinKH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlSuKien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlDanhSachKH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
		tblKhachHang.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				int row = tblKhachHang.getSelectedRow();
				txtMaKH.setText(model.getValueAt(row, 0).toString());
				txtTenKH.setText(model.getValueAt(row, 1).toString());
				cboGioiTinh.setSelectedItem(model.getValueAt(row, 2).toString());
				txtSDT.setText(model.getValueAt(row, 3).toString());
			}
		});
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaKHActionPerformed
    	if (txtMaKH.getText().equals("") || txtTenKH.getText().equals("") ||
				txtSDT.getText().equals("")) {
			JLabel lbl1 = new JLabel("Vui lòng nhập đầy đủ thông tin!");
			lbl1.setFont(new Font("Arial", Font.PLAIN, 18));
    		JOptionPane.showMessageDialog(this, lbl1);
		} else {
	        if(validData()) {
				boolean gt = true;
				if(cboGioiTinh.getSelectedItem().equals("Nữ"))
					gt = false;
	        	KhachHang kh = new KhachHang(txtMaKH.getText(), txtTenKH.getText(), gt, txtSDT.getText());
				if(khachHang_DAO.getAllKhachHang().contains(kh)) {
					JLabel lbl2 = new JLabel("Không được thêm trùng mã khách hàng");
					lbl2.setFont(new Font("Arial", Font.PLAIN, 18));
					JOptionPane.showMessageDialog(this, lbl2);
				} else {
		            khachHang_DAO.addKhachHang(kh);
		            DocDuLieuDatabaseVaoTable();
		            xoaRongTextfields();
				}
	        }
		}
    }//GEN-LAST:event_txtMaKHActionPerformed

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
		int row = tblKhachHang.getSelectedRow();
		if (row != -1) {
	    	if (txtMaKH.getText().equals("") || txtTenKH.getText().equals("") ||
					txtSDT.getText().equals("")) {
				JLabel lbl1 = new JLabel("Vui lòng nhập đầy đủ thông tin!");
				lbl1.setFont(new Font("Arial", Font.PLAIN, 18));
	    		JOptionPane.showMessageDialog(this, lbl1);
			} else {
		        if(validData()) {
					boolean gt = true;
					if(cboGioiTinh.getSelectedItem()=="Nữ")
						gt = false;
			        KhachHang kh = new KhachHang(txtMaKH.getText(), txtTenKH.getText(), gt, txtSDT.getText());
			        khachHang_DAO.updateKhachHang(kh);
			        DocDuLieuDatabaseVaoTable();
			        xoaRongTextfields();
		        }
			}
		}else {
			JLabel lbl3 = new JLabel("Bạn chưa chọn khách hàng cần cập nhật");
			lbl3.setFont(new Font("Arial", Font.PLAIN, 18));
			JOptionPane.showMessageDialog(this, lbl3);
		}
    }//GEN-LAST:event_btnCapNhatActionPerformed
    
    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
		int row = tblKhachHang.getSelectedRow();
		if (row != -1) {
			JLabel lbl1 = new JLabel("Bạn có chắc muốn xóa không?");
			lbl1.setFont(new Font("Arial", Font.PLAIN, 18));
			int ask = JOptionPane.showConfirmDialog(this, lbl1, "Cảnh Báo!", JOptionPane.YES_NO_OPTION);
			if(ask == JOptionPane.YES_OPTION) {
		    	khachHang_DAO.deleteKhachHang(txtMaKH.getText());
		        DocDuLieuDatabaseVaoTable();
				xoaRongTextfields();
				JLabel lbl2 = new JLabel("Xóa thành công");
				lbl2.setFont(new Font("Arial", Font.PLAIN, 18));
				JOptionPane.showMessageDialog(this, lbl2);
				if(row < khachHang_DAO.getAllKhachHang().size() - 1) {
					selectedRow(row);
				} else if(khachHang_DAO.getAllKhachHang().size() > 0) {
					row = 0;
					selectedRow(row);
				}
			}
		}else {
			JLabel lbl3 = new JLabel("Bạn chưa chọn khách hàng cần xóa");
			lbl3.setFont(new Font("Arial", Font.PLAIN, 18));
			JOptionPane.showMessageDialog(this, lbl3);
		}
    }//GEN-LAST:event_btnCapNhatActionPerformed
    
    private void btnXoaTrangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        xoaRongTextfields();
    }//GEN-LAST:event_btnCapNhatActionPerformed
    
	public void DocDuLieuDatabaseVaoTable() {
		model.setRowCount(0);
		List<KhachHang> list = khachHang_DAO.getAllKhachHang();
				for (KhachHang kh : list) {
					String gt = "Nữ";
					if(kh.isGioiTinh()==true)
						gt="Nam";	
					Object [] row = {kh.getMaKhachHang(),kh.getTenKhachHang(),gt,kh.getSoDT()};
					model.addRow(row);
				}
	}
	private void xoaRongTextfields() {
        txtMaKH.setText(khachHang_DAO.getMaKH());
		txtTenKH.setText("");
		cboGioiTinh.setSelectedIndex(0);
		txtSDT.setText("");
	}
	private void selectedRow(int row) {
		if(row != -1) {
			tblKhachHang.setRowSelectionInterval(row, row);
			tblKhachHang.scrollRectToVisible(tblKhachHang.getCellRect(row, row, true));
		}
	}
	private boolean validData() {
		String maKH = txtMaKH.getText().trim(), soDT = txtSDT.getText().trim(); ; 

		if (!(maKH.length() > 0 && maKH.matches("KH\\d{3}"))) {
			JLabel lbl1 = new JLabel("Error: Mã khách hàng theo mẫu: KH + Dãy gồm 3 chữ số");
			lbl1.setFont(new Font("Arial", Font.PLAIN, 18));
			JOptionPane.showMessageDialog(this, lbl1);
			txtMaKH.requestFocus();;
			return false;
		}
		if (!(soDT.length() > 0 && soDT.matches("^(0|\\+84)(\\s|\\.)?((3[2-9])|(5[689])|(7[06-9])|(8[1-689])|(9[0-46-9]))(\\d)(\\s|\\.)?(\\d{3})(\\s|\\.)?(\\d{3})$"))) {
			JLabel lbl3 = new JLabel("Error: Số điện thoại không hợp lệ");
			lbl3.setFont(new Font("Arial", Font.PLAIN, 18));
			JOptionPane.showMessageDialog(this, lbl3);
			txtSDT.requestFocus();;
			return false;
		}
		return true;
	}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnXoaTrang;
    private javax.swing.JComboBox<String> cboGioiTinh;
    private javax.swing.JLabel lblGioiTinh;
    private javax.swing.JLabel lblMaKH;
    private javax.swing.JLabel lblSDT;
    private javax.swing.JLabel lblTenKH;
    private javax.swing.JPanel pnlDanhSachKH;
    private javax.swing.JPanel pnlSuKien;
    private javax.swing.JPanel pnlThongTinKH;
    private javax.swing.JScrollPane scr;
    private static javax.swing.JTable tblKhachHang;
    private javax.swing.JTextField txtMaKH;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTenKH;
    // End of variables declaration//GEN-END:variables
}
