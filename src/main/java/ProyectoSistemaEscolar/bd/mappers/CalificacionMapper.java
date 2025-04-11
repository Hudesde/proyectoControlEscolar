package ProyectoSistemaEscolar.bd.mappers;

import ProyectoSistemaEscolar.bd.domain.Calificacion;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @autor ADMINISTRACION
 */
public class CalificacionMapper {
    public int anadeCalif(Calificacion nuevaCalificacion){
        conexion con = new conexion();
        Connection conn = con.getConexion();
        int insert_id = -1;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            stmt = conn.createStatement();
            stmt.executeUpdate("INSERT INTO calificacion (id_calificacion, parcial1, parcial2, parcial3, ordinario, extra1) "
                + "VALUES (NULL, '"+ nuevaCalificacion.getParcial1() + "', '" + nuevaCalificacion.getParcial2() + "', '" + nuevaCalificacion.getParcial3() + "', '" + nuevaCalificacion.getOrdinario() + "', '" + nuevaCalificacion.getExtra1() + "')",Statement.RETURN_GENERATED_KEYS);
            rs = stmt.getGeneratedKeys();
            if (rs.next()) {
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
                e.printStackTrace();
            }
        }
        return insert_id;
    }

    public boolean actualizaCalif(Calificacion nuevaCalificacion){
        conexion con = new conexion();
        Connection conn = con.getConexion();

        Statement stmt = null;
        ResultSet rs = null;

        try {
            stmt = conn.createStatement();
            stmt.executeUpdate("UPDATE calificacion SET parcial1 = '" + nuevaCalificacion.getParcial1() + "', parcial2 = '" + nuevaCalificacion.getParcial2() + "', parcial3 = '" + nuevaCalificacion.getParcial3() + "', ordinario = '" + nuevaCalificacion.getOrdinario() + "', extra1 = '" + nuevaCalificacion.getExtra1() + "' WHERE id_calificacion = '" + nuevaCalificacion.getIdCalificacion() + "'");
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
    
    public boolean eliminarCalificacion(int idC){
        conexion con = new conexion();
        Connection conn = con.getConexion();

        Statement stmt = null;
        ResultSet rs = null;

        try {
            stmt = conn.createStatement();
            stmt.executeUpdate("DELETE FROM calificacion WHERE calificacion.id_calificacion = '" + idC+"';",Statement.RETURN_GENERATED_KEYS);
            
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
        return true;
    }

    public ArrayList<Calificacion> listarCalificaciones() {
        conexion con = new conexion();
        Connection conn = con.getConexion();

        Statement stmt = null;
        ResultSet rs = null;
        ArrayList<Calificacion> calificaciones = new ArrayList<>();

        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM calificacion");

            while (rs.next()) {
                Calificacion temp = new Calificacion();
                temp.setIdCalificacion(rs.getInt("id_calificacion"));
                temp.setParcial1(rs.getInt("parcial1"));
                temp.setParcial2(rs.getInt("parcial2"));
                temp.setParcial3(rs.getInt("parcial3"));
                temp.setOrdinario(rs.getInt("ordinario"));
                temp.setExtra1(rs.getInt("extra1"));
                calificaciones.add(temp);
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

        return calificaciones;
    }
    
    public Calificacion listarCalificacionesId(int idC) {
        conexion con = new conexion();
        Connection conn = con.getConexion();

        Statement stmt = null;
        ResultSet rs = null;
        Calificacion temp = new Calificacion();

        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM `calificacion` WHERE `id_calificacion` = "+idC);

            while (rs.next()) {
                
                temp.setIdCalificacion(rs.getInt("id_calificacion"));
                temp.setParcial1(rs.getInt("parcial1"));
                temp.setParcial2(rs.getInt("parcial2"));
                temp.setParcial3(rs.getInt("parcial3"));
                temp.setOrdinario(rs.getInt("ordinario"));
                temp.setExtra1(rs.getInt("extra1"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
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
}
