/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade9;

import java.util.Scanner;

/**
 *
 * @author 7
 */
public class Atividade9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Livro livro = new Livro();
        System.out.print("Digite o título do livro: ");
        livro.setTitulo(ler.nextLine());

        System.out.print("Digite o autor do livro: ");
        livro.setAutor(ler.nextLine());

        System.out.print("Digite o número total de páginas do livro: ");
        livro.setTotalPaginas(ler.nextInt());

        // Inicializando as páginas lidas como 0
        livro.setPaginasLidas(0);

        // Atualizando o progresso
        System.out.print("Digite o número de páginas lidas: ");
        int paginasLidas = ler.nextInt();
        livro.atualizarProgresso(paginasLidas);

       
        System.out.println("\nProgresso da Leitura:");
        System.out.println("Título: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Páginas lidas: " + livro.getPaginasLidas() + "/" + livro.getTotalPaginas());
        System.out.println("Progresso: " + livro.exibirProgresso() + "%");

        
        if (livro.isLeituraCompleta()) {
            System.out.println("Leitura concluída!");
        } else {
            System.out.println("Leitura ainda não concluída.");
        }
    }
    
}
