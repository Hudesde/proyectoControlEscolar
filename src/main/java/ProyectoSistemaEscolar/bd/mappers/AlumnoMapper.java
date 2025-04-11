/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoSistemaEscolar.bd.mappers;

import java.sql.*;
import java.util.ArrayList; //Los import deben ir siempre al principio antes de declarar la clase
import ProyectoSistemaEscolar.bd.domain.Alumno;
import ProyectoSistemaEscolar.bd.domain.Grupo;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Alumnos
 */
public class AlumnoMapper {
    public ArrayList<Alumno> listarAlumno() {
        conexion con = new conexion();
        Connection conn = con.getConexion();
        
        Statement stmt = null;
        ResultSet rs = null;
        ArrayList<Alumno> alumnos = new ArrayList();
        
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM alumnos");
            
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
        
        return alumnos;
    }
    
    public Alumno listOneAlumno(int id) {
        conexion con = new conexion();
        Connection conn = con.getConexion();
        
        Statement stmt = null;
        ResultSet rs = null;
        Alumno alumno = new Alumno();
        
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM alumnos WHERE id_alumno = "+id);
            
            if (rs.next()) {
                alumno.setId_alumno(rs.getInt("id_alumno"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setApellido_paterno(rs.getString("apellido_paterno"));
                alumno.setApellido_materno(rs.getString("apellido_materno"));
                alumno.setMatricula(rs.getString("matricula"));
                alumno.setCorreo(rs.getString("correo"));
                alumno.setPassword(rs.getString("password"));
                alumno.setId_grupo(rs.getInt("id_grupo"));
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
        
        return alumno;
    }
    
    public int registrarAlumno(Alumno nuevoAlumno) {
        conexion con = new conexion();
        Connection conn = con.getConexion();
        
        Statement stmt = null;
        ResultSet rs = null;
        int insert_id = -1;
        
        try {
            stmt = conn.createStatement();
            stmt.executeUpdate("INSERT INTO alumnos (id_alumno, nombre, apellido_paterno, apellido_materno, matricula, correo, password,id_grupo) "
                    + "VALUES (NULL, '"+nuevoAlumno.getNombre()+"', '"+nuevoAlumno.getApellido_paterno()+"', '"+nuevoAlumno.getApellido_materno()
                    + "', '"+nuevoAlumno.getMatricula()+"', '"+nuevoAlumno.getCorreo()+"', '"+nuevoAlumno.getPassword()+"', " + nuevoAlumno.getId_grupo() +")", Statement.RETURN_GENERATED_KEYS);
            rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                insert_id = rs.getInt(1);
            }
        }
        catch (SQLException e) {
            System.out.println(e);
            insert_id = -1;
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
        
        return insert_id;
    }
    
    public boolean actualizarAlumno(Alumno nuevoAlumno) {
        conexion con = new conexion();
        Connection conn = con.getConexion();
        
        Statement stmt = null;
        ResultSet rs = null;
        boolean isSuccesful = false;
        
        try {
            stmt = conn.createStatement();
            stmt.executeUpdate("UPDATE alumnos SET nombre = '"+nuevoAlumno.getNombre()+"', apellido_paterno = '"+nuevoAlumno.getApellido_paterno()
                               +"', apellido_materno = '"+nuevoAlumno.getApellido_materno()+"', matricula = '"+nuevoAlumno.getMatricula()
                               +"', correo = '"+nuevoAlumno.getCorreo()+"', password = '"+nuevoAlumno.getPassword()+"',id_grupo = "+ nuevoAlumno.getId_grupo()
                               +" WHERE id_alumno = "+nuevoAlumno.getId_alumno());
            isSuccesful = true;
        }
        catch(SQLException e) {
            System.out.println(e);
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
    public boolean asignarGrupoAlumno(Alumno nuevoAlumno) {
        conexion con = new conexion();
        Connection conn = con.getConexion();
        
        Statement stmt = null;
        ResultSet rs = null;
        boolean isSuccesful = false;
        
        try {
            stmt = conn.createStatement();
            stmt.executeUpdate("UPDATE alumnos SET id_grupo = "+ nuevoAlumno.getId_grupo()
                               +" WHERE  alumnos.id_alumno = "+nuevoAlumno.getId_alumno());
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
    public boolean eliminarAlumno(int id) {
        conexion con = new conexion();
        Connection conn = con.getConexion();
        
        Statement stmt = null;
        ResultSet rs = null;
        boolean isSuccesful = false;
        
        try {
            stmt = conn.createStatement();
            stmt.executeUpdate("DELETE FROM alumnos WHERE id_alumno = "+id);
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
    
    public int login(String correo, String password) {
        conexion con = new conexion();
        Connection conn = con.getConexion();
        
        Statement stmt = null;
        ResultSet rs = null;
        int id_alumno = -1;
        
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT id_alumno FROM alumnos WHERE correo = '"+correo+"' AND password = '"+password+"'");
            if (rs.next()) {
                id_alumno = rs.getInt("id_alumno");
            }
        }
        catch (SQLException e) {
            id_alumno = -1;
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
        
        return id_alumno;
    }
}
