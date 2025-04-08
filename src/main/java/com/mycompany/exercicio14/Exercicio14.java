

package com.mycompany.exercicio14;

import javax.swing.JOptionPane;
public class Exercicio14 {

    public static void main(String[] args) {
        String inputNascimento = JOptionPane.showInputDialog("Digite o ano de nascimento");
        int anoNascimento = Integer.parseInt(inputNascimento);
        
        String inputAtual = JOptionPane.showInputDialog("Digite o ano atual");
        int anoAtual = Integer.parseInt(inputAtual);
        
        if (anoNascimento < anoAtual) {
            int idade = anoAtual - anoNascimento;
            JOptionPane.showMessageDialog(null,
                    "sua idade é: " + idade + "anos.",
                    "Resultado",
                    JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null,
                    "Ano de nascimento invalido! Deve ser menor que o ano atual.",
                    "erro",
                    JOptionPane.ERROR_MESSAGE);
            
        }
    }
}
