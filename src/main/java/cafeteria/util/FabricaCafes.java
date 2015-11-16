/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cafeteria.util;

import cafeteria.util.cafes.FabricaCafeExpresso;
import cafeteria.util.cafes.FabricaCafeSemCafeina;
import cafeteria.util.cafes.FabricaCafeCappuccino;

/**
 *
 * @author IzabelyFurtado
 */

/*
A cafeteira “Black & White” está com a seguinte promoção: 
    (i) segunda-feira, quarta-feira e sexta-feira o café normal é metade do preço; 
    (ii) terça-feira, quintafeira e sábado o café sem cafeína é metade do preço e 
    (iii) domingo o cappuccino é metade do preço. 
    Devido a promoção, o cliente apenas pode escolher os cafés da promoção. 
    Implemente o padrão de projeto que resolve esse problema. 
*/
public interface FabricaCafes {
    public FabricaCafeCappuccino criaCappuccino();
    public FabricaCafeExpresso criaCafeExpresso();
    public FabricaCafeSemCafeina criaCafeSemCafeina();
    
}
