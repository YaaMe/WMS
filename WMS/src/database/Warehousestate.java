package database;

/**
 * Warehousestate entity. @author MyEclipse Persistence Tools
 */

public class Warehousestate implements java.io.Serializable {

	// Fields

	private WarehousestateId id;
	private String cargoId;

	// Constructors

	/** default constructor */
	public Warehousestate() {
	}

	/** full constructor */
	public Warehousestate(WarehousestateId id, String cargoId) {
		this.id = id;
		this.cargoId = cargoId;
	}

	// Property accessors

	public WarehousestateId getId() {
		return this.id;
	}

	public void setId(WarehousestateId id) {
		this.id = id;
	}

	public String getCargoId() {
		return this.cargoId;
	}

	public void setCargoId(String cargoId) {
		this.cargoId = cargoId;
	}

}