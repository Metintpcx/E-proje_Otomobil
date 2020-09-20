package topcu.kardesler.controller.website;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import topcu.kardesler.dao.tblkategoridao;
import topcu.kardesler.dao.tblusersdao;
import topcu.kardesler.dao.tblyankategoridao;
import topcu.kardesler.models.tblkategori;
import topcu.kardesler.models.tblusers;
import topcu.kardesler.models.tblyankategori;
import topcu.kardesler.modelsview.ModelWebSiteIndex;

@ManagedBean(name = "indexBean")
@SessionScoped
public class IndexBean {

	private tblusers tbluser;
	private tblyankategori tblyankategori;
	private tblkategori tblkategori;
	private tblkategoridao Dbkategori;
	private tblyankategoridao Dbyankategori;
	private tblusersdao Dbuser;
	private ModelWebSiteIndex model;
	
	public IndexBean() {
		Dbkategori = new tblkategoridao();
		model = new ModelWebSiteIndex();
		Dbyankategori = new tblyankategoridao();
		Dbuser = new tblusersdao();
		
		
	
	}
	
	private void UsersEkle() {
		
		tbluser = new tblusers();
		tbluser.setAd("Kayit Ol");
		Dbuser.Save(tbluser);
		
		tbluser = new tblusers();
		tbluser.setAd("Giris Yap");
		Dbuser.Save(tbluser);
		
		
	}
	
	private void yanKategoriEkle() {
		
		tblyankategori = new tblyankategori();
		tblyankategori.setAd("Kiralik");
		tblyankategori.setResimurl("images/car1.jpg");
		Dbyankategori.Save(tblyankategori);
		
		tblyankategori = new tblyankategori();
		tblyankategori.setAd("Hasarlý/Hurda");
		tblyankategori.setResimurl("images/car2.jpg");
		Dbyankategori.Save(tblyankategori);
		
		tblyankategori = new tblyankategori();
		tblyankategori.setAd("Engelli Plakalý");
		tblyankategori.setResimurl("images/car3.jpg");
		Dbyankategori.Save(tblyankategori);
		
		tblyankategori = new tblyankategori();
		tblyankategori.setAd("Yabancýdan");
		tblyankategori.setResimurl("images/car4.jpg");
		Dbyankategori.Save(tblyankategori);
		
		
	}
	
	private void KategoriEkle() {

		
		tblkategori = new tblkategori();
		tblkategori.setAd("Ana Sayfa");
		Dbkategori.Save(tblkategori);
		
		tblkategori = new tblkategori();
		tblkategori.setAd("Otomobil Listesi");
		Dbkategori.Save(tblkategori);
		
		tblkategori = new tblkategori();
		tblkategori.setAd("Fiyatta indirim");
		Dbkategori.Save(tblkategori);
		
		tblkategori = new tblkategori();
		tblkategori.setAd("Hakkinda");
		Dbkategori.Save(tblkategori);
		
		tblkategori = new tblkategori();
		tblkategori.setAd("Ýletisim");
		Dbkategori.Save(tblkategori);
		

	}
	public ModelWebSiteIndex getModel() {
		return model;
	}
	public void setModel(ModelWebSiteIndex model) {
		this.model = model;
	}
	
}
