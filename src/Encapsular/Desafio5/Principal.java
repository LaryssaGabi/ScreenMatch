package Encapsular.Desafio5;

public class Principal {
    public static void main(String[] args) {
        Livro livro = new Livro();

        livro.setNome("As vanatgens de ser invisivel");
        livro.setAutor("Stephen Chbosky");

        livro.exibirDetalhes();
    }
}
