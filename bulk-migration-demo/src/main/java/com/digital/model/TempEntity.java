/**
 * 
 */
package com.digital.model;

import java.sql.Date;

import javax.persistence.Id;

/**
 * @author M1056182
 *
 */
public class TempEntity {
	
	@Id
	private int id;

	private int irecipientid;
	
	private String semail;
	
	private Date tsfirstsignup;
	
	private String sfirstsignupcountryisoa2;
	
	private String sbrandcode;
	
	private String seuci;
	
	private int istoreid;
	
	private int isourceid;
	
	private int irecipientstatus;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIrecipientid() {
		return irecipientid;
	}

	public void setIrecipientid(int irecipientid) {
		this.irecipientid = irecipientid;
	}

	public String getSemail() {
		return semail;
	}

	public void setSemail(String semail) {
		this.semail = semail;
	}

	public Date getTsfirstsignup() {
		return tsfirstsignup;
	}

	public void setTsfirstsignup(Date tsfirstsignup) {
		this.tsfirstsignup = tsfirstsignup;
	}

	public String getSfirstsignupcountryisoa2() {
		return sfirstsignupcountryisoa2;
	}

	public void setSfirstsignupcountryisoa2(String sfirstsignupcountryisoa2) {
		this.sfirstsignupcountryisoa2 = sfirstsignupcountryisoa2;
	}

	public String getSbrandcode() {
		return sbrandcode;
	}

	public void setSbrandcode(String sbrandcode) {
		this.sbrandcode = sbrandcode;
	}

	public String getSeuci() {
		return seuci;
	}

	public void setSeuci(String seuci) {
		this.seuci = seuci;
	}

	public int getIstoreid() {
		return istoreid;
	}

	public void setIstoreid(int istoreid) {
		this.istoreid = istoreid;
	}

	public int getIsourceid() {
		return isourceid;
	}

	public void setIsourceid(int isourceid) {
		this.isourceid = isourceid;
	}

	public int getIrecipientstatus() {
		return irecipientstatus;
	}

	public void setIrecipientstatus(int irecipientstatus) {
		this.irecipientstatus = irecipientstatus;
	}

	public TempEntity(int id, int irecipientid, String semail, Date tsfirstsignup, String sfirstsignupcountryisoa2,
			String sbrandcode, String seuci, int istoreid, int isourceid, int irecipientstatus) {
		super();
		this.id = id;
		this.irecipientid = irecipientid;
		this.semail = semail;
		this.tsfirstsignup = tsfirstsignup;
		this.sfirstsignupcountryisoa2 = sfirstsignupcountryisoa2;
		this.sbrandcode = sbrandcode;
		this.seuci = seuci;
		this.istoreid = istoreid;
		this.isourceid = isourceid;
		this.irecipientstatus = irecipientstatus;
	}

	public TempEntity() {
		super();
	}
	
	
	
	
}
