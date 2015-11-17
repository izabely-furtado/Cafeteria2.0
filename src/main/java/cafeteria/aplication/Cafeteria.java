/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeteria.aplication;

import cafeteria.util.cafes.*;
import cafeteria.util.cafes.decorator.*;
import java.util.Scanner;

/**
 *
 * @author 20121bsi0040
 */
public class Cafeteria {
    
    public static void escolha() {
        Scanner lerOpcao = new Scanner(System.in);
        //Receitas ou sair
        int opcao = Cafeteria.leOpcoesMenu();
        String escolhido = escolhaOpcoes(opcao);
        while ("escolhe a Receita".equals(escolhido) || "escolhe o Dia".equals(escolhido)) {
            if ("escolhe a Receita".equals(escolhido)){
                opcao = Cafeteria.leOpcoesCafe();
                FabricaCafe fc = Cafeteria.escolhaCafe(opcao);
                opcao = Cafeteria.leDesejaComplemento();
                while (opcao != 2){
                        fc = Cafeteria.escolhaEscolherComplemento(opcao, fc);
                        opcao = Cafeteria.leDesejaComplemento();
                }
                System.out.println(fc.toString());
                System.out.println("Preco R$ " + fc.getPreco());
                
            }
            opcao = Cafeteria.leOpcoesMenu();
            escolhido = escolhaOpcoes(opcao);

        }
        //se escolher sair o programa para
        System.out.println(escolhido);
        
    }

    public static int leOpcoesMenu(){
        System.out.println("\n Digite a opção desejada:       \n"
                            + "1 - Vizualizar Receita         \n"
                            + "2 - Sair                       \n"
                            + "3 - Visualizar Promoção do Dia \n");
        Scanner lerOpcao = new Scanner(System.in);
        int opcao = lerOpcao.nextInt();
        return opcao;
    }
    
    public static int leOpcoesCafe(){
        System.out.println("Digite a receita desejada: \n"
                            + "1 - Café Expresso       \n"
                            + "2 - Café sem cafeína    \n"
                            + "3 - Cappuccino          \n");
        Scanner lerOpcao = new Scanner(System.in);
        int opcao = lerOpcao.nextInt();
        return opcao;
    }
    
    public static int leOpcoesPromoSemana(){
        System.out.println("Digite o dia da semana que deseja ver a promoção: \n"
                                    + "1 - Domingo \n"
                                    + "2 - Segunda \n"
                                    + "3 - Terça   \n"
                                    + "4 - Quarta  \n"
                                    + "5 - Quinta  \n"
                                    + "6 - Sexta   \n"
                                    + "7 - Sabado  \n");
        Scanner lerOpcao = new Scanner(System.in);
        int opcao = lerOpcao.nextInt();
        return opcao;
    }
    
    public static int leDesejaComplemento(){
        System.out.println("Deseja complementar mais? \n"
                            + "1 - Sim                \n"
                            + "2 - Não                \n");
        Scanner lerOpcao = new Scanner(System.in);
        int opcao = lerOpcao.nextInt();
        return opcao;
    }
    
    public static int leOpcoesComplemento(){
        System.out.println("Digite o complemento desejado: \n"
                            + "1 - Chocolate               \n" 
                            + "2 - Creme de Laranja        \n"
                            + "3 - Licor                   \n"
                            + "4 - Chantili                \n");
        Scanner lerOpcao = new Scanner(System.in);
        int opcao = lerOpcao.nextInt();
        return opcao;
    }
    
    public static FabricaCafe escolhaEscolherComplemento(int opcao, FabricaCafe fc){
        if(opcao == 1){
            int opcaoComplemento = Cafeteria.leOpcoesComplemento();
            return Cafeteria.escolhaComplemento(opcaoComplemento, fc);
        }
        else{
            return fc;
        }
    }
    
    public static FabricaCafe escolhaComplemento(int opcaoComplemento, FabricaCafe fc){
        if(opcaoComplemento == 1){
            return new Chocolate(fc);
        }
        else if (opcaoComplemento == 2){
            return new CremeLaranja(fc);
        }
        else if (opcaoComplemento == 3){
            return new Licor(fc);
        }
        else if (opcaoComplemento == 4){
            return new Chantili(fc);
        }
        else{
            throw new RuntimeException("Só um palpite: \n"
                    + "dando tudo errado, grite. \n"
                    + "Ulisses Tavares \n"
                    + "(Escolha coisas possíveis)");
        }
    }
    
    public static String escolhaOpcoes(int opcao) {
        String retorno = "";
        Scanner lerOpcao = new Scanner(System.in);
        //se escolher ver receitas
        if (opcao == 1) {
            retorno = "escolhe a Receita";
        }
        //se escolher sair o programa para
        else if (opcao == 2){
            retorno = " :D Hasta la Vista Baby";
        }
        else if (opcao == 3){
            retorno = "escolhe o Dia";
        }
        else{
            throw new RuntimeException("Só um palpite: \n"
                    + "dando tudo errado, grite. \n"
                    + "Ulisses Tavares \n"
                    + "(Escolha coisas possíveis)");
        }
        return retorno;
    }

    public static FabricaCafe escolhaCafe(int opcao) {
        if (opcao == 1) {
            return FabricaCafeExpresso.getInstance();
        } 
        else if (opcao == 2) {
            return FabricaCafeSemCafeina.getInstance();
        } 
        else if (opcao == 3) {
            return FabricaCafeCappuccino.getInstance();
        } 
        else {
            throw new RuntimeException("Só um palpite: \n"
                    + "dando tudo errado, grite. \n"
                    + "Ulisses Tavares \n"
                    + "(Escolha coisas possíveis)");
        }
    }
}
    