package generic.ex1;

public class BoxMain1 {
    public static void main(String[] args) {
        IntegerBox integerBox = new IntegerBox();
        integerBox.set(10); //오토 박싱
        Integer integer = integerBox.get();
        System.out.println("integer = " + integer);

        StringBox stringBox = new StringBox();
        stringBox.set("Hello");
        String str = stringBox.get();
        System.out.println("str = " + str);
    }
    /**
     * 다양한 타입을 담아야하는 BOX를 만들 때, 타입별로 클래스를 만들어야하는 문제가 있다.
     * 이를 해결하기 위해 제네릭을 사용한다.
     * 제네릭을 사용하면 타입별로 클래스를 만들 필요가 없다.
     */
}
