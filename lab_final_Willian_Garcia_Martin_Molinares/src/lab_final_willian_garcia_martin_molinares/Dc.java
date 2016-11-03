package lab_final_willian_garcia_martin_molinares;

import java.util.StringTokenizer;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Dc extends javax.swing.JFrame {

    public Dc() {
        initComponents();
        
        JFrame.setDefaultLookAndFeelDecorated(true);
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
        jButton5 = new javax.swing.JButton();

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

        jButton5.setText("Desencriptar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Bei)
                            .addComponent(Bie))
                        .addGap(37, 37, 37)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE))
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(83, 83, 83)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(72, Short.MAX_VALUE))
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public static String[] EE = {"cielo", "hola", "mundo", "rojo", "teléfono", "zapato", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
    public static String[] IE = {"sky", "hello", "world", "red", "phone", "shoe", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
    public static String[] II = {"hello", "phone", "red", "shoe", "sky", "world", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
    public static String[] EI = {"hola", "telefono", "rojo", "zapato", "cielo", "mundo", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
    public static int act = 6;
    public static int x;
    public static String a = "";
    public static String prop = "";
    public static String original = "";
    public static char[] letras = new char[32];

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
                    if (Bie.isSelected() == true) tr = tr + traduce_to_Ingles(p) + ",";
                    else if (Bei.isSelected() == true) tr = tr + traduce_to_Español(p) + ",";
                }
            }
            po = (txt1.getText()).toLowerCase();
            po = po.replaceAll(" ", "");
            StringTokenizer vr = new StringTokenizer(po, ",");
            if (po.equals(""))
                JOptionPane.showMessageDialog(null, "No ha ingresado nada");
            else if (vr.countTokens() > 4)
                JOptionPane.showMessageDialog(null, "Excedio el numero de palabras");
            else if (vr.countTokens() <= 4 && !(po.equals("")))
                JOptionPane.showMessageDialog(null, tr.substring(0, tr.length() - 1));
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (act < Inicio.w) {
            Formulario_add v3 = new Formulario_add();
            v3.setVisible(true);
            this.setVisible(false);
        } else JOptionPane.showMessageDialog(this, "Error Se ha alcanzado el limite maximo");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (act != 0) {
            Formulario_del v4 = new Formulario_del();
            v4.setVisible(true);
            this.setVisible(false);
        } else
            JOptionPane.showMessageDialog(this, "El diccionario esta vacio");
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
                    System.out.println(tr.substring(0, tr.length() - 1));
                }
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        x = 0;
        if (!(Bie.isSelected()) && !(Bei.isSelected())) {
            JOptionPane.showMessageDialog(null, "Error seleccione una opcion");
        } else {
            String po = (txt1.getText()).toLowerCase();
            if (!po.replaceAll(" ", "").equals("")) {
                if (((po.replaceAll(" ", "").length()) - con_c(po, ",")) % 8 != 0) {
                    JOptionPane.showMessageDialog(this, "Error ingrese la entrada completa");
                } else {
                    //binary to text
                    po = binary_to_text(po);
                    System.out.println(po);
                    StringTokenizer st = new StringTokenizer(po, ",");
                    String tr = "";
                    String clave;
                    //error cuando cancelan
                    do {
                        clave = JOptionPane.showInputDialog(null, "Digite la clave");
                    } while (clave.equals("") || clave.equals(null));
                    clave = clave.toLowerCase();
                    original = "";
                    prop = "";
                    String te = "";
                    while (st.hasMoreTokens() && !(po.equals("")) && !te.contains("No tenemos la traduccion")) {
                        String p = st.nextToken();
                        if (!(p.equals(""))) {
                            if (Bie.isSelected() == true) {
                                te+= Desencriptar(p, clave, IE, EE, "i") + ",";
                            } else if (Bei.isSelected() == true) {
                                te+= Desencriptar(p, clave, EI, II, "e") + ",";
                            }
                        }
                    }
                    if (te.contains("No tenemos la traduccion")) {
                        JOptionPane.showMessageDialog(null, "Error no todas las palabras tienen traduccion");
                    } else {
                        JOptionPane.showMessageDialog(null, "Mensaje traducido sin binario:\n" + po);
                        JOptionPane.showMessageDialog(null, "Mensaje traducido sin binario y sin vigenere:\n" + prop.substring(0, prop.length() - 1));
                        JOptionPane.showMessageDialog(null, "Mensaje traducido sin binario,sin vigenere y\nsin cifrado propio es:\n" + our(prop.substring(0, prop.length() - 1)));
                        JOptionPane.showMessageDialog(null, "Mensaje traducido sin binario,sin vigenere,\nsin cifrado propio es y traducido a su vez al idioma contrario es:\n" + te.substring(0,te.length()-1));
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Error no ingreso nada");
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed
    public static void Encriptar(String s) {
        x = 0;
        int a = (int) 'a';
        for (int i = 0; i < 26; i++) {
            if (i < 14) {
                letras[i] = (char) (a + i);
            } else if (i == 14) {
                letras[i] = 'ñ';
            } else {
                letras[i] = (char) (a - 1 + i);
            }
        }
        letras[27] = 'á';
        letras[28] = 'é';
        letras[29] = 'í';
        letras[30] = 'ó';
        letras[31] = 'ú';
        String clave = "";
        do {
            clave = JOptionPane.showInputDialog(null, "Digite la clave");
            clave = clave.replaceAll(" ", "");
        } while (clave == null || clave.equals(""));
        clave = clave.toLowerCase();
        if (clave.length() < s.length()) {
            clave = igclave(s, clave);
        }
        s = s.replaceAll(" ", "");
        //cifrado propio
        s = our(s);
        JOptionPane.showMessageDialog(null, "cifrado propio: \n" + s);
        //cifrado vigenere
        char f1[], cl[];
        f1 = s.toCharArray();
        cl = clave.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (f1[i] == ',') {
                f1[i] = ',';
            } else {
                if (x == clave.length()) {
                    x = 0;
                }
                int n = (posletra(f1[i],0) + posletra(cl[x],0)) % 32;
                f1[i] = letras[n];
                x++;
            }
        }
        String lol = "";
        for (int i = 0; i < s.length(); i++) {
            lol = lol + f1[i];
        }
        JOptionPane.showMessageDialog(null, "Propio+vigenere: \n" + lol);
        //cifrado a binario (aplicacion)
        String pala = "", sout;
        StringTokenizer xd = new StringTokenizer(lol, ",");
        while (xd.hasMoreTokens()) {
            String w = xd.nextToken();
            sout = "";
            for (int i = 0; i < w.length(); i++) {
                sout += text_to_binary(w.charAt(i));
            }
            pala += sout + ",\n";
        }
        System.out.println(pala.substring(0, pala.length() - 2));
        JOptionPane.showMessageDialog(null, "(propio+vigenere) a binario:\n" + pala.substring(0, pala.length() - 2));
    }

    public static String our(String c) {
        c = c.replaceAll(" ", "");
        char sw;
        StringTokenizer st = new StringTokenizer(c, ",");
        String nc = "";
        while (st.hasMoreTokens()) {
            String w = st.nextToken();
            if (w.length() % 2 == 0) {
                for (int i = 0; i < w.length(); i += 2) {
                    nc += w.substring(i + 1, i + 2) + c.substring(i, i + 1) + "";
                }
            } else {
                for (int i = 0; i < w.length() - 1; i += 2) {
                    nc += w.substring(i + 1, i + 2) + w.substring(i, i + 1) + "";
                }
                nc += w.substring(w.length() - 1, w.length());
            }
            nc += ",";
        }
        return nc.substring(0, nc.length() - 1);
    }

    public static String Desencriptar(String s, String psw, String v[], String v2[], String l) {
        int d = psw.length();
        x = 0;
        int a = (int) 'a';
        for (int i = 0; i < 26; i++) {
            if (i < 14) {
                letras[i] = (char) (a + i);
            } else if (i == 14) {
                letras[i] = 'ñ';
            } else {
                letras[i] = (char) (a - 1 + i);
            }
        }
        letras[27] = 'á';
        letras[28] = 'é';
        letras[29] = 'í';
        letras[30] = 'ó';
        letras[31] = 'ú';
        String palabra = "";
        char p[] = s.toCharArray();
        char cl[] = psw.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (p[i] != ',') {
                if (x == d) {
                    x = 0;
                }
                int n = (posletra(p[i],0) - posletra(cl[x],0));
                if (n >= 0) {
                    n = n % 32;
                } else {
                    n = (n + 32) % 32;
                }
                palabra = palabra + letras[n];
                x++;
            }
        }
        prop += palabra + ",";
        palabra = our(palabra);
        int place = posicion(palabra, v);
        if (place != -1) {
            if (l.equals("e")) {
                return traduce_to_Español(palabra);
            } else if (l.equals("i")) {
                return traduce_to_Ingles(palabra);
            }
        }
        return "";
    }

    public static int con_c(String a, String b) {
        a = a.replaceAll(" ", "");
        int c = 0;
        while (a.contains(b)) {
            a = a.substring(a.indexOf(b) + 1, a.length());
            c++;
        }
        return c;
    }

    public static String binary_to_text(String a) {
        StringTokenizer st = new StringTokenizer(a, ",");
        String frase = "";
        while (st.hasMoreTokens()) {
            String w = st.nextToken();
            StringTokenizer esp = new StringTokenizer(w, " ");
            String palabra = "";
            while (esp.hasMoreTokens()) {
                String l = esp.nextToken();
                int num = 0;
                for (int i = 0; i < 8; i++) {
                    if (l.charAt(i) == '1') {
                        num += Math.pow(2, 8 - i - 1);
                    }
                }
                palabra += (char) num;
            }
            frase += palabra + ",";
        }
        return frase.substring(0, frase.length() - 1);
    }

    public static String text_to_binary(char a) {
        int s = (int) a;
        String binaryin = "";
        for (int i = 0; i < 8; i++) {
            binaryin += (s % 2);
            s = s / 2;
        }
        String binary = "";
        for (int i = 7; i > -1; i--) {
            binary += binaryin.charAt(i);
        }
        return binary + " ";
    }

    public static void deleteEE(String p) {
        for (int i = buscar(p, EE,0); i < EE.length - 1; i++) {
            EE[i] = EE[i + 1];
            IE[i] = IE[i + 1];
        }
        for (int i = buscar(p, EI,0); i < EI.length - 1; i++) {
            EI[i] = EI[i + 1];
            II[i] = II[i + 1];
        }
    }

    public static String igclave(String w, String c) {
        int cont = 0;
        int p = c.length();
        for (int i = p; i < w.length(); i++) {
            if (cont == p) {
                cont = 0;
            }
            if (!w.substring(i, i + 1).equals(',')) {
                c = c + "" + c.substring(cont, cont + 1);
                cont++;
            } else {
                c = c + " " + c.substring(cont, cont + 1);
            }
        }
        return c;
    }
/*public static int posletra(char l) {
        int i = 0;
        while (i < 32 && letras[i] != l) {
            i++;
        }
        return i;
    }*/
    public static int posletra(char l,int i) {
        
        if(i < 32 && letras[i] != l) {
            return posletra(l, i+1);
        }
        return i;       
    }

    public static void deleteII(String p) {
        for (int i = buscar(p, IE,0); i < IE.length - 1; i++) {
            EE[i] = EE[i + 1];
            IE[i] = IE[i + 1];
        }
        for (int i = buscar(p, II,0); i < II.length - 1; i++) {
            EI[i] = EI[i + 1];
            II[i] = II[i + 1];
        }
    }

    public static void añadirII(String p, String p1) {
        int x1 = posicion(p1, II);
        for (int i = EI.length - 1; i > x1; i--) {
            EI[i] = EI[i - 1];
            II[i] = II[i - 1];
        }
        EI[x1] = p;
        II[x1] = p1;
    }

    public static void añadirEE(String p, String p1) {
        int x1 = posicion(p, EE);
        for (int i = EE.length - 1; i > x1; i--) {
            EE[i] = EE[i - 1];
            IE[i] = IE[i - 1];
        }
        EE[x1] = p;
        IE[x1] = p1;
    }

    public static int posicion(String p, String a[]) {
        int x1 = 0;
        while (x1 < a.length) {
            if (p.compareTo(a[x1]) < 0 || a[x1].equals("")) {
                return x1;
            }
            x1++;
        }
        return a.length;
    }

    public static String traduce_to_Ingles(String p) {
        int x1 = buscar(p, II,0);
        if (x1 != -1) {
            return EI[x1];
        } else {
            return "No tenemos la traduccion";
        }
    }

    public static String traduce_to_Español(String p) {
        int x1 = buscar(p, EE,0);
        if (x1 != -1) {
            return IE[x1];
        } else {
            return "No tenemos la traduccion";
        }
    }

    public static int buscar(String palabra, String m[], int i) {
        if(i < m.length) {
            if (palabra.equals(m[i])) {
                return i;
            }
            return buscar(palabra, m, i+1);
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
    private javax.swing.JButton jButton5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt1;
    // End of variables declaration//GEN-END:variables
}
