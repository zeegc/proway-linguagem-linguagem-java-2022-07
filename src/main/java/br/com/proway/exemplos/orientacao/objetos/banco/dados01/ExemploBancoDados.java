package br.com.proway.exemplos.orientacao.objetos.banco.dados01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ExemploBancoDados {

    public static void main(String[] args) {
        try {
            Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/lojaBd", "root", "admin");

            System.out.println("Conexao aberta com sucesso");

//            Statement executor = conexao.createStatement();
//            executor.execute("INSERT INTO carros (modelo, marca, preco) " + 
//                    "VALUES ('Kombi', 'VW', 52000)");
//            System.out.println("Registro criado com sucesso");
//            CRUD CREATE, READ, UPADTE, DELETE
//              Statement executor = conexao.createStatement();
//              executor.execute("DELETE FROM carros WHERE id = 1");
//              
//              System.out.println("Registro apagado com sucesso");
//            
              Statement executor = conexao.createStatement();
              executor.execute("select id, modelo, marca, preco from carros");
              ResultSet registros = executor.getResultSet();
              
              while(registros.next()){
                  int id = Integer.parseInt(registros.getString("id"));
                  String modelo = registros.getString("modelo");
                  String marca = registros.getString("marca");
                  double preco = Double.parseDouble(registros.getString("preco"));
                  System.out.println(
                  "codigo: " + id +
                          " - modelo: " + modelo + 
                          " - marca: " + marca + 
                          " - preco: " + preco);
              }

        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Nao foi possivel conectar");
        }
    }
}
