package root.domain;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties
public class Tim {

	Tim() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String ime;
	private String grbUrl;
	private int brojSlicica;
	
	public Long getId() {
		return id;
	}
	
	public Tim(Long id, String ime, String grbUrl, int brojSlicica) {
		super();
		this.id = id;
		this.ime = ime;
		this.grbUrl = grbUrl;
		this.brojSlicica = brojSlicica;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getIme() {
		return ime;
	}
	
	public void setIme(String ime) {
		this.ime = ime;
	}
	
	public String getGrbUrl() {
		return grbUrl;
	}
	
	public void setGrbUrl(String grbUrl) {
		this.grbUrl = grbUrl;
	}
	
	public int getBrojSlicica() {
		return brojSlicica;
	}
	
	public void setBrojSlicica(int brojSlicica) {
		this.brojSlicica = brojSlicica;
	}
}
