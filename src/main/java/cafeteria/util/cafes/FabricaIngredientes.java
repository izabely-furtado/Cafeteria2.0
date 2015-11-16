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
public interface FabricaIngredientes {
    
    public Acucar criarAcucar();
    public Bicarbonato criarBicarbonato();
    public CafeSoluvel criarCafeSoluvel();
    public Canela criarCanela();
    public Chocolate criarChocolate();
    public LeitePo criarLeitePo();
    public LeiteLiq criarLeiteLiq();
    public CafeSemCafeina criarCafeSemCafeina();
    public Agua criarAgua();
    
    
}
