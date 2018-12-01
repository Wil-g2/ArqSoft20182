/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela;
import conexoes.ConexaoSQLLite;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.util.Properties;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ListModel;
import org.json.JSONArray;
import org.json.JSONObject;
/**
 *
 * @author Willian
 */
public class frmiRestricoes extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmiRestricoes
     */
    public frmiRestricoes() {
        initComponents();
    }
    private DefaultListModel modelRestriciton = new DefaultListModel();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        btnGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtPath = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listClass = new javax.swing.JList<>();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        rgRequired = new javax.swing.JRadioButton();
        rgDenied = new javax.swing.JRadioButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        listClass2 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        listRestriction = new javax.swing.JList<>();
        jButton5 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtResult = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();

        jFileChooser1.setDialogTitle("");

        setClosable(true);
        setIconifiable(true);
        setTitle("Restrições");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Project:");

        txtPath.setEditable(false);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/load16x16.png"))); // NOI18N
        jButton1.setText("Load");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPath))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(69, 69, 69))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        listClass.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listClass);

        jButton2.setText("Carregar Classes");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Access");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Extend");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setText("Implement");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Declare");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        btnGroup.add(rgRequired);
        rgRequired.setSelected(true);
        rgRequired.setText("Required");

        btnGroup.add(rgDenied);
        rgDenied.setText("Denied");

        listClass2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(listClass2);

        listRestriction.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listRestriction.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                listRestrictionKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(listRestriction);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/save16x16.png"))); // NOI18N
        jButton5.setText("Salvar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/load16x16.png"))); // NOI18N
        jButton8.setText("Carregar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/validate16x16.png"))); // NOI18N
        jButton9.setText("Validar");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        txtResult.setColumns(20);
        txtResult.setRows(5);
        jScrollPane4.setViewportView(txtResult);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 884, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(5, 5, 5)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(14, 14, 14)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(rgRequired)
                                                    .addComponent(rgDenied))
                                                .addGap(0, 0, Short.MAX_VALUE))))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jButton2)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jButton5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton8)))))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jButton9)
                            .addGap(788, 788, 788)))
                    .addGap(6, 6, 6)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton8)))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(29, 29, 29)
                            .addComponent(jButton3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton4)
                            .addGap(7, 7, 7)
                            .addComponent(jButton6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton7)
                            .addGap(18, 18, 18)
                            .addComponent(rgRequired)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(rgDenied)))
                    .addGap(18, 18, 18)
                    .addComponent(jButton9)
                    .addGap(4, 4, 4)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jTabbedPane1.addTab("Restrições", jPanel3);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 864, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Visualização", jPanel4);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 869, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        jFileChooser1.setDialogTitle("Selecione o projeto");
        jFileChooser1.setFileSelectionMode(jFileChooser1.DIRECTORIES_ONLY);
        //FileFilter filter = new FileNameExtensionFilter("Dependencias Texto", "txt","text");
        //jFileChooser1.addChoosableFileFilter(filter);
        //jFileChooser1.setAcceptAllFileFilterUsed(false);
        //jFileChooser1.setMultiSelectionEnabled(true);
        int file = jFileChooser1.showOpenDialog(this);
        if (file == jFileChooser1.APPROVE_OPTION) {
            File f = jFileChooser1.getSelectedFile();
            txtPath.setText(jFileChooser1.getSelectedFile().getAbsolutePath());
            Runtime run = Runtime.getRuntime();
            try {
                jProgressBar1.setIndeterminate(true);
                String cmd = "java -jar javadepextractor.jar " + txtPath.getText();
                System.out.println(cmd);
                run.exec(cmd);
                
                Thread.sleep(5000);
                jProgressBar1.setIndeterminate(false);
                JOptionPane.showMessageDialog(this, "Projeto carregado com sucesso!");
                Properties props = new Properties();
                FileOutputStream config = new FileOutputStream("config.properties");
                props.setProperty("path", txtPath.getText());
                props.store(config, null);
                System.out.println("teste");
            } catch (IOException ex) {
                Logger.getLogger(LoadProject.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex.getMessage());
            } catch (InterruptedException ex) {
                Logger.getLogger(LoadProject.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
            ConexaoSQLLite connection = new ConexaoSQLLite();
            String tables = "CREATE TABLE IF NOT EXISTS project (id INTEGER PRIMARY KEY AUTOINCREMENT, origem VARCHAR(255) NOT NULL,tipo VARCHAR(30) NOT NULL,destino VARCHAR(255) NOT NULL)";
            String insert = "INSERT INTO project(origem,tipo,destino) VALUES(?,?,?);";
            String del = "DELETE FROM project";
            if (connection.conectar()) {
                try {
                    Statement stmt = connection.criarStatement();
                    stmt.execute(tables);
                    stmt.execute(del);
                    Scanner ler = new Scanner(System.in);
                    String nome = txtPath.getText() + "\\dependencies.txt";
                    try {
                        FileReader arq = new FileReader(nome);
                        BufferedReader lerArq = new BufferedReader(arq);
                        String linha = lerArq.readLine(); // lê a primeira linha
                        PreparedStatement prepareStatement = connection.preparesStatement(insert);
                        while (linha != null) {
                            System.out.println("Teste");
                            System.out.printf("%s\n", linha);
                            linha = lerArq.readLine(); // lê da segunda até a última linha
                            String[] dados = linha.split(",");
                            prepareStatement.setString(1, dados[0]);
                            prepareStatement.setString(2, dados[1]);
                            prepareStatement.setString(3, dados[2]);
                            prepareStatement.execute();
                        }

                        arq.close();
                    } catch (IOException e) {
                        System.err.printf("Erro na abertura do arquivo: %s.\n",
                            e.getMessage());
                        JOptionPane.showMessageDialog(null, e.getMessage());
                    }
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                } finally {
                    GetClass();
                    connection.desconectar();
                }
            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ConexaoSQLLite connection = new ConexaoSQLLite();
        String classes = "select distinct origem from project";
        String tipos = "select distinct destino from project";
        if (connection.conectar()) {
            try {
                DefaultListModel listModel = new DefaultListModel();
                DefaultListModel listModel2 = new DefaultListModel();
                Statement stmt = connection.criarStatement();
                PreparedStatement prepareStatement = connection.preparesStatement(classes);
                ResultSet rs = prepareStatement.executeQuery();
                while (rs.next()) {
                    listClass.removeAll();
                    listClass2.removeAll();
                    listModel.addElement(rs.getString("origem"));
                    listModel2.addElement(rs.getString("origem"));

                }
                PreparedStatement prepareStatementTipos = connection.preparesStatement(tipos);
                ResultSet rsTipo = prepareStatementTipos.executeQuery();
                while (rsTipo.next()) {
                    listModel2.addElement(rsTipo.getString("destino"));
                }
                listClass.setModel(listModel);
                listClass2.setModel(listModel2);

            } catch (SQLException e) {
                System.err.println(e.getMessage());
                JOptionPane.showMessageDialog(null, e.getMessage());
            } finally {
                connection.desconectar();
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String classe1 = listClass.getSelectedValue();
        String classe2 = listClass2.getSelectedValue();
        if (rgRequired.isSelected()) {
            modelRestriciton.addElement(classe1 + "- Required Access -" + classe2);
        } else if (rgDenied.isSelected()) {
            modelRestriciton.addElement(classe1 + "- Denied Access -" + classe2);
        } else {
            modelRestriciton.addElement(classe1 + "- Can Access -" + classe2);
        }
        listRestriction.setModel(modelRestriciton);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String classe1 = listClass.getSelectedValue();
        String classe2 = listClass2.getSelectedValue();
        if (rgRequired.isSelected()) {
            modelRestriciton.addElement(classe1 + "- Required Extend -" + classe2);
        } else if (rgDenied.isSelected()) {
            modelRestriciton.addElement(classe1 + "- Denied Extend -" + classe2);
        } else {
            modelRestriciton.addElement(classe1 + "- Can Extend -" + classe2);
        }

        listRestriction.setModel(modelRestriciton);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String classe1 = listClass.getSelectedValue();
        String classe2 = listClass2.getSelectedValue();
        if (rgRequired.isSelected()) {
            modelRestriciton.addElement(classe1 + "- Required Implement -" + classe2);
        } else if (rgDenied.isSelected()) {
            modelRestriciton.addElement(classe1 + "- Denied Implement -" + classe2);
        } else {
            modelRestriciton.addElement(classe1 + "- Can Implement -" + classe2);
        }

        listRestriction.setModel(modelRestriciton);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        String classe1 = listClass.getSelectedValue();
        String classe2 = listClass2.getSelectedValue();
        if (rgRequired.isSelected()) {
            modelRestriciton.addElement(classe1 + "- Required Declare -" + classe2);
        } else if (rgDenied.isSelected()) {
            modelRestriciton.addElement(classe1 + "- Denied Declare -" + classe2);
        } else {
            modelRestriciton.addElement(classe1 + "- Can Declare -" + classe2);
        }

        listRestriction.setModel(modelRestriciton);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void listRestrictionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_listRestrictionKeyPressed
        int index = listRestriction.getSelectedIndex();
        if (evt.getKeyCode() == KeyEvent.VK_DELETE) {
            modelRestriciton.remove(index);
            listRestriction.removeAll();
            listRestriction.setModel(modelRestriciton);
        }
    }//GEN-LAST:event_listRestrictionKeyPressed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            FileWriter file = new FileWriter("restricoes.txt");
            System.out.println("Arquivo gerado.");
            PrintWriter gravaArq = new PrintWriter(file);
            JSONObject json = new JSONObject();
            JSONArray jsonArray = new JSONArray();
            ListModel<String> model = listRestriction.getModel();
            for (int i = 0; i < model.getSize(); i++) {
                jsonArray.put(model.getElementAt(i));
                gravaArq.println(model.getElementAt(i));
            }
            json.put("restricoes", jsonArray);
            System.out.println(json.toString());
            file.close();
            JOptionPane.showMessageDialog(this, "Arquivo salvo com sucesso.");

        } catch (IOException ex) {
            Logger.getLogger(frmRestriction.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        try {
            modelRestriciton.clear();
            BufferedReader br = new BufferedReader(new FileReader("restricoes.txt"));
            while (br.ready()) {
                String linha = br.readLine();
                modelRestriciton.addElement(linha);
            }
            br.close();
            JOptionPane.showMessageDialog(this, "Arquivo carregado com sucesso.");
            listRestriction.setModel(modelRestriciton);
            listRestriction.repaint();
        } catch (IOException ex) {
            Logger.getLogger(frmRestriction.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        txtResult.setText("");
        ConexaoSQLLite connection = new ConexaoSQLLite();
        String canAccess = "select count(*) as count from project where(tipo = \"access\" or tipo = \"declare\") and origem = ? and destino = ? ";
        String extend = "select count(*) as count from project where tipo = \"extend\" and origem = ? and destino = ? ";
        String declare = "select count(*) as count from project where tipo = \"declare\" and origem = ? and destino = ? ";
        String implement = "select count(*) as count from project where tipo = \"implement\" and origem = ? and destino = ? ";

        if (connection.conectar()) {
            try {
                ListModel<String> model = listRestriction.getModel();
                PreparedStatement prepareStatement = null;
                String[] parameters = null;
                for (int i = 0; i < model.getSize(); i++) {
                    if (model.getElementAt(i).contains("Can Access") || model.getElementAt(i).contains("Required Access") || model.getElementAt(i).contains("Denied Access")) {
                        prepareStatement = connection.preparesStatement(canAccess);
                    } else if (model.getElementAt(i).contains("Can Implement") || model.getElementAt(i).contains("Required Implement") || model.getElementAt(i).contains("Denied Implement")) {
                        prepareStatement = connection.preparesStatement(implement);
                    } else if (model.getElementAt(i).contains("Can Declare") || model.getElementAt(i).contains("Required Declare") || model.getElementAt(i).contains("Denied Declare")) {
                        prepareStatement = connection.preparesStatement(declare);
                    } else if (model.getElementAt(i).contains("Can Extend") || model.getElementAt(i).contains("Required Extend") || model.getElementAt(i).contains("Denied Extend")) {
                        prepareStatement = connection.preparesStatement(implement);
                    }
                    parameters = model.getElementAt(i).split("-");
                    prepareStatement.setString(1, parameters[0].trim());
                    prepareStatement.setString(2, parameters[2].trim());
                    ResultSet rs = prepareStatement.executeQuery();
                    if (rs.getInt(1) > 0) {
                        if (model.getElementAt(i).contains("Denied")) { //Se for Deined e encotrar ocorrência
                            txtResult.append("(DIVERGÊNCIA) - " + model.getElementAt(i) + "\n");
                        }
                    } else {
                        if (model.getElementAt(i).contains("Can Access")) { //Se for Access e não encotrar ocorrência
                            txtResult.append("(AUSÊNCIA NÃO OBRIGATÓRIA) - " + model.getElementAt(i) + "\n");
                        }else if(model.getElementAt(i).contains("Required")){ //Se for Required e não encotrar ocorrência
                            txtResult.append("(AUSÊNCIA) - " + model.getElementAt(i) + "\n");
                        }
                    }
                }
            } catch (SQLException e) {
                System.err.println(e.getMessage());
                JOptionPane.showMessageDialog(null, e.getMessage());
            } finally {
                connection.desconectar();
            }

        }

    }//GEN-LAST:event_jButton9ActionPerformed

    private void GetClass(){
        ConexaoSQLLite connection = new ConexaoSQLLite();
        String classes = "select distinct origem from project";
        String tipos = "select distinct destino from project";
        if (connection.conectar()) {
            try {
                DefaultListModel listModel = new DefaultListModel();
                DefaultListModel listModel2 = new DefaultListModel();
                Statement stmt = connection.criarStatement();
                PreparedStatement prepareStatement = connection.preparesStatement(classes);
                ResultSet rs = prepareStatement.executeQuery();
                while (rs.next()) {
                    listClass.removeAll();
                    listClass2.removeAll();
                    listModel.addElement(rs.getString("origem"));
                    listModel2.addElement(rs.getString("origem"));

                }
                PreparedStatement prepareStatementTipos = connection.preparesStatement(tipos);
                ResultSet rsTipo = prepareStatementTipos.executeQuery();
                while (rsTipo.next()) {
                    listModel2.addElement(rsTipo.getString("destino"));
                }
                listClass.setModel(listModel);
                listClass2.setModel(listModel2);

            } catch (SQLException e) {
                System.err.println(e.getMessage());
                JOptionPane.showMessageDialog(null, e.getMessage());
            } finally {
                connection.desconectar();
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGroup;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JList<String> listClass;
    private javax.swing.JList<String> listClass2;
    private javax.swing.JList<String> listRestriction;
    private javax.swing.JRadioButton rgDenied;
    private javax.swing.JRadioButton rgRequired;
    private javax.swing.JTextField txtPath;
    private javax.swing.JTextArea txtResult;
    // End of variables declaration//GEN-END:variables
}
