/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeteria.util.promocoes;

import cafeteria.util.FabricaCafes;
import cafeteria.util.cafes.*;

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
public abstract class FabricaPromoCafe implements FabricaCafes {
    
    protected static FabricaPromoCafe fabPromoCafe;
    protected int codExpresso;
    protected int codSemCafeina;
    protected int codCappuccino;
    
    public synchronized int getCodExpresso() {
        codExpresso = codExpresso+1;
        return codExpresso;
    }
    
    public synchronized int getCodSemCafeina() {
        codSemCafeina = codSemCafeina+1;
        return codSemCafeina;
    }
    
    public synchronized int getCodCappuccino() {
        codCappuccino = codCappuccino+1;
        return codCappuccino;
    }
    
    @Override
    public FabricaCafeCappuccino criaCappuccino() {
        return (FabricaCafeCappuccino) FabricaCafeCappuccino.getInstance();
    }

    @Override
    public FabricaCafeExpresso criaCafeExpresso() {
        return (FabricaCafeExpresso) FabricaCafeExpresso.getInstance();
    }

    @Override
    public FabricaCafeSemCafeina criaCafeSemCafeina() {
        return (FabricaCafeSemCafeina) FabricaCafeSemCafeina.getInstance();
    }
    

}