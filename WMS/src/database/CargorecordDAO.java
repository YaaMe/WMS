package database;

import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for
 * Cargorecord entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see database.Cargorecord
 * @author MyEclipse Persistence Tools
 */

public class CargorecordDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(CargorecordDAO.class);
	// property constants
	public static final String CARGO_KG = "cargoKg";
	public static final String CARGO_ISINTACT = "cargoIsintact";
	public static final String CARGO_REMARK = "cargoRemark";
	public static final String CARGO_AREA = "cargoArea";
	public static final String CARGO_ROW = "cargoRow";
	public static final String CARGO_SHELF = "cargoShelf";
	public static final String CARGO_SEAT = "cargoSeat";
	public static final String CARGO_STATE = "cargoState";
	public static final String CARGO_BEMOVED = "cargoBemoved";

	public void save(Cargorecord transientInstance) {
		log.debug("saving Cargorecord instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Cargorecord persistentInstance) {
		log.debug("deleting Cargorecord instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Cargorecord findById(java.lang.String id) {
		log.debug("getting Cargorecord instance with id: " + id);
		try {
			Cargorecord instance = (Cargorecord) getSession().get(
					"database.Cargorecord", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Cargorecord instance) {
		log.debug("finding Cargorecord instance by example");
		try {
			List results = getSession().createCriteria("database.Cargorecord")
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
		log.debug("finding Cargorecord instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Cargorecord as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByCargoKg(Object cargoKg) {
		return findByProperty(CARGO_KG, cargoKg);
	}

	public List findByCargoIsintact(Object cargoIsintact) {
		return findByProperty(CARGO_ISINTACT, cargoIsintact);
	}

	public List findByCargoRemark(Object cargoRemark) {
		return findByProperty(CARGO_REMARK, cargoRemark);
	}

	public List findByCargoArea(Object cargoArea) {
		return findByProperty(CARGO_AREA, cargoArea);
	}

	public List findByCargoRow(Object cargoRow) {
		return findByProperty(CARGO_ROW, cargoRow);
	}

	public List findByCargoShelf(Object cargoShelf) {
		return findByProperty(CARGO_SHELF, cargoShelf);
	}

	public List findByCargoSeat(Object cargoSeat) {
		return findByProperty(CARGO_SEAT, cargoSeat);
	}

	public List findByCargoState(Object cargoState) {
		return findByProperty(CARGO_STATE, cargoState);
	}

	public List findByCargoBemoved(Object cargoBemoved) {
		return findByProperty(CARGO_BEMOVED, cargoBemoved);
	}

	public List findAll() {
		log.debug("finding all Cargorecord instances");
		try {
			String queryString = "from Cargorecord";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Cargorecord merge(Cargorecord detachedInstance) {
		log.debug("merging Cargorecord instance");
		try {
			Cargorecord result = (Cargorecord) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Cargorecord instance) {
		log.debug("attaching dirty Cargorecord instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Cargorecord instance) {
		log.debug("attaching clean Cargorecord instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}