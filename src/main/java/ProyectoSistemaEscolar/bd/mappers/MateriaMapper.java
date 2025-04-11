package ProyectoSistemaEscolar.bd.mappers;

import ProyectoSistemaEscolar.bd.domain.Materia;
import ProyectoSistemaEscolar.bd.domain.Materia;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author ADMINISTRACION
 */
public class MateriaMapper {
        public int registarMateriaSolo(Materia nuevaMateria){
        conexion con = new conexion();
        Connection conn = con.getConexion();
        int insert_id = -1;
        Statement stmt = null;
        ResultSet rs = null;
        
        
        try {
        stmt = conn.createStatement();
        stmt.executeUpdate("INSERT INTO materias (id_materia, nombre) VALUES (NULL, '" + nuevaMateria.getNombre() +"')",Statement.RETURN_GENERATED_KEYS);
        rs = stmt.getGeneratedKeys();
        if(rs.next())
            insert_id = rs.getInt(1);
        } catch (SQLException e) {
            insert_id = -1;
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
        return insert_id;    
    }
        
        public ArrayList<Materia> listarMateriasSolo() {
        conexion con = new conexion();
        Connection conn = con.getConexion();
        
        Statement stmt = null;
        ResultSet rs = null;
        ArrayList<Materia> materias = new ArrayList();
        
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM materias");
            
            while (rs.next()) {
                Materia temp = new Materia();
                temp.setId(rs.getInt("id_materia"));
                temp.setNombre(rs.getString("nombre"));
                materias.add(temp);
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
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
        
        return materias;
    }
    
         public boolean actualizaMateriaSolo(Materia nuevaMateria){
        conexion con = new conexion();
        Connection conn = con.getConexion();

        Statement stmt = null;
        ResultSet rs = null;
        
        
        try {
        stmt = conn.createStatement();
        
        stmt.executeUpdate("UPDATE materias SET nombre = '"+nuevaMateria.getNombre()+"' WHERE materias.id_materia = "+nuevaMateria.getId(),Statement.RETURN_GENERATED_KEYS);
        
        return true;
        } catch (SQLException e) {
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
         
        public boolean eliminarMateriaSolo(int id) {
        conexion con = new conexion();
        Connection conn = con.getConexion();
        
        Statement stmt = null;
        ResultSet rs = null;
        boolean isSuccesful = false;
        
        try {
            stmt = conn.createStatement();
            stmt.executeUpdate("DELETE FROM materias WHERE id_materia = "+id,Statement.RETURN_GENERATED_KEYS);
            isSuccesful = true;
        }
        catch (SQLException e) {
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
}
