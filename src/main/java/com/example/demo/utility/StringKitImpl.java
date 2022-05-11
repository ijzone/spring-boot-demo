package com.example.demo.utility;

import java.security.InvalidParameterException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Map;

public class StringKitImpl implements StringKit {
	
	public static void main(String[] args) {
		StringKitImpl kit = new StringKitImpl();
//		Map<String, String> map = kit.emailDivider("ijzone86@gmail.com");
//		System.out.println("ID: " + map.get(EnumEmail.ID.getMapKey()));
//		System.out.println("Provider: " + map.get(EnumEmail.EMAIL_PROVIDER.getMapKey()));
		
		System.out.println(kit.numberWithCommaDelimiter("123492.3"));
	}

	@Override
	public Map<String, String> emailDivider(Object emailAddress) {
		// @를 기준으로 문자열을 추출
//        String mail = "abced@naver.com";
		if(emailAddress instanceof String == false) {
			throw new InvalidParameterException("문자열 매개변수가 아닙니다.");
		}
		
		// 먼저 @ 의 인덱스를 찾는다 - 인덱스 값: 5
		int idx = (int) ((String) emailAddress).indexOf("@"); 
		if(idx == -1) {
			throw new InvalidParameterException("이메일 형식이 올바르지 않습니다.");
		}
		
		Map<String, String> returnMap = new HashMap<String, String>();
		
		/* @ 앞부분을 추출
		 * substring은 첫번째 지정한 인덱스는 포함하지 않는다.
		 * 아래의 경우는 첫번째 문자열인 a 부터 추출된다.
		 * */
		String id = ((String) emailAddress).substring(0, idx);
		returnMap.put(EnumEmail.ID.getMapKey(), id);
		
		/* 뒷부분을 추출
		 * 아래 substring은 @ 바로 뒷부분인 n부터 추출
		 * */
		String provider = ((String) emailAddress).substring(idx+1);
		returnMap.put(EnumEmail.EMAIL_PROVIDER.getMapKey(), provider);
		
//		System.out.println("id : "+id);
//		System.out.println("provider : "+provider);
//		System.out.println("Map: " + returnMap);
		
		return returnMap;
	}

	@Override
	public String numberWithCommaDelimiter(Object obj) {
		System.out.println(obj.getClass().getSimpleName());
//		if(obj.getClass().getSimpleName().equalsIgnoreCase("String")) {
//			obj = Integer.parseInt(obj.toString());
//		}
		
		if(obj instanceof String) {
			if(isStringDouble((String)obj)) {
				return new DecimalFormat("#,###.00").format(Double.parseDouble(obj.toString()));
			}else {
				obj = Integer.parseInt(obj.toString());
			}
		}else if(obj instanceof Double) {
			return new DecimalFormat("#,###.00").format(Double.parseDouble(obj.toString()));
		}
		return NumberFormat.getInstance().format(obj);
	}

	@Override
	public boolean isStringDouble(String str) {
		int idx = str.indexOf(".");
		if(idx == -1) {
			return false;
		}
		return true;
	}
	
}
