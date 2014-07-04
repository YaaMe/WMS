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
 * Cargomoving entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see database.Cargomoving
 * @author MyEclipse Persistence Tools
 */

public class CargomovingDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(CargomovingDAO.class);
	// property constants
	public static final String CARGO_ID = "cargoId";
	public static final String CARGO_MOVERID = "cargoMoverid";
	public static final String CARGO_OLDAREA = "cargoOldarea";
	public static final String CARGO_OLDROW = "cargoOldrow";
	public static final String CARGO_OLDSHELF = "cargoOldshelf";
	public static final String CARGO_OLDSEAT = "cargoOldseat";
	public static final String CARGO_NEWAREA = "cargoNewarea";
	public static final String CARGO_NEWROW = "cargoNewrow";
	public static final String CARGO_NEWSHELF = "cargoNewshelf";
	public static final String CARGO_NEWSEAT = "cargoNewseat";

	public void save(Cargomoving transientInstance) {
		log.debug("saving Cargomoving instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Cargomoving persistentInstance) {
		log.debug("deleting Cargomoving instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Cargomoving findById(java.lang.Integer id) {
		log.debug("getting Cargomoving instance with id: " + id);
		try {
			Cargomoving instance = (Cargomoving) getSession().get(
					"database.Cargomoving", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Cargomoving instance) {
		log.debug("finding Cargomoving instance by example");
		try {
			List results = getSession().createCriteria("database.Cargomoving")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Cargomoving instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Cargomoving as model where model."
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

	public List findByCargoMoverid(Object cargoMoverid) {
		return findByProperty(CARGO_MOVERID, cargoMoverid);
	}

	public List findByCargoOldarea(Object cargoOldarea) {
		return findByProperty(CARGO_OLDAREA, cargoOldarea);
	}

	public List findByCargoOldrow(Object cargoOldrow) {
		return findByProperty(CARGO_OLDROW, cargoOldrow);
	}

	public List findByCargoOldshelf(Object cargoOldshelf) {
		return findByProperty(CARGO_OLDSHELF, cargoOldshelf);
	}

	public List findByCargoOldseat(Object cargoOldseat) {
		return findByProperty(CARGO_OLDSEAT, cargoOldseat);
	}

	public List findByCargoNewarea(Object cargoNewarea) {
		return findByProperty(CARGO_NEWAREA, cargoNewarea);
	}

	public List findByCargoNewrow(Object cargoNewrow) {
		return findByProperty(CARGO_NEWROW, cargoNewrow);
	}

	public List findByCargoNewshelf(Object cargoNewshelf) {
		return findByProperty(CARGO_NEWSHELF, cargoNewshelf);
	}

	public List findByCargoNewseat(Object cargoNewseat) {
		return findByProperty(CARGO_NEWSEAT, cargoNewseat);
	}

	public List findAll() {
		log.debug("finding all Cargomoving instances");
		try {
			String queryString = "from Cargomoving";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Cargomoving merge(Cargomoving detachedInstance) {
		log.debug("merging Cargomoving instance");
		try {
			Cargomoving result = (Cargomoving) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Cargomoving instance) {
		log.debug("attaching dirty Cargomoving instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Cargomoving instance) {
		log.debug("attaching clean Cargomoving instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}