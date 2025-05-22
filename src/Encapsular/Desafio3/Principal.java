package Encapsular.Desafio3;

public class Principal {
    public static void main(String[] args) {
        Produto produto = new Produto();

        produto.setNome("Banana");
        produto.setPreco(12);

        System.out.println("O produto é: " + produto.getNome());
        System.out.println("0 valor do produto sem o desconto é de: " + produto.getPreco());

        produto.aplicarDesconto(10);

        System.out.println("Desconto aplicado em 10% no valor do produto, ficará: " + produto.getPreco());

    }
}
