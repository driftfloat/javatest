package utils;

import java.net.URLEncoder;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

//import com.dc.wyc.kits.Md5Kit;
import com.google.common.base.Strings;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

/**
 * AES 是一种可逆加密算法，对用户的敏感信息加密处理 对原始数据进行AES加密后，在进行Base64编码转化；
 */
public class AESOperator {
	static Log logger = LogFactory.getLog(AESOperator.class);
	/*
	 * 加密用的Key 可以用26个字母和数字组成 此处使用AES-128-CBC加密模式，key需要为16位。
	 */
	private String sKey = "123456789zxcvbnm";
	private String ivParameter = "123456789zxcvbnm";
	private static AESOperator instance = null;

	private AESOperator() {

	}

	public static AESOperator getInstance() {
		if (instance == null)
			instance = new AESOperator();
		return instance;
	}

	public static String Encrypt(String encData, String secretKey, String vector) throws Exception {
		if (secretKey == null) {
			return null;
		}
		if (secretKey.length() != 16) {
			return null;
		}
		Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
		byte[] raw = secretKey.getBytes();
		SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
		IvParameterSpec iv = new IvParameterSpec(vector.getBytes());// 使用CBC模式，需要一个向量iv，可增加加密算法的强度
		cipher.init(Cipher.ENCRYPT_MODE, skeySpec, iv);
		byte[] encrypted = cipher.doFinal(encData.getBytes("utf-8"));
		return new BASE64Encoder().encode(encrypted);// 此处使用BASE64做转码。
	}

	// 加密
	public String encrypt(String sSrc) {
		if (Strings.isNullOrEmpty(sSrc)) {
			logger.info("==================无法对空值加密！");
			return sSrc;
		}
//        if (VerificationKit.isMobile(sSrc)) {
		try {
			Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
			byte[] raw = sKey.getBytes();
			SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
			IvParameterSpec iv = new IvParameterSpec(ivParameter.getBytes());// 使用CBC模式，需要一个向量iv，可增加加密算法的强度
			cipher.init(Cipher.ENCRYPT_MODE, skeySpec, iv);
			byte[] encrypted = cipher.doFinal(sSrc.getBytes("utf-8"));
			return new BASE64Encoder().encode(encrypted);// 此处使用BASE64做转码。
		} catch (Exception e) {
			logger.info("===================加密失败！");
			return sSrc;
		}
//        } else {
//            logger.info("================无需重复加密！");
//            return sSrc;
//        }
	}

	// 解密
	public String decrypt(String sSrc) {
		if (Strings.isNullOrEmpty(sSrc)) {
			logger.info("无法对空值解密！");
			return sSrc;
		}
		// 如果是空字符串的加密串
		if ("ZVYrFsE56PO8TKD8glU/Mg==".equals(sSrc)) {
			return "";
		}
		try {
			byte[] raw = sKey.getBytes("ASCII");
			SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
			Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
			IvParameterSpec iv = new IvParameterSpec(ivParameter.getBytes());
			cipher.init(Cipher.DECRYPT_MODE, skeySpec, iv);
			// 先用base64解密
			byte[] encrypted1 = new BASE64Decoder().decodeBuffer(sSrc);
			byte[] original = cipher.doFinal(encrypted1);
			String originalString = new String(original, "utf-8");
			originalString = "".equals(originalString) ? sSrc : originalString;
			return originalString;
		} catch (Exception ex) {
			logger.info("解密失败！" + sSrc);
			return sSrc;
		}
	}

	public String decrypt(String sSrc, String key, String ivs) {
		try {
			byte[] raw = key.getBytes("ASCII");
			SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
			Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
			IvParameterSpec iv = new IvParameterSpec(ivs.getBytes());
			cipher.init(Cipher.DECRYPT_MODE, skeySpec, iv);
			// 先用base64解密
			byte[] encrypted1 = new BASE64Decoder().decodeBuffer(sSrc);
			byte[] original = cipher.doFinal(encrypted1);
			String originalString = new String(original, "utf-8");
			return originalString;
		} catch (Exception ex) {
			return null;
		}
	}

	public static String encodeBytes(byte[] bytes) {
		StringBuffer strBuf = new StringBuffer();

		for (int i = 0; i < bytes.length; i++) {
			strBuf.append((char) (((bytes[i] >> 4) & 0xF) + ((int) 'a')));
			strBuf.append((char) (((bytes[i]) & 0xF) + ((int) 'a')));
		}

		return strBuf.toString();
	}

	public static void order() throws Exception {
		String cSrc = "1083753";
		String enString = AESOperator.getInstance().encrypt(cSrc);
		System.out.println("orderId:"+enString);
		System.out.println(AESOperator.getInstance().decrypt(enString));
		System.out.println(URLEncoder.encode(enString, "utf-8")+"\n");
		cSrc = "4.30";
		enString = AESOperator.getInstance().encrypt(cSrc);
		System.out.println("distance:"+enString);
		System.out.println(AESOperator.getInstance().decrypt(enString));
		System.out.println(URLEncoder.encode(enString, "utf-8")+"\n");
		cSrc = "108.881347";
		enString = AESOperator.getInstance().encrypt(cSrc);
		System.out.println("longitude:"+enString);
		System.out.println(AESOperator.getInstance().decrypt(enString));
		System.out.println(URLEncoder.encode(enString, "utf-8")+"\n");
		cSrc = "34.224129";
		enString = AESOperator.getInstance().encrypt(cSrc);
		System.out.println("latitude:"+enString);
		System.out.println(AESOperator.getInstance().decrypt(enString));
		System.out.println(URLEncoder.encode(enString, "utf-8")+"\n");
		cSrc = "3.00";
		enString = AESOperator.getInstance().encrypt(cSrc);
		System.out.println("waitMinutes:"+enString);
		System.out.println(AESOperator.getInstance().decrypt(enString));
		System.out.println(URLEncoder.encode(enString, "utf-8")+"\n");
	}
	
