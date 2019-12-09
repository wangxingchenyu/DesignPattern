package testInterface03;

/**
 * @Author: zhilei.wang
 * @Date: 2019/11/12 15:40
 * @Version 1.0
 */
public class testInterface03 {
    public String usernmae ="testInterface03-username";

    public static void main(String[] args){
        JiaDian jd = new JiaDian(new Washable() {
            @Override
            public void wash() {
                System.out.println("washing.......");
            }

            @Override
            public void connect() {
                System.out.println("connection..............");
            }
        });

        jd.tt();
    }


    class  Person{
        public String username="perron-username";
        public void eat(){
           String username = "eat-method-username" ;
           System.out.println(username);
           System.out.println(this.username);
           System.out.println(testInterface03.this.usernmae);

        }
    }

}


class JiaDian {
    public Washable washable;
    public JiaDian(Washable washable) {
        this.washable = washable;
    }

    public void tt(){
        washable.wash();
        washable.connect();
    }

}