package Controladores;

import Conexion.ConexionSQL;
import static Vista.Usuarios.resultado;
import Vista.guiPlanilla;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import org.edisoncor.gui.passwordField.PasswordFieldRoundBackground;
import org.edisoncor.gui.textField.TextFieldRound;

/*
    Esta clase valida los datos de entrada, con la base de datos para permitir acceso a usuarios
*/

public class Logging {

    
    ConexionSQL cc=new ConexionSQL();
    Connection con=cc.conexion(); 
    
 /*   public String logging_usuario(String usuario, String password) {
        // auxi
        String mensaje;
        if (usuario.equals("Admin") && password.equals("1111")) {
            mensaje = "Usuario Admin logeado";
        } else if ((usuario.equals("Juan") && password.equals("1234"))) {
            mensaje = "Usuario Juan logeado";
        } else if ((usuario.equals("Diego") && password.equals("7777"))) {
            mensaje = "Usuario Diego logeado";
        } else if ((usuario.equals("Kevin") && password.equals("9895"))) {
            mensaje = "Usuario Kevin logeado";
        } else {
            mensaje = "Invalido";
        }

        return mensaje;

    }
*/
    public String validarUsuario(String usuario, String password) {
        
        String mensaje;

        try {
            String SQL = ("SELECT nombre, contraseña FROM empleado WHERE nombre = '" + usuario + "' && contraseña = '" + password + "' ");
            PreparedStatement pst = con.prepareStatement(SQL);
            resultado = pst.executeQuery();

            if (resultado.next()) {
                JOptionPane.showMessageDialog(null, "Ingreso exitoso");
                
            } else {
                JOptionPane.showMessageDialog(null, "Autenticación fallida");
                mensaje = "Invalido";

            }

            con.close();

        } catch (SQLException | HeadlessException e) {

            JOptionPane.showMessageDialog(null, "Error desconocido: " + e.getMessage());
            
        }
        return "";
    }
}

