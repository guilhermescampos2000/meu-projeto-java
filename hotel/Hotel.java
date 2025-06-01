/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hotel;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

    private String nome;
    private String endereco;
    private List<Quarto> quartos;

    public Hotel(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.quartos = new ArrayList<>();
    }

    public List<Quarto> listarQuartos() {
        return quartos;
    }

    // Correção 1: Remover a re-inicialização da lista de quartos
    public void adicionarQuarto(Quarto quarto) {
        quartos.add(quarto);
    }

    public void removerQuarto(Quarto quarto) {
        quartos.remove(quarto);
    }

    // Correção 2: Iniciar o loop com i = 0 e corrigir o retorno para usar o índice correto
    public Quarto buscarQuarto(int numero) {
        for (int i = 0; i < this.quartos.size(); i++) { // Começar em 0
            if (this.quartos.get(i).getNumero() == numero) {
                return this.quartos.get(i); // Usar o índice i
            }
        }
        return null;
    }
}
