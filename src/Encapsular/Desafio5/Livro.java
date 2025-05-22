package Encapsular.Desafio5;

public class Livro {
    private String nome;
    private String autor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void exibirDetalhes(){
        System.out.println("O nome do livro é: " + nome);
        System.out.println("O nome do autor é: " + autor);
    }
}
