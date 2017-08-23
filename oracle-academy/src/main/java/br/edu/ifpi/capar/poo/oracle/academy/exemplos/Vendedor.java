/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oracle.exercicio.pkgdo.denilson;
import java.math.BigDecimal;

public class Vendedor {
    
    //propriedades
    String nome;
    short idade;
    String cpf;
    String rg;
    String carteiraTrabalho;
    String loja;
    BigDecimal salario;
    
    //comportamentos
    vender();
    dormir();
    oferecerCartao();
    oferecerCpfNota();
    oferecerDesconto();
    dizerQueNaoTemDesconto();
    oferecerGarantiaEstendida();
    falarMalTrabalho();
    receberSalario();
    gastarSalario();
    trazerMercadorias();
}