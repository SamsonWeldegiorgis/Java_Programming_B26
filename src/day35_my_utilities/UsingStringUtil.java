package day35_my_utilities;

public class UsingStringUtil {
    public static void main(String[] args) {

        System.out.println(StringUtil.reverse("apple"));
        System.out.println(StringUtil.fixFormat("jaMES"));
        System.out.println(StringUtil.frequencyofCharacter("aabbaacca", 'a'));

        System.out.println(StringUtil.camelCase("JAVA will ruLE tHe wORLd"));

        System.out.println(StringUtil.uniqueCharacter("aaaaabcccdeeff"));
        System.out.println(StringUtil.uniqueCharacter("java"));



    }
}
