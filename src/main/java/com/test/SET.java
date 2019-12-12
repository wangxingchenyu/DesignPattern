package test;

public class SET {
    public static void main(String[] args){
        Dt d = new Dt();
        d.setUsername("alex");
        System.out.println(d.getUsername());
    }
}

class Dt{
    private String username;
    public static void main(String[] args){
        System.out.println();
    }

    public String getUsername(){
        return username;
    }

    public void setUsername(String username){
        this.username = username;
    }

}

/*
 *
 * 属性是private
 * 方法是public 修饰 方法名是set/get+属性名大写
 *
 */

