package wellfernandes.com.github.equipmentdatacollectionapi.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "equipment_state_history")
public class EquipmentStateHistory implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
    private UUID id;

	@ManyToOne
	@JoinColumn(name = "equipment_id")
	private Equipment equipmentId;

	@ManyToOne
	@JoinColumn(name = "equipment_state_id")
	private EquipmentState equipmentStateId;

	private Date date;

	public EquipmentStateHistory() {

	}

	public EquipmentStateHistory(Date date) {
		super();
		this.date = date;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Equipment getEquipmentId() {
		return equipmentId;
	}

	public EquipmentState getEquipmentStateId() {
		return equipmentStateId;
	}
}
