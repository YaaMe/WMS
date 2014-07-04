package database;

/**
 * Cargo entity. @author MyEclipse Persistence Tools
 */

public class Cargo implements java.io.Serializable {

	// Fields

	private String cargoTrackingno;
	private String cargoOrigin;
	private String cargoDestination;

	// Constructors

	/** default constructor */
	public Cargo() {
	}

	/** minimal constructor */
	public Cargo(String cargoTrackingno) {
		this.cargoTrackingno = cargoTrackingno;
	}

	/** full constructor */
	public Cargo(String cargoTrackingno, String cargoOrigin,
			String cargoDestination) {
		this.cargoTrackingno = cargoTrackingno;
		this.cargoOrigin = cargoOrigin;
		this.cargoDestination = cargoDestination;
	}

	// Property accessors

	public String getCargoTrackingno() {
		return this.cargoTrackingno;
	}

	public void setCargoTrackingno(String cargoTrackingno) {
		this.cargoTrackingno = cargoTrackingno;
	}

	public String getCargoOrigin() {
		return this.cargoOrigin;
	}

	public void setCargoOrigin(String cargoOrigin) {
		this.cargoOrigin = cargoOrigin;
	}

	public String getCargoDestination() {
		return this.cargoDestination;
	}

	public void setCargoDestination(String cargoDestination) {
		this.cargoDestination = cargoDestination;
	}

}