package ProyectoSistemaEscolar.bd.mappers;

/**
 *
 * @author alber
 */

import ProyectoSistemaEscolar.bd.domain.Union;
import java.sql.*;
import java.util.ArrayList;
public class UnionMapper {
    public int registarUnion(Union nuevaUnion){
        conexion con = new conexion();
        Connection conn = con.getConexion();
        int insert_id = -1;
        Statement stmt = null;
        ResultSet rs = null;
        
        
        try {
        stmt = conn.createStatement();
        stmt.executeUpdate("INSERT INTO `conexion` (`id`, `id_profesor`, `id_alumno`, `id_calificacion`) VALUES (NULL, "+nuevaUnion.getId_profesor()+", "+ nuevaUnion.getId_alumno()+", "+nuevaUnion.getId_calificacion()+")",Statement.RETURN_GENERATED_KEYS);
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
    
    public boolean actualizaUnion(Union nuevaMateria){
        conexion con = new conexion();
        Connection conn = con.getConexion();

        Statement stmt = null;
        ResultSet rs = null;
        
        
        try {
        stmt = conn.createStatement();
        
        /*stmt.executeUpdate("UPDATE `conexion` SET `id_profesor` = '2', `id_alumno` = '2' WHERE `conexion`.`id` = 5",Statement.RETURN_GENERATED_KEYS);*/
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
    
    public ArrayList<Union> listarUniones() {
        conexion con = new conexion();
        Connection conn = con.getConexion();
        
        Statement stmt = null;
        ResultSet rs = null;
        ArrayList<Union> materias = new ArrayList();
        
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM `conexion`");
            
            while (rs.next()) {
                Union temp = new Union();
                temp.setId_alumno(rs.getInt("id_alumno"));
                temp.setId_calificacion(rs.getInt("id_calificacion"));
                temp.setId_profesor(rs.getInt("id_profesor"));
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
    
    public ArrayList<Union> listarUnionesIdAlumno(int idA) {
        conexion con = new conexion();
        Connection conn = con.getConexion();
        
        Statement stmt = null;
        ResultSet rs = null;
        ArrayList<Union> materias = new ArrayList();
        
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM conexion WHERE id_alumno= "+idA);
            
            while (rs.next()) {
                Union temp = new Union();
                temp.setId(rs.getInt("id"));
                temp.setId_alumno(rs.getInt("id_alumno"));
                temp.setId_calificacion(rs.getInt("id_calificacion"));
                temp.setId_profesor(rs.getInt("id_profesor"));
                materias.add(temp);
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
            return null;
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
    
    public ArrayList<Union> listarUnionesProfes(int idP) {
        conexion con = new conexion();
        Connection conn = con.getConexion();
        
        Statement stmt = null;
        ResultSet rs = null;
        ArrayList<Union> materias = new ArrayList();
        
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM `conexion` WHERE `id_profesor` = "+idP);
            
            while (rs.next()) {
                Union temp = new Union();
                temp.setId_alumno(rs.getInt("id_alumno"));
                temp.setId_calificacion(rs.getInt("id_calificacion"));
                temp.setId_profesor(rs.getInt("id_profesor"));
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
    
    public String listarGrupoProfe(int id) {
        conexion con = new conexion();
        Connection conn = con.getConexion();
        
        Statement stmt = null;
        ResultSet rs = null;
        String temp = "";
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT DISTINCT grupos.nombre FROM conexion,alumnos,grupos WHERE conexion.id_profesor ="+id +" AND alumnos.id_alumno = conexion.id_alumno AND alumnos.id_grupo = grupos.id_grupo");
            
            while (rs.next()) {
                
                temp = rs.getString("nombre");
                
            }
        }
        catch (SQLException e) {
            return "";
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
            }
        }
        
        return temp;
    }
    
    public boolean eliminarUnionTodas(int id) {
        conexion con = new conexion();
        Connection conn = con.getConexion();
        
        Statement stmt = null;
        ResultSet rs = null;
        boolean isSuccesful = false;
        
        try {
            stmt = conn.createStatement();
            stmt.executeUpdate("DELETE FROM conexion WHERE id_profesor = "+id,Statement.RETURN_GENERATED_KEYS);
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
    
    public boolean eliminarUnion(int id) {
        conexion con = new conexion();
        Connection conn = con.getConexion();
        
        Statement stmt = null;
        ResultSet rs = null;
        boolean isSuccesful = false;
        
        try {
            stmt = conn.createStatement();
            stmt.executeUpdate("DELETE FROM conexion WHERE id = "+id,Statement.RETURN_GENERATED_KEYS);
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
    
    public ArrayList<ArrayList<String>> listarMateriasTodo() {
        conexion con = new conexion();
        Connection conn = con.getConexion();
        
        Statement stmt = null;
        ResultSet rs = null;
        ArrayList<ArrayList<String>> materias = new ArrayList<>();
        
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT conexion.id,materias.nombre AS 'Materia',CONCAT( alumnos.nombre,' ',alumnos.apellido_paterno, ' ',alumnos.apellido_materno) AS 'Alumno',grupos.nombre AS 'Grupo',calificacion.id_calificacion AS 'IdCalificacion',calificacion.parcial1,calificacion.parcial2,calificacion.parcial3,calificacion.ordinario,calificacion.extra1 FROM conexion,calificacion,profesores,materias,alumnos,grupos WHERE conexion.id_calificacion=calificacion.id_calificacion AND profesores.id_profesor = conexion.id_profesor AND profesores.id_materia=materias.id_materia AND conexion.id_alumno=alumnos.id_alumno AND alumnos.id_grupo = grupos.id_grupo;");
            
            while (rs.next()) {
                ArrayList<String> lista = new ArrayList<>();
                lista.add(Integer.toString(rs.getInt("id")));
                lista.add(rs.getString("Materia"));
                lista.add(rs.getString("Alumno"));
                lista.add(rs.getString("Grupo"));
                lista.add(Integer.toString(rs.getInt("IdCalificacion")));
                materias.add(lista);
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
}
