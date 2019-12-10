package main.java.DesignPatter.mementoPattern.v2;

/**
 * @Author: zhilei.wang
 * @Date: 2019/12/9 17:19
 * @Version 1.0
 */
public class mementoPattern02 {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        invoker.setState("begin");
        System.out.println("调用者设置了状态为  :" + invoker.getState());
        SnapShot orginalSnapShot = invoker.keepStateByInvoker();
        System.out.println("封装状态中....................");
        SnapShotManager snapShotManager = new SnapShotManager();
        System.out.println("状态保存");
        snapShotManager.storeState(orginalSnapShot);

        System.out.println("---------------------------------------------------------------------");
        System.out.println("重新设计状态...");
        invoker.setState("stop02");
        System.out.println("重新封装状态...");
        SnapShot snapShot = invoker.keepStateByInvoker();

        invoker.rollBackState(snapShotManager.getState());
        System.out.println("恢复后的状态  :" + invoker.getState());

    }
}


class SnapShot {
    String state;

    public SnapShot(String state) {
        this.state = state;
    }


}


class Invoker {
    String state;


    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public SnapShot keepStateByInvoker() {
        return new SnapShot(state);
    }

    public void rollBackState(SnapShot snapShot) {
        this.setState(snapShot.state);
    }

}

class SnapShotManager {
    SnapShot sm;

    public void storeState(SnapShot snapShot) {
        this.sm = snapShot;
    }


    public SnapShot getState() {
        return sm;
    }

}