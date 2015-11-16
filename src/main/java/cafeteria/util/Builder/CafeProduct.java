/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeteria.util.Builder;

import cafeteria.util.cafes.FabricaCafe;
/**
 *
 * @author IzabelyFurtado
 */
public class CafeProduct {

    Float preco;
    FabricaCafe cafe;

    public Float getPreco() {
        return this.preco;
    }

    public FabricaCafe getCafe() {
        return this.cafe;
    }

    @Override
    public String toString() {
        return "Preço: R$" + this.preco.toString() + "\n"
             + this.cafe.toString()                + "\n";
    }
}
