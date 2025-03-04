package interfaces.exemplo4.Aplication;

import interfaces.exemplo4.entities.AluguelCarro;
import interfaces.exemplo4.entities.Veiculo;
import interfaces.exemplo4.service.AluguelService;
import interfaces.exemplo4.service.ImpostoBrasilService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        System.out.println("Insira os dados do aluguel");
        System.out.println("Modelo do carro: ");
        String modeloCarro = scanner.nextLine();
        System.out.print("Entrada (dd/MM/yyyy HH:mm): ");
        Date inicio= sdf.parse(scanner.nextLine());
        System.out.print("Saida (dd/MM/yyyy HH:mm): ");
        Date fim = sdf.parse(scanner.nextLine());

        AluguelCarro carro = new AluguelCarro(inicio, fim, new Veiculo(modeloCarro));
        System.out.println("Entre com o preço por hora: ");
        double precoPorHora = scanner.nextDouble();
        System.out.println("Entre com o preco por dia: ");
        double precoPorDia = scanner.nextDouble();

        AluguelService aluguelService = new AluguelService(precoPorDia, precoPorHora, new ImpostoBrasilService());
        aluguelService.fatura(carro);
        System.out.println("Fatura:");
        System.out.printf("Pagamento basico: %.2f", carro.getFatura().getPagamentoBasico());
        System.out.printf(" imposto: %.2f", carro.getFatura().getImposto());
        System.out.printf("total pagamento: %.2f", carro.getFatura().getPagamentoTotal());
        scanner.close();
    }
}
