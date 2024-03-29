package GUI;

import BUS.MonChinhBUS;
import BUS.MonPhuBUS;
import BUS.OptionBUS;
import DTO.Foods;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Enumeration;

public class MainMenu extends javax.swing.JFrame {
    // Variables declaration - do not modify
    public javax.swing.ButtonGroup btnGroup_Food;
    public javax.swing.JButton btnSubmit;
    public javax.swing.JComboBox<String> cboxLuaChon;
    public javax.swing.JScrollPane jScrollPane;
    public javax.swing.JPanel pnDanhMuc;
    public javax.swing.JPanel pnMonChinh;
    public javax.swing.JPanel pnMonPhu;
    public javax.swing.JTextArea txtDanhMuc;
    private final ArrayList<JCheckBox> listItemCB = new ArrayList<>();
    /**
     * Creates new form ExampleLearning
     */
    public MainMenu() {
        initComponents();
        initMonChinh();
        initMonPhu();
        initOption();
    }

    private void initMonChinh() {
        ArrayList<Foods> listFoods = new MonChinhBUS().getData();
        int rowItem = listFoods.size();
        int colItem = rowItem / 4 + 1;
        pnMonChinh.setLayout(new GridLayout(colItem, rowItem, 10, 10)); // set Layout
        for (Foods item : listFoods) {
            JCheckBox jCheckBox = new JCheckBox();
            jCheckBox.setText(item.getName());
            jCheckBox.setFont(new Font("Segoe UI", 0, 13));
//            jCheckBox.setIcon(new ImageIcon("Resource//image//product.png"));
            pnMonChinh.add(jCheckBox);
            listItemCB.add(jCheckBox);
        }
    }

    private void initMonPhu() {
        ArrayList<Foods> listFoods = new MonPhuBUS().getData();
        int rowItem = listFoods.size();
        int colItem = rowItem / 4 + 1;
        pnMonPhu.setLayout(new GridLayout(colItem, rowItem, 10, 10)); // set Layout
        for (Foods item : listFoods) {
            JRadioButton jRadioButton = new JRadioButton();
            jRadioButton.setText(item.getName());
            jRadioButton.setFont(new Font("Segoe UI", 0, 13));
//            jRadioButton.setIcon(new ImageIcon("Resource//image//product.png"));
            btnGroup_Food.add(jRadioButton);
            pnMonPhu.add(jRadioButton);
        }
    }

    private void initOption() {
        ArrayList<Foods> listFoods = new OptionBUS().getData();
        cboxLuaChon.addItem("---");
        for (Foods item : listFoods) {
            cboxLuaChon.addItem(item.getName());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {
        btnGroup_Food = new javax.swing.ButtonGroup();
        pnMonChinh = new javax.swing.JPanel();
        pnMonPhu = new javax.swing.JPanel();
        cboxLuaChon = new javax.swing.JComboBox<>();
        pnDanhMuc = new javax.swing.JPanel();
        jScrollPane = new javax.swing.JScrollPane();
        txtDanhMuc = new javax.swing.JTextArea();
        btnSubmit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnMonChinh.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Món chính", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 13))); // NOI18N
//        pnMonChinh.setLayout(new java.awt.GridLayout());

        pnMonPhu.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Món phụ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 13))); // NOI18N
//        pnMonPhu.setLayout(new java.awt.GridLayout());

        cboxLuaChon.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
//        cboxLuaChon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---" }));

        pnDanhMuc.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh mục món ăn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 13))); // NOI18N

        txtDanhMuc.setColumns(20);
        txtDanhMuc.setRows(5);
        txtDanhMuc.setEditable(false);
        jScrollPane.setViewportView(txtDanhMuc);

        javax.swing.GroupLayout pnDanhMucLayout = new javax.swing.GroupLayout(pnDanhMuc);
        pnDanhMuc.setLayout(pnDanhMucLayout);
        pnDanhMucLayout.setHorizontalGroup(
                pnDanhMucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        pnDanhMucLayout.setVerticalGroup(
                pnDanhMucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
        );

        btnSubmit.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(pnMonChinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(pnMonPhu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(cboxLuaChon, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 425, Short.MAX_VALUE)
                                                .addComponent(btnSubmit)
                                                .addGap(17, 17, 17))
                                        .addComponent(pnDanhMuc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(pnMonChinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pnMonPhu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cboxLuaChon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnSubmit))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pnDanhMuc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {
//        String msg = "da xay ra loi";
//        String error = "Error";

        // Mon Chinh
        double tienMonChinh = 0.0;
        ArrayList<String> listSelection_MonChinh = new ArrayList<String>(); // lấy danh sách món ăn đã chọn
        for (AbstractButton item : listItemCB) {
            if (item.isSelected()) {
                Foods itemSelect = new MonChinhBUS().getItemValue(item.getText());
                if (itemSelect != null) {
                    listSelection_MonChinh.add(itemSelect.getName());
                    tienMonChinh += Double.parseDouble(itemSelect.getGia());
                }
            }
        }

        // Mon Phu
        double tienMonPhu = 0.0;
        ArrayList<String> listSelection_MonPhu = new ArrayList<String>(); // lấy danh sách món ăn đã chọn
        Enumeration<AbstractButton> btnMonPhu = this.btnGroup_Food.getElements();
        while (btnMonPhu.hasMoreElements()) {
            AbstractButton item = btnMonPhu.nextElement();
            if (item.isSelected()) {
                Foods itemSelect = new MonPhuBUS().getItemValue(item.getText());
                if (itemSelect != null) {
                    listSelection_MonPhu.add(itemSelect.getName());
                    tienMonPhu += Double.parseDouble(itemSelect.getGia());
                }
            }
        }

        // Option
        double tienOption = 0.0;
        ArrayList<String> listSelection_Option = new ArrayList<String>(); // lấy danh sách món ăn đã chọn
        Foods itemSelectOption = new OptionBUS().getItemValue((String) cboxLuaChon.getSelectedItem());
        if (itemSelectOption != null) {
            listSelection_Option.add(itemSelectOption.getName());
            tienOption += Double.parseDouble(itemSelectOption.getGia());
        }

        // thong ke
        double tongTien = tienMonChinh + tienMonPhu + tienOption;
        StringBuilder listMonChinh = new StringBuilder();
        StringBuilder listMonPhu = new StringBuilder();
        StringBuilder listOption = new StringBuilder();

        for (String item : listSelection_MonChinh) {
            listMonChinh.append(String.format("%s, ", item));
        }
        for (String item : listSelection_MonPhu) {
            listMonPhu.append(String.format("%s, ", item));
        }
        for (String item : listSelection_Option) {
            listOption.append(String.format("%s, ", item));
        }

        txtDanhMuc.setText(String.format("Danh muc da chon:\n" +
                        "Mon chinh: %s \n" +
                        "Mon phu: %s \n" +
                        "Tuy chon: %s \n" +
                        "Tong tien: %.2f vnđ",
                listMonChinh, listMonPhu, listOption, tongTien));
    }
    // End of variables declaration
}
