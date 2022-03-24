package step07;

import java.io.IOException;

public class Java_5622 {

	public static void main(String[] args) throws IOException {
		// 8.다이얼
		int ans=0;
		int value;
		while(true) {
			value = System.in.read();
			if(value=='\n') break;
			if(value<68) ans+=3;
			else if(value<71) ans+=4;
			else if(value<74) ans+=5;
			else if(value<77) ans+=6;
			else if(value<80) ans+=7;
			else if(value<84) ans+=8;
			else if(value<87) ans+=9;
			else ans+=10;
		}
		System.out.println(ans);
	}

}
