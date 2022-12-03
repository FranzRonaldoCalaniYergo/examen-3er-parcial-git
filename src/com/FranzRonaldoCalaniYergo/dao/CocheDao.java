package com.FranzRonaldoCalaniYergo.dao;

import com.FranzRonaldoCalaniYergo.model.Coche;
import com.FranzRonaldoCalaniYergo.util.ConectorBD;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CocheDao {
    private Connection connection;

    {
        connection = ConectorBD.getConnection();
    }

    public CocheDao() {
    }

    public void addCoche(Coche coche) {
        try {
            PreparedStatement preparedStatement = this.connection.prepareStatement("INSERT INTO coches (matricula, marca, modelo, color, precio, nif) VALUES (?, ?, ?, ?, ?, ?)");
            preparedStatement.setString(1, coche.getMatricula());
            preparedStatement.setString(2, coche.getMarca());
            preparedStatement.setString(3, coche.getModelo());
            preparedStatement.setString(4, coche.getColor());
            preparedStatement.setDouble(5, coche.getPrecio());
            preparedStatement.setString(6, coche.getNif());
            preparedStatement.executeUpdate();
            System.out.println(coche + " creado con exito");
        } catch (SQLException e) {
            System.out.println("Error al crear el coche: " + e.getMessage());
        }

    }

    public void updateCoche(Coche coche) {
        try {
            PreparedStatement preparedStatement = this.connection.prepareStatement("UPDATE coches SET matricula=?, marca=?, modelo=?, color=?, precio=?, nif=? WHERE matricula=?");
            preparedStatement.setString(1, coche.getMatricula());
            preparedStatement.setString(2, coche.getMarca());
            preparedStatement.setString(3, coche.getModelo());
            preparedStatement.setString(4, coche.getColor());
            preparedStatement.setDouble(5, coche.getPrecio());
            preparedStatement.setString(6, coche.getNif());
            preparedStatement.setString(7, coche.getMatricula());
            preparedStatement.executeUpdate();
            System.out.println(coche + " fue editado!");
        } catch (SQLException var3) {
            System.out.println("Error al editar el coche: " + var3.getMessage());
        }

    }

    public void deleteCoche(String matricula) {
        try {
            PreparedStatement preparedStatement = this.connection.prepareStatement("DELETE FROM coches WHERE matricula=?");
            preparedStatement.setString(1, matricula);
            preparedStatement.executeUpdate();
            System.out.println(matricula + " eliminado!");
        } catch (SQLException var3) {
            System.out.println("Error al borrar el coche: " + var3.getMessage());
        }

    }

    public List<Coche> getAllCoches() {
        List<Coche> coches = new ArrayList();

        try {
            Statement statement = this.connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM coches");

            while(resultSet.next()) {
                Coche coche = new Coche();
                coche.setMatricula(resultSet.getString("matricula"));
                coche.setMarca(resultSet.getString("marca"));
                coche.setModelo(resultSet.getString("modelo"));
                coche.setColor(resultSet.getString("color"));
                coche.setPrecio((double)resultSet.getInt("precio"));
                coche.setNif(resultSet.getString("nif"));
                coches.add(coche);
            }
        } catch (SQLException var5) {
            System.out.println("Error al Listar los coches: " + var5.getMessage());
        }

        return coches;
    }
}
