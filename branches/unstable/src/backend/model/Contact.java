package backend.model;

// Generated May 11, 2012 8:57:46 PM by Hibernate Tools 3.4.0.CR1

/**
 * Contact generated by hbm2java
 */
public class Contact implements java.io.Serializable {

	private long contact;
	private Long subjectFk;
	private Long contactTypeFk;
	private String valueText;
	private Long orderby;
	private Long subjectTypeFk;
	private String note;

	public Contact() {
	}

	public Contact(long contact) {
		this.contact = contact;
	}

	public Contact(long contact, Long subjectFk, Long contactTypeFk,
			String valueText, Long orderby, Long subjectTypeFk, String note) {
		this.contact = contact;
		this.subjectFk = subjectFk;
		this.contactTypeFk = contactTypeFk;
		this.valueText = valueText;
		this.orderby = orderby;
		this.subjectTypeFk = subjectTypeFk;
		this.note = note;
	}

	public long getContact() {
		return this.contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public Long getSubjectFk() {
		return this.subjectFk;
	}

	public void setSubjectFk(Long subjectFk) {
		this.subjectFk = subjectFk;
	}

	public Long getContactTypeFk() {
		return this.contactTypeFk;
	}

	public void setContactTypeFk(Long contactTypeFk) {
		this.contactTypeFk = contactTypeFk;
	}

	public String getValueText() {
		return this.valueText;
	}

	public void setValueText(String valueText) {
		this.valueText = valueText;
	}

	public Long getOrderby() {
		return this.orderby;
	}

	public void setOrderby(Long orderby) {
		this.orderby = orderby;
	}

	public Long getSubjectTypeFk() {
		return this.subjectTypeFk;
	}

	public void setSubjectTypeFk(Long subjectTypeFk) {
		this.subjectTypeFk = subjectTypeFk;
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

}
