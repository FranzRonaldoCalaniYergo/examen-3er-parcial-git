package com.FranzRonaldoCalaniYergo;

import com.FranzRonaldoCalaniYergo.dao.ClienteDao;
import com.FranzRonaldoCalaniYergo.dao.CocheDao;
import com.FranzRonaldoCalaniYergo.dao.RevisionDao;
import com.FranzRonaldoCalaniYergo.model.Cliente;
import com.FranzRonaldoCalaniYergo.model.Coche;
import com.FranzRonaldoCalaniYergo.model.Revision;
import com.FranzRonaldoCalaniYergo.util.ConectorBD;

import java.sql.Connection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Cliente cliente = new Cliente("1725", "Roberto Bolaños", "Cochabamba", "23 de marzo", 4635783 );
        //Cliente Vinicius = new Cliente("1727", "Vinicius Junior", "Oruro", "Av. Heroinas s/n", 4827483 );
        //Cliente Diego = new Cliente("1726", "Diego Armando", "La Paz", "Av. Ayacucho s/n", 4967354 );
        Cliente Messi = new Cliente("1725-L", "Lionel Messi", "Santa Cruz", "Av. Circunvalacion s/n", 4987036 );
        Cliente Ronaldo = new Cliente("17277", "Cristiano Ronaldo", "Cochabamba", "Av. America s/n", 4673560 );

       // Coche Mercedes = new Coche("645BFX", "Mercedes", "2018", "Plateado", 540.679, "17277");
       // Coche Toyota = new Coche("843FRE", "Toyota", "2010", "Negro", 165728, "1727");
        Coche Mclaren = new Coche("735KIL", "Mclaren", "2022", "Naranja", 1600000, "1726");
        Coche Ferrari = new Coche("321FAS", "Ferrari", "2000", "Plateado", 980000, "1725-L");

      //  Revision toyota = new Revision("2448", "funcionando", "buen estado", "nuevos", "843FRE");
       // Revision ferrari = new Revision("4567", "mal estado", "bajo", "gastados", "toyota");
      //  Revision mercedes = new Revision("7689", "regular", "regular", "seminuevos", "645BFX");

        //CRUD tabla clientes - coches - revisiones.
      //  ClienteDao clienteDao = new ClienteDao();
      //  CocheDao cocheDao = new CocheDao();
      //  RevisionDao revisionDao = new RevisionDao();

        //CREATE
        //clienteDao.addCliente(cliente);
        //clienteDao.addCliente(Vinicius);
        //clienteDao.addCliente(Diego);
       // clienteDao.addCliente(Messi);
        //clienteDao.addCliente(Ronaldo);

       // cocheDao.addCoche(Mercedes);
       // cocheDao.addCoche(Toyota);
       // cocheDao.addCoche(Mclaren);
       // cocheDao.addCoche(Ferrari);

      //  revisionDao.addRevision(toyota);
      //  revisionDao.addRevision(ferrari);
      //  revisionDao.addRevision(mercedes);


        //READ
        /*
        List<Cliente> clientes = clienteDao.getALLClientes();
        for (int i = 0; i < clientes.size(); i++) {
            Cliente cliente = clientes.get(i);

            System.out.println(cliente);

           }
       /* List<Coche> coches = cocheDao.getAllCoches();
        for (int i = 0; i < coches.size(); i++) {
            Coche coche = coches.get(i);

            System.out.println(coche);
        }
*/   /*
        List<Revision> revisiones = revisionDao.getAllRevisiones();
        for (int i = 0; i < revisiones.size(); i++) {
            Revision revision = revisiones.get(i);

            System.out.println(revision);
        }   */
        //UPDATE
        //Cliente cliente = new Cliente("1725", "Luka Modric", "Beni", "Av. Libertadores s/n", 4887766 );
        //clienteDao.updateCliente(cliente);

       // Coche coche = new Coche("645BFX", "Mercedes", "2018", "plateado", 540670, "17277");
       // Coche coche = new Coche("321FAS", "Ferrari", "2015", "rojo", 999000, "1725-L");
       // cocheDao.updateCoche(coche);

        //DELETE
        // clienteDao.deleteCliente("1725");
        // clienteDao.deleteCliente("1725-L");
        // clienteDao.deleteCliente("1726");

      //  cocheDao.deleteCoche("735KIL");
        //  cocheDao.deleteCoche("843FRE");
    }
}
