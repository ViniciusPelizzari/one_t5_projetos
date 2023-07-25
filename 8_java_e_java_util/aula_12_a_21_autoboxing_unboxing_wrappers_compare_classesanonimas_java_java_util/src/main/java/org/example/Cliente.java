package org.example;

public class Cliente {
    private static String nome;
    private static String cpf;
    private static String profissao;

    public static String getNome() {
        return nome;
    }

    public static void setNome(String nome) {
        Cliente.nome = nome;
    }

    public static String getCpf() {
        return cpf;
    }

    public static void setCpf(String cpf) {
        Cliente.cpf = cpf;
    }

    public static String getProfissao() {
        return profissao;
    }

    public static void setProfissao(String profissao) {
        Cliente.profissao = profissao;
    }
}
