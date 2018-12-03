package org.smarthome.skill.util;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.sql.Blob;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/***
 * 出自https://blog.csdn.net/xukun5137/article/details/78199875
 * 
 * @author HuangDayu
 *
 */
public class TypeUtil {

	public static void main(String[] args) {
		System.out.println(toString(065110));
		System.out.println(toInt(23.1));
		System.out.println(toInt(false));
	}

	private static final String DEFAULT_STRING = "";
	private static final int DEFAULT_INT = 0;
	private static final long DEFAULT_LONG = 0L;
	private static final double DEFAULT_DOUBLE = 0.0D;
	private static final float DEFAULT_FLOAT = 0.0F;
	private static final boolean DEFAULT_BOOLEAN = Boolean.FALSE;

	public static String toString(Object obj, String defaultValue) {
		return obj != null ? obj.toString() : defaultValue;
	}

	public static String toString(Object obj) {
		return toString(obj, DEFAULT_STRING);
	}

	public static String toString(Integer intValue, String defaultValue) {
		return intValue != null ? String.valueOf(intValue) : defaultValue;
	}

	public static String toString(Integer intValue) {
		return toString(intValue, DEFAULT_STRING);
	}

	public static String toString(Long longValue, String defaultValue) {
		return longValue != null ? String.valueOf(longValue) : defaultValue;
	}

	public static String toString(Long longValue) {
		return toString(longValue, DEFAULT_STRING);
	}

	public static String toString(Boolean booleanValue, String defaultValue) {
		return booleanValue != null ? String.valueOf(booleanValue) : defaultValue;
	}

	public static String toString(Boolean booleanValue) {
		return toString(booleanValue, DEFAULT_STRING);
	}

	public static String toString(Double doubleValue, String defaultValue) {
		return null != doubleValue ? String.valueOf(doubleValue) : defaultValue;
	}

	public static String toString(Double doubleValue) {
		return toString(doubleValue, DEFAULT_STRING);
	}

	public static String toString(Float floatValue, String defaultValue) {
		return null != floatValue ? String.valueOf(floatValue) : defaultValue;
	}

	public static String toString(Float floatValue) {
		return toString(floatValue, DEFAULT_STRING);
	}

	public static int toInt(Object objectValue, int defaultValue) {
		int intValue = defaultValue;
		if (null != objectValue) {
			try {
				intValue = Integer.parseInt(toString(objectValue, toString(defaultValue)));
			} catch (NumberFormatException numberFormatException) {
				System.err.println(numberFormatException.getMessage());
			}
		}
		return intValue;
	}

	public static int toInt(Object objectValue) {
		return toInt(objectValue, DEFAULT_INT);
	}

	public static int toInt(String stringValue, int defaultValue) {
		int intValue = defaultValue;
		if (null != stringValue && stringValue.length() > 0) {
			try {
				intValue = Integer.parseInt(stringValue);
			} catch (NumberFormatException numberFormatException) {
				System.err.println(numberFormatException.getMessage());
			}
		}
		return intValue;
	}

	public static int toInt(Long longValue, int defaultValue) {
		int intValue = defaultValue;
		if (null != longValue) {
			intValue = longValue.intValue();
		}
		return intValue;
	}

	public static int toInt(Long longValue) {
		return toInt(longValue, DEFAULT_INT);
	}

	public static int toInt(Boolean booleanValue, int defaultValue) {
		int intValue = defaultValue;
		if (null != booleanValue) {
			intValue = booleanValue ? 1 : 0;
		}
		return intValue;
	}

	public static int toInt(Boolean booleanValue) {
		return toInt(booleanValue, DEFAULT_INT);
	}

	public static int toInt(Double doubleValue, int defaultValue) {
		int intValue = defaultValue;
		if (null != doubleValue) {
			intValue = doubleValue.intValue();
		}
		return intValue;
	}

	public static int toInt(Double doubleValue) {
		return toInt(doubleValue, DEFAULT_INT);
	}

	public static int toInt(Float floatValue, int defaultValue) {
		int intValue = defaultValue;
		if (null != floatValue) {
			intValue = floatValue.intValue();
		}
		return intValue;
	}

	public static int toInt(Float floatValue) {
		return toInt(floatValue, DEFAULT_INT);
	}

