/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.util.Scanner;

/**
 *
 * @author 5967325
 */
public class Menu {
    public static void exibirMenu(){
        System.out.println(" -=-=-=-= Menu Principal =-=-=-=- ");
        System.out.println(" Seleciona a opção: ");
        System.out.println(" 1. Cadastro equipamento ");
        System.out.println(" 2. Listagem equipamento ");
        System.out.print(" O que você deseja fazer ");
        
        Scanner entrada = new Scanner(System.in);
        
        try{
            int opcao = entrada.nextInt();
            System.out.println("Opção desejada: "+opcao);
        }catch(Exception e){
            System.out.println("Não deu certo!!!"+e.getClass());
        }
        
        
    }
}
