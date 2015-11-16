/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cafeteria.util.Builder;

import cafeteria.util.cafes.FabricaCafeExpresso;

/**
 *
 * @author IzabelyFurtado
 */
public class CafeExpressoBuilder extends CafeBuilder {

    private CafeExpressoBuilder() {
        super();
        this.buildPreço();
        this.buildCafe();
    }
    
    public synchronized static CafeBuilder getInstance() {
        if(cafeBuilder == null) {
            cafeBuilder = new CafeExpressoBuilder();
        }
        return cafeBuilder;
    }

    @Override
    public final void buildPreço() {
        this.cafe.preco = 2F;
    }

    @Override
    public final void buildCafe() {
        this.cafe.cafe = FabricaCafeExpresso.getInstance();
    }

}
