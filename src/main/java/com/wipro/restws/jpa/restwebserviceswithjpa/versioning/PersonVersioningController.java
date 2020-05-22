package com.wipro.restws.jpa.restwebserviceswithjpa.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonVersioningController {
	
	//URI Versioning
	@GetMapping("v1/person")
	public PersonV1 personV1() {
		return new PersonV1("Anant Jain");
	}
	@GetMapping("v2/person")
	public PersonV2 personV2() {
		return new PersonV2(new Name("Anant", "Jain"));
	}
	
	//Request Parameter Versioning
	@GetMapping(value="person/param",params="version=1")
	public PersonV1 paramV1() {
		return new PersonV1("Anant Jain");
	}
	@GetMapping(value="person/param",params="version=2")
	public PersonV2 paramV2() {
		return new PersonV2(new Name("Anant", "Jain"));
	}
	
	//Custom Header Versioning
		@GetMapping(value="person/header",headers="VERSION=1")
		public PersonV1 headerV1() {
			return new PersonV1("Anant Jain");
		}
		@GetMapping(value="person/header",headers="VERSION=2")
		public PersonV2 headerV2() {
			return new PersonV2(new Name("Anant", "Jain"));
		}
	
	//Media Type Versioning OR Accept Header Versioning OR Content Negotiation Versioning
		@GetMapping(value="person/produces",produces="application/vnd.xyz.abc-v1+json")
		public PersonV1 producesV1() {
			return new PersonV1("Anant Jain");
		}
		@GetMapping(value="person/produces",produces="application/vnd.xyz.abc-v2+json")
		public PersonV2 producesV2() {
			return new PersonV2(new Name("Anant", "Jain"));
		}
		
}
