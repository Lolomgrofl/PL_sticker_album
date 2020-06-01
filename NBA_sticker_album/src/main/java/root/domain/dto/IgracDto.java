package root.domain.dto;

public class IgracDto {

	private Long id;
	private String ime;
	private String pozicija;
	private String slikaUrl;
	private Long timId;

	public IgracDto(Long id, String ime, String pozicija, String slikaUrl, Long timId) {
		super();
		this.id = id;
		this.ime = ime;
		this.pozicija = pozicija;
		this.slikaUrl = slikaUrl;
		this.timId = timId;
	}

	public IgracDto() {
		super();
	}

	public Long getId() {
		return id;
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

	public String getPozicija() {
		return pozicija;
	}

	public void setPozicija(String pozicija) {
		this.pozicija = pozicija;
	}

	public String getSlikaUrl() {
		return slikaUrl;
	}

	public void setSlikaUrl(String slikaUrl) {
		this.slikaUrl = slikaUrl;
	}

	public Long getTimId() {
		return timId;
	}

	public void setTimId(Long timId) {
		this.timId = timId;
	}
}
