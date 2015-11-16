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
public class Chocolate extends CafeDecorator{

    public Chocolate(FabricaCafe cafe) {
        super(cafe, 0.5F);
    }
    
    @Override
    public String toString(){
        return this.umCafe.toString() + "Chocolate a mais por R$ " + this.getPreco() + "\n";
    }
    
}
