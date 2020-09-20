package topcu.kardesler.controller.website;

import java.util.List;

import javax.faces.bean.ManagedBean;

import topcu.kardesler.dao.tblkategoridao;
import topcu.kardesler.dao.tblusersdao;
import topcu.kardesler.dao.tblyankategoridao;
import topcu.kardesler.models.tblkategori;
import topcu.kardesler.models.tblusers;
import topcu.kardesler.models.tblyankategori;

@ManagedBean(name = "headerBean")
public class HeaderBean {

	private List<tblkategori> kategoriListesi;
	private List<tblusers> usersListesi;
	private List<tblyankategori> yankategoriListesi;
	private tblkategoridao Dbkategori;
	private tblusersdao Dbusers;
	private tblyankategoridao Dbyankategori;
	
	public HeaderBean() {
		
		Dbkategori = new tblkategoridao();
		Dbusers = new tblusersdao();
		Dbyankategori = new tblyankategoridao();
		
	}
	
	public List<tblkategori> getKategoriListesi() {
		return Dbkategori.MyList(new tblkategori());
	}
	public void setKategoriListesi(List<tblkategori> kategoriListesi) {
		this.kategoriListesi = kategoriListesi;
	}
	public List<tblusers> getUsersListesi() {
		return Dbusers.MyList(new tblusers());
	}
	public void setUsersListesi(List<tblusers> usersListesi) {
		this.usersListesi = usersListesi;
	}
	public List<tblyankategori> getYankategoriListesi() {
		return Dbyankategori.MyList(new tblyankategori());
	}
	public void setYankategoriListesi(List<tblyankategori> yankategoriListesi) {
		this.yankategoriListesi = yankategoriListesi;
	}
	
	
	
}
