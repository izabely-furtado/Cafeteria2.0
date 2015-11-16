/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cafeteria.util.Builder;

/**
 *
 * @author IzabelyFurtado
 */
public class CafeteriaDirector {
    protected CafeBuilder montadora;
    
    public CafeteriaDirector(CafeBuilder montadora){
        this.montadora = montadora;
    }
    
    public void construirCafe(){
        this.montadora.buildPreço();
        this.montadora.buildCafe();
    }
    
    public CafeProduct getCafe(){
        return this.montadora.getCafe();
    }
    
}
