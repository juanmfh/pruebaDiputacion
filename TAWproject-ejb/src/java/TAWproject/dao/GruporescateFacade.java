/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TAWproject.dao;

import TAWproject.entity.Gruporescate;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author JuanM
 */
@Stateless
public class GruporescateFacade extends AbstractFacade<Gruporescate> {
    @PersistenceContext(unitName = "TAWproject-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public GruporescateFacade() {
        super(Gruporescate.class);
    }
    
    /*public int numUsuarios(int id){
        int res = 0;
        em.createNamedQuery("numUsuarios").setParameter("idgrupoRescate", id +"").getFirstResult();
        CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        Root<Gruporescate> rt = cq.from(Gruporescate.class);
        cq.select(getEntityManager().getCriteriaBuilder().count(rt));
        return res;
    }*/
}
