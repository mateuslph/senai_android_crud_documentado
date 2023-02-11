import java.sql.*;

public class Main {
//    caminho do Banco de Dados
    static final String DATABASE_URL = "jdbc:mysql://localhost:3306/senai_uc10_sa2";
    public static void main(String[] args) {
//        inicializa a conexao
        Connection connection = null;
//        inicializa o Statement que fara as transacoes
        Statement stm = null;
//        inicializa o ResultSet que exibira o resultado na tela
        ResultSet rs = null;

//        try tenta executar, se nao conseguir uma Exception sera lancada no trecho catch
        try {
//            estabelece uma conexao seguindo as credenciais de acesso do Banco de Dados
            connection = DriverManager.getConnection(DATABASE_URL, "root", "10.20-Ma.login");
//            procedimento responsavel por carregar os metodos do CRUD em um objeto anteriormente criado
            stm = connection.createStatement();
//            executa a insersao de dados
            stm.execute("insert into produtos (idProduto, descricao, preco, unidade) values (5, 'Linguíça', 28.2, 'kg');");
//            atualiza os dados ja contidos no Banco de Dados
            stm.execute("update produtos set descricao = 'Farinha' where descricao = 'Açúcar';");
//            deleta os dados que a Query SQL determina
            stm.execute("delete from produtos where descricao = 'Carne';");
//            seleciona os dados da pesquisa intencionada na Query, para posteriormente exibir
            rs = stm.executeQuery("select * from produtos");
//            percorre o ResultSet (rs) atraves do metodo 'next()' enquanto houver conteudo
            while (rs.next())
//                exibe na tela os dados selecionados pelo indice da coluna de dados, determinados com seus referidos tipos
                System.out.println(rs.getInt(1) + " " +
                        rs.getString(2) + " " +
                        rs.getFloat(3) + " " +
                        rs.getString(4));
//            fecha a conexao com o Banco de Dados
            connection.close();
//            captura do erro caso o try nao obtiver sucesso
        } catch (SQLException se) {
            se.printStackTrace();
        }
    }
}