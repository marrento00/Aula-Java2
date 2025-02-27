package heranca.exemplo2;

public class Main {
    public static void main(String[] args) {
        Empregado empregado = new Empregado("Felipe", "Russelia", "Manaus", "Redencao", "99435283", 1222, 300, 15);
        System.out.println(empregado);
        System.out.println("Salario liquido: " + empregado.calcularImposto());
        System.out.println();

        Administrador administrador = new Administrador("Carlos", "rua C", "Sao Paulo", "Osasco", "93992029", 21, 1300, 31, 223);
        System.out.println(administrador);
        System.out.println("Salario liquido: " + administrador.calcularImposto());
        System.out.println();

        /*
        Fornecedor fornecedor = new Fornecedor("Jose", "Rua A", "Sao Paulo", "Paulista", "93992382", 1233, 123);
        System.out.println(fornecedor);
        System.out.println("Saldo " + fornecedor.obterSaldo());
        System.out.println();
         */
    }
}
