package database;

import java.sql.Timestamp;

/**
 * Cargout entity. @author MyEclipse Persistence Tools
 */

public class Cargout implements java.io.Serializable {

	// Fields

	private String cargoId;
	private Timestamp cargoOutime;
	private String cargoOuterid;
	private String cargoCheckerid;

	// Constructors

	/** default constructor */
	public Cargout() {
	}

	/** minimal constructor */
	public Cargout(String cargoId) {
		this.cargoId = cargoId;
	}

	/** full constructor */
	public Cargout(String cargoId, Timestamp cargoOutime, String cargoOuterid,
			String cargoCheckerid) {
		this.cargoId = cargoId;
		this.cargoOutime = cargoOutime;
		this.cargoOuterid = cargoOuterid;
		this.cargoCheckerid = cargoCheckerid;
	}

	// Property accessors

	public String getCargoId() {
		return this.cargoId;
	}

	public void setCargoId(String cargoId) {
		this.cargoId = cargoId;
	}

	public Timestamp getCargoOutime() {
		return this.cargoOutime;
	}

	public void setCargoOutime(Timestamp cargoOutime) {
		this.cargoOutime = cargoOutime;
	}

	public String getCargoOuterid() {
		return this.cargoOuterid;
	}

	public void setCargoOuterid(String cargoOuterid) {
		this.cargoOuterid = cargoOuterid;
	}

	public String getCargoCheckerid() {
		return this.cargoCheckerid;
	}

	public void setCargoCheckerid(String cargoCheckerid) {
		this.cargoCheckerid = cargoCheckerid;
	}

}