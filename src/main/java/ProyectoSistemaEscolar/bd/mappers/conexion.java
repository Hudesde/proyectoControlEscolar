package ProyectoSistemaEscolar.bd.mappers;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;

public class conexion {
    public Connection getConexion() {
        Connection conexion = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/escolar","root","");
            System.out.println("Conexion exitosa!");

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, "Error en la conexión", ex);
        }
     return conexion;
    }
}