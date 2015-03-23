package com.family.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.famaily.api.FamilyService;

@Service("familyService")
public class FamailyServiceImpl implements FamilyService {
	private static final Logger LOG = LoggerFactory
			.getLogger(FamailyServiceImpl.class);

	public FamailyServiceImpl() {
		LOG.info("FamailyServiceImpl");
	}

	@Override
	public void sayHi() {

		// TODO Auto-generated method stub

	}

}
