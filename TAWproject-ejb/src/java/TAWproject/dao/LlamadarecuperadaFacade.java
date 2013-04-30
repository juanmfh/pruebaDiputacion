/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TAWproject.dao;

import TAWproject.entity.Llamadarecuperada;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author JuanM
 */
@Stateless
public class LlamadarecuperadaFacade extends AbstractFacade<Llamadarecuperada> {
    @PersistenceContext(unitName = "TAWproject-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public LlamadarecuperadaFacade() {
        super(Llamadarecuperada.class);
    }
    
}
