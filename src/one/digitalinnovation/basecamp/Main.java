package one.digitalinnovation.basecamp;

public class Main {
    public static void main(String[] args){

        //calculadora
        System.out.println("Exercicio calculadora");
        Calculadora.soma(5, 6);
        Calculadora.subtracao(9, 1.8);
        Calculadora.multiplicacao(7, 8);
        Calculadora.divisao(5, 2.5);

        //mensagem
        System.out.println("Exercicio mensagem");
        Mensagem.obterMensagem( 9);
        Mensagem.obterMensagem( 14);
        Mensagem.obterMensagem(1);

        //emprestimo
        System.out.println("Exercicio Empréstimo");
        Emprestimo.calcular( 1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular( 1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular( 1000, 5);
    }
}
