package generic.ex1;

public class BoxMain3 {

    public static void main(String[] args) {

        /**
         * 생성 시점에 T의 타입이 결정
         * 코드 재사용성과 타입안정성 두마리 토끼를 잡기 위함.
         */
        GenericBox<Integer> integerBox = new GenericBox<Integer>();
        integerBox.set(10);
        //IntegerBox.set("문자100");  타입 문제로 컴파일오류 발생.

        Integer integer = integerBox.get(); //Integer로 타입이 변환되어 캐스팅이 필요없다.
        System.out.println("integer = " + integer);

        GenericBox<String> stringBox = new GenericBox<String>();
        stringBox.set("Hello");

        String str = stringBox.get();
        System.out.println("str = " + str);

        //원하는 모든 타입 사용 가능
        GenericBox<Object> doubleBox = new GenericBox<>();
        doubleBox.set(10.5);
        System.out.println("doubleBox.get = " + doubleBox.get());
        doubleBox.set("HI");
        System.out.println("doubleBox.get = " + doubleBox.get());

        /**
         * 타입 추론: 생성하는 제네릭 타입 생략 가능
         * 문법상 가능한 위치에만 가능하다.
         */
        GenericBox<Integer> integerBox2 = new GenericBox<>();

    }
}
