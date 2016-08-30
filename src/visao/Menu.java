/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import armazenamento.MeioArmazenamento;
import java.text.ParseException;
import java.util.Scanner;

/**
 *
 * @author 5967325
 */
public class Menu {
    public static void exibirMenu(){
        System.out.println(" ======= Menu Principal ======= ");
        System.out.println(" Número de equipamentos: " + MeioArmazenamento.MEIO_ARMAZENAMENTO_EQUIPAMENTOS.size());
        
        System.out.println(" Selecione a opção: ");
        System.out.println(" 1. Cadastro equipamento ");
        System.out.println(" 2. Listagem equipamento ");
        System.out.print(" O que você deseja fazer? ");
        
        Scanner entrada = new Scanner(System.in);
        int opcao;
        do{
            try{
                opcao = Integer.parseInt(entrada.nextLine());
                System.out.println("Opção desejada: "+opcao);
                if(opcao == 1 || opcao == 2) break;
            }catch(Exception e){
                System.out.println("Não deu certo!!!"+e.getClass());
            }
        }while(true);
        if(opcao == 1) {
            EquipamentoVisao.exibirFormularioEquipamento();
        } else if (opcao == 2) {
            EquipamentoVisao.exibirListagemEquipamento();
        }
    }
}
