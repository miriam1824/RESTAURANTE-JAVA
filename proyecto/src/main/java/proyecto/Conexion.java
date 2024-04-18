package proyecto;

import java.sql.*;

public class Conexion 
{
    public  static Connection getConexion(){
    Connection con = null;

    try {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/";
        String bd ="restaurante";
        
        con = DriverManager.getConnection(url + bd , "root","");
        System.out.println("Conectada");
        
    } catch (ClassNotFoundException e) {
        System.out.println("Error >> Driver no Instalado!!");
    } catch (SQLException e) {
        System.out.println("Error >> de conexi n con la BD");
    }
    return con;
}

    /*public static void main(String[] args) throws Exception {
        try {
          Class.forName("com.mysql.cj.jdbc.Driver");
          Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurante","root","");
          Statement stmt = con.createStatement();
          
          ResultSet rs = stmt.executeQuery("select*from usuarios where nombre = ? and clave =  ?");
          
          while (rs.next()){
              System.out.println(rs.getString(2));
          }
          con.close();
         } catch (Exception e) {
          System.out.println(e);
         }
      }*/
}
