package lab_final_willian_garcia_martin_molinares;
import javax.swing.JOptionPane;
import static lab_final_willian_garcia_martin_molinares.Inicio.w;
public class Lab_final_Willian_Garcia_Martin_Molinares {
    public static void main(String[] args) {
        int reply = JOptionPane.showConfirmDialog(null, "Desea el limite predeterminado?", "Diccionario", JOptionPane.YES_NO_OPTION);
        if( reply==0) {
            w=100;
            Dc v1 =new Dc();
            v1.setVisible(true);
        }else{
        Inicio v0=new Inicio();
        v0.setVisible(true);
        }
    }
    
}
