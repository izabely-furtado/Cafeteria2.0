/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeteria.cdp;

/**
 *
 * @author 20121bsi0040
 */
public class Acucar extends Ingrediente{

    public Acucar(float quantidade) {
        super(quantidade);
    }
    
    @Override
    public String toString(){
        return "Açucar: " + this.getQuantidade() + "\n";
    }
    
    
}
