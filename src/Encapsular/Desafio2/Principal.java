package Encapsular.Desafio2;

public class Principal {
    public static void main(String[] args) {
        IdadePessoa verificador = new IdadePessoa();

        verificador.setIdade(11);
        verificador.setNome("Laryssa");

        System.out.println("O nome é: " + verificador.getNome());
        System.out.println("A idade é: " + verificador.getIdade());
        verificador.verificarIdade();
    }
}
