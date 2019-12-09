package main.java.DesignPatter.ProxyPattern.v2;

import java.lang.reflect.Proxy;

public class TestClassLoader {
	public static void main(String[] args) {

	
		Mishu mishu = new Mishu();
		Gongneng gongneng = (Gongneng) Proxy.newProxyInstance(Laozong.class.getClassLoader(),new Class[] { Gongneng.class }, mishu);
		gongneng.chifan();



		SecurityManager seuManager =  System.getSecurityManager();

	}
}