	public static long toLong(Object objectValue, long defaultValue) {
		long longValue = defaultValue;
		if (null != objectValue) {
			try {
				longValue = Long.parseLong(toString(objectValue, toString(defaultValue)));
			} catch (NumberFormatException numberFormatException) {
				System.err.println(numberFormatException.getMessage());
			}
		}
		return longValue;
	}

	public static long toLong(Object objectValue) {
		return toLong(objectValue, DEFAULT_LONG);
	}

	public static long toLong(String stringValue, long defaultValue) {
		long longValue = defaultValue;
		if (null != stringValue && stringValue.length() > 0) {
			longValue = Long.parseLong(stringValue);
		}
		return longValue;
	}

	public static long toLong(String stringValue) {
		return toLong(stringValue, DEFAULT_LONG);
	}

	public static long toLong(Integer intValue, long defaultValue) {
		long longValue = defaultValue;
		if (null != intValue) {
			longValue = intValue.longValue();
		}
		return longValue;
	}

	public static long toLong(Integer intValue) {
		return toLong(intValue, DEFAULT_LONG);
	}

	public static long toLong(Boolean booleanValue, long defaultValue) {
		long longValue = defaultValue;
		if (null != booleanValue) {
			longValue = booleanValue ? 1L : 0L;
		}
		return longValue;
	}

	public static long toLong(Boolean booleanValue) {
		return toLong(booleanValue, DEFAULT_LONG);
	}

	public static long toLong(Double doubleValue, long defaultValue) {
		long longValue = defaultValue;
		if (null != doubleValue) {
			longValue = doubleValue.longValue();
		}
		return longValue;
	}

	public static long toLong(Double doubleValue) {
		return toLong(doubleValue, DEFAULT_LONG);
	}

	public static long toLong(Float floatValue, long defaultValue) {
		long longValue = defaultValue;
		if (null != floatValue) {
			longValue = floatValue.longValue();
		}
		return longValue;
	}

	public static long toLong(Float floatValue) {
		return toLong(floatValue, DEFAULT_LONG);
	}

	public static boolean toBoolean(Object objectValue, boolean defaultValue) {
		boolean booleanValue = defaultValue;
		if (null != objectValue) {
			booleanValue = Boolean.valueOf(toString(objectValue, toString(defaultValue)));
		}
		return booleanValue;
	}

	public static boolean toBoolean(Object objectValue) {
		return toBoolean(objectValue, DEFAULT_BOOLEAN);
	}

	public static boolean toBoolean(String stringValue, boolean defaultValue) {
		boolean booleanValue = defaultValue;
		if (null != stringValue && stringValue.length() > 0) {
			booleanValue = Boolean.valueOf(stringValue);
		}
		return booleanValue;
	}

	public static boolean toBoolean(String stringValue) {
		return toBoolean(stringValue, DEFAULT_BOOLEAN);
	}

	public static boolean toBoolean(Integer intValue, boolean defaultValue) {
		boolean booleanValue = defaultValue;
		if (null != intValue) {
			booleanValue = intValue == 1;
		}
		return booleanValue;
	}

	public static boolean toBoolean(Integer intValue) {
		return toBoolean(intValue, DEFAULT_BOOLEAN);
	}

	public static boolean toBoolean(Long longValue, boolean defaultValue) {
		boolean booleanValue = defaultValue;
		if (null != longValue) {
			booleanValue = longValue.longValue() == 1L;
		}
		return booleanValue;
	}

	public static boolean toBoolean(Long longValue) {
		return toBoolean(longValue, DEFAULT_BOOLEAN);
	}

	public static float toFloat(Object objectValue, float defaultValue) {
		float floatValue = defaultValue;
		if (null != objectValue) {
			try {
				floatValue = Float.valueOf(toString(objectValue, toString(defaultValue)));
			} catch (NumberFormatException numberFormatException) {
				System.err.println(numberFormatException);
			}
		}
		return floatValue;
	}

	public static float toFloat(Object objectValue) {
		return toFloat(objectValue, DEFAULT_FLOAT);
	}

	public static float toFloat(String stringValue, float defaultValue) {
		float floatValue = defaultValue;
		if (null != stringValue && stringValue.length() > 0) {
			try {
				floatValue = Float.valueOf(stringValue);
			} catch (NumberFormatException numberFormatException) {
				System.err.println(numberFormatException.getMessage());
			}
		}
		return floatValue;
	}

