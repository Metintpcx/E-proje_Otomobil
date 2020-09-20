package topcu.kardesler.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table
@Entity
public class tblyankategori {

	
	@Id
	@SequenceGenerator(name = "sq_yankategori_id",sequenceName = "sq_yankategori_id",
			initialValue = 1,allocationSize = 1)
@GeneratedValue(generator = "sq_yankategori_id")
	private int id;
	private String ad;
	private String resimurl;
	
	public String getResimurl() {
		return resimurl;
	}
	public void setResimurl(String resimurl) {
		this.resimurl = resimurl;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
}
