package com.ejcsoft.conexion;
import com.ejcsoft.puntos.model.Punto;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Magda on 12/12/2016.
 */
public class conexion {
     public static void main(String[] args)
    {
        conexion c = new conexion();
        c.returnPuntos();
        System.out.println("hola");
        /* String driver = "org.postgresql.Driver";
        String connectString = "jdbc:postgresql://localhost:5432/sct";
        String user = "postgres";
        String password = "P4ssw0rd";
        java.util.List <Punto> puntos = new ArrayList<>();
        try{
            Class.forName(driver);
            Connection con = DriverManager.getConnection(connectString, user , password);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM accidentes_carreteros");
            System.out.println(rs.getFetchSize());
            while (rs.next()){
                Punto aux = new Punto(rs.getString("latitud"), rs.getString("longitud"));
                puntos.add(aux);

               // System.out.println("latitud " + rs.getString("latitud"));
            }

            stmt.close();
            con.close();

        }

        catch ( Exception e ){
            System.out.println(e.getMessage());
        }*/
    }

    List <Punto> returnPuntos() {


        String driver = "org.postgresql.Driver";
        String connectString = "jdbc:postgresql://localhost:5432/sct";
        String user = "postgres";
        String password = "P4ssw0rd";
        java.util.List <Punto> puntos = new ArrayList<>();
        try{
            Class.forName(driver);
            Connection con = DriverManager.getConnection(connectString, user , password);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM accidentes_carreteros");
            System.out.println(rs.getFetchSize());
            while (rs.next()){
                Punto aux = new Punto(rs.getString("latitud"), rs.getString("longitud"));
                puntos.add(aux);

                // System.out.println("latitud " + rs.getString("latitud"));
            }

            stmt.close();
            con.close();

        }

        catch ( Exception e ){
            System.out.println(e.getMessage());
        }
        return puntos;
    }
    conexion(){
        String driver = "org.postgresql.Driver";
        String connectString = "jdbc:postgresql://localhost:5432/sct";
        String user = "postgres";
        String password = "P4ssw0rd";
        java.util.List <Punto> puntos = new ArrayList<>();
        try{
            Class.forName(driver);
            Connection con = DriverManager.getConnection(connectString, user , password);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM accidentes_carreteros");
            System.out.println(rs.getFetchSize());
            while (rs.next()){
                Punto aux = new Punto(rs.getString("latitud"), rs.getString("longitud"));
                puntos.add(aux);

                // System.out.println("latitud " + rs.getString("latitud"));
            }

            stmt.close();
            con.close();

        }

        catch ( Exception e ){
            System.out.println(e.getMessage());
        }
    }

}