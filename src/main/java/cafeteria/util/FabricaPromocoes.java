/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cafeteria.util;

import cafeteria.util.promocoes.*;

/**
 *
 * @author IzabelyFurtado
 */

/*
A cafeteira “Black & White” está com a seguinte promoção: 
    (i) segunda-feira, quarta-feira e sexta-feira o café normal é metade do preço; 
    (ii) terça-feira, quintafeira e sábado o café sem cafeína é metade do preço e 
    (iii) domingo o cappuccino é metade do preço. 
*/
public class FabricaPromocoes {
    
    public static FabricaPromoCafe promoSegunda(){
        return FabricaPromoCafeExpresso.getInstance();
    }
    
    public static FabricaPromoCafe promoTerça(){
        return FabricaPromoCafeSemCafeina.getInstance();
    }
    
    public static FabricaPromoCafe promoQuarta(){
        return FabricaPromoCafeExpresso.getInstance();
    }
    
    public static FabricaPromoCafe promoQuinta(){
        return FabricaPromoCafeSemCafeina.getInstance();
    }
    
    public static FabricaPromoCafe promoSexta(){
        return FabricaPromoCafeExpresso.getInstance();
    }
    
    public static FabricaPromoCafe promoSabado(){
        return FabricaPromoCafeSemCafeina.getInstance();
    }
    
    public static FabricaPromoCafe promoDomingo(){
        return FabricaPromoCappuccino.getInstance();
    }
}
