package topcu.kardesler.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table
@Entity
public class tblusers {

	@Id
	@SequenceGenerator(name = "sq_users_id",sequenceName = "sq_users_id",
			initialValue = 1,allocationSize = 1)
@GeneratedValue(generator = "sq_users_id")
	private int id;
	private String ad;
	
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
