package database;

import java.sql.Timestamp;
import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for
 * Cargout entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see database.Cargout
 * @author MyEclipse Persistence Tools
 */

public class CargoutDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory.getLogger(CargoutDAO.class);
	// property constants
	public static final String CARGO_OUTERID = "cargoOuterid";
	public static final String CARGO_CHECKERID = "cargoCheckerid";

	public void save(Cargout transientInstance) {
		log.debug("saving Cargout instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Cargout persistentInstance) {
		log.debug("deleting Cargout instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Cargout findById(java.lang.String id) {
		log.debug("getting Cargout instance with id: " + id);
		try {
			Cargout instance = (Cargout) getSession().get("database.Cargout",
					id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Cargout instance) {
		log.debug("finding Cargout instance by example");
		try {
			List results = getSession().createCriteria("database.Cargout").add(
					Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Cargout instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Cargout as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByCargoOuterid(Object cargoOuterid) {
		return findByProperty(CARGO_OUTERID, cargoOuterid);
	}

	public List findByCargoCheckerid(Object cargoCheckerid) {
		return findByProperty(CARGO_CHECKERID, cargoCheckerid);
	}

	public List findAll() {
		log.debug("finding all Cargout instances");
		try {
			String queryString = "from Cargout";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Cargout merge(Cargout detachedInstance) {
		log.debug("merging Cargout instance");
		try {
			Cargout result = (Cargout) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Cargout instance) {
		log.debug("attaching dirty Cargout instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Cargout instance) {
		log.debug("attaching clean Cargout instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}