package TestBingFa;

public class TestSync {
    public static void main(String[] args) {
        Account a1 = new Account(100, "高");
        Drawing draw1 = new Drawing(80, a1);
        Drawing draw2 = new Drawing(80, a1);
        draw1.start(); // 你取钱
        draw2.start(); // 你老婆取钱
    }
}

/*
 * 简单表示银行账户
 */
class Account {
    int money;
    String aname;

    public Account(int money, String aname) {
        super();
        this.money = money;
        this.aname = aname;
    }
}

/**
 * 模拟提款操作
 *
 * @author Administrator
 */
class Drawing extends Thread {
    int drawingNum; // 取多少钱
    Account account; // 要取钱的账户
    int expenseTotal; // 总共取的钱数

    public Drawing(int drawingNum, Account account) {
        super();
        this.drawingNum = drawingNum;
        this.account = account;
    }

    @Override
    public void run() {
        draw();
    }

    void draw() {
//        同步块
        synchronized (account) {
            if (account.money < drawingNum) {
                System.out.println(this.getName()+"余额不足!!!");
                return;
            }
        }
//
            account.money -= drawingNum;
            expenseTotal += drawingNum;
//        }
        System.out.println(this.getName() + "--账户余额：" + account.money);
        System.out.println(this.getName() + "--总共取了：" + expenseTotal);
    }
}
