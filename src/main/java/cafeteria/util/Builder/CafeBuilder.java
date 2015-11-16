/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cafeteria.util.Builder;

import cafeteria.util.Builder.CafeProduct;

/**
 *
 * @author IzabelyFurtado
 */
public abstract class CafeBuilder {
    protected CafeProduct cafe;
    protected static CafeBuilder cafeBuilder;
    protected int codCappucino;
    protected int codCafeExpresso;
    protected int codCafeSemCafeina;
    
    protected CafeBuilder(){
        cafe = new CafeProduct();
    }
    
    public synchronized int getCodCappuccino() {
        codCappucino = codCappucino+1;
        return codCappucino;
    }
    
    public synchronized int getCodCafeExpresso() {
        codCafeExpresso = codCafeExpresso+1;
        return codCafeExpresso;
    }
    
    public synchronized int getCodCafeSemCafeina() {
        codCafeSemCafeina = codCafeSemCafeina+1;
        return codCafeSemCafeina;
    }
    
    public abstract void buildPreço();
    
    public abstract void buildCafe();
    
    public CafeProduct getCafe(){
        return this.cafe;
    }
    
}
