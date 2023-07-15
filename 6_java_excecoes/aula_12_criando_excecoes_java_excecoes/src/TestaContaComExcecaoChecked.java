public class TestaContaComExcecaoChecked {
    public static void main(String[] args) /*throws MinhaExcecaoException*/{
        Conta c = new Conta();
        //para chamar algum método da Classe Conta é necessário usar o throws MinhaExcecaoException - o mesmo que esta na classe conta
        //ou usa o try-catch
        try {
            c.deposita();
        } catch (MinhaExcecaoException exception){
            System.out.println("Tratamento");
        }
    }
}
