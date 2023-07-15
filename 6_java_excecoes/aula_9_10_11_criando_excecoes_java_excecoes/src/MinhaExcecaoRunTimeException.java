//extendendo a classe RuntimeException é possível fazer um lançamento usando apenas o throw
public class MinhaExcecaoRunTimeException extends RuntimeException{

    //criando exceção
    public MinhaExcecaoRunTimeException(String frase){
        //chamando método da classe mãe - RuntimeException - e passando a frase para ele
        super(frase);
    }

}
