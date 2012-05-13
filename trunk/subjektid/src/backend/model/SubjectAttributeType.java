package backend.model;

// Generated May 11, 2012 8:57:46 PM by Hibernate Tools 3.4.0.CR1

/**
 * SubjectAttributeType generated by hbm2java
 */
public class SubjectAttributeType implements java.io.Serializable {

	private long subjectAttributeType;
	private Long subjectTypeFk;
	private String typeName;
	private Boolean dataType;
	private Long orderby;
	private String required;
	private String multipleAttributes;
	private String createdByDefault;

	public SubjectAttributeType() {
	}

	public SubjectAttributeType(long subjectAttributeType) {
		this.subjectAttributeType = subjectAttributeType;
	}

	public SubjectAttributeType(long subjectAttributeType, Long subjectTypeFk,
			String typeName, Boolean dataType, Long orderby, String required,
			String multipleAttributes, String createdByDefault) {
		this.subjectAttributeType = subjectAttributeType;
		this.subjectTypeFk = subjectTypeFk;
		this.typeName = typeName;
		this.dataType = dataType;
		this.orderby = orderby;
		this.required = required;
		this.multipleAttributes = multipleAttributes;
		this.createdByDefault = createdByDefault;
	}

	public long getSubjectAttributeType() {
		return this.subjectAttributeType;
	}

	public void setSubjectAttributeType(long subjectAttributeType) {
		this.subjectAttributeType = subjectAttributeType;
	}

	public Long getSubjectTypeFk() {
		return this.subjectTypeFk;
	}

	public void setSubjectTypeFk(Long subjectTypeFk) {
		this.subjectTypeFk = subjectTypeFk;
	}

	public String getTypeName() {
		return this.typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public Boolean getDataType() {
		return this.dataType;
	}

	public void setDataType(Boolean dataType) {
		this.dataType = dataType;
	}

	public Long getOrderby() {
		return this.orderby;
	}

	public void setOrderby(Long orderby) {
		this.orderby = orderby;
	}

	public String getRequired() {
		return this.required;
	}

	public void setRequired(String required) {
		this.required = required;
	}

	public String getMultipleAttributes() {
		return this.multipleAttributes;
	}

	public void setMultipleAttributes(String multipleAttributes) {
		this.multipleAttributes = multipleAttributes;
	}

	public String getCreatedByDefault() {
		return this.createdByDefault;
	}

	public void setCreatedByDefault(String createdByDefault) {
		this.createdByDefault = createdByDefault;
	}

}
