package main.java.DesignPatter.mediatorPattern.v3;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zhilei.wang
 * @Date: 2019/12/9 16:17
 * @Version 1.0
 */
public class SpringCloudNetflix {
    public static void main(String[] args) {
        EurekaServer eurekaServer = new EurekaServer();
        Dao dao = new Dao();
        Cache cache = new Cache();
        MQ mq = new MQ();

        // 1 将三个服务注册到服务中心去了  2 并且告诉EurekaClient 他注册的是哪个服务注册中心，好让在发送请求的时候，直接走这个注册中心去
        eurekaServer.registService(dao).registService(cache).registService(mq);

        // 注册完成后，正常的运行
        dao.reqeust();
        cache.reqeust();

    }
}


class EurekaServer {

    List<EurekaClient> clients = new ArrayList();

    // 注册服务功能
    public EurekaServer registService(EurekaClient client) {
        if (!this.clients.contains(client)) {
            // 其实每个服务都有一个applicationName 来识别   springCloud 基于springBoot的
            this.clients.add(client);
            client.setEurekaServer(this);
        }
        return this;
    }

    //服务通知功能
    public void notice(EurekaClient client) {
        for (EurekaClient eurekaClient : clients) {
            if (eurekaClient != client) {
                client.response();
            }
        }
    }

}


abstract class EurekaClient {
    EurekaServer eurekaServer = null;

    public void setEurekaServer(EurekaServer eurekaServer) {
        this.eurekaServer = eurekaServer;
    }

    public abstract void reqeust();

    public abstract void response();
}


class Dao extends EurekaClient {

    @Override
    public void reqeust() {
        System.err.println("Dao 层执行了请求");
        eurekaServer.notice(this);
    }

    @Override
    public void response() {
        System.out.println("dao层接到到了响应");
    }
}


class Cache extends EurekaClient {

    @Override
    public void reqeust() {
        System.err.println("Cache 层执行了请求");
        eurekaServer.notice(this);
    }

    @Override
    public void response() {
        System.out.println("Cache 执行了响应...");
    }
}


class MQ extends EurekaClient {

    @Override
    public void reqeust() {
        System.err.println("MQ 层执行了请求");
        eurekaServer.notice(this);
    }

    @Override
    public void response() {
        System.out.println("MQ 层接到到了响应");
    }
}
