package us.kulba.holiday.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "city")
public class City extends BaseObject {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long id;

	@Column(nullable = false)
	private String name;

	@Column(nullable = false)
	private String state;

	@Column(nullable = false)
	private String country;

	@Column(nullable = false)
	private String map;

	protected City() {
	}

	public City(String name, String state, String country, String map) {
		super();
		this.name = name;
		this.state = state;
		this.country = country;
		this.map = map;
	}

	public String getName() {
		return this.name;
	}

	public String getState() {
		return this.state;
	}

	public String getCountry() {
		return this.country;
	}

	public String getMap() { return this.map; }

}
