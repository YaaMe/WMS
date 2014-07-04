package database;

/**
 * WarehousestateId entity. @author MyEclipse Persistence Tools
 */

public class WarehousestateId implements java.io.Serializable {

	// Fields

	private String cargoArea;
	private Integer cargoRow;
	private String cargoShelf;
	private Integer cargoSeat;

	// Constructors

	/** default constructor */
	public WarehousestateId() {
	}

	/** full constructor */
	public WarehousestateId(String cargoArea, Integer cargoRow,
			String cargoShelf, Integer cargoSeat) {
		this.cargoArea = cargoArea;
		this.cargoRow = cargoRow;
		this.cargoShelf = cargoShelf;
		this.cargoSeat = cargoSeat;
	}

	// Property accessors

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

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof WarehousestateId))
			return false;
		WarehousestateId castOther = (WarehousestateId) other;

		return ((this.getCargoArea() == castOther.getCargoArea()) || (this
				.getCargoArea() != null
				&& castOther.getCargoArea() != null && this.getCargoArea()
				.equals(castOther.getCargoArea())))
				&& ((this.getCargoRow() == castOther.getCargoRow()) || (this
						.getCargoRow() != null
						&& castOther.getCargoRow() != null && this
						.getCargoRow().equals(castOther.getCargoRow())))
				&& ((this.getCargoShelf() == castOther.getCargoShelf()) || (this
						.getCargoShelf() != null
						&& castOther.getCargoShelf() != null && this
						.getCargoShelf().equals(castOther.getCargoShelf())))
				&& ((this.getCargoSeat() == castOther.getCargoSeat()) || (this
						.getCargoSeat() != null
						&& castOther.getCargoSeat() != null && this
						.getCargoSeat().equals(castOther.getCargoSeat())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCargoArea() == null ? 0 : this.getCargoArea().hashCode());
		result = 37 * result
				+ (getCargoRow() == null ? 0 : this.getCargoRow().hashCode());
		result = 37
				* result
				+ (getCargoShelf() == null ? 0 : this.getCargoShelf()
						.hashCode());
		result = 37 * result
				+ (getCargoSeat() == null ? 0 : this.getCargoSeat().hashCode());
		return result;
	}

}