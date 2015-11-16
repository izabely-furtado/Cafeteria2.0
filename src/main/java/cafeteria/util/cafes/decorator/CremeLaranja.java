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
public class CremeLaranja extends CafeDecorator{

    public CremeLaranja(FabricaCafe cafe) {
        super(cafe, 1.5F);
    }
    
    @Override
    public String toString(){
        return this.umCafe.toString() + "Creme de Laranja a mais por R$ " + this.getPreco() + "\n";
    }
}
