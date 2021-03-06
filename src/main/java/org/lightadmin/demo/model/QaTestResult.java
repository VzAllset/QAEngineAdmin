package org.lightadmin.demo.model;
// Generated Nov 5, 2015 4:42:20 AM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * QaTestResult generated by hbm2java
 */
@Entity
@Table(name = "qa_test_result", catalog = "sakila")
public class QaTestResult implements java.io.Serializable {

	private Long testResultId;
	private QaData qaData;
	private QaObject qaObject;
	private String testDescription;
	private String status;
	private Date createdDt;
	private String action;

	public QaTestResult() {
	}

	public QaTestResult(Long testResultId, QaData qaData, QaObject qaObject, String action) {
		this.testResultId = testResultId;
		this.qaData = qaData;
		this.qaObject = qaObject;
		this.action = action;
	}

	public QaTestResult(Long testResultId, QaData qaData, QaObject qaObject, String testDescription, String status,
			Date createdDt, String action, Set qaFlowTestMaps) {
		this.testResultId = testResultId;
		this.qaData = qaData;
		this.qaObject = qaObject;
		this.testDescription = testDescription;
		this.status = status;
		this.createdDt = createdDt;
		this.action = action;
	}

	@Id

	@Column(name = "TEST_RESULT_ID", unique = true, nullable = false, precision = 10, scale = 0)
	public Long getTestResultId() {
		return this.testResultId;
	}

	public void setTestResultId(Long testResultId) {
		this.testResultId = testResultId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "DATA_ID", nullable = false)
	public QaData getQaData() {
		return this.qaData;
	}

	public void setQaData(QaData qaData) {
		this.qaData = qaData;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "OBJECT_ID", nullable = false)
	public QaObject getQaObject() {
		return this.qaObject;
	}

	public void setQaObject(QaObject qaObject) {
		this.qaObject = qaObject;
	}

	@Column(name = "TEST_DESCRIPTION", length = 200)
	public String getTestDescription() {
		return this.testDescription;
	}

	public void setTestDescription(String testDescription) {
		this.testDescription = testDescription;
	}

	@Column(name = "STATUS", length = 1)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CREATED_DT", length = 10)
	public Date getCreatedDt() {
		return this.createdDt;
	}

	public void setCreatedDt(Date createdDt) {
		this.createdDt = createdDt;
	}

	@Column(name = "ACTION", nullable = false, length = 20)
	public String getAction() {
		return this.action;
	}

	public void setAction(String action) {
		this.action = action;
	}

}
