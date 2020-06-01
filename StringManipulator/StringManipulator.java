public class StringManipulator {
    public String trimAndConcat(String str1, String str2) {
        String newStr1 = str1.trim();
        String newStr2 = str2.trim();
        return newStr1.concat(newStr2);
    }

    public Integer getIndexOrNull(String str, char character) {
        Integer i = str.indexOf(character);
        if (i == -1) return null;
        else return i;
    }

    public Integer getIndexOrNull(String str1, String str2) {
        Integer i = str1.indexOf(str2);
        if (i == -1) return null;
        else return i;
    }

    public String concatSubstring(String str1, int startIndex, int endIndex, String str2) {
        String substring = str1.substring(startIndex, endIndex);
        return substring.concat(str2);
    }
}