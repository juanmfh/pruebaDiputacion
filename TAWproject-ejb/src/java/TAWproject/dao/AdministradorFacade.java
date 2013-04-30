/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TAWproject.dao;

import TAWproject.entity.Administrador;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author JuanM
 */
@Stateless
public class AdministradorFacade extends AbstractFacade<Administrador> {
    @PersistenceContext(unitName = "TAWproject-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AdministradorFacade() {
        super(Administrador.class);
    }
    
}
