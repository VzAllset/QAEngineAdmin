package org.lightadmin.demo.model;
// Generated Nov 5, 2015 4:50:17 AM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * QaTestCase generated by hbm2java
 */
@Entity
@Table(name = "qa_test_case", catalog = "sakila")
public class QaTestCase implements java.io.Serializable {

	private Long testCaseId;
	private String testCaseName;
	private String testCaseDesc;
	private Date createDate;
	private String createUserid;
	private String lastUpdatedUserid;
	private Date lastUpdatedDt;

	public QaTestCase() {
	}

	public QaTestCase(Long testCaseId, Date createDate, Date lastUpdatedDt) {
		this.testCaseId = testCaseId;
		this.createDate = createDate;
		this.lastUpdatedDt = lastUpdatedDt;
	}

	public QaTestCase(Long testCaseId, String testCaseName, String testCaseDesc, Date createDate, String createUserid,
			String lastUpdatedUserid, Date lastUpdatedDt, Set qaTestCaseFlowMaps, Set qaResults,
			Set qaResultTestCases) {
		this.testCaseId = testCaseId;
		this.testCaseName = testCaseName;
		this.testCaseDesc = testCaseDesc;
		this.createDate = createDate;
		this.createUserid = createUserid;
		this.lastUpdatedUserid = lastUpdatedUserid;
		this.lastUpdatedDt = lastUpdatedDt;
	}

	@Id

	@Column(name = "TEST_CASE_ID", unique = true, nullable = false, precision = 10, scale = 0)
	public Long getTestCaseId() {
		return this.testCaseId;
	}

	public void setTestCaseId(Long testCaseId) {
		this.testCaseId = testCaseId;
	}

	@Column(name = "TEST_CASE_NAME", length = 50)
	public String getTestCaseName() {
		return this.testCaseName;
	}

	public void setTestCaseName(String testCaseName) {
		this.testCaseName = testCaseName;
	}

	@Column(name = "TEST_CASE_DESC", length = 200)
	public String getTestCaseDesc() {
		return this.testCaseDesc;
	}

	public void setTestCaseDesc(String testCaseDesc) {
		this.testCaseDesc = testCaseDesc;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATE_DATE", nullable = false, length = 19)
	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Column(name = "CREATE_USERID", length = 15)
	public String getCreateUserid() {
		return this.createUserid;
	}

	public void setCreateUserid(String createUserid) {
		this.createUserid = createUserid;
	}

	@Column(name = "LAST_UPDATED_USERID", length = 15)
	public String getLastUpdatedUserid() {
		return this.lastUpdatedUserid;
	}

	public void setLastUpdatedUserid(String lastUpdatedUserid) {
		this.lastUpdatedUserid = lastUpdatedUserid;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LAST_UPDATED_DT", nullable = false, length = 19)
	public Date getLastUpdatedDt() {
		return this.lastUpdatedDt;
	}

	public void setLastUpdatedDt(Date lastUpdatedDt) {
		this.lastUpdatedDt = lastUpdatedDt;
	}

	

}