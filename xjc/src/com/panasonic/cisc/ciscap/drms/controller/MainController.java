package com.panasonic.cisc.ciscap.drms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.panasonic.cisc.ciscap.drms.service.OadrCreatedPartyRegistrationBuilder;


@Controller
public class MainController {

	@Autowired
	OadrCreatedPartyRegistrationBuilder oadrCreatedPartyRegistrationBuilder ;

	public void start(){
		oadrCreatedPartyRegistrationBuilder.MessageBuilder();
	}
}
