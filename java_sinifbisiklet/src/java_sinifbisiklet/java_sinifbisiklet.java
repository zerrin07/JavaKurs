package java_sinifbisiklet;

public class java_sinifbisiklet {

	public static void main(String[] args) {
		bisiklet bisiklet1 = new bisiklet();
		
		System.out.println("bisiklet hız:" + bisiklet1.hiz+
				"\nBisiklet1 vites:" + bisiklet1.vites);
		System.out.println("---------------");
        bisiklet1.VitesDegis(1);
        System.out.println("bisiklet hız:" + bisiklet1.hiz+
				"\nBisiklet1 vites:" + bisiklet1.vites);
	}

}