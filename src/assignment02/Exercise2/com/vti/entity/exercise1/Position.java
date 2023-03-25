package assignment02.Exercise2.com.vti.entity.exercise1;

public class Position {
	private Long positionID;
	private String positionIDName;

	public Position() {
		// TODO Auto-generated constructor stub
	}

	public Position(Long positionID, String positionIDName) {
		super();
		this.positionID = positionID;
		this.positionIDName = positionIDName;
	}
	
	public Position(Long positionId) {
		this.positionID = positionId;
	}

	public Long getPositionID() {
		return positionID;
	}

	public void setPositionID(Long positionID) {
		this.positionID = positionID;
	}

	public String getPositionIDName() {
		return positionIDName;
	}

	public void setPositionIDName(String positionIDName) {
		this.positionIDName = positionIDName;
	}

	@Override
	public String toString() {
		return "Position [positionID=" + positionID + ", positionIDName=" + positionIDName + "]";
	}

}
