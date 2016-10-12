package lab_final_willian_garcia_martin_molinares;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Dc extends javax.swing.JFrame {

    public Dc() {
        initComponents();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Traducir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(Bei);
        Bei.setText("Ei");

        buttonGroup1.add(Bie);
        Bie.setText("Ie");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(114, 114, 114)
                                        .addComponent(Bie))
                                    .addComponent(Bei))))
                        .addGap(136, 136, 136)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 264, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Bie)
                            .addComponent(Bei)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public static String[] EE = {"cielo", "hola", "mundo", "rojo", "telefono", "zapato","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","",""};
    public static String[] IE = {"sky", "hello", "world", "red", "phone", "shoe","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","",""};
    public static String[] II = {"hello", "phone", "red", "shoe", "sky", "world","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","",""};
    public static String[] EI = {"hola", "telefono", "rojo", "zapato", "cielo","mundo","","","", "","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","",""};
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //int lim;
        //JOptionPane.showConfirmDialog(rootPane, sc);
        Scanner sc = new Scanner(System.in);
        String po = (txt1.getText()).toLowerCase();
        po = po.replaceAll(" ", "");
        StringTokenizer st = new StringTokenizer(po, ",");
        int j = 0;
        String tr = "";
        while (st.hasMoreTokens()) {
            String p = st.nextToken();
            if (!(p.equals(""))) {
                if (Bie.isSelected() == true) {
                    tr = tr + traduce_to_Ingles(p) + ",";
                }else if (Bei.isSelected() == true) {
                    tr = tr + traduce_to_Español(p) + ",";
                }
                j++;
            }
             if (j <= 4 && !(tr.equals(""))) {
            tr = tr.substring(0, tr.length() - 1);
            System.out.println(tr);
        } else if (po.equals("")) {
            System.out.println("No ha ingresado nada");
        } else {
            System.out.println("Excedio el numero de palabras");
        }
      }   
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String pe,pi;
        Scanner sc =new Scanner(System.in);
        pe=sc.nextLine();
        pi=sc.nextLine();
        if(buscar(pe,EE)==-1){
        añadirEE(pe,pi);
        for (int i = 0; i < EE.length; i++) {
              if(!(EE[i].equals("")) && !(IE[i].equals(""))){
                System.out.println(EE[i]+" "+IE[i]);
              }
        }
     }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String del;
        Scanner sc =new Scanner(System.in);
        del=sc.nextLine();
        if(buscar(del,EE)!=-1){
            delete(del);
            for (int i = 0; i < EE.length; i++) {
                  if(!(EE[i].equals("")) && !(IE[i].equals(""))){
                    System.out.println(EE[i]+" "+IE[i]);
                  }
            }
            for (int i = 0; i < EE.length; i++) {
                  if(!(EE[i].equals("")) && !(IE[i].equals(""))){
                    System.out.println(II[i]+" "+EI[i]);
                  }
            }
        }else{
            System.out.println("La palabra no se encuentra");
        }  
    }//GEN-LAST:event_jButton3ActionPerformed
public static void delete(String p) {
            for (int i = buscar(p,EE); i < EE.length-1; i++) {
                EE[i]=EE[i+1];
                IE[i]=IE[i+1];
            }
            for (int i = buscar(p,EI); i < EI.length-1; i++) {
                EI[i]=EI[i+1];
                II[i]=II[i+1];
            }
}
    public static void añadirII(String p,String p1) {
            int x=posicion(p, II);
            for (int i = EI.length-1; i > x; i--) {   
                EI[i]=EI[i-1];
                II[i]=II[i-1];
            }
            EI[x]=p1;
            II[x]=p;
    }
    public static void añadirEE(String p,String p1) {
            int x=posicion(p, EE);
            System.out.println(x);
            for (int i = EE.length-1; i > x; i--) {   
                EE[i]=EE[i-1];
                IE[i]=IE[i-1];
            }
            EE[x]=p;
            IE[x]=p1;
    }

    public static int posicion(String p, String a[]) {
        int x = 0;
        while (x < a.length) {
            if(p.compareTo(a[x])<0 || a[x].equals(""))
                return x;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt1;
    // End of variables declaration//GEN-END:variables
}
