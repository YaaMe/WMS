package database;

import java.sql.Timestamp;

/**
 * Cargomoving entity. @author MyEclipse Persistence Tools
 */

public class Cargomoving implements java.io.Serializable {

	// Fields

	private Integer movid;
	private String cargoId;
	private Timestamp cargoMovtime;
	private String cargoMoverid;
	private String cargoOldarea;
	private Integer cargoOldrow;
	private String cargoOldshelf;
	private Integer cargoOldseat;
	private String cargoNewarea;
	private Integer cargoNewrow;
	private String cargoNewshelf;
	private Integer cargoNewseat;

	// Constructors

	/** default constructor */
	public Cargomoving() {
	}

	/** full constructor */
	public Cargomoving(String cargoId, Timestamp cargoMovtime,
			String cargoMoverid, String cargoOldarea, Integer cargoOldrow,
			String cargoOldshelf, Integer cargoOldseat, String cargoNewarea,
			Integer cargoNewrow, String cargoNewshelf, Integer cargoNewseat) {
		this.cargoId = cargoId;
		this.cargoMovtime = cargoMovtime;
		this.cargoMoverid = cargoMoverid;
		this.cargoOldarea = cargoOldarea;
		this.cargoOldrow = cargoOldrow;
		this.cargoOldshelf = cargoOldshelf;
		this.cargoOldseat = cargoOldseat;
		this.cargoNewarea = cargoNewarea;
		this.cargoNewrow = cargoNewrow;
		this.cargoNewshelf = cargoNewshelf;
		this.cargoNewseat = cargoNewseat;
	}

	// Property accessors

	public Integer getMovid() {
		return this.movid;
	}

	public void setMovid(Integer movid) {
		this.movid = movid;
	}

	public String getCargoId() {
		return this.cargoId;
	}

	public void setCargoId(String cargoId) {
		this.cargoId = cargoId;
	}

	public Timestamp getCargoMovtime() {
		return this.cargoMovtime;
	}

	public void setCargoMovtime(Timestamp cargoMovtime) {
		this.cargoMovtime = cargoMovtime;
	}

	public String getCargoMoverid() {
		return this.cargoMoverid;
	}

	public void setCargoMoverid(String cargoMoverid) {
		this.cargoMoverid = cargoMoverid;
	}

	public String getCargoOldarea() {
		return this.cargoOldarea;
	}

	public void setCargoOldarea(String cargoOldarea) {
		this.cargoOldarea = cargoOldarea;
	}

	public Integer getCargoOldrow() {
		return this.cargoOldrow;
	}

	public void setCargoOldrow(Integer cargoOldrow) {
		this.cargoOldrow = cargoOldrow;
	}

	public String getCargoOldshelf() {
		return this.cargoOldshelf;
	}

	public void setCargoOldshelf(String cargoOldshelf) {
		this.cargoOldshelf = cargoOldshelf;
	}

	public Integer getCargoOldseat() {
		return this.cargoOldseat;
	}

	public void setCargoOldseat(Integer cargoOldseat) {
		this.cargoOldseat = cargoOldseat;
	}

	public String getCargoNewarea() {
		return this.cargoNewarea;
	}

	public void setCargoNewarea(String cargoNewarea) {
		this.cargoNewarea = cargoNewarea;
	}

	public Integer getCargoNewrow() {
		return this.cargoNewrow;
	}

	public void setCargoNewrow(Integer cargoNewrow) {
		this.cargoNewrow = cargoNewrow;
	}

	public String getCargoNewshelf() {
		return this.cargoNewshelf;
	}

	public void setCargoNewshelf(String cargoNewshelf) {
		this.cargoNewshelf = cargoNewshelf;
	}

	public Integer getCargoNewseat() {
		return this.cargoNewseat;
	}

	public void setCargoNewseat(Integer cargoNewseat) {
		this.cargoNewseat = cargoNewseat;
	}

}