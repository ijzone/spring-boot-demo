package com.example.demo.utility;

import java.util.Map;

public interface StringKit {

	/**
	 * Email divider
	 * @param emailAddress
	 * @return
	 */
	public abstract Map<String, String> emailDivider(Object emailAddress);
	/**
	 * Number with Comma Delimiter
	 * @param obj
	 * @return
	 */
	public abstract String numberWithCommaDelimiter(Object obj);
	
	/**
	 * Determine if it's string type double value
	 * @param str
	 * @return
	 */
	public abstract boolean isStringDouble(String str);
}
