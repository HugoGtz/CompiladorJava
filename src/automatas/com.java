/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automatas;

import java.awt.Color;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author hugo
 */
public class com extends javax.swing.JFrame {
    String codigos;
    String system = "";
    

    /**
     * Creates new form com
     */
    public com() {
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        codigo = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        pantalla = new javax.swing.JTextPane();
        sintax = new javax.swing.JButton();
        ejecutar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        salir = new javax.swing.JButton();
        barra = new javax.swing.JProgressBar();
        analizar = new javax.swing.JButton();
        abrir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(226, 241, 252));

        codigo.setColumns(20);
        codigo.setRows(5);
        jScrollPane1.setViewportView(codigo);

        jPanel2.setBackground(new java.awt.Color(66, 165, 245));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(0, 0, 0)));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Movimientos del robot.");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addContainerGap(133, Short.MAX_VALUE))
            .addComponent(jSeparator1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(165, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(30, 30, 30))
        );

        jScrollPane2.setViewportView(pantalla);

        sintax.setBackground(new java.awt.Color(255, 255, 255));
        sintax.setText("Guardar");
        sintax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sintaxActionPerformed(evt);
            }
        });

        ejecutar.setBackground(new java.awt.Color(33, 150, 243));
        ejecutar.setForeground(new java.awt.Color(255, 255, 255));
        ejecutar.setText("Ejecutar");
        ejecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ejecutarActionPerformed(evt);
            }
        });

        jLabel1.setText("Edita tu codígo.");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel3.setText("Robot Automata.");

        salir.setBackground(new java.awt.Color(255, 255, 255));
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        barra.setForeground(new java.awt.Color(33, 150, 243));
        barra.setToolTipText("");

        analizar.setBackground(new java.awt.Color(255, 255, 255));
        analizar.setText("Analizar");
        analizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                analizarActionPerformed(evt);
            }
        });

        abrir.setBackground(new java.awt.Color(255, 255, 255));
        abrir.setText("Abrir");
        abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(sintax, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(abrir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(analizar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(ejecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(197, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(230, 230, 230))
            .addComponent(barra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ejecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(analizar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(sintax, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(abrir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(barra, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sintaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sintaxActionPerformed
        // TODO add your handling code here:
        codigos = codigo.getText();
            if (codigos.equals("")) {
                pantalla.setForeground(Color.red); 
                system += "Aun no escribes Codigo./n";
            pantalla.setText(system);
        }else{
        javax.swing.JFileChooser jF1= new javax.swing.JFileChooser();
String ruta = ""; 
try{ 
if(jF1.showSaveDialog(null)==jF1.APPROVE_OPTION){ 
ruta = jF1.getSelectedFile().getAbsolutePath(); 
//Aqui ya tiens la ruta,,,ahora puedes crear un fichero n esa ruta y escribir lo k kieras... 
} 
}catch (Exception ex){ 
ex.printStackTrace(); 
} 

       
    File archivo = new File(ruta);
    BufferedWriter bw = null;
    
    barra.setValue(20);
    try {
                wait(1000);
            } catch (Exception e) {}
    
    
        if (archivo.exists()) {
            archivo.delete();
        }
        try {
            bw = new BufferedWriter(new FileWriter(archivo));
            barra.setValue(40);
            try {
                wait(1000);
            } catch (Exception e) {}
            
        } catch (IOException ex) {
            Logger.getLogger(com.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            bw.write(codigos);
            barra.setValue(70);
            try {
                wait(1000);
            } catch (Exception e) {}
        } catch (IOException ex) {
            Logger.getLogger(com.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            bw.close();
            barra.setValue(90);
            try {
                wait(1000);
            } catch (Exception e) {}
        } catch (IOException ex) {
            Logger.getLogger(com.class.getName()).log(Level.SEVERE, null, ex);
        }
         barra.setValue(100);
         try {
                wait(1000);
            } catch (Exception e) {}
         pantalla.setForeground(Color.blue); 
         system += "Archivo .txt guardado en "+ruta+" \n";
        pantalla.setText(system);
        
            }
    }//GEN-LAST:event_sintaxActionPerformed

    private void ejecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ejecutarActionPerformed
        // TODO add your handling code here:
 
   
    }//GEN-LAST:event_ejecutarActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void analizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_analizarActionPerformed
        // TODO add your handling code here:
try {  
           
            
            //Process p2 = Runtime.getRuntime().exec("javac Scanner.java");
           Process p2=Runtime.getRuntime().exec("javac Scanner.java",null, new File("/home/hugo/NetBeansProjects/Automatas"));
            BufferedReader in = new BufferedReader(  
                                new InputStreamReader(p2.getInputStream()));  
            String line = null;  
            while ((line = in.readLine()) != null) {  
                system += line+"\n"; 
            }  
            pantalla.setText(system);
        } catch (IOException e) {  
            e.printStackTrace();  
        }
        System.out.println(system);

    }//GEN-LAST:event_analizarActionPerformed

    private void abrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirActionPerformed
        // TODO add your handling code here:
                javax.swing.JFileChooser jF1= new javax.swing.JFileChooser(); 
String ruta = ""; 
try{ 
if(jF1.showSaveDialog(null)==jF1.APPROVE_OPTION){ 
ruta = jF1.getSelectedFile().getAbsolutePath(); 
//Aqui ya tiens la ruta,,,ahora puedes crear un fichero n esa ruta y escribir lo k kieras... 
} 
}catch (Exception ex){ 
ex.printStackTrace(); 
} 
String cadena;
String texto = "";
        FileReader f = null;
        try {
            f = new FileReader(ruta);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(com.class.getName()).log(Level.SEVERE, null, ex);
        }
        BufferedReader b = new BufferedReader(f);
        try {
            while((cadena = b.readLine())!=null) {
                texto += cadena+"\n";
            }
            codigo.setText(texto);
        } catch (IOException ex) {
            Logger.getLogger(com.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            b.close();
        } catch (IOException ex) {
            Logger.getLogger(com.class.getName()).log(Level.SEVERE, null, ex);
        }
        system += "Se a cargado con exito "+ruta+"\n";
        pantalla.setText(system);
    }//GEN-LAST:event_abrirActionPerformed

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
            java.util.logging.Logger.getLogger(com.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(com.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(com.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(com.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new com().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton abrir;
    private javax.swing.JButton analizar;
    private javax.swing.JProgressBar barra;
    private javax.swing.JTextArea codigo;
    private javax.swing.JButton ejecutar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextPane pantalla;
    private javax.swing.JButton salir;
    private javax.swing.JButton sintax;
    // End of variables declaration//GEN-END:variables
}
