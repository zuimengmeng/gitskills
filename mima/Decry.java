package mima;

public class Decry extends Encry{
	//继承Encry的属性和方法
	//重写go方法
	String go(byte pwd[]) {
		this.pwd=pwd;
		this.reversal();
		this.exchange();
		this.minus();
		p=new String(pwd);
		return p;
	}
	//添加新的实例方法，为add方法的逆运算
	void minus() {
		for(int i=0;i<pwd.length;i++) {
			pwd[i]=(byte)(pwd[i]-i-1-3);
		}
	}
}

