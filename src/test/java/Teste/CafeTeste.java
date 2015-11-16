/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Teste;

import cafeteria.aplication.Cafeteria;
import cafeteria.util.FabricaPromocoes;
import cafeteria.util.cafes.*;
import cafeteria.util.cafes.decorator.Chantili;
import cafeteria.util.cafes.decorator.Chocolate;
import cafeteria.util.cafes.decorator.CremeLaranja;
import cafeteria.util.cafes.decorator.Licor;
import cafeteria.util.promocoes.FabricaPromoCafe;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author IzabelyFurtado
 */
public class CafeTeste {
    
    public CafeTeste() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @Test
    public void escolhaCafeCappuccino(){
        int val1 = 3;
        FabricaCafe resultado = FabricaCafeCappuccino.getInstance();
        assertEquals(resultado, Cafeteria.escolhaCafe(val1));
    }
    
    @Test
    public void escolhaCafeExpresso(){
        int val1 = 1;
        FabricaCafe resultado = FabricaCafeExpresso.getInstance();
        assertEquals(resultado, Cafeteria.escolhaCafe(val1));
    }
    
    @Test
    public void escolhaCafeSemCafeina(){
        int val1 = 2;
        FabricaCafe resultado = FabricaCafeSemCafeina.getInstance();
        assertEquals(resultado, Cafeteria.escolhaCafe(val1));
    }
   

    @Test
    public void escolhaReceita(){
        int val1 = 1;
        String resultado = "escolhe a Receita";
        assertEquals(resultado, Cafeteria.escolhaOpcoes(val1));
    }
    
    @Test
    public void escolhaSair() {
        int val1 = 2;
        String resultado = " :D Hasta la Vista Baby";
        assertEquals(resultado, Cafeteria.escolhaOpcoes(val1));
    }
    
    @Test
    public void escolhaPromocao(){
        int val1 = 3;
        String resultado = "escolhe o Dia";
        assertEquals(resultado, Cafeteria.escolhaOpcoes(val1));
    }
    @Test
    public void escolhaPromoDOM() {
        int val1 = 1;
        FabricaPromoCafe resultado = FabricaPromocoes.promoDomingo();
        assertEquals(resultado, Cafeteria.escolheDiaPromo(val1));
    }
    
    @Test
    public void escolhaPromoSEG() {
        int val1 = 2;
        FabricaPromoCafe resultado = FabricaPromocoes.promoSegunda();
        assertEquals(resultado, Cafeteria.escolheDiaPromo(val1));
    }
    
    @Test
    public void escolhaPromoTER() {
        int val1 = 3;
        FabricaPromoCafe resultado = FabricaPromocoes.promoTerça();
        assertEquals(resultado, Cafeteria.escolheDiaPromo(val1));
    }
    
    @Test
    public void escolhaPromoQUA() {
        int val1 = 4;
        FabricaPromoCafe resultado = FabricaPromocoes.promoQuarta();
        assertEquals(resultado, Cafeteria.escolheDiaPromo(val1));
    }
    
    @Test
    public void escolhaPromoQUI() {
        int val1 = 5;
        FabricaPromoCafe resultado = FabricaPromocoes.promoQuinta();
        assertEquals(resultado, Cafeteria.escolheDiaPromo(val1));
    }
    
    @Test
    public void escolhaPromoSEX() {
        int val1 = 6;
        FabricaPromoCafe resultado = FabricaPromocoes.promoSexta();
        assertEquals(resultado, Cafeteria.escolheDiaPromo(val1));
    }
    
    @Test
    public void escolhaPromoSAB() {
        int val1 = 7;
        FabricaPromoCafe resultado = FabricaPromocoes.promoSabado();
        assertEquals(resultado, Cafeteria.escolheDiaPromo(val1));
    }
    
    //testando somente para cappuccino
    @Test
    public void escolhaComplemento2(){
        int val = 2;
        FabricaCafe val2 = FabricaCafeCappuccino.getInstance(); 
        assertEquals(val2, Cafeteria.escolhaComplemento(val, val2));
    }
    
    @Test
    public void escolhaChocolate(){
        int val = 2;
        FabricaCafe val2 = FabricaCafeCappuccino.getInstance(); 
        Chocolate resultado = new Chocolate(val2);
        assertEquals(resultado.getPreco(), Cafeteria.escolhaComplemento(val, val2).getPreco());
    }
    
    @Test
    public void escolhaChantili(){
        int val = 2;
        FabricaCafe val2 = FabricaCafeCappuccino.getInstance(); 
        Chantili resultado = new Chantili(val2);
        assertEquals(resultado.getPreco(), Cafeteria.escolhaComplemento(val, val2).getPreco());
    }
    
    @Test
    public void escolhaLicor(){
        int val = 2;
        FabricaCafe val2 = FabricaCafeCappuccino.getInstance(); 
        Licor resultado = new Licor(val2);
        assertEquals(resultado.getPreco(), Cafeteria.escolhaComplemento(val, val2).getPreco());
    }
    
    @Test
    public void escolhaCremeLaranja(){
        int val = 2;
        FabricaCafe val2 = FabricaCafeCappuccino.getInstance(); 
        CremeLaranja resultado = new CremeLaranja(val2);
        assertEquals(resultado.getPreco(), Cafeteria.escolhaComplemento(val, val2).getPreco());
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
