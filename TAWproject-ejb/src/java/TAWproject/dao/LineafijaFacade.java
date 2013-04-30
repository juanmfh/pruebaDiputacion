/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TAWproject.dao;

import TAWproject.entity.Lineafija;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author JuanM
 */
@Stateless
public class LineafijaFacade extends AbstractFacade<Lineafija> {
    @PersistenceContext(unitName = "TAWproject-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public LineafijaFacade() {
        super(Lineafija.class);
    }
    
}
