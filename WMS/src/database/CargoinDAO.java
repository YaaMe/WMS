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
 * Cargoin entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see database.Cargoin
 * @author MyEclipse Persistence Tools
 */

public class CargoinDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory.getLogger(CargoinDAO.class);
	// property constants
	public static final String CARGO_TRACKINGNO = "cargoTrackingno";
	public static final String CARGO_INERID = "cargoInerid";
	public static final String CARGO_CHECKERID = "cargoCheckerid";

	public void save(Cargoin transientInstance) {
		log.debug("saving Cargoin instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Cargoin persistentInstance) {
		log.debug("deleting Cargoin instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Cargoin findById(java.lang.String id) {
		log.debug("getting Cargoin instance with id: " + id);
		try {
			Cargoin instance = (Cargoin) getSession().get("database.Cargoin",
					id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Cargoin instance) {
		log.debug("finding Cargoin instance by example");
		try {
			List results = getSession().createCriteria("database.Cargoin").add(
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
		log.debug("finding Cargoin instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Cargoin as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByCargoTrackingno(Object cargoTrackingno) {
		return findByProperty(CARGO_TRACKINGNO, cargoTrackingno);
	}

	public List findByCargoInerid(Object cargoInerid) {
		return findByProperty(CARGO_INERID, cargoInerid);
	}

	public List findByCargoCheckerid(Object cargoCheckerid) {
		return findByProperty(CARGO_CHECKERID, cargoCheckerid);
	}

	public List findAll() {
		log.debug("finding all Cargoin instances");
		try {
			String queryString = "from Cargoin";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Cargoin merge(Cargoin detachedInstance) {
		log.debug("merging Cargoin instance");
		try {
			Cargoin result = (Cargoin) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Cargoin instance) {
		log.debug("attaching dirty Cargoin instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Cargoin instance) {
		log.debug("attaching clean Cargoin instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}