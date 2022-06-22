package wellfernandes.com.github.equipamentdatacollectionapi.entities.enums;

import java.io.Serializable;
import java.util.Date;

public class EquipamentPositionHistory implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long equipamentId;
	private Date date;
	private Double lat;
	private Double lon;
	
	public EquipamentPositionHistory() {
		
	}

	public EquipamentPositionHistory(Long equipamentId, Date date, Double lat, Double lon) {
		super();
		this.equipamentId = equipamentId;
		this.date = date;
		this.lat = lat;
		this.lon = lon;
	}

	public Long getEquipamentId() {
		return equipamentId;
	}

	public void setEquipamentId(Long equipamentId) {
		this.equipamentId = equipamentId;
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
}
