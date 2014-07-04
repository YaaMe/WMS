package database;

import java.sql.Timestamp;

/**
 * Cargoin entity. @author MyEclipse Persistence Tools
 */

public class Cargoin implements java.io.Serializable {

	// Fields

	private String cargoId;
	private String cargoTrackingno;
	private Timestamp cargoGetime;
	private Timestamp cargoIntime;
	private String cargoInerid;
	private String cargoCheckerid;

	// Constructors

	/** default constructor */
	public Cargoin() {
	}

	/** minimal constructor */
	public Cargoin(String cargoId) {
		this.cargoId = cargoId;
	}

	/** full constructor */
	public Cargoin(String cargoId, String cargoTrackingno,
			Timestamp cargoGetime, Timestamp cargoIntime, String cargoInerid,
			String cargoCheckerid) {
		this.cargoId = cargoId;
		this.cargoTrackingno = cargoTrackingno;
		this.cargoGetime = cargoGetime;
		this.cargoIntime = cargoIntime;
		this.cargoInerid = cargoInerid;
		this.cargoCheckerid = cargoCheckerid;
	}

	// Property accessors

	public String getCargoId() {
		return this.cargoId;
	}

	public void setCargoId(String cargoId) {
		this.cargoId = cargoId;
	}

	public String getCargoTrackingno() {
		return this.cargoTrackingno;
	}

	public void setCargoTrackingno(String cargoTrackingno) {
		this.cargoTrackingno = cargoTrackingno;
	}

	public Timestamp getCargoGetime() {
		return this.cargoGetime;
	}

	public void setCargoGetime(Timestamp cargoGetime) {
		this.cargoGetime = cargoGetime;
	}

	public Timestamp getCargoIntime() {
		return this.cargoIntime;
	}

	public void setCargoIntime(Timestamp cargoIntime) {
		this.cargoIntime = cargoIntime;
	}

	public String getCargoInerid() {
		return this.cargoInerid;
	}

	public void setCargoInerid(String cargoInerid) {
		this.cargoInerid = cargoInerid;
	}

	public String getCargoCheckerid() {
		return this.cargoCheckerid;
	}

	public void setCargoCheckerid(String cargoCheckerid) {
		this.cargoCheckerid = cargoCheckerid;
	}

}