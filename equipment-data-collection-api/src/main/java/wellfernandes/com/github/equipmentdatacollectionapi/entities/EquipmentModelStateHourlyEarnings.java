package wellfernandes.com.github.equipmentdatacollectionapi.entities;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "equipment_model_state_hourly_earnings")
public class EquipmentModelStateHourlyEarnings implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private UUID id;

	@ManyToOne
	@JoinColumn(name = "equipment_model_id")
	private EquipmentModel equipmentModelId;

	@ManyToOne
	@JoinColumn(name = "equipment_state_id")
	private EquipmentState equipmentStateId;

	private Double value;

	public EquipmentModelStateHourlyEarnings() {

	}

	public EquipmentModelStateHourlyEarnings(Double value) {
		super();
		this.value = value;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public EquipmentModel getEquipmentModelId() {
		return equipmentModelId;
	}

	public EquipmentState getEquipmentStateId() {
		return equipmentStateId;
	}
}
