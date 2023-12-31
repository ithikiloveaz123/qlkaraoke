/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

import com.itextpdf.text.xml.XmlToTxt;

import dao.CT_HoaDon_DAO;
import dao.HoaDon_DAO;
import entity.CT_HoaDon;
import entity.HoaDon;

/**
 *
 * @author dell
 */
public class JPanel_TKDTTheoThang extends javax.swing.JPanel {

    /**
     * Creates new form JPanelTKDTTheoNgay
     */
    public JPanel_TKDTTheoThang() {
    	hoaDon_DAO = new HoaDon_DAO();
    	ct_HoaDon_DAO = new CT_HoaDon_DAO();
        initComponents();
        model = (DefaultTableModel) tblDanhSachHD.getModel();
        tblDanhSachHD.getTableHeader().setFont(new Font("Segoe UI", Font.PLAIN, 18));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblThang = new javax.swing.JLabel();
        lblTongHD = new javax.swing.JLabel();
        lblTongHD2 = new javax.swing.JLabel();
        lblTongDT = new javax.swing.JLabel();
        lblTongDT2 = new javax.swing.JLabel();
        scr = new javax.swing.JScrollPane();
        tblDanhSachHD = new javax.swing.JTable();
        mchThangTK = new com.toedter.calendar.JMonthChooser();
        ychNamTK = new com.toedter.calendar.JYearChooser();
        btnThongKe = new JButton();
        pnlBieuDo = new JPanel();

        lblThang.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblThang.setText("Thống Kê Doanh Thu Theo Tháng: ");

        lblTongHD.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTongHD.setText("Tổng Hóa Đơn:");

        lblTongHD2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lblTongDT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTongDT.setText("Tổng Doanh Thu Trong Tháng:");

        lblTongDT2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        
        btnThongKe.setFont(new java.awt.Font("Segoe UI", 0, 18));
        btnThongKe.setIcon(new javax.swing.ImageIcon("icon/TK_icon.png"));
        btnThongKe.setBackground(new Color(230, 125, 0));
        btnThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongKeActionPerformed(evt);
            }
        });
        
        pnlBieuDo.setBackground(new Color(255,255,255));
        
        tblDanhSachHD.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tblDanhSachHD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã HD", "Khách Hàng", "Phòng", "Tổng Tiền (VNĐ)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblDanhSachHD.setRowHeight(30);
        tblDanhSachHD.getTableHeader().setBackground(new Color(255, 127, 0));
        tblDanhSachHD.setShowHorizontalLines(true);
        tblDanhSachHD.setShowVerticalLines(true);
        scr.setViewportView(tblDanhSachHD);

        mchThangTK.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        
        ychNamTK.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlBieuDo)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTongHD, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblTongHD2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(lblTongDT, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblTongDT2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblThang)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mchThangTK, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ychNamTK, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnThongKe,javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 94, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblThang, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(mchThangTK, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ychNamTK, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThongKe,javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTongHD, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblTongHD2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblTongDT, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTongDT2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(pnlBieuDo, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
                .addContainerGap())
        );
      
    }// </editor-fold>//GEN-END:initComponents

    private JFreeChart createChart() {
    	int thang =mchThangTK.getMonth()+1;
    	String s = String.valueOf(thang);
        barChart = ChartFactory.createBarChart(
        		"BIỂU ĐỒ DOANH THU KARAOKE NICE THÁNG " +s,
                "Ngày", "Doanh Thu (VNĐ)",
                createDataset(), PlotOrientation.VERTICAL, false,false, false);
        return barChart;
	}

	private CategoryDataset createDataset() {
		final DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		int thang =mchThangTK.getMonth()+1;
		int nam =ychNamTK.getYear();
		int k=0;
		double tongDT=0;
		for(int j=1;j<=31;j++) {
			ArrayList<HoaDon> dsHD = hoaDon_DAO.getHDTheoThang(thang, nam,j);
			int i = 0;
			double tongDTN=0;

			for(HoaDon hd : dsHD) {
				List<CT_HoaDon> dsCTHD = ct_HoaDon_DAO.getAllCTHDTheoMa(hd.getMaHoaDon());
				if(dsCTHD==null) {
					double tongtien =0;
					tongtien =tongtien + hd.getTienPhong();
					i++;
					tongDTN = tongDTN + tongtien;
				}else {
					double tongtien =0;
					double tienDV = 0;
					for(CT_HoaDon cthd : dsCTHD) {
						tienDV = cthd.getSoLuong()*cthd.getGiaBan() + tienDV;
					}
					tongtien =tienDV + hd.getTienPhong();
					i++;
					tongDTN = tongDTN + tongtien;
				}
			}
			String ngay = String.valueOf(j);
	        dataset.addValue(tongDTN, "VNĐ", ngay);
	        k = k+i;
	        tongDT = tongDT + tongDTN;
			}
		DecimalFormat formatter = new DecimalFormat("###,###,###");
		lblTongHD2.setText(String.valueOf(k));
		lblTongDT2.setText(formatter.format(tongDT)+" VNĐ");
        return dataset;
	}

	private void btnThongKeActionPerformed(ActionEvent evt) {
		pnlBieuDo.removeAll();
		chartPanel = new ChartPanel(createChart());
		chartPanel.setPreferredSize(new java.awt.Dimension(1180, 770));
		pnlBieuDo.add(chartPanel);
		
	}
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblThang;
    private javax.swing.JLabel lblTongDT;
    private javax.swing.JLabel lblTongDT2;
    private javax.swing.JLabel lblTongHD;
    private javax.swing.JLabel lblTongHD2;
    private static com.toedter.calendar.JMonthChooser mchThangTK;
    private javax.swing.JScrollPane scr;
    private javax.swing.JTable tblDanhSachHD;
    private com.toedter.calendar.JYearChooser ychNamTK;
    private JButton btnThongKe;
    private HoaDon_DAO hoaDon_DAO;
    private DefaultTableModel model;
    private CT_HoaDon_DAO ct_HoaDon_DAO;
    private ChartPanel chartPanel;
    private JPanel pnlBieuDo;
    private DefaultCategoryDataset dataset;
    private static JFreeChart barChart;
    // End of variables declaration//GEN-END:variables
}
