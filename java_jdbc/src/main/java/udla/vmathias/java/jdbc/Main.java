package udla.vmathias.java.jdbc;

import udla.vmathias.java.jdbc.util.ConexionBaseDatos;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        /*String url = "jdbc:mysql://localhost:3306/java_db?serverTimezone=America/Guayaquil";
        String url = "jdbc:mysql://localhost:3306/java_db?serverTimezone=UTC";
        String username = "root";
        String password = "sasa";*/

        try (Connection conn = ConexionBaseDatos.getInstance();
             Statement stmt = conn.createStatement();
             ResultSet resultado = stmt.executeQuery("SELECT * FROM productos");){
            /*Connection conn = DriverManager.getConnection(url, username, password);
            Statement stmt = conn.createStatement();
            ResultSet resultado = stmt.executeQuery("SELECT * FROM productos WHERE year(fecha_creacion_producto)<'2024'");*/
            while(resultado.next()){
                System.out.print(resultado.getString("id"));
                System.out.print("\t");
                System.out.print(resultado.getString("nombre_producto"));
                System.out.print("\t");
                System.out.print(resultado.getString("precio_producto"));
                System.out.print("\t");
                System.out.println(resultado.getString("fecha_creacion_producto"));
            }
            /*resultado.close();
            stmt.close();
            conn.close();*/
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }



    }
}