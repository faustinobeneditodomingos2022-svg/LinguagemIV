package dao;

import util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class PacienteDAO {

    public void salvar(String nome,
                       String telefone,
                       String endereco) {

        try {

            Connection con = Conexao.conectar();

            String sql =
                    "INSERT INTO paciente(nome,telefone,endereco)"
                            + "VALUES(?,?,?)";

            PreparedStatement pst =
                    con.prepareStatement(sql);

            pst.setString(1, nome);
            pst.setString(2, telefone);
            pst.setString(3, endereco);

            pst.executeUpdate();

            System.out.println("Salvo com sucesso!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
