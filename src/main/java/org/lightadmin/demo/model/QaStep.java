package org.lightadmin.demo.model;
// Generated Nov 1, 2015 1:04:48 AM by Hibernate Tools 3.4.0.CR1

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

/**
 * QaStep generated by hbm2java
 */
@Entity
@Table(name = "qa_step", catalog = "sakila")
public class QaStep implements java.io.Serializable {

	private Long stepId;
	private QaData qaData;
	private QaObject qaObject;
	private String stepName;
	private String action;
	private String stepDesc;
	/*private Set qaDepDatas = new HashSet(0);
	private Set qaFlowStepMapsForRefStepId = new HashSet(0);
	private Set qaResultTestCases = new HashSet(0);
	private Set qaFlowStepMapsForStepId = new HashSet(0);
	private Set qaResults = new HashSet(0);*/

	public QaStep() {
	}

	public QaStep(Long stepId, QaData qaData, QaObject qaObject) {
		this.stepId = stepId;
		this.qaData = qaData;
		this.qaObject = qaObject;
	}

	public QaStep(Long stepId, QaData qaData, QaObject qaObject, String stepName, String action, String stepDesc,
			Set qaDepDatas, Set qaFlowStepMapsForRefStepId, Set qaResultTestCases, Set qaFlowStepMapsForStepId,
			Set qaResults) {
		this.stepId = stepId;
		this.qaData = qaData;
		this.qaObject = qaObject;
		this.stepName = stepName;
		this.action = action;
		this.stepDesc = stepDesc;
		/*this.qaDepDatas = qaDepDatas;
		this.qaFlowStepMapsForRefStepId = qaFlowStepMapsForRefStepId;
		this.qaResultTestCases = qaResultTestCases;
		this.qaFlowStepMapsForStepId = qaFlowStepMapsForStepId;
		this.qaResults = qaResults;*/
	}

	@Id

	@Column(name = "STEP_ID", unique = true, nullable = false, precision = 10, scale = 0)
	public Long getStepId() {
		return this.stepId;
	}

	public void setStepId(Long stepId) {
		this.stepId = stepId;
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
	@JoinColumn(name = "OBJ_ID", nullable = false)
	public QaObject getQaObject() {
		return this.qaObject;
	}

	public void setQaObject(QaObject qaObject) {
		this.qaObject = qaObject;
	}

	@Column(name = "STEP_NAME", length = 30)
	public String getStepName() {
		return this.stepName;
	}

	public void setStepName(String stepName) {
		this.stepName = stepName;
	}

	@Column(name = "ACTION", length = 30)
	public String getAction() {
		return this.action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	@Column(name = "STEP_DESC", length = 200)
	public String getStepDesc() {
		return this.stepDesc;
	}

	public void setStepDesc(String stepDesc) {
		this.stepDesc = stepDesc;
	}

	/*@OneToMany(fetch = FetchType.LAZY, mappedBy = "qaStep")
	public Set getQaDepDatas() {
		return this.qaDepDatas;
	}

	public void setQaDepDatas(Set qaDepDatas) {
		this.qaDepDatas = qaDepDatas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "qaStepByRefStepId")
	public Set getQaFlowStepMapsForRefStepId() {
		return this.qaFlowStepMapsForRefStepId;
	}

	public void setQaFlowStepMapsForRefStepId(Set qaFlowStepMapsForRefStepId) {
		this.qaFlowStepMapsForRefStepId = qaFlowStepMapsForRefStepId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "qaStep")
	public Set getQaResultTestCases() {
		return this.qaResultTestCases;
	}

	public void setQaResultTestCases(Set qaResultTestCases) {
		this.qaResultTestCases = qaResultTestCases;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "qaStepByStepId")
	public Set getQaFlowStepMapsForStepId() {
		return this.qaFlowStepMapsForStepId;
	}

	public void setQaFlowStepMapsForStepId(Set qaFlowStepMapsForStepId) {
		this.qaFlowStepMapsForStepId = qaFlowStepMapsForStepId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "qaStep")
	public Set getQaResults() {
		return this.qaResults;
	}

	public void setQaResults(Set qaResults) {
		this.qaResults = qaResults;
	}
*/
}
