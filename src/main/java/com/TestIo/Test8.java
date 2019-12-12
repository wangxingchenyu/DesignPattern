package TestIo;

public class Test8 {
    public static void main(String[] args) {
        System.out.println("未装饰前----------------");
        Python python = new Python();
        python.show();
        System.out.println("装饰后------------------");
        StrongCoder strongCoder = new StrongCoder(python);
        strongCoder.show();
    }
}


class Python {
    private String name;

    public void show() {
        System.out.println("我会写python程序");
    }
}


class StrongCoder {
    private Python p;

    public StrongCoder(Python p1) {
        p = p1;
    }

    public void show() {
        this.p.show();
        System.out.println("我不仅会写python,还写java");
    }
}