	public static float toFloat(String stringValue) {
		return toFloat(stringValue, DEFAULT_FLOAT);
	}

	public static float toFloat(Integer intValue, float defaultValue) {
		float floatValue = defaultValue;
		if (null != intValue) {
			floatValue = intValue.floatValue();
		}
		return floatValue;
	}

	public static float toFloat(Integer intValue) {
		return toFloat(intValue, DEFAULT_FLOAT);
	}

	public static float toFloat(Long longValue, float defaultValue) {
		float floatValue = defaultValue;
		if (null != longValue) {
			floatValue = longValue.floatValue();
		}
		return floatValue;
	}

	public static float toFloat(Long longValue) {
		return toFloat(longValue, DEFAULT_FLOAT);
	}

	public static float toFloat(Double doubleValue, float defaultValue) {
		float floatValue = defaultValue;
		if (null != doubleValue) {
			floatValue = doubleValue.floatValue();
		}
		return floatValue;
	}

	public static float toFloat(Double doubleValue) {
		return toFloat(doubleValue, DEFAULT_FLOAT);
	}

	public static double toDouble(Object objectValue, double defaultValue) {
		double doubleValue = defaultValue;
		if (null != objectValue) {
			doubleValue = Double.parseDouble(toString(objectValue, toString(defaultValue)));
		}
		return doubleValue;
	}

	public static double toDouble(Object objectValue) {
		return toDouble(objectValue, DEFAULT_DOUBLE);
	}

	public static double toDouble(String stringValue, double defaultValue) {
		double doubleValue = defaultValue;
		if (null != stringValue && stringValue.length() > 0) {
			doubleValue = Double.parseDouble(stringValue);
		}
		return doubleValue;
	}

	public static double toDouble(String stringValue) {
		return toDouble(stringValue, DEFAULT_DOUBLE);
	}

	public static double toDouble(Integer intValue, double defaultValue) {
		double doubleValue = defaultValue;
		if (null != intValue) {
			doubleValue = intValue.doubleValue();
		}
		return doubleValue;
	}

	public static double toDouble(Integer intValue) {
		return toDouble(intValue, DEFAULT_DOUBLE);
	}

	public static double toDouble(Long longValue, double defaultValue) {
		double doubleValue = defaultValue;
		if (null != longValue) {
			doubleValue = longValue.doubleValue();
		}
		return doubleValue;
	}

	public static double toDouble(Long longValue) {
		return toDouble(longValue, DEFAULT_DOUBLE);
	}

	public static double toDouble(Float floatValue, double defaultValue) {
		double doubleValue = defaultValue;
		if (null != floatValue) {
			doubleValue = floatValue.doubleValue();
		}
		return doubleValue;
	}

	public static double toDouble(Float floatValue) {
		return toDouble(floatValue, DEFAULT_DOUBLE);
	}

	private static final Map<String, String> typeMap = new HashMap<String, String>();
	static {
		typeMap.put("java.lang.Byte", "byte");
		typeMap.put("java.lang.Short", "short");
		typeMap.put("java.lang.Integer", "int");
		typeMap.put("java.lang.Long", "long");
		typeMap.put("java.lang.Double", "double");
		typeMap.put("java.lang.Float", "float");
		typeMap.put("java.lang.Character", "char");
		typeMap.put("java.lang.Boolean", "boolean");
	}

	public final static <T> String getType(T t) {
		if (t == null) {
			return null;
		}
		String typeInfo = t.getClass().getName();
		return typeMap.containsKey(typeInfo) ? typeMap.get(typeInfo) : typeInfo;
	}
	
	/**
	 * 字节数组转换为十六进制字符串.
	 * 
	 * @param src
	 * @return 十六进制字符串
	 */
	public static String bytesToHexString(byte[] src) {
		StringBuilder stringBuilder = new StringBuilder("");
		if (src == null || src.length <= 0) {
			return null;
		}
		for (int i = 0; i < src.length; i++) {
			int v = src[i] & 0xFF;
			String hv = Integer.toHexString(v);
			if (hv.length() < 2) {
				stringBuilder.append(0);
			}
			stringBuilder.append(hv);
		}
		return stringBuilder.toString();
	}

	/**
	 * 十六进制字符串转换为字节数组
	 * 
	 * @param hexString
	 *            十六进制字符串
	 * @return
	 */
	public static byte[] hexStringToBytes(String hexString) {
		if (hexString == null || hexString.equals("")) {
			return null;
		}
		hexString = hexString.toUpperCase();
		int length = hexString.length() / 2;
		char[] hexChars = hexString.toCharArray();
		byte[] d = new byte[length];
		for (int i = 0; i < length; i++) {
			int pos = i * 2;
			d[i] = (byte) (charToByte(hexChars[pos]) << 4 | charToByte(hexChars[pos + 1]));
		}
		return d;
	}

	/**
	 * 字符转换为字节
	 * 
	 * @param c
	 *            字符
	 * @return
	 */
	private static byte charToByte(char c) {
		return (byte) "0123456789ABCDEF".indexOf(c);
	}

	/**
	 * Blob类型转换为字节数组
	 * 
	 * @param blob
	 * @return
	 */
	public static byte[] blobToBytes(Blob blob) {
		BufferedInputStream is = null;
		try {
			is = new BufferedInputStream(blob.getBinaryStream());
			byte[] bytes = new byte[(int) blob.length()];
			int len = bytes.length;
			int offset = 0;
			int read = 0;

			while (offset < len && (read = is.read(bytes, offset, len - offset)) >= 0) {
				offset += read;
			}
			return bytes;
		} catch (Exception e) {
			return null;
		} finally {
			try {
				is.close();
				is = null;
			} catch (IOException e) {
				return null;
			}
		}
	}

	/**
	 * 阿拉伯数字转中文小写
	 * 
	 * @param si
	 *            阿拉伯数字
	 * @return 中文小写字符串
	 */
	public static String transition(String si) {
		String[] aa = { "", "十", "百", "千", "万", "十万", "百万", "千万", "亿", "十亿" };
		String[] bb = { "一", "二", "三", "四", "五", "六", "七", "八", "九" };
		char[] ch = si.toCharArray();
		int maxindex = ch.length;
		// 字符的转换
		String result = "";
		// 两位数的特殊转换
		if (maxindex == 2) {
			for (int i = maxindex - 1, j = 0; i >= 0; i--, j++) {
				if (ch[j] != 48) {
					if (j == 0 && ch[j] == 49) {
						result += aa[i];
					} else {
						result += bb[ch[j] - 49] + aa[i];
					}
				}
			}
			// 其他位数的特殊转换，使用的是int类型最大的位数为十亿
		} else {
			for (int i = maxindex - 1, j = 0; i >= 0; i--, j++) {
				if (ch[j] != 48) {
					result += bb[ch[j] - 49] + aa[i];
				}
			}
		}

		return result;
	}

	/**
	 * 利用反射机制，将源对象转换为目标对象，属性名一致，且源对象有get方法，目标对象有set方法
	 * 
	 * @param src
	 *            源对象
	 * @param target
	 *            目标对象
	 * @return 赋值后的目标对象
	 */
	public static Object autoGetterAndSetter(Object src, Object target) {
		Method[] sms = src.getClass().getMethods(); // 原始类方法srcMethod
		Method[] tms = target.getClass().getMethods(); // 目标类方法targetMethod
		for (Method sm : sms) {
			if (sm.getName().startsWith("get")) { // 原始类的 getter
				String attrName = sm.getName().substring(3);// 属性
				for (Method tm : tms) {// 遍历目标方法
					if (("set" + attrName).equals(tm.getName())) {// 执行目标类的指定attrName的setter
						try {
							if (!(null == sm.invoke(src))) {
								tm.invoke(target, sm.invoke(src));
							}
						} catch (Exception e) {
							continue;
						}
					}
				}
			}
		}
		return target;
	}

	/**
	 * <将List<Object>转换为List<Map<String, Object>>>
	 * 
	 * @param list
	 *            需要转换的list
	 * @return 转换的结果
	 */
	@SuppressWarnings("unchecked")
	public static List<Map<String, Object>> converterForMapList(List<Object> list) {
		List<Map<String, Object>> result = new ArrayList<Map<String, Object>>();
		for (Object tempObj : list) {
			result.add((HashMap<String, Object>) tempObj);
		}
		return result;
	}

}
