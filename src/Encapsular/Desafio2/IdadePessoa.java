package Encapsular.Desafio2;

public class IdadePessoa {
    private int idade;
    private String nome;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void verificarIdade() {
        if (idade >= 18) {
            System.out.println("A pessoa é maior de idade");
        } else {
            System.out.println("Apessoa é menor de idade");
        }
    }
}
