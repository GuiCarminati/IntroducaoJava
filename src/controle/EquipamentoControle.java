/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.util.Date;
import modelo.Equipamento;

/**
 *
 * @author 5964970
 */
public class EquipamentoControle {
    public static void receberDadosCadastraEquipamento(String nome, String patrimonio, Date dataAquisicao, Date dataTerminoGarantia, float valor){
       Equipamento objetoEquipamento = new Equipamento();
       objetoEquipamento.setNome(nome);
       objetoEquipamento.setPatrimonio(patrimonio);
       objetoEquipamento.setDataAquisicao(dataAquisicao);
       objetoEquipamento.setDataTerminoGarantia(dataTerminoGarantia);
       objetoEquipamento.setValor(valor);
       objetoEquipamento.salvar();
    }
}
