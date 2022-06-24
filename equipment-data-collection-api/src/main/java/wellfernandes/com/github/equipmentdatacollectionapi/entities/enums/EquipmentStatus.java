package wellfernandes.com.github.equipmentdatacollectionapi.entities.enums;

public enum EquipmentStatus {

	OPERATING(1), STOPPED(2), MAINTENANCE(3);

	private int code;

	private EquipmentStatus(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}

	public static EquipmentStatus valueOf(int code) {
		for (EquipmentStatus value : EquipmentStatus.values()) {
			if (value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid equipment status code.");
	}
}
