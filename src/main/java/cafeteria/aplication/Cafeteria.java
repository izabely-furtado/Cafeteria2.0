/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeteria.aplication;

import cafeteria.util.*;
import cafeteria.util.Builder.*;
import cafeteria.util.promocoes.FabricaPromoCafe;
import java.util.Scanner;

/**
 *
 * @author 20121bsi0040
 */
public class Cafeteria {
    
    public static void escolha() {
        Scanner lerOpcao = new Scanner(System.in);
        //Receitas ou sair
        System.out.println("Digite a opção desejada: \n"
                + "1 - Vizualizar Receita            \n"
                + "2 - Sair                          \n"
                + "3 - Visualizar Promoção do Dia    \n");
        int opcao = lerOpcao.nextInt();
        String escolhido = escolhaOpcoes(opcao);
        while ("escolhe a Receita".equals(escolhido) || "escolhe o Dia".equals(escolhido)) {
            if ("escolhe a Receita".equals(escolhido)){
                System.out.println("Digite a receita desejada: \n"
                                    + "1 - Café Expresso       \n"
                                    + "2 - Café sem cafeína    \n"
                                    + "3 - Cappuccino          \n");
                opcao = lerOpcao.nextInt();
                Cafeteria.criando(Cafeteria.escolhaCafe(opcao));
            }
            else{
                System.out.println("Digite o dia da semana que deseja ver a promoção: \n"
                                    + "1 - Domingo \n"
                                    + "2 - Segunda \n"
                                    + "3 - Terça   \n"
                                    + "4 - Quarta  \n"
                                    + "5 - Quinta  \n"
                                    + "6 - Sexta   \n"
                                    + "7 - Sabado  \n");
                opcao = lerOpcao.nextInt();
                System.out.println(Cafeteria.escolheDiaPromo(opcao));
            }
            System.out.println("\n Digite a opção desejada: \n"
                            + "1 - Vizualizar Receita            \n"
                            + "2 - Sair                          \n"
                            + "3 - Visualizar Promoção do Dia    \n");
            opcao = lerOpcao.nextInt();
            escolhido = escolhaOpcoes(opcao);

        }
        //se escolher sair o programa para
        System.out.println(escolhido);
        
    }

    public static void criando(CafeBuilder cafeEscolhido){
        CafeteriaDirector pizzaria = new CafeteriaDirector(cafeEscolhido);
        pizzaria.construirCafe();
        CafeProduct cafe = pizzaria.getCafe();
        System.out.println(cafe);
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

    public static CafeBuilder escolhaCafe(int opcao) {
        if (opcao == 1) {
            return CafeExpressoBuilder.getInstance();
        } 
        else if (opcao == 2) {
            return CafeSemCafeinaBuilder.getInstance();
        } 
        else if (opcao == 3) {
            return CappuccinoBuilder.getInstance();
        } 
        else {
            throw new RuntimeException("Só um palpite: \n"
                    + "dando tudo errado, grite. \n"
                    + "Ulisses Tavares \n"
                    + "(Escolha coisas possíveis)");
        }
    }
    
    public static FabricaPromoCafe escolheDiaPromo(int opcao){
        if (opcao == 1) {
            return FabricaPromocoes.promoDomingo();
        } 
        else if (opcao == 2) {
            return FabricaPromocoes.promoSegunda();
        }
        else if (opcao == 3) {
            return FabricaPromocoes.promoTerça();
        }
        else if (opcao == 4) {
            return FabricaPromocoes.promoQuarta();
        }
        else if (opcao == 5) {
            return FabricaPromocoes.promoQuinta();
        }
        else if (opcao == 6) {
            return FabricaPromocoes.promoSexta();
        }
        else if (opcao == 7) {
            return FabricaPromocoes.promoSabado();
        }
        else {
            throw new RuntimeException("Só um palpite: \n" + 
                                       "dando tudo errado, grite. \n"  +
                                       "Ulisses Tavares \n" +
                                       "(Dia da Semana Incorreto)");
        }
    }

}
