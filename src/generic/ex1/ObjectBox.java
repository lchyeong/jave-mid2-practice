package generic.ex1;

/**
 * Object 타입을 보관하는 박스
 */
public class ObjectBox {

    private Object value;

    public void set(Object value){
        this.value = value;
    }

    public Object get(){
        return value;
    }
}
