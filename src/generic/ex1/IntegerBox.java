package generic.ex1;

/**
 * 정수를 보관하는 박스
 */

public class IntegerBox {
    private Integer value;

    public void set(Integer value){
        this.value = value;
    }

    public Integer get(){
        return value;
    }
}
