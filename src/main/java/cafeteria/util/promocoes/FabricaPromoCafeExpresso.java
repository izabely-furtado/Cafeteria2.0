/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cafeteria.util.promocoes;

import cafeteria.util.cafes.FabricaCafeExpresso;
/**
 *
 * @author IzabelyFurtado
 *     (i) segunda-feira, quarta-feira e sexta-feira o café normal é metade do preço; 
 */
public class FabricaPromoCafeExpresso extends FabricaPromoCafe{
    protected FabricaCafeExpresso fabExpresso;
    
    private FabricaPromoCafeExpresso() {
        super();
        this.fabExpresso = this.criaCafeExpresso();
    }
    
    public synchronized static FabricaPromoCafe getInstance() {
        if(fabPromoCafe == null) {
            fabPromoCafe = new FabricaPromoCafeExpresso();
        }
        return fabPromoCafe;
    }
    
    @Override
    public String toString(){
        return "Cafe Expresso: \n" 
              + "de R$ " + this.fabExpresso.getPreco()
              + " por R$ " + (this.fabExpresso.getPreco()/2) 
              + "\n";
    }
    
}
