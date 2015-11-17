/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Teste;

import cafeteria.aplication.Cafeteria;
import cafeteria.util.cafes.*;
import cafeteria.util.cafes.decorator.Chantili;
import cafeteria.util.cafes.decorator.Chocolate;
import cafeteria.util.cafes.decorator.CremeLaranja;
import cafeteria.util.cafes.decorator.Licor;
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
    //testando somente para cappuccino
    @Test
    public void escolhaComplemento2(){
        int val = 2;
        FabricaCafe val2 = FabricaCafeCappuccino.getInstance(); 
        assertEquals(val2, Cafeteria.escolhaEscolherComplemento(val, val2));
    }
    
    @Test
    public void escolhaChocolate(){
        int val = 1;
        FabricaCafe val2 = FabricaCafeCappuccino.getInstance(); 
        Chocolate resultado = new Chocolate(val2);
        assertEquals(resultado.getPreco(), Cafeteria.escolhaComplemento(val, val2).getPreco(), 0.1);
    }
    
    @Test
    public void escolhaChantili(){
        int val = 4;
        FabricaCafe val2 = FabricaCafeCappuccino.getInstance(); 
        Chantili resultado = new Chantili(val2);
        assertEquals(resultado.getPreco(), Cafeteria.escolhaComplemento(val, val2).getPreco(), 0.1);
    }
    
    @Test
    public void escolhaLicor(){
        int val = 3;
        FabricaCafe val2 = FabricaCafeCappuccino.getInstance(); 
        Licor resultado = new Licor(val2);
        assertEquals(resultado.getPreco(), Cafeteria.escolhaComplemento(val, val2).getPreco(), 0.1);
    }
    
    @Test
    public void escolhaCremeLaranja(){
        int val = 2;
        FabricaCafe val2 = FabricaCafeCappuccino.getInstance(); 
        CremeLaranja resultado = new CremeLaranja(val2);
        assertEquals(resultado.getPreco(), Cafeteria.escolhaComplemento(val, val2).getPreco(), 0.1);
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
