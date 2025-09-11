/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Vista extends javax.swing.JFrame {

    public Vista() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grpButtons = new ButtonGroup();
        background = new JPanel();
        tittle = new JLabel();
        tflCode = new JTextField();
        tflCode2 = new JTextField();
        tflCode3 = new JTextField();
        tflTittle = new JTextField();
        tflTittle2 = new JTextField();
        tflTittle3 = new JTextField();
        tflAuthor = new JTextField();
        tflAuthor2 = new JTextField();
        tflAuthor3 = new JTextField();
        lblCode = new JLabel();
        lblTittle = new JLabel();
        lblAuthor = new JLabel();
        rbtCode = new JRadioButton();
        rbtTittle = new JRadioButton();
        rbtAuthor = new JRadioButton();
        pnlSearch = new JPanel();
        lblSearch = new JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLineal = new JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblBinary = new JTable();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        pnlResult = new JPanel();
        lblResult = new JLabel();
        pnlResult2 = new JPanel();
        lblResult2 = new JLabel();
        pnlResult3 = new JPanel();
        lblResult3 = new JLabel();
        pnlColor = new JPanel();
        lblColor = new JLabel();
        pnlVerVector = new JPanel();
        lblVerVector = new JLabel();
        pnlLimpiar = new JPanel();
        lblLimpiar = new JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Búsqueda Binaria");
        setMinimumSize(new java.awt.Dimension(800, 520));
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));

        tittle.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 20)); // NOI18N
        tittle.setForeground(new java.awt.Color(0, 0, 204));
        tittle.setText("Buscador de libros");

        tflCode.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        tflCode.setForeground(new java.awt.Color(0, 0, 204));
        tflCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tflCodeActionPerformed(evt);
            }
        });

        tflCode2.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        tflCode2.setForeground(new java.awt.Color(0, 0, 204));

        tflCode3.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        tflCode3.setForeground(new java.awt.Color(0, 0, 204));

        tflTittle.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        tflTittle.setForeground(new java.awt.Color(0, 0, 204));

        tflTittle2.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        tflTittle2.setForeground(new java.awt.Color(0, 0, 204));

        tflTittle3.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        tflTittle3.setForeground(new java.awt.Color(0, 0, 204));

        tflAuthor.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        tflAuthor.setForeground(new java.awt.Color(0, 0, 204));

        tflAuthor2.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        tflAuthor2.setForeground(new java.awt.Color(0, 0, 204));

        tflAuthor3.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        tflAuthor3.setForeground(new java.awt.Color(0, 0, 204));

        lblCode.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        lblCode.setForeground(new java.awt.Color(0, 0, 204));
        lblCode.setText("Código");

        lblTittle.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        lblTittle.setForeground(new java.awt.Color(0, 0, 204));
        lblTittle.setText("Título");

        lblAuthor.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        lblAuthor.setForeground(new java.awt.Color(0, 0, 204));
        lblAuthor.setText("Autor");

        pnlSearch.setBackground(new java.awt.Color(0, 0, 204));
        pnlSearch.setForeground(new java.awt.Color(255, 255, 255));
        pnlSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblSearch.setBackground(new java.awt.Color(255, 255, 255));
        lblSearch.setFont(new java.awt.Font("Franklin Gothic Demi", 3, 20)); // NOI18N
        lblSearch.setForeground(new java.awt.Color(255, 255, 255));
        lblSearch.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSearch.setText("¡Realizar Búsquedas!");

        javax.swing.GroupLayout pnlSearchLayout = new javax.swing.GroupLayout(pnlSearch);
        pnlSearch.setLayout(pnlSearchLayout);
        pnlSearchLayout.setHorizontalGroup(
            pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );
        pnlSearchLayout.setVerticalGroup(
            pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        tblLineal.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        tblLineal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Iteración", "Inicio", "Medio", "Fin"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblLineal);
        if (tblLineal.getColumnModel().getColumnCount() > 0) {
            tblLineal.getColumnModel().getColumn(0).setResizable(false);
            tblLineal.getColumnModel().getColumn(1).setResizable(false);
            tblLineal.getColumnModel().getColumn(2).setResizable(false);
            tblLineal.getColumnModel().getColumn(3).setResizable(false);
        }

        tblBinary.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Iteración", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblBinary);
        if (tblBinary.getColumnModel().getColumnCount() > 0) {
            tblBinary.getColumnModel().getColumn(0).setResizable(false);
            tblBinary.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("Iteraciones Búsqueda Binaria:");

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("Iteraciones Búsqueda Secuencial:");

        pnlResult.setBackground(new java.awt.Color(0, 0, 204));
        pnlResult.setForeground(new java.awt.Color(255, 255, 255));
        pnlResult.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblResult.setBackground(new java.awt.Color(255, 255, 255));
        lblResult.setFont(new java.awt.Font("Franklin Gothic Demi", 3, 16)); // NOI18N
        lblResult.setForeground(new java.awt.Color(255, 255, 255));
        lblResult.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResult.setText("Primer resultado");

        javax.swing.GroupLayout pnlResultLayout = new javax.swing.GroupLayout(pnlResult);
        pnlResult.setLayout(pnlResultLayout);
        pnlResultLayout.setHorizontalGroup(
            pnlResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblResult, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );
        pnlResultLayout.setVerticalGroup(
            pnlResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblResult, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        pnlResult2.setBackground(new java.awt.Color(0, 0, 204));
        pnlResult2.setForeground(new java.awt.Color(255, 255, 255));
        pnlResult2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblResult2.setBackground(new java.awt.Color(255, 255, 255));
        lblResult2.setFont(new java.awt.Font("Franklin Gothic Demi", 3, 16)); // NOI18N
        lblResult2.setForeground(new java.awt.Color(255, 255, 255));
        lblResult2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResult2.setText("Segundo resultado");

        javax.swing.GroupLayout pnlResult2Layout = new javax.swing.GroupLayout(pnlResult2);
        pnlResult2.setLayout(pnlResult2Layout);
        pnlResult2Layout.setHorizontalGroup(
            pnlResult2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblResult2, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );
        pnlResult2Layout.setVerticalGroup(
            pnlResult2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblResult2, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        pnlResult3.setBackground(new java.awt.Color(0, 0, 204));
        pnlResult3.setForeground(new java.awt.Color(255, 255, 255));
        pnlResult3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblResult3.setBackground(new java.awt.Color(255, 255, 255));
        lblResult3.setFont(new java.awt.Font("Franklin Gothic Demi", 3, 16)); // NOI18N
        lblResult3.setForeground(new java.awt.Color(255, 255, 255));
        lblResult3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResult3.setText("Tercer resultado");

        javax.swing.GroupLayout pnlResult3Layout = new javax.swing.GroupLayout(pnlResult3);
        pnlResult3.setLayout(pnlResult3Layout);
        pnlResult3Layout.setHorizontalGroup(
            pnlResult3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblResult3, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );
        pnlResult3Layout.setVerticalGroup(
            pnlResult3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblResult3, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        pnlColor.setBackground(new java.awt.Color(0, 0, 204));
        pnlColor.setForeground(new java.awt.Color(255, 255, 255));
        pnlColor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblColor.setBackground(new java.awt.Color(255, 255, 255));
        lblColor.setFont(new java.awt.Font("Franklin Gothic Demi", 3, 16)); // NOI18N
        lblColor.setForeground(new java.awt.Color(255, 255, 255));
        lblColor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblColor.setText("Color");

        javax.swing.GroupLayout pnlColorLayout = new javax.swing.GroupLayout(pnlColor);
        pnlColor.setLayout(pnlColorLayout);
        pnlColorLayout.setHorizontalGroup(
            pnlColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblColor, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        pnlColorLayout.setVerticalGroup(
            pnlColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblColor, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        pnlVerVector.setBackground(new java.awt.Color(0, 0, 204));
        pnlVerVector.setForeground(new java.awt.Color(255, 255, 255));
        pnlVerVector.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblVerVector.setBackground(new java.awt.Color(255, 255, 255));
        lblVerVector.setFont(new java.awt.Font("Franklin Gothic Demi", 3, 16)); // NOI18N
        lblVerVector.setForeground(new java.awt.Color(255, 255, 255));
        lblVerVector.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVerVector.setText("Ver vector");

        javax.swing.GroupLayout pnlVerVectorLayout = new javax.swing.GroupLayout(pnlVerVector);
        pnlVerVector.setLayout(pnlVerVectorLayout);
        pnlVerVectorLayout.setHorizontalGroup(
            pnlVerVectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblVerVector, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        pnlVerVectorLayout.setVerticalGroup(
            pnlVerVectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblVerVector, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        pnlLimpiar.setBackground(new java.awt.Color(0, 0, 204));
        pnlLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        pnlLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblLimpiar.setBackground(new java.awt.Color(255, 255, 255));
        lblLimpiar.setFont(new java.awt.Font("Franklin Gothic Demi", 3, 16)); // NOI18N
        lblLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        lblLimpiar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLimpiar.setText("Limpiar");

        javax.swing.GroupLayout pnlLimpiarLayout = new javax.swing.GroupLayout(pnlLimpiar);
        pnlLimpiar.setLayout(pnlLimpiarLayout);
        pnlLimpiarLayout.setHorizontalGroup(
            pnlLimpiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        pnlLimpiarLayout.setVerticalGroup(
            pnlLimpiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(317, 317, 317)
                        .addComponent(tittle))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(tflCode, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105)
                        .addComponent(tflTittle, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(113, 113, 113)
                        .addComponent(tflAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(lblCode)
                        .addGap(12, 12, 12)
                        .addComponent(tflCode2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(rbtCode)
                        .addGap(31, 31, 31)
                        .addComponent(lblTittle, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(tflTittle2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(rbtTittle)
                        .addGap(39, 39, 39)
                        .addComponent(lblAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(tflAuthor2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(rbtAuthor))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(tflCode3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105)
                        .addComponent(tflTittle3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(113, 113, 113)
                        .addComponent(tflAuthor3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(pnlSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(pnlResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(pnlResult2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(pnlResult3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(pnlColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(200, 200, 200)
                        .addComponent(pnlVerVector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(190, 190, 190)
                        .addComponent(pnlLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(tittle)
                .addGap(18, 18, 18)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tflCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tflTittle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tflAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblCode))
                    .addComponent(tflCode2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(rbtCode))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblTittle))
                    .addComponent(tflTittle2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(rbtTittle))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblAuthor))
                    .addComponent(tflAuthor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(rbtAuthor)))
                .addGap(3, 3, 3)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tflCode3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tflTittle3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tflAuthor3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(pnlSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(14, 14, 14)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlResult2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlResult3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlVerVector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tflCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tflCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tflCodeActionPerformed

    // Getters
    public ButtonGroup getGrpButtons() {
        return grpButtons;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public JLabel getLblAuthor() {
        return lblAuthor;
    }

    public JLabel getLblCode() {
        return lblCode;
    }

    public JLabel getLblTittle() {
        return lblTittle;
    }

    public JPanel getPnlColor() {
        return pnlColor;
    }

    public JPanel getPnlLimpiar() {
        return pnlLimpiar;
    }

    public JPanel getPnlResult() {
        return pnlResult;
    }

    public JPanel getPnlResult2() {
        return pnlResult2;
    }

    public JPanel getPnlResult3() {
        return pnlResult3;
    }

    public JPanel getPnlSearch() {
        return pnlSearch;
    }

    public JPanel getPnlVerVector() {
        return pnlVerVector;
    }

    public JRadioButton getRbtAuthor() {
        return rbtAuthor;
    }

    public JRadioButton getRbtCode() {
        return rbtCode;
    }

    public JRadioButton getRbtTittle() {
        return rbtTittle;
    }

    public JTable getTblBinary() {
        return tblBinary;
    }

    public JTable getTblLineal() {
        return tblLineal;
    }

    public JTextField getTflAuthor() {
        return tflAuthor;
    }

    public JTextField getTflAuthor2() {
        return tflAuthor2;
    }

    public JTextField getTflAuthor3() {
        return tflAuthor3;
    }

    public JTextField getTflCode() {
        return tflCode;
    }

    public JTextField getTflCode2() {
        return tflCode2;
    }

    public JTextField getTflCode3() {
        return tflCode3;
    }

    public JTextField getTflTittle() {
        return tflTittle;
    }

    public JTextField getTflTittle2() {
        return tflTittle2;
    }

    public JTextField getTflTittle3() {
        return tflTittle3;
    }

    public JLabel getTittle() {
        return tittle;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JPanel background;
    private ButtonGroup grpButtons;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private JLabel lblAuthor;
    private JLabel lblCode;
    private JLabel lblColor;
    private JLabel lblLimpiar;
    private JLabel lblResult;
    private JLabel lblResult2;
    private JLabel lblResult3;
    private JLabel lblSearch;
    private JLabel lblTittle;
    private JLabel lblVerVector;
    private JPanel pnlColor;
    private JPanel pnlLimpiar;
    private JPanel pnlResult;
    private JPanel pnlResult2;
    private JPanel pnlResult3;
    private JPanel pnlSearch;
    private JPanel pnlVerVector;
    private JRadioButton rbtAuthor;
    private JRadioButton rbtCode;
    private JRadioButton rbtTittle;
    private JTable tblBinary;
    private JTable tblLineal;
    private JTextField tflAuthor;
    private JTextField tflAuthor2;
    private JTextField tflAuthor3;
    private JTextField tflCode;
    private JTextField tflCode2;
    private JTextField tflCode3;
    private JTextField tflTittle;
    private JTextField tflTittle2;
    private JTextField tflTittle3;
    private JLabel tittle;
    // End of variables declaration//GEN-END:variables
}
