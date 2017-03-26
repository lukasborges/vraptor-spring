package br.com.caelum.vraptor.blank.service;

import org.springframework.stereotype.Service;

@Service
public class TesteService {

	public String getVariableVRaptor() {
		return  "VRaptor!";
	}

	public String getVariableSpring() {
		return "Spring!";
	}
}
