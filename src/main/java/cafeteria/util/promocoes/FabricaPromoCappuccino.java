/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cafeteria.util.promocoes;

import cafeteria.util.cafes.FabricaCafeCappuccino;
/**
 *
 * @author IzabelyFurtado
 * (iii) domingo o cappuccino é metade do preço.
 */
public class FabricaPromoCappuccino extends FabricaPromoCafe{
    protected FabricaCafeCappuccino fabCappuccino;
    private FabricaPromoCappuccino() {
        super();
        this.fabCappuccino = this.criaCappuccino();
        
    }
    
    public synchronized static FabricaPromoCafe getInstance() {
        if(fabPromoCafe == null) {
            fabPromoCafe = new FabricaPromoCappuccino();
        }
        return fabPromoCafe;
    }
    
    
    @Override
    public String toString(){
        return "Cappuccino: \n" 
              + "de R$ " + this.fabCappuccino.getPreco()
              + " por R$ " + this.fabCappuccino.getPreco()/2
              + "\n";
    }
    
}
