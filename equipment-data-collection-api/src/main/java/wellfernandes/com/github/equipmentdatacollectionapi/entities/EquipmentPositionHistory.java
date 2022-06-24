package wellfernandes.com.github.equipmentdatacollectionapi.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name = "equipment_position_history")
public class EquipmentPositionHistory implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private UUID id;

	@MapsId("id")
	@ManyToOne
	@JoinColumn(name = "equipment_id")
	private Equipment equipmentId;

	private Date date;
	private Double lat;
	private Double lon;

	public EquipmentPositionHistory() {

	}

	public EquipmentPositionHistory(Long equipmentId, Date date, Double lat, Double lon) {
		super();
		this.date = date;
		this.lat = lat;
		this.lon = lon;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getLat() {
		return lat;
	}

	public void setLat(Double lat) {
		this.lat = lat;
	}

	public Double getLon() {
		return lon;
	}

	public void setLon(Double lon) {
		this.lon = lon;
	}

	public Equipment getEquipmentId() {
		return equipmentId;
	}
}
