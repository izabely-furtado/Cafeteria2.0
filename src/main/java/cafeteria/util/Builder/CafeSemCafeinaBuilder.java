/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cafeteria.util.Builder;

import cafeteria.util.cafes.FabricaCafeSemCafeina;

/**
 *
 * @author IzabelyFurtado
 */
public class CafeSemCafeinaBuilder extends CafeBuilder {

    private CafeSemCafeinaBuilder() {
        super();
        this.buildPreço();
        this.buildCafe();
    }
    
    public synchronized static CafeBuilder getInstance() {
        if(cafeBuilder == null) {
            cafeBuilder = new CafeSemCafeinaBuilder();
        }
        return cafeBuilder;
    }
    
    @Override
    public final void buildCafe() {
        this.cafe.cafe = FabricaCafeSemCafeina.getInstance();
    }

    @Override
    public final void buildPreço() {
        this.cafe.preco = 3F;
    }
    
}
