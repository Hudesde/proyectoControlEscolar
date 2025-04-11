/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoSistemaEscolar.bd.mappers;

import ProyectoSistemaEscolar.bd.domain.Alumno;
import ProyectoSistemaEscolar.bd.domain.Grupo;
import java.util.ArrayList;
import java.sql.*;
/**
 *
 * @author Refut
 */
public class GrupoMapper {
    public ArrayList<Grupo> visualizarPorCarreraGrupo(String carrera) {
        conexion con = new conexion();
        Connection conn = con.getConexion();
        ArrayList<Grupo> grupos = new ArrayList<>();
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            String sql = "SELECT * FROM grupos WHERE SUBSTRING(nombre, 3, 1) = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, carrera);
            rs = pstmt.executeQuery();
            
            while (rs.next()) {
                Grupo temp = new Grupo();
                temp.setId_grupo(rs.getInt("id_grupo"));
                temp.setNombre(rs.getString("nombre"));
                grupos.add(temp);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        
        return grupos;
    }

    // Método para filtrar por semestre
    public ArrayList<Grupo> visualizarPorSemestreGrupo(String semestre) {
        conexion con = new conexion();
        Connection conn = con.getConexion();
        ArrayList<Grupo> grupos = new ArrayList<>();
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            String sql = "SELECT * FROM grupos WHERE LEFT(nombre, 1) = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, semestre);
            rs = pstmt.executeQuery();
            
            while (rs.next()) {
                Grupo temp = new Grupo();
                temp.setId_grupo(rs.getInt("id_grupo"));
                temp.setNombre(rs.getString("nombre"));
                grupos.add(temp);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        
        return grupos;
    }
    public ArrayList<Grupo> listarGrupo() {
        conexion con = new conexion();
        Connection conn = con.getConexion();
        
        Statement stmt = null;
        ResultSet rs = null;
        ArrayList<Grupo> grupos = new ArrayList();
        
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM grupos");
            
            while (rs.next()) {
                Grupo temp = new Grupo();
                temp.setId_grupo(rs.getInt("id_grupo"));
                temp.setNombre(rs.getString("nombre"));
                grupos.add(temp);
            }
        }
        catch (SQLException e) {
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
        
        return grupos;
    }
    
    public ArrayList<Alumno> listarAlumnosGrupo(int id) {
        conexion con = new conexion();
        Connection conn = con.getConexion();
        
        Statement stmt = null;
        ResultSet rs = null;
        ArrayList<Alumno> alumnos = new ArrayList();
        
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT *  FROM `alumnos` WHERE `id_grupo` = "+id);
            
            while (rs.next()) {
                
                Alumno temp = new Alumno();
                temp.setId_alumno(rs.getInt("id_alumno"));
                temp.setNombre(rs.getString("nombre"));
                temp.setApellido_paterno(rs.getString("apellido_paterno"));
                temp.setApellido_materno(rs.getString("apellido_materno"));
                temp.setMatricula(rs.getString("matricula"));
                temp.setCorreo(rs.getString("correo"));
                temp.setPassword(rs.getString("password"));
                temp.setId_grupo(rs.getInt("id_grupo"));
                alumnos.add(temp);
                
            }
        }
        catch (SQLException e) {
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
        
        return alumnos;
    }
    
   public int registarGrupo(Grupo nuevoGrupo){
        conexion con = new conexion();
        Connection conn = con.getConexion();

        Statement stmt = null;
        ResultSet rs = null;
        int insert_id = -1;
        
        
        try {
        stmt = conn.createStatement();
        stmt.executeUpdate("INSERT INTO grupos (id_grupo, nombre) "
                + "VALUES (NULL, '"+ nuevoGrupo.getNombre()+"')", Statement.RETURN_GENERATED_KEYS);
        System.out.println("Grupo Registrados");
        rs = stmt.getGeneratedKeys();
        System.out.println(rs);
        System.out.println("Claves obtenidas");
        if(rs.next()){
            insert_id = rs.getInt(1);
        }
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
            }
        }
          return insert_id;
    }
    
    public boolean modificarGrupo(Grupo nuevoGrupo){
        conexion con = new conexion();
        Connection conn = con.getConexion();

        Statement stmt = null;
        ResultSet rs = null;
        
        
        try {
        stmt = conn.createStatement();
        
        stmt.executeUpdate("UPDATE `grupos` SET nombre = '"+ nuevoGrupo.getNombre()+"' WHERE `grupos`.`id_grupo` = "+nuevoGrupo.getId_grupo());
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
            }
        }
            
            
    } 
     public boolean eliminarGrupo(int id){
    conexion con = new conexion();
    Connection conn = con.getConexion();

    Statement stmt = null;
    ResultSet rs = null;
    
    try {
        stmt = conn.createStatement();
        
        // Sentencia para eliminar la tupla de la tabla 'grupos' usando el 'id' proporcionado
        stmt.executeUpdate("DELETE FROM `grupos` WHERE id_grupo = " + id);
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
        }
    }
    
    }

}
