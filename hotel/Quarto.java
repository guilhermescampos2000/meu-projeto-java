/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel;
public class Quarto {
    private int numero;
    private double precoDiaria;
    boolean disponivel;

    public Quarto(int numero, double precoDiaria) {
        this.numero = numero;
        this.precoDiaria = precoDiaria;
        this.disponivel = true;
    }
    
    public int getNumero() {
        return this.numero;
    }

    public double getPrecoDiaria() {
        return this.precoDiaria;
    }

    // Correção 3: Adicionar verificação para não reservar um quarto já reservado
    public void reservar() {
        if (disponivel) {
            disponivel = false;
        } else {
            System.out.println("O quarto já está reservado.");
        }
    }

    public void liberar() {
        if (!disponivel) {
            disponivel = true;
        } else {
            System.out.println("Quarto já está disponível.");
        }
    }
}
