package com.mycompany.web.models;

import com.mycompany.web.models.Inscripto;

import java.sql.*;


public class AccionesInscripto {
    public static int registrarInscripto(Inscripto c) {
        int estado = 0;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyectofinal", "root",
                    "root");

            String query = "INSERT INTO inscripcion(nombre,apellido,correo,cantidad,categoria) VALUES (?,?,?,?,?)";

            String nombre = c.getNombre();
            String apellido = c.getApellido();
            String correo = c.getCorreo();
            int cantidad = c.getCantidad();
            String categoria = c.getCategoria();

            PreparedStatement pst = conexion.prepareStatement(query);

            pst.setString(1, nombre);
            pst.setString(2, apellido);
            pst.setString(3, correo);
            pst.setInt(4, cantidad);
            pst.setString(5, categoria);

            estado = pst.executeUpdate();

            conexion.close();

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Algo anda mal");
        }

        return estado;
    }

public static Inscripto verInscripto(int nroAConsultar){
    Inscripto inscriptoADevolver = new Inscripto();

    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/proyectofinal","root","root");

        String query = "SELECT * FROM inscripcion WHERE nro_tramite=?";

        PreparedStatement pst = conexion.prepareStatement(query);
        
        pst.setInt(1, nroAConsultar);

        ResultSet consultaInscripto = pst.executeQuery();

        if (consultaInscripto.next()){
            inscriptoADevolver.setNro(consultaInscripto.getInt(1));
            inscriptoADevolver.setNombre( consultaInscripto.getString(2));
            inscriptoADevolver.setApellido( consultaInscripto.getString(3));
            inscriptoADevolver.setCorreo( consultaInscripto.getString(4));
            inscriptoADevolver.setCantidad( consultaInscripto.getInt(5));
            inscriptoADevolver.setCategoria( consultaInscripto.getString(6));
            conexion.close();
        }
    } catch (Exception e){
        System.out.println(e);
        System.out.println("Algo anda mal");
    }

    return inscriptoADevolver;
}

}
