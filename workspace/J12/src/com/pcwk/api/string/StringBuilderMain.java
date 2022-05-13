package com.pcwk.api.string;

public class StringBuilderMain implements LoggerManager {

	public static void main(String[] args) {
		LOG.debug("=====================");
		// StringBuilder : 가변 배열
		
		// String : char[]로 데이터를 저장한다.
		// 배열은 한번 크기를 정하면 변경 불가.
		
		// 동기화 되지 않음, 연산 속도 우수
		StringBuilder sb = new StringBuilder();
		LOG.debug(sb.capacity()); // 기본은 16개지만, 원하는 만큼 지정할 수 있다.
		sb.append("01_java	\n"); // append : 문자열 결합
		sb.append("02_oracle	\n");
		sb.append("03_html	\n");
		LOG.debug(sb.capacity()); // 내용을 추가하면 용량이 자동으로 증가됨
		
		LOG.debug(sb.toString());
	}

}
