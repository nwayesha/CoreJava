package designpattern.structural.proxypattern;

public class ProxyPatternClient {
	public static void main(String[] args) {
		OfficeInternetAccess access = new ProxyInternetAccess("Ayesha");
		access.grantInternetAccess();
	}
}
