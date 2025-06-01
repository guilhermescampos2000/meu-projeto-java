/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel;

/**
 *
 * @author guilherme002
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Reserva> reservas = new ArrayList<>();

        // Criar o Hotel
        Hotel hotel = new Hotel("Hotel Exemplo", "Endereço Exemplo");

        // Adicionar quartos ao hotel
        hotel.adicionarQuarto(new Quarto(101, 200.0));
        hotel.adicionarQuarto(new Quarto(102, 250.0));
        hotel.adicionarQuarto(new Quarto(103, 300.0));

        boolean continuar = true;

        while (continuar) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Listar quartos disponíveis");
            System.out.println("2. Fazer uma reserva");
            System.out.println("3. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    System.out.println("Quartos disponíveis:");
                    for (Quarto quarto : hotel.listarQuartos()) {
                        if (quarto.disponivel) {
                            System.out.println("Quarto número: " + quarto.getNumero() + ", Preço: " + quarto.getPrecoDiaria());
                        }
                    }
                    break;

                case 2:
                    System.out.println("Digite o número do quarto que deseja reservar:");
                    int numeroQuarto = scanner.nextInt();
                    Quarto quarto = hotel.buscarQuarto(numeroQuarto);

                    if (quarto != null && quarto.disponivel) {
                        System.out.println("Digite o seu nome:");
                        scanner.nextLine(); // Limpar o buffer do scanner
                        String nomeCliente = scanner.nextLine();

                        System.out.println("Digite a quantidade de dias da reserva:");
                        int dias = scanner.nextInt();

                        Reserva reserva = new Reserva(quarto, nomeCliente, dias);
                        reserva.confirmarReserva();
                        reservas.add(reserva);

                        System.out.println("Reserva confirmada! Valor total: " + reserva.calcularValor());
                    } else {
                        System.out.println("Quarto indisponível ou não encontrado.");
                    }
                    break;

                case 3:
                    continuar = false;
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        }

        scanner.close();
    }
}

