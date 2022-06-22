package wellfernandes.com.github.equipamentdatacollectionapi.entities.enums;

public enum EquipamentStatus {

	OPERATING(1), STOPPED(2), MAINTENANCE(3);

	private int code;

	private EquipamentStatus(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}

	public static EquipamentStatus valueOf(int code) {
		for (EquipamentStatus value : EquipamentStatus.values()) {
			if (value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid equipment status code.");
	}
}
