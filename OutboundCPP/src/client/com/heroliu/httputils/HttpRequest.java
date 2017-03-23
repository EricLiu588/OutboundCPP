package com.heroliu.httputils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLConnection;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class HttpRequest {

	public static String sendGet(String url, HashMap<String, String> shaMap)
			throws UnsupportedEncodingException {
		
		String result = "";
		BufferedReader in = null;
		try {
			String urlNameString = url + "?"
					+ handleBeforeSend(shaMap);
			URL realUrl = new URL(urlNameString);
			System.out.println("请求地址--->" + realUrl);
			URLConnection connection = realUrl.openConnection();
			connection.setRequestProperty("Accept", "*/*");
			connection.setRequestProperty("Accept-Encoding",
					"gzip, deflate, sdch");
			connection.setRequestProperty("connection", "Keep-Alive");
			connection
					.setRequestProperty(
							"user-agent",
							"Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/56.0.2924.87 Mobile Safari/537.36");
			connection.connect();
			Map<String, List<String>> map = connection.getHeaderFields();
			for (String key : map.keySet()) {
				System.out.println(key + "--->" + map.get(key));
			}
			in = new BufferedReader(new InputStreamReader(
					connection.getInputStream()));
			String line;
			while ((line = in.readLine()) != null) {
				result += line;
			}
		} catch (Exception e) {
			System.out.println("GET方式异常" + e);
			e.printStackTrace();
		} finally {
			try {
				if (in != null) {
					in.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return result;
	}

	private static String getSha1(String str) {
		if (str == null || str.length() == 0) {
			return null;
		}
		char hexDigits[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
				'a', 'b', 'c', 'd', 'e', 'f' };
		try {
			MessageDigest mdTemp = MessageDigest.getInstance("SHA1");
			mdTemp.update(str.getBytes("UTF-8"));

			byte[] md = mdTemp.digest();
			int j = md.length;
			char buf[] = new char[j * 2];
			int k = 0;
			for (int i = 0; i < j; i++) {
				byte byte0 = md[i];
				buf[k++] = hexDigits[byte0 >>> 4 & 0xf];
				buf[k++] = hexDigits[byte0 & 0xf];
			}
			return new String(buf);
		} catch (Exception e) {
			return null;
		}
	}

	public static String sendPost(String url, HashMap<String,String> shaMap) {
		PrintWriter out = null;
		BufferedReader in = null;
		String result = "";
		try {
			URL realUrl = new URL(url);
			URLConnection conn = realUrl.openConnection();
			conn.setRequestProperty("accept", "");
			conn.setRequestProperty("connection", "Keep-Alive");
			conn.setRequestProperty("user-agent",
					"Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
			conn.setDoOutput(true);
			conn.setDoInput(true);
			out = new PrintWriter(conn.getOutputStream());
			out.print(handleBeforeSend(shaMap));
			out.flush();
			in = new BufferedReader(new InputStreamReader(
					conn.getInputStream()));
			String line;
			while ((line = in.readLine()) != null) {
				result += line;
			}
		} catch (Exception e) {
			System.out.println("POST方式异常" + e);
			e.printStackTrace();
		} finally {
			try {
				if (out != null) {
					out.close();
				}
				if (in != null) {
					in.close();
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		return result;
	}
	
	private static String handleBeforeSend(HashMap<String,String> shaMap){
		HashMap<String, String> sha1Map = new HashMap<String, String>();
		sha1Map = shaMap;

		// 加密字符串
		StringBuilder builder = new StringBuilder();
		// 做sha1 生成signature
		Iterator<String> iterator = sha1Map.keySet().iterator();
		List<String> keys = new ArrayList<String>();
		while (iterator.hasNext()) {
			keys.add(iterator.next());
		}
		// 字典序排序
		Collections.sort(keys);
		for (int i = 0; i < keys.size(); i++) {
			if (i > 0) {
				builder.append("&");
			}
			String tem = "";
			tem = sha1Map.get(keys.get(i));
			builder.append(keys.get(i) + "=" + tem);
		}
		// 加密
		// System.out.println("加密前字符串--->" + builder.toString());
		String signature = getSha1(builder.toString());
		sha1Map.put("signature", signature);
		iterator = sha1Map.keySet().iterator();
		StringBuilder urlBuilder = new StringBuilder();
		int count = 0;
		while (iterator.hasNext()) {
			String key = iterator.next();
			if (!key.equals("appsecret")) {
				if (count > 0) {
					urlBuilder.append("&");
				}
				String tem = "";
				tem = sha1Map.get(key);
				urlBuilder.append(key + "=" + tem);
				count++;
			}
		}
		return urlBuilder.toString().replaceFirst(" ", "%20");
	}

}