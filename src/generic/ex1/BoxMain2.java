package generic.ex1;

public class BoxMain2 {

    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.set(10);
        Object object = integerBox.get();
        Integer integer = (Integer) object; // Object가 -> Integer로 형변환(캐스팅)

        //Integer integer2 = (Integer) integerBox.get(); 한줄로 합치기.
        System.out.println("integer = " + integer);

        ObjectBox stringBox = new ObjectBox();
        stringBox.set("Hello");
        String str = (String) stringBox.get(); // Object가 -> String으로 형변환(캐스팅)
        System.out.println("str = " + str);

        /**
         * ObjectBox를 사용하면 다양한 타입을 담을 수 있지만, -> 기존에 여러 박스를 만들어야 하던 문제는 해결됐으나,
         * 값을 꺼낼 때마다 형변환을 해야하는 불편함이 있다.
         * 이를 해결하기 위해 제네릭을 사용한다.
         */


        /**
         * 아래의 예제는 integerBox에 실수로 문자를 넣었을때 발생하는 문제를 보여준다.
         * 이런 문제는 컴파일러가 체크할 수 없다.
         * 이런 문제를 해결하기 위해 제네릭을 사용한다.
         */

        integerBox.set("문자100");  //세팅이 되어버림, 타입 안정성 문제 발생.
        Integer result = (Integer) integerBox.get(); // ClassCastException 발생
        System.out.println("result = " + result);

    }
}
