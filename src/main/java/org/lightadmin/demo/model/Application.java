package org.lightadmin.demo.model;
// Generated Nov 1, 2015 1:04:48 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Application generated by hbm2java
 */
@Entity
@Table(name = "application", catalog = "sakila")
public class Application implements java.io.Serializable {

	private Long applicationId;
	private String applicationName;
	private String applicationUrl;

	public Application() {
	}

	public Application(Long applicationId) {
		this.applicationId = applicationId;
	}

	public Application(Long applicationId, String applicationName, String applicationUrl) {
		this.applicationId = applicationId;
		this.applicationName = applicationName;
		this.applicationUrl = applicationUrl;
	}

	@Id

	@Column(name = "APPLICATION_ID", unique = true, nullable = false, precision = 10, scale = 0)
	public Long getApplicationId() {
		return this.applicationId;
	}

	public void setApplicationId(Long applicationId) {
		this.applicationId = applicationId;
	}

	@Column(name = "APPLICATION_NAME", length = 100)
	public String getApplicationName() {
		return this.applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	@Column(name = "APPLICATION_URL", length = 100)
	public String getApplicationUrl() {
		return this.applicationUrl;
	}

	public void setApplicationUrl(String applicationUrl) {
		this.applicationUrl = applicationUrl;
	}

}
