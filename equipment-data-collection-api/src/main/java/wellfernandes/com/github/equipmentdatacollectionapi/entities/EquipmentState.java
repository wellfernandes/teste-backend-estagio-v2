package wellfernandes.com.github.equipmentdatacollectionapi.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "equipment_state")
public class EquipmentState implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;
	private String color;

	@OneToMany(mappedBy = "equipmentStateId")
	private List<EquipmentModelStateHourlyEarnings> listEquipmentModelStateHourlyEarnings;

	@OneToMany(mappedBy = "equipmentStateId")
	private List<EquipmentStateHistory> listEquipmentStateHistory;

	public EquipmentState() {

	}

	public EquipmentState(Long id, String name, String color) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
