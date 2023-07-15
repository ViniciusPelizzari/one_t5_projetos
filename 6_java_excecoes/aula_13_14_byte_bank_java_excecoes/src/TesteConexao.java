public class TesteConexao {

    public static void main(String[] args) {
        ConexaoConst cnx1 = null;
        try {
            cnx1 = new ConexaoConst();
            cnx1.LerDados();
            cnx1.Fecha(); //ESTE MÉTODO NÃO FOI LIDO, POIS FOI LANÇADO UMA EXCEÇÃO ANTES DELE
        } catch (IllegalStateException exception){
            System.out.println("ERRO: " + exception.getMessage());
            cnx1.Fecha(); //FOI REPETIDO O MÉTODO PARA FECHAMENTO
        }

        System.out.println();

        //mesma coisa que o exemplo acima, mas usando o FINALLY
        ConexaoConst cnx2 = null;
        try {
            cnx2 = new ConexaoConst();
            cnx2.LerDados();
        } catch (IllegalStateException exception){
            System.out.println("ERRO: " + exception.getMessage());
        } finally { //executa, mesmo que houver erro
            cnx2.Fecha();
        }

        System.out.println();

        Conexao cnx3 = null;
        try {
            cnx3 = new Conexao();
            cnx3.LerDados();
        } catch (IllegalStateException exception){
            System.out.println("ERRO: " + exception.getMessage());
        } finally { //executa, mesmo que houver erro
            System.out.println("Finally");
            if(cnx3 != null){
                cnx3.Fecha();
            }
        }

        System.out.println();

        //abreviando código
        try(Conexao conexao = new Conexao()){ //usando a classe AUTOCLOSEABLE - e automaticamente o método CLOSE
            conexao.LerDados(); //já está sendo fechada a conexão automaticamente
        } catch (IllegalStateException exception){
            System.out.println("ERRO: " + exception.getMessage());
        }
    }
}