	public static void encryptLine()throws Exception {
		String file = "t:/a.txt";
		Path path = Paths.get(file);
		if(!Files.exists(path)){
			path = Paths.get("./a.txt");
		}
		List<String> lines = Files.readAllLines(path);
		lines.forEach(str -> System.out.println(str+"\t"+AESOperator.getInstance().encrypt(str)));
	}
	
	public static void main(String[] args) throws Exception {
		encryptLine();
		System.exit(0);
		// 需要加密的字串
		String deSrc = "5";
		System.out.println(AESOperator.getInstance().encrypt(deSrc));
		deSrc = "8";
		System.out.println(AESOperator.getInstance().encrypt(deSrc));
		deSrc = "name";
		System.out.println(AESOperator.getInstance().encrypt(deSrc));
		deSrc = "address";
		System.out.println(AESOperator.getInstance().encrypt(deSrc));
		deSrc="王总公司";
		System.out.println(AESOperator.getInstance().encrypt(deSrc));
		deSrc = "龙城大街泰鼎国际大厦  ";
		System.out.println(AESOperator.getInstance().encrypt(deSrc));
//		order();
		System.exit(1);
		
		String cSrc = "373726";
		cSrc = "13609297327";
		// 加密
		long lStart = System.currentTimeMillis();
		String enString = AESOperator.getInstance().encrypt(cSrc);
		System.out.println("加密后的字串是：" + enString);
		System.out.println("解密后的字串是：" + AESOperator.getInstance().decrypt(enString));
		cSrc = "13152113825";
		enString = AESOperator.getInstance().encrypt(cSrc);
		System.out.println("加密后的字串是：" + enString);
		System.out.println("解密后的字串是：" + AESOperator.getInstance().decrypt(enString));
		cSrc = "025349";
		// 加密

//		enString = AESOperator.getInstance().encrypt(cSrc);
//		System.out.println("加密后的字串是：" + enString);
//		System.out.println("解密后的字串是：" + AESOperator.getInstance().decrypt(enString));
//		String salt = "g6t2ts";
//		String md5Pwd = Md5Kit.MD5(cSrc);
//		System.out.println(md5Pwd);
//		enString = AESOperator.getInstance().encrypt(md5Pwd);
//		System.out.println("jmeter.pwd字串是：" + enString);
//		enString = AESOperator.getInstance().decrypt(enString);
//		System.out.println("解密后的字串是：" + enString);
//		System.out.println(Md5Kit.MD5(enString + cSrc));
//		System.out.println(Md5Kit.MD5(AESOperator.getInstance().decrypt(enString) + cSrc));
//		System.out.println(Md5Kit.MD5(Md5Kit.MD5(cSrc) + cSrc));
//		System.exit(1);
//		cSrc = "52.10";
//		// 加密
//		enString = AESOperator.getInstance().encrypt(cSrc);
//		System.out.println("加密后的字串是：" + enString);
//
//		cSrc = "0";
//		// 加密
//		enString = AESOperator.getInstance().encrypt(cSrc);
//		System.out.println("加密后的字串是：" + enString);
//
//		cSrc = "5";
//		// 加密
//		enString = AESOperator.getInstance().encrypt(cSrc);
//		System.out.println("加密后的字串是：" + enString);
//
//		cSrc = "45";
//		// 加密
//		enString = AESOperator.getInstance().encrypt(cSrc);
//		System.out.println("加密后的字串是：" + enString);
//
//		cSrc = "18110932720";
//		// 加密
//		enString = AESOperator.getInstance().encrypt(cSrc);
//		System.out.println("加密后的字串是：" + enString);
//
//		long lUseTime = System.currentTimeMillis() - lStart;
//		System.out.println("加密耗时：" + lUseTime + "毫秒");
//		// 解密
//		lStart = System.currentTimeMillis();
//		String DeString = AESOperator.getInstance().decrypt(enString);
//		System.out.println("解密后的字串是：" + DeString);
//		lUseTime = System.currentTimeMillis() - lStart;
//		System.out.println("解密耗时：" + lUseTime + "毫秒");
//
//		String d0 = AESOperator.getInstance().decrypt("Ec0gBbfGmjM3cB6cwqb+Ig==");
//		System.out.println(d0 + "d");
//		d0 = AESOperator.getInstance().decrypt("TbM/YClmGstAxKmxFPYe2w==");
//		System.out.println(d0 + "d");
//		
//		String s = "1,2,2,1";
//		Set<String> set = new HashSet<>();
//		for(String d : s.split(",")) {
//			set.add(d);
//		}
//		while(true) {
//			for(String d : set) {
//				System.out.print(d+"\t");
//			}
//			System.out.println();
//		}
	}

	public String decrypt2(String sSrc) {
		if (Strings.isNullOrEmpty(sSrc)) {
			logger.info("无法对空值解密！");
			return sSrc;
		}
		try {
			byte[] encrypted1 = new BASE64Decoder().decodeBuffer(sSrc);// 先用base64解密
			String originalString = new String(encrypted1, "utf-8");
			originalString = java.net.URLDecoder.decode(originalString, "UTF-8");
			originalString = "".equals(originalString) ? sSrc : originalString;
			return originalString;
		} catch (Exception ex) {
			logger.info("解密失败！" + sSrc);
			return sSrc;
		}
	}
}