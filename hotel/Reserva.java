/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel;

public class Reserva {

    private Quarto quarto;
    private String nomeCliente;
    private int dias;

    public Reserva(Quarto quarto, String nomeCliente, int dias) {
        this.quarto = quarto;
        this.nomeCliente = nomeCliente;
        this.dias = dias;
    }

    // Correção 4: Aplicar desconto de 10% para reservas de 10 dias ou mais
    public double calcularValor() {
        double valorTotal = quarto.getPrecoDiaria() * dias;
        if (dias >= 10) {
            valorTotal *= 0.9; // Aplicar 10% de desconto
        }
        return valorTotal;
    }

    public void confirmarReserva() {
        quarto.reservar();
    }
}

