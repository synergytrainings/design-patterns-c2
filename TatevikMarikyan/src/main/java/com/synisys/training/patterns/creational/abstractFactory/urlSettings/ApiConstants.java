/**
 * 
 */
package com.synisys.training.patterns.creational.abstractFactory.urlSettings;

/**
 * <p>
 * this class for holding constants
 * 
 * <p>
 * class marked final because nobody need to extends from this class
 * 
 * @author Artur Yolchyan
 */
public final class ApiConstants {
	
	/**
	 * nobody need to create instance of this class
	 */
	private ApiConstants() {
		throw new RuntimeException();
	}
	
	/** here are constants for MPAO api */
	public static final String MPAO_ACTION_URI = "https://portal2.aasandha.mv/nspa/patient/summary/get";
	public static final String MPAO_TOKEN = "bece2c8ad4478d8e86e5c462ab445707";

	public static final String MPAO_REQUEST_KEY = "key";
	public static final String MPAO_REQUEST_ID = "id";
	public static final String MPAO_REQUEST_START_DATE = "startDate";
	public static final String MPAO_REQUEST_END_DATE = "endDate";

	public static final String MPAO_RESPONSE_LOCAL = "local";
	public static final String MPAO_RESPONSE_FOREIGN = "foriegn";
	public static final String MPAO_RESPONSE_AMOUNT = "amount";
	public static final String MPAO_RESPONSE_DIAGNOSE_DETAIL_ARRAY = "diagnosisDetails";
	public static final String MPAO_RESPONSE_DIAGNOSE_DETAIL_CODE = "diagnosis";
	public static final String MPAO_RESPONSE_DIAGNOSE_DETAIL_DESCRIPTION = "description";
}
