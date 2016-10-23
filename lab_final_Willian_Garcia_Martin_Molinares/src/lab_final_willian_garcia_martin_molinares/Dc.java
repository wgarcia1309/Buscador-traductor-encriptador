package lab_final_willian_garcia_martin_molinares;

import java.util.StringTokenizer;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.jvnet.substance.SubstanceLookAndFeel;

public class Dc extends javax.swing.JFrame {
    
    public Dc() {
        initComponents();
        JFrame.setDefaultLookAndFeelDecorated(true);
        SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.BusinessBlackSteelSkin");
        SubstanceLookAndFeel.setCurrentTheme("org.jvnet.substance.theme.SubstanceCremeTheme");
        setTitle("DICCIONARIO");
        setLocationRelativeTo(null);
        setResizable(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        txt1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        Bei = new javax.swing.JRadioButton();
        Bie = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setOpaque(false);

        jButton1.setText("Traducir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(Bei);
        Bei.setText("Español-Ingles");
        Bei.setContentAreaFilled(false);

        buttonGroup1.add(Bie);
        Bie.setText("Ingles-Español");
        Bie.setOpaque(false);

        jButton2.setText("Añadir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Encriptar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Bei)
                            .addComponent(Bie))
                        .addGap(37, 37, 37)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Bei)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Bie))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public static String[] EE = {"cielo", "hola", "mundo", "rojo", "telefono", "zapato", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
    public static String[] IE = {"sky", "hello", "world", "red", "phone", "shoe", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
    public static String[] II = {"hello", "phone", "red", "shoe", "sky", "world", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
    public static String[] EI = {"hola", "telefono", "rojo", "zapato", "cielo", "mundo", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
    public static int act = 6;
    public static char[] letras = new char[27];

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (!(Bie.isSelected()) && !(Bei.isSelected())) {
            JOptionPane.showMessageDialog(null, "Error Seleccione una opcion");
        } else {
            String po = (txt1.getText()).toLowerCase();
            po = po.replaceAll(" ", "");
            StringTokenizer st = new StringTokenizer(po, ",");
            String tr = "";
            while (st.hasMoreTokens() && !(po.equals(""))) {
                String p = st.nextToken();
                if (!(p.equals(""))) {
                    if (Bie.isSelected() == true) {
                        tr = tr + traduce_to_Ingles(p) + ",";
                    } else if (Bei.isSelected() == true) {
                        tr = tr + traduce_to_Español(p) + ",";
                    }
                }
            }
            po = (txt1.getText()).toLowerCase();
            po = po.replaceAll(" ", "");
            StringTokenizer vr = new StringTokenizer(po, ",");
            if (po.equals("")) {
                JOptionPane.showMessageDialog(null, "No ha ingresado nada");
            } else if (vr.countTokens() > 4) {
                JOptionPane.showMessageDialog(null, "Excedio el numero de palabras");
            } else if (vr.countTokens() <= 4 && !(po.equals(""))) {
                JOptionPane.showMessageDialog(null, tr.substring(0, tr.length() - 1));
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed
//añadir
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (act < Inicio.w) {
            Formulario_add v3 = new Formulario_add();
            v3.setVisible(true);
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this, "Error Se ha alcanzado el limite maximo");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (act != 0) {
            Formulario_del v4 = new Formulario_del();
            v4.setVisible(true);
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this, "El diccionario esta vacio");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (!(Bie.isSelected()) && !(Bei.isSelected())) {
            JOptionPane.showMessageDialog(null, "Error seleccione una opcion");
        } else {
            String po = (txt1.getText()).toLowerCase();
            po = po.replaceAll(" ", "");
            StringTokenizer st = new StringTokenizer(po, ",");
            String tr = "";
            while (st.hasMoreTokens() && !(po.equals(""))) {
                String p = st.nextToken();
                if (!(p.equals(""))) {
                    if (Bie.isSelected() == true) {
                        if (traduce_to_Ingles(p).equals("No tenemos la traduccion")) {
                            JOptionPane.showMessageDialog(null, "No es pobile encriptar");
                            tr = "";
                            break;
                        }
                        tr = tr + traduce_to_Ingles(p) + ",";
                    } else if (Bei.isSelected() == true) {
                        if (traduce_to_Español(p).equals("No tenemos la traduccion")) {
                            JOptionPane.showMessageDialog(null, "No es pobile encriptar");
                            tr = "";
                            break;
                        }
                        tr = tr + traduce_to_Español(p) + ",";
                    }
                }
            }
            po = (txt1.getText()).toLowerCase();
            po = po.replaceAll(" ", "");
            StringTokenizer vr = new StringTokenizer(po, ",");
            if (po.equals("")) {
                JOptionPane.showMessageDialog(null, "No ha ingresado nada");
            } else if (vr.countTokens() > 4) {
                JOptionPane.showMessageDialog(null, "Excedio el numero de palabras");
            } else if (vr.countTokens() <= 4 && !(po.equals(""))) {
                if (!tr.equals("")) {
                    Encriptar(tr.substring(0, tr.length() - 1));
                }
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed
    public static void deleteEE(String p) {
        for (int i = buscar(p, EE); i < EE.length - 1; i++) {
            EE[i] = EE[i + 1];
            IE[i] = IE[i + 1];
        }
        for (int i = buscar(p, EI); i < EI.length - 1; i++) {
            EI[i] = EI[i + 1];
            II[i] = II[i + 1];
        }
    }
    
    public static void Encriptar(String s) {
        int a = (int) 'a';
        for (int i = 0; i < letras.length; i++) {
            if (i < 14) {
                letras[i] = (char) (a + i);
            } else if (i == 14) {
                letras[i] = 'ñ';
            } else {
                letras[i] = (char) (a - 1 + i);
            }
        }
        String clave = "";
        do {
            clave = JOptionPane.showInputDialog(null, "Digite la clave");
        } while (clave == null || clave.equals(""));
        if (clave.length() < s.length()) {
            clave = igclave(s, clave);
        }
        s = s.replaceAll(" ", "");
        char f1[], cl[];
        f1 = s.toCharArray();
        cl = clave.toCharArray();       
        for (int i = 0; i < s.length(); i++) {
            if (f1[i] == ',') {
                f1[i] = cl[i];
            } else {
                int n = (posletra(f1[i]) + posletra(cl[i])) % 27;
                f1[i] = letras[n];
            }
        }
        String lol = "";
        for (int i = 0; i < s.length(); i++) {
            lol = lol + f1[i];
        }
        JOptionPane.showMessageDialog(null, lol);
    }

    public static String igclave(String w, String c) {
            int cont = 0;
            int p = c.length();
            for (int i = p; i < w.length(); i++) {
                if (cont == p) {
                    cont = 0;
                }
                if (!w.substring(i,i+1).equals(',')) {
                    c = c + "" + c.substring(cont, cont + 1);
                    cont++;
                } else {
                    c = c + " " + c.substring(cont, cont + 1);
                }
            }
        return c;
    }

    public static int posletra(char l) {
        int i = 0;
        while (i < 27 && letras[i] != l) {
            i++;
        }
        return i;
    }
    
    public static void deleteII(String p) {
        for (int i = buscar(p, IE); i < IE.length - 1; i++) {
            EE[i] = EE[i + 1];
            IE[i] = IE[i + 1];
        }
        for (int i = buscar(p, II); i < II.length - 1; i++) {
            EI[i] = EI[i + 1];
            II[i] = II[i + 1];
        }
    }
    
    public static void añadirII(String p, String p1) {
        int x = posicion(p1, II);
        for (int i = EI.length - 1; i > x; i--) {
            EI[i] = EI[i - 1];
            II[i] = II[i - 1];
        }
        EI[x] = p;
        II[x] = p1;
    }
    
    public static void añadirEE(String p, String p1) {
        int x = posicion(p, EE);
        for (int i = EE.length - 1; i > x; i--) {
            EE[i] = EE[i - 1];
            IE[i] = IE[i - 1];
        }
        EE[x] = p;
        IE[x] = p1;
    }
    
    public static int posicion(String p, String a[]) {
        int x = 0;
        while (x < a.length) {
            if (p.compareTo(a[x]) < 0 || a[x].equals("")) {
                return x;
            }
            x++;
        }
        return a.length;
    }
    
    public static String traduce_to_Ingles(String p) {
        int x = buscar(p, II);
        if (x != -1) {
            return EI[x];
        } else {
            return "No tenemos la traduccion";
        }
    }
    
    public static String traduce_to_Español(String p) {
        int x = buscar(p, EE);
        if (x != -1) {
            return IE[x];
        } else {
            return "No tenemos la traduccion";
        }
    }
    
    public static int buscar(String palabra, String m[]) {
        int i = 0;
        while (i < m.length) {
            if (palabra.equals(m[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }
    
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
            java.util.logging.Logger.getLogger(Dc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dc().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Bei;
    private javax.swing.JRadioButton Bie;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt1;
    // End of variables declaration//GEN-END:variables

}
