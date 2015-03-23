package com.family.web;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.famaily.api.FamilyService;

@ManagedBean(name = "famailyController")
@RequestScoped
public class FamailyController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static final Logger LOG = LoggerFactory
			.getLogger(FamailyController.class);

	@ManagedProperty(value = "#{familyService}")
	private transient FamilyService familyService;

	public FamailyController() {
		LOG.info("FamailyController.. ");

	}

	public void say() {
		this.familyService.sayHi();
	}

}
