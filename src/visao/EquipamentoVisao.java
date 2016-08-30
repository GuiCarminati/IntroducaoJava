/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import controle.EquipamentoControle;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import modelo.Equipamento;

/**
 *
 * @author 5964970
 */
public class EquipamentoVisao {
    public static void exibirFormularioEquipamento() {
        System.out.println(" ===== TELA DE CADASTRO DE EQUIPAMENTO =====");
        Scanner entrada = new Scanner(System.in);
        String nome, patrimonio;
        Date dataAquisicao, dataTerminoGarantia;
        float valor;
        System.out.println(" Informe o nome:");
        nome = entrada.nextLine();
        System.out.println(" Informe o número do patrimônio:");
        patrimonio = entrada.nextLine();
        SimpleDateFormat formatadorData = new SimpleDateFormat("dd/MM/yyyy");
        formatadorData.setLenient(false);
        System.out.println(" Informe a data de aquisição:");
        do{
            try{
                dataAquisicao = formatadorData.parse(entrada.nextLine());
                break;
            }catch(ParseException e){
                System.out.println(" Data invalida! Digite a data novamente: ");
            }
        }while(true);
        System.out.println(" Informe a data termino da garantia:");
        do{
            try{
                dataTerminoGarantia = formatadorData.parse(entrada.nextLine());
                if(dataTerminoGarantia.after(dataAquisicao)) break;
                else System.out.println(" Data de termino da garantia é anterior a data de aquisição.");
            }catch(ParseException e){
                System.out.println(" Data invalida! Digite a data novamente: ");
            }
        }while(true);
        System.out.println(" Informe o valor:");
        do{
            try{
                valor = Float.parseFloat(entrada.nextLine());
                break;
            }catch (Exception e) {
                System.out.print(" Valor invalido! Digite novamente: ");                
            }
        }while(true);
        EquipamentoControle.receberDadosCadastraEquipamento(nome, patrimonio, dataAquisicao, dataTerminoGarantia, valor);
        Menu.exibirMenu();
    }
    
    public static void exibirListagemEquipamento(){
        System.out.println(" ===== TELA DE LISTAGEM DE EQUIPAMENTOS ===== ");
        System.out.println(" NOME \tNÚMERO PATRIMONIO\tNÚMERO MANUTENÇÕES");
//        ArrayList<Equipamento> lista = EquipamentoControle.obterListaEquipamentos();
//        for(int i=0; i < lista.size(); i++)
//            System.out.println(lista.get(i).getNome()+"\t"+lista.get(i).getDataAquisicao());
        for(Equipamento obj: EquipamentoControle.obterListaEquipamentos())
            System.out.println(obj.getNome()+"\t"+obj.getPatrimonio()+"\t"+obj.getListaManutencoes().size());
        
        
        System.out.println(" O que deseja fazer?");  
        System.out.println(" 0. Voltar ao menu");  
        System.out.println(" [Número do patrimonio] Cadastrar manutenção para o equipamento");  
        
        Scanner entrada = new Scanner(System.in);
        String valorDigitado = entrada.nextLine();
        
        if(entrada.equals("0"))        
            Menu.exibirMenu();
        else{
            Equipamento encontrado = EquipamentoControle.obterEquipamentoPeloNumeroDoPatrimonio(valorDigitado);
            if(encontrado == null){
                System.out.println(" ERROR: Equipamento não encontrado!");  
                Menu.exibirMenu();
            }
            else{
                
            }
            
        }
    }
}
