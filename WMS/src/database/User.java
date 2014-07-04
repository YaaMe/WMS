package database;

/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User implements java.io.Serializable {

	// Fields

	private String UId;
	private String UPassword;
	private String UType;
	private String UName;
	private String UGender;

	// Constructors

	/** default constructor */
	public User() {
	}

	/** minimal constructor */
	public User(String UId) {
		this.UId = UId;
	}

	/** full constructor */
	public User(String UId, String UPassword, String UType, String UName,
			String UGender) {
		this.UId = UId;
		this.UPassword = UPassword;
		this.UType = UType;
		this.UName = UName;
		this.UGender = UGender;
	}

	// Property accessors

	public String getUId() {
		return this.UId;
	}

	public void setUId(String UId) {
		this.UId = UId;
	}

	public String getUPassword() {
		return this.UPassword;
	}

	public void setUPassword(String UPassword) {
		this.UPassword = UPassword;
	}

	public String getUType() {
		return this.UType;
	}

	public void setUType(String UType) {
		this.UType = UType;
	}

	public String getUName() {
		return this.UName;
	}

	public void setUName(String UName) {
		this.UName = UName;
	}

	public String getUGender() {
		return this.UGender;
	}

	public void setUGender(String UGender) {
		this.UGender = UGender;
	}

}