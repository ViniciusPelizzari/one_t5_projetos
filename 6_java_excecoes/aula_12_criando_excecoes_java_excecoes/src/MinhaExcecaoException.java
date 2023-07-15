//extendendo a classe Exception é preciso fazer o throw + nome da classe que extende apenas o Exception em toda assinatura do método que estiver relacionado ao lançamento do throw
public class MinhaExcecaoException extends Exception{

    //criando exceção
    public MinhaExcecaoException(String frase){
        //chamando método da classe mãe - RuntimeException - e passando a frase para ele
        super(frase);
    }

}
