package baseball.valid;

import java.util.ArrayList;
import java.util.List;

public class Valid {

    public static int userInput(String num){
        try{
            OutOfRange(num); //입력값의 범위를 벗어 났을 때
            List<Character> list = new ArrayList<>();
            for(int i = 0; i < num.length(); i++){
                Character c = num.charAt(i);
                NotMatch(c); //입력 받은 값이 정수가 아닐 때
                checkOverlap(list, c); // 숫자가 중복됬을 때
                list.add(c);
            }

            return Integer.parseInt(num);

        }catch(IllegalArgumentException e){
            System.out.println(e);
            return -1;
        }
    }
    public static void OutOfRange(String num) {
        if(num.length() != 3){
            throw new IllegalArgumentException("숫자의 범위를 벗어났습니다. 다시 입력해주세요");
        }
    }
    public static void NotMatch(Character character) {
        if(!Character.isDigit(character)){ //입력 받은 값이 숫자가 아닐 때
            throw new IllegalArgumentException("정수로 다시 입력해주세요");
        }
    }
    public static void checkOverlap(List<Character> list, Character character){
        if(list.contains(character)){       //입력 받은 값이 동일한 값이 들어 있을 때
            throw new IllegalArgumentException("중복된 숫자가 들어 왔습니다. 다시 입력해주세요");
        }
    }

}
