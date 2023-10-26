package mima;
//随意添加一行注释
public class Decry extends Encry{
	//缁ф壙Encry鐨勫睘鎬у拰鏂规硶
	//閲嶅啓go鏂规硶
	String go(byte pwd[]) {
		this.pwd=pwd;
		this.reversal();
		this.exchange();
		this.minus();
		p=new String(pwd);
		return p;
	}
	//娣诲姞鏂扮殑瀹炰緥鏂规硶锛屼负add鏂规硶鐨勯?嗚繍绠?
	void minus() {
		for(int i=0;i<pwd.length;i++) {
			pwd[i]=(byte)(pwd[i]-i-1-3);
		}
	}
}

