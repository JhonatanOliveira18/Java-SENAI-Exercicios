package br.senai.logica;

import java.util.Scanner;

public class Exercicio25SwitchCidades {

    /*
     Analise o código gerado no Visualg, entenda a sua lógica e desenvolva um
    algoritmo utilizando a linguagem Java.

    var cidade: caractere
    escreval (&quot;Digite um nome de cidade&quot;)
    leia (cidade)
    escolha cidade
    caso &quot;Jundiai&quot;, &quot;Santos&quot;, &quot;Mauá&quot;, &quot;Diadema&quot;
    escreval (&quot;É uma cidade de São Paulo&quot;)
    caso &quot;Monte Verde&quot;,&quot;Camanducaia&quot;,&quot;Pouso Alegre&quot;
    escreval (&quot;É uma cidade de Minas Gerais&quot;)
    outrocaso
    escreval (&quot;É uma cidade não listada no programa&quot;)
    fimescolha
     */
    
    public static void main(String[] args) {
        // Instanciando a classe Scanner
        Scanner e = new Scanner(System.in);
        
        //Solicitando dados
        System.out.print("Digite um nome de cidade: ");
        //Convertendo todos os caracteres de uma string para letras maiúsculas e removendo todos os espaços em branco do início e do fim, respectivamente
        String cidade = e.nextLine().toUpperCase().trim(); 
        e.close();
        
        //Estrutura Switch
        switch (cidade){
            case "JUNDIAI", "SANTOS", "MAUA", "DIADEMA" -> {
                System.out.println("É uma cidade de São Paulo");
            }
            case "MONTE VERDE", "CAMANDUCAIA", "POUSO ALEGRE" -> {
                System.out.println("É uma cidade de Minas Gerais");
            }
            default -> {
               System.out.println("Cidade não listada");
            }
            
        }
    
    }
}