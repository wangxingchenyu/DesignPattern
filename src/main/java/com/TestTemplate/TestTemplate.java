package TestTemplate;

/**
 * 测试回调函数
 */
public class TestTemplate {
    public static void main(String[] args) {
        System.out.println();
        Gao gao = new Gao();
        Liu liu = new Liu(gao);
        //小刘问问题
        liu.askQuestion("学习Java选哪家机构呢？");
    }
}


/**
 * 回调接口
 */
interface CallBack {
    /**
     * 小高知道答案后告诉小刘时需要调用的方法，即回调方法
     *
     * @param result 是问题的答案
     */
    public void answer(String result);
}

/**
 * 小刘类：实现了回调接口CallBack（背景一）
 */
class Liu implements CallBack {
    /**
     * 包含小高对象的引用 （背景二）
     */
    private Gao gao;

    public Liu(Gao gao) {
        this.gao = gao;
    }

    /**
     * 小刘通过这个方法去问小高
     *
     * @param question 小刘问的问题“学习Java选哪家机构呢？”
     */
    public void askQuestion(String question) {
        //小刘问小高问题(第一个传入对象)

        //我先执行子类的方法
        gao.execute(Liu.this, question);
    }

    /**
     * 小高知道答案后调用此方法告诉小刘
     */
    @Override
    public void answer(String result) {
        System.out.println("小高告诉小刘的答案是：" + result);
    }
}

/**
 * 小高类
 */
class Gao {
    /**
     * 相当于class B有一个参数为CallBack的方法C（背景三）
     */

    //子类里面又执行我的方法，可以实现异步发送邮件
    public void execute(CallBack callBack, String question) {
        System.out.println("小刘问的问题是：" + question);

        //模拟小高挂点后先办自己的事情花了很长时间
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //小高办完自己的事情后想到了答案
        String result = "学Java当然去北京尚学堂";

        //小高打电话把答案告诉小刘，相当于class B 反过来调用class A 的D方法
        callBack.answer(result);
    }
}


/**
 * 组合模式
 */

class Cpu {
    public void run() {
        System.out.println("quickly.........");
    }
}

class MainBoard {
    public void connect() {
        System.out.println("connect...........");
    }
}

class Memory {
    public void store() {
        System.out.println("store........");
    }
}

class Computer {
    Cpu cpu;
    Memory memory;
    MainBoard mainBoard;

    public void work() {
        cpu.run();
        memory.store();
        mainBoard.connect();
    }

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.cpu = new Cpu();
        computer.mainBoard = new MainBoard();
        computer.memory = new Memory();
        computer.work();
    }
}

