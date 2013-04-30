/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TAWproject.dao;

import TAWproject.entity.Perfil;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author JuanM
 */
@Stateless
public class PerfilFacade extends AbstractFacade<Perfil> {
    @PersistenceContext(unitName = "TAWproject-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PerfilFacade() {
        super(Perfil.class);
    }
    
}
