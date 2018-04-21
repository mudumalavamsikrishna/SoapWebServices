package com.vamsi.soap.webservices.soapdemoapplication.soap;

import org.springframework.ws.soap.server.endpoint.annotation.FaultCode;
import org.springframework.ws.soap.server.endpoint.annotation.SoapFault;

@SoapFault(faultCode = FaultCode.CUSTOM, customFaultCode = "{http://vamsi.com/courses}001-COURSE_NOT_FOUND")
public class CourseNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -7771131032321481544L;

	public CourseNotFoundException(String arg0) {
		super(arg0);
	}

}
