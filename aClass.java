class aName<K>{
    K a;
    K b;

    public aName(K a, K b) {
        this.a = a;
        this.b = b;
    }

    public K getA() {
        return a;
    }
    public void setA(K a) {
        this.a = a;
    }

    public K getB() {
        return b;
    }
    public void setB(K b) {
        this.b = b;
    }
}

public class aClass {
    public static void main(String[] args) {
        aName<String> obj = new aName<>("Hello", "World");
        System.out.println("a: " + obj.getA());
        System.out.println("b: " + obj.getB());

        aName<Integer> obj2 = new aName<>(1,2);
        System.out.println("a: " + obj2.getA());
        System.out.println("b: " + obj2.getB());


    }
}