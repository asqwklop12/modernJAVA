package chapter09;

public class Refactor {
    public static void main(String[] args) {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello");
            }
        };

        //==> 람다로
        Runnable r2 = () -> System.out.println("Hello");
    }

    public static void doSomething(Runnable r) {
        r.run();
    }

    public static void doSomething(Task a) {
        a.execute();
    }

    public void shadow() {
        int a = 0;
        Runnable r1 = () -> {
//            int a = 2; ????!!!!
            System.out.println(a);
        };

        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                int a = 2;
                System.out.println(a);
            }
        };
    }

    public void task() {
        doSomething(new Task() {
            @Override
            public void execute() {
                System.out.println("Danger Danger!");
            }
        });

        // =>
//        doSomething(() -> System.out.println("Danger Danger")); 에러
        doSomething((Task) () -> System.out.println("Danger Danger"));
    }

}
