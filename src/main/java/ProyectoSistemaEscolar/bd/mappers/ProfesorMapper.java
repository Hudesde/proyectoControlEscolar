package ProyectoSistemaEscolar.bd.mappers;

/**
 *
 * @author ADMINISTRACION
 */
import java.sql.*;
import java.util.ArrayList; //Los import deben ir siempre al principio antes de declarar la clase
import ProyectoSistemaEscolar.bd.domain.Profesor;
public class ProfesorMapper {
    public ArrayList<Profesor> listarProfesor(){
        conexion con = new conexion();
        Connection conn = con.getConexion();
        
        Statement stmt = null;
        ResultSet rs = null;
        
        ArrayList<Profesor> profes = new ArrayList<>();
        //Profesor temp = new Profesor();
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM profesores");

            while (rs.next()) {
                Profesor temp = new Profesor();
                //id_calificacion = rs.getInt("id_alumno");
                //descripcion = rs.getString("nombre");
                temp.setId_profesor(rs.getInt("id_profesor"));
                temp.setNombres(rs.getString("nombre"));
                temp.setApellido_materno(rs.getString("apellido_materno"));
                temp.setApellido_paterno(rs.getString("apellido_paterno"));
                temp.setCorreo(rs.getString("correo"));
                temp.setTelefono(rs.getString("telefono"));
                temp.setId_materia(rs.getInt("id_materia"));
                profes.add(temp);
                //System.out.println("ID: " + rs.getInt("id_profesor") + ", Nombre: " + rs.getString("nombre"));
            }
            
            /*for (Profesor profesor : profes) {
                System.out.println(profesor.getNombres());
            }*/
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return profes;
    }
    
        public Profesor listarOneProfesor(int idP){
        conexion con = new conexion();
        Connection conn = con.getConexion();
        
        Statement stmt = null;
        ResultSet rs = null;
        
        Profesor profe = new Profesor();
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM profesores WHERE id_profesor = "+idP);

            while (rs.next()) {
                profe.setId_profesor(rs.getInt("id_profesor"));
                profe.setNombres(rs.getString("nombre"));
                profe.setApellido_materno(rs.getString("apellido_materno"));
                profe.setApellido_paterno(rs.getString("apellido_paterno"));
                profe.setCorreo(rs.getString("correo"));
                profe.setTelefono(rs.getString("telefono"));
                profe.setId_materia(rs.getInt("id_materia"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return profe;
    }
    
    public String listarProfesorMateriaId(int idP){
        conexion con = new conexion();
        Connection conn = con.getConexion();
        
        Statement stmt = null;
        ResultSet rs = null;
        
        //ArrayList<Profesor> profes = new ArrayList<>();
        //Profesor temp = new Profesor();
        String temp = "";
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT materias.nombre AS 'Materia' FROM profesores,materias WHERE profesores.id_materia= materias.id_materia AND profesores.id_profesor= "+idP);

            while (rs.next()) {
                
                temp =rs.getString("Materia");

            }
            
            /*for (Profesor profesor : profes) {
                System.out.println(profesor.getNombres());
            }*/
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return temp;
    }
    
    public boolean registarProfesor(Profesor nuevoProfe){
        conexion con = new conexion();
        Connection conn = con.getConexion();
        boolean isSuccesful = false;
        Statement stmt = null;
        ResultSet rs = null;
        
        
        try {
        stmt = conn.createStatement();
        stmt.executeUpdate("INSERT INTO profesores (id_profesor, nombre, apellido_paterno, apellido_materno, telefono, correo, id_materia) "
                + "VALUES (NULL, '"+ nuevoProfe.getNombres() +"', '"+ nuevoProfe.getApellido_paterno() +"', '"+nuevoProfe.getApellido_materno()
                +"', '"+nuevoProfe.getTelefono() +"', '"+ nuevoProfe.getCorreo()+ "',"+ nuevoProfe.getId_materia()+")");
        isSuccesful = true;
        } catch (SQLException e) {
            System.out.println(e);
            isSuccesful = false;
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return isSuccesful;
    }
    
    public boolean actualizarProfesor(Profesor nuevoProfe){
        conexion con = new conexion();
        Connection conn = con.getConexion();
        boolean isSuccesful = false;
        Statement stmt = null;
        ResultSet rs = null;
        
        
        try {
        stmt = conn.createStatement();
        stmt.executeUpdate("UPDATE `profesores` SET `nombre` = '"+nuevoProfe.getNombres()+"', `apellido_paterno` = '"+nuevoProfe.getApellido_paterno()+"', "
                + "`apellido_materno` = '"+nuevoProfe.getApellido_materno()+"', `telefono` = '"+nuevoProfe.getTelefono()+"', `correo` = '"+nuevoProfe.getCorreo()+"', `id_materia` = "+ nuevoProfe.getId_materia() +" WHERE `profesores`.`id_profesor` = "+nuevoProfe.getId_profesor());
        isSuccesful = true;
        } catch (SQLException e) {
            System.out.println(e);
            isSuccesful = false;
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return isSuccesful;
    }
    public boolean asignarMateriaProfesor(Profesor nuevoProfesor) {
        conexion con = new conexion();
        Connection conn = con.getConexion();
        
        Statement stmt = null;
        ResultSet rs = null;
        boolean isSuccesful = false;
        
        try {
            stmt = conn.createStatement();
            stmt.executeUpdate("UPDATE profesores SET id_materia = "+ nuevoProfesor.getId_materia()
                               +" WHERE  profesores.id_profesor = "+nuevoProfesor.getId_profesor());
            isSuccesful = true;
        }
        catch(SQLException e) {
            isSuccesful = false;
        }
        finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            }
            catch (SQLException e) {
                e.printStackTrace();
            }
        }
        
        return isSuccesful;
    }    
public boolean eliminarProfesor(int id){
    conexion con = new conexion();
    Connection conn = con.getConexion();

    Statement stmt = null;
    ResultSet rs = null;
    
    try {
        stmt = conn.createStatement();
        
        // Sentencia para eliminar la tupla de la tabla 'grupos' usando el 'id' proporcionado
        stmt.executeUpdate("DELETE FROM `profesores` WHERE id_profesor = " + id);
        return true;
    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    } finally {
        try {
            if (rs != null) {
                rs.close();
            }
            if (stmt != null) {
                stmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    }
}
