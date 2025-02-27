package enums.exemplo1;

import heranca.exemplo1.Pessoa;

public class Cliente extends Pessoa implements Coisas2{
    private double cupom;
    public Cliente(int idade, String nome, double cupom) {
        super(idade, nome);
        this.cupom=cupom;
    }

    public double getCupom() {
        return cupom;
    }

    public void setCupom(double cupom) {
        this.cupom = cupom;
    }

    @Override
    public double calcularGanhos(int valor) {
        return cupom + valor;
    }

    public class Loja{
        String nome = getNome();
        int valorDesconto;
        public int desconto(int valor){
            return valorDesconto = (int) (valor - cupom);
        }
    }

    @Override
    public int calcularDesconto(int valor) {
        return super.calcularDesconto((int) (valor - getCupom()));
    }
}
