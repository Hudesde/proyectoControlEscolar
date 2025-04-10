import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;

public class conexion {
    public static void main(String[] args) {
        Connection conexion = null;
        Statement stmt = null;
        ResultSet rs = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/escolar","root","");
            System.out.println("Conexión exitosa!");

            // Consulta de prueba
            stmt = conexion.createStatement();
            rs = stmt.executeQuery("SELECT id_alumno, nombre, apellido_paterno, apellido_materno, matricula, correo FROM alumnos");
            while (rs.next()) {
                // Obtener datos de las columnas específicas
                int id_alumno = rs.getInt("id_alumno");
                String nombre = rs.getString("nombre");
                String apellido_paterno = rs.getString("apellido_paterno");
                String apellido_materno = rs.getString("apellido_materno");
                String matricula = rs.getString("matricula");
                String correo = rs.getString("correo");
                System.out.println("ID: " + id_alumno + ", Nombre: " + nombre + " " + apellido_paterno + " " + apellido_materno + ", Matrícula: " + matricula + ", Correo: " + correo);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, "Error en la conexión", ex);
        } finally {
            // Cerrar recursos en el bloque finally
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conexion != null) conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, "Error al cerrar recursos", ex);
            }
        }
    }
}
