/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author 5964970
 */
public class EquipamentoVisao {
    public static void exibirFormularioEquipamento() throws ParseException{
        System.out.println("===== TELA DE CADASTRO DE EQUIPAMENTO =====");
        Scanner entrada = new Scanner(System.in);
        String nome, patrimonio;
        Date dataAquisicao, dataTerminoGarantia;
        float valor;
        System.out.println("Informe o nome:");
        nome = entrada.nextLine();
        System.out.println("Informe o número do patrimônio:");
        patrimonio = entrada.nextLine();
        SimpleDateFormat formatadorData = new SimpleDateFormat("dd/MM/yyyy");
        formatadorData.setLenient(false);
        System.out.println("Informe a data de aquisição:");
        do{
            try{
                dataAquisicao = formatadorData.parse(entrada.nextLine());
                break;
            }catch(ParseException e){
                System.out.println("Data invalida! Digite a data novamente: ");
            }
        }while(true);
        System.out.println("Informe a data termino da garantia:");
        do{
            try{
                dataTerminoGarantia = formatadorData.parse(entrada.nextLine());
                if(dataTerminoGarantia.after(dataAquisicao)) break;
                else System.out.println("Data de termino da garantia é anterior a data de aquisição.");
            }catch(ParseException e){
                System.out.println("Data invalida! Digite a data novamente: ");
            }
        }while(true);
        System.out.println("Informe o valor:");
        valor = Float.parseFloat(entrada.nextLine());
    }
}
