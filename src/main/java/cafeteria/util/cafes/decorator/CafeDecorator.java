/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeteria.util.cafes.decorator;

import cafeteria.util.cafes.FabricaCafe;

/**
 *
 * @author 20121bsi0040
 */
public abstract class CafeDecorator extends FabricaCafe{
    FabricaCafe umCafe;
    
    public CafeDecorator(FabricaCafe cafe, float preco) {
        super(preco);
        this.umCafe = cafe;
        this.setPreco(preco + this.umCafe.getPreco());
        
    }
    
    
}
