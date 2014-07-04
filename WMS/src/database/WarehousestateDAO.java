package database;

import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for
 * Warehousestate entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see database.Warehousestate
 * @author MyEclipse Persistence Tools
 */

public class WarehousestateDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(WarehousestateDAO.class);
	// property constants
	public static final String CARGO_ID = "cargoId";

	public void save(Warehousestate transientInstance) {
		log.debug("saving Warehousestate instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Warehousestate persistentInstance) {
		log.debug("deleting Warehousestate instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Warehousestate findById(database.WarehousestateId id) {
		log.debug("getting Warehousestate instance with id: " + id);
		try {
			Warehousestate instance = (Warehousestate) getSession().get(
					"database.Warehousestate", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Warehousestate instance) {
		log.debug("finding Warehousestate instance by example");
		try {
			List results = getSession().createCriteria(
					"database.Warehousestate").add(Example.create(instance))
					.list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Warehousestate instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from Warehousestate as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByCargoId(Object cargoId) {
		return findByProperty(CARGO_ID, cargoId);
	}

	public List findAll() {
		log.debug("finding all Warehousestate instances");
		try {
			String queryString = "from Warehousestate";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Warehousestate merge(Warehousestate detachedInstance) {
		log.debug("merging Warehousestate instance");
		try {
			Warehousestate result = (Warehousestate) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Warehousestate instance) {
		log.debug("attaching dirty Warehousestate instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Warehousestate instance) {
		log.debug("attaching clean Warehousestate instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}