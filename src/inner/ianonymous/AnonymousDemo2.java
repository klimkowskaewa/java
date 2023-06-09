package inner.ianonymous;

public class AnonymousDemo2 {
    public interface GreetingModule {
        void sayHello();
    }
    public class GreetingModuleImp implements GreetingModule {
        @Override
        public void sayHello() {
            System.out.println("good morning");
        }
    }
    public void someMethod() {
        GreetingModule greetingModule = new GreetingModuleImp();
        greetingModule.sayHello();
    }
    public static void main(String[] args) {
        AnonymousDemo2 anonymousDemo = new AnonymousDemo2();
        anonymousDemo.someMethod();
    }
}