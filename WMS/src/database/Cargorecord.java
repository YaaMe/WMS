package database;

/**
 * Cargorecord entity. @author MyEclipse Persistence Tools
 */

public class Cargorecord implements java.io.Serializable {

	// Fields

	private String cargoId;
	private Double cargoKg;
	private Integer cargoIsintact;
	private String cargoRemark;
	private String cargoArea;
	private Integer cargoRow;
	private String cargoShelf;
	private Integer cargoSeat;
	private String cargoState;
	private Integer cargoBemoved;

	// Constructors

	/** default constructor */
	public Cargorecord() {
	}

	/** minimal constructor */
	public Cargorecord(String cargoId) {
		this.cargoId = cargoId;
	}

	/** full constructor */
	public Cargorecord(String cargoId, Double cargoKg, Integer cargoIsintact,
			String cargoRemark, String cargoArea, Integer cargoRow,
			String cargoShelf, Integer cargoSeat, String cargoState,
			Integer cargoBemoved) {
		this.cargoId = cargoId;
		this.cargoKg = cargoKg;
		this.cargoIsintact = cargoIsintact;
		this.cargoRemark = cargoRemark;
		this.cargoArea = cargoArea;
		this.cargoRow = cargoRow;
		this.cargoShelf = cargoShelf;
		this.cargoSeat = cargoSeat;
		this.cargoState = cargoState;
		this.cargoBemoved = cargoBemoved;
	}

	// Property accessors

	public String getCargoId() {
		return this.cargoId;
	}

	public void setCargoId(String cargoId) {
		this.cargoId = cargoId;
	}

	public Double getCargoKg() {
		return this.cargoKg;
	}

	public void setCargoKg(Double cargoKg) {
		this.cargoKg = cargoKg;
	}

	public Integer getCargoIsintact() {
		return this.cargoIsintact;
	}

	public void setCargoIsintact(Integer cargoIsintact) {
		this.cargoIsintact = cargoIsintact;
	}

	public String getCargoRemark() {
		return this.cargoRemark;
	}

	public void setCargoRemark(String cargoRemark) {
		this.cargoRemark = cargoRemark;
	}

	public String getCargoArea() {
		return this.cargoArea;
	}

	public void setCargoArea(String cargoArea) {
		this.cargoArea = cargoArea;
	}

	public Integer getCargoRow() {
		return this.cargoRow;
	}

	public void setCargoRow(Integer cargoRow) {
		this.cargoRow = cargoRow;
	}

	public String getCargoShelf() {
		return this.cargoShelf;
	}

	public void setCargoShelf(String cargoShelf) {
		this.cargoShelf = cargoShelf;
	}

	public Integer getCargoSeat() {
		return this.cargoSeat;
	}

	public void setCargoSeat(Integer cargoSeat) {
		this.cargoSeat = cargoSeat;
	}

	public String getCargoState() {
		return this.cargoState;
	}

	public void setCargoState(String cargoState) {
		this.cargoState = cargoState;
	}

	public Integer getCargoBemoved() {
		return this.cargoBemoved;
	}

	public void setCargoBemoved(Integer cargoBemoved) {
		this.cargoBemoved = cargoBemoved;
	}

}