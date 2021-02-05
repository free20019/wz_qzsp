package test;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
* Created by IntelliJ IDEA.
* User: leizhimin
* Date: 2008-8-7 22:21:07
* 客户端测试，在客户端调用远程对象上的远程方法，并返回结果。
*/
public class HelloClient {
	private static Logger logger = LoggerFactory.getLogger(HelloClient.class);
    public static void main(String args[]){
        try {
            //在RMI服务注册表中查找名称为RHello的对象，并调用其上的方法
            IHello rhello =(IHello) Naming.lookup("rmi://192.168.11.50:8888/RHello");
            System.out.println(rhello.helloWorld());
            System.out.println(rhello.sayHelloToSomeBody("熔岩"));
        } catch (NotBoundException e) {
            logger.error("app_error",e);
        } catch (MalformedURLException e) {
            logger.error("app_error",e);
        } catch (RemoteException e) {
            logger.error("app_error",e);
        }
    }
}