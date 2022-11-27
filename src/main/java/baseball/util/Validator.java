package baseball.util;


import java.util.ArrayList;
import java.util.List;

public class Validator {
    public static String OUTOFRANGE = "[ERROR] 숫자의 범위를 벗어났습니다.";
    public static String NOTNUMBER = "[ERROR] 입력된 값이 숫자가 아닙니다.";
    public static String IMPORTZERO = "[ERROR] 0이 포함되어 있습니다.";
    public static String DUPLICATE = "[ERROR] 중복된 값이 포함되어 있습니다.";
    public static String NONEONETWO = "[ERROR] 1또는 2가 아닙니다.";

    /*
     *조건
     * 1. 3자리여야한다.
     * 2. 1~9까지여야 한다.
     * 3. 중복되면 안된다.
     */
    /*
     *조건
     * 1. 0 또는 1 여야 한다.
     */
    public static void OutOfRange(String number){
        if(number.length()!=3){
            throw new  IllegalArgumentException(OUTOFRANGE);
        }
    }

    public static void NotNumber(String number) {
        for(int i = 0; i < number.length(); i++){
            if(!Character.isDigit(number.charAt(i))){
                throw new IllegalArgumentException(NOTNUMBER);
            }
        }
    }

    public static void ImportZero(String number) {
        for(int i = 0; i < number.length(); i++){
            if(number.charAt(i) == '0'){
                throw new IllegalArgumentException(IMPORTZERO);
            }
        }
    }
    public static void Duplicate(String number) {
        List<String> duplicateChecker = new ArrayList<>();
        for(int i = 0 ;i < number.length(); i++){
            String num = number.substring(i, i + 1);
            if(duplicateChecker.contains(num)){
                throw new IllegalArgumentException(DUPLICATE);
            }
            duplicateChecker.add(num);
        }
    }

    public static void NoneOneTwo(String number){
        if(!number.equals("1") && !number.equals("2")){
            throw new IllegalArgumentException(NONEONETWO);
        }
    }
}
