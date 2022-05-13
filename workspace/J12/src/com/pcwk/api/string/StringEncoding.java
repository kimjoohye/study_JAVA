package com.pcwk.api.string;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

import org.apache.log4j.*;

public class StringEncoding {
	final static Logger LOG = Logger.getLogger(StringEncoding.class);

	public static void main(String[] args) {
		String str = "가";
		try {
			byte[] bArr = str.getBytes("UTF-8"); // encoding
			byte[] bArrMS = str.getBytes("CP949");
			
			// 한글 : 3byte
			LOG.debug("UTF-8 bArr: "+ Arrays.toString(bArr)); // UTF-8 bArr: [-22, -80, -128]
			LOG.debug("UTF-8: "+new String(bArr, "UTF-8")); // decoding, UTF-8: 가
			
			// 한글 : 2byte
			LOG.debug("CP949 bArrMS: "+Arrays.toString(bArrMS)); // CP949 bArrMS: [-80, -95]
			LOG.debug("CP949: "+new String(bArrMS,"CP949")); // CP949: 가
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
//2022-02-18 10:11:23,225 DEBUG [main] string.StringEncoding (StringEncoding.java:17)     - UTF-8 bArr: [-22, -80, -128]
//2022-02-18 10:11:23,227 DEBUG [main] string.StringEncoding (StringEncoding.java:18)     - UTF-8: 가
//2022-02-18 10:11:23,227 DEBUG [main] string.StringEncoding (StringEncoding.java:20)     - CP949 bArrMS: [-80, -95]
//2022-02-18 10:11:23,227 DEBUG [main] string.StringEncoding (StringEncoding.java:21)     - CP949: 가
