public class taller {
    public static void main(String[] args) {
        aClass<? extends String> me = new aClass<String>("Hello");
        me.printar();
        // Invalidad Reference: me.printar();
    }
}

class aClass<T>{
    private T message;
    public aClass(T hello){
        this.message = hello;
    }

    public void printar(){
        System.out.println(message);
    }
}