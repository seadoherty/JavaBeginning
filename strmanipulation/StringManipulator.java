package strmanipulation;

public class StringManipulator {
	String trimAndConcat(String firstStr, String secondStr) {
		String result = firstStr.trim().concat(secondStr.trim());
		return result;
	}

	Integer getIndexOrNull(String str, char text) {
		Integer result = str.indexOf(text);
		if (result > -1) {
			return result;
		} else {
			return null;
		}
	}

	Integer getIndexOrNull1(String str1, String str2) {
		Integer result = str1.indexOf(str2);
		if (result > -1) {
			return result;
		} else {
			return null;
		}
	}

	String concatSubstring(String str1, int num1, int num2, String str2) {
		String sub = str1.substring(num1, num2);
		String result = sub.concat(str2);
		return result;
	}
}