/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeteria.util.cafes;

import cafeteria.cdp.*;

/**
 *
 * @author 20121bsi0040
 */

/*O cappuccino é composto por: 
    100g de café solúvel, 
    200g de açúcar, 
    100g lata de leite em pó, 
    1 colher de chá de bicarbonato, 
    50g de chocolate em pó e 
    1 colher (sobremesa) de canela*/
public class FabricaCafeCappuccino extends FabricaCafe{
    private final Acucar acucar;
    private final Bicarbonato bicarbonato;
    private final CafeSoluvel cafeSoluvel;
    private final Canela canela;
    private final Chocolate chocolate;
    private final LeitePo leitePo;

    
    private FabricaCafeCappuccino() {
        super(5);      
        this.acucar = this.criarAcucar();
        this.bicarbonato = this.criarBicarbonato();
        this.cafeSoluvel = this.criarCafeSoluvel();
        this.canela = this.criarCanela();
        this.chocolate = this.criarChocolate();
        this.leitePo = this.criarLeitePo();
    }

    public synchronized static FabricaCafe getInstance() {
        if(fabCafe == null) {
            fabCafe = new FabricaCafeCappuccino();
        }
        return fabCafe;
    }
    
    @Override
    public final Acucar criarAcucar() {
        return new Acucar(200);
    }

    @Override
    public final Bicarbonato criarBicarbonato() {
        return new Bicarbonato(2);
    }

    @Override
    public final CafeSoluvel criarCafeSoluvel() {
        return new CafeSoluvel(100);
    }

    @Override
    public final Canela criarCanela() {
        return new Canela(5);
    }

    @Override
    public final Chocolate criarChocolate() {
        return new Chocolate(50);
    }

    @Override
    public final LeitePo criarLeitePo() {
        return new LeitePo(100);
    }

    @Override
    public String toString(){
        return super.toString() + "Cappuccino: \n" +
               this.criarAcucar().toString() +
               this.criarBicarbonato().toString() + 
               this.criarCafeSoluvel().toString() + 
               this.criarCanela().toString() + 
               this.criarChocolate().toString() +
               this.criarLeitePo().toString();
    }
}
