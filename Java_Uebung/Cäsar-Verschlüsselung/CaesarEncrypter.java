public class CaesarEncrypter implements Encrypter {
    String S="abcdefghijklmnopqrstuvwxyz .,!?";
    char Char[]=S.toCharArray();
    public int n;
	public CaesarEncrypter(int n) {
		this.n=n;
	}
	@Override
	public String encrypt(String message) {
	    String encry ="";
		char Encry[]=message.toCharArray();
	    for(int i=0;i<message.length();i++) {
		for(int q=0;q<S.length();q++) {
			if(Char[q]==Encry[i]) {
				if(q+n>30) {
					Encry[i]=Char[q+n-31];
				}else {
					Encry[i]=Char[q+n];
				}
			}
			
		}
		encry=encry+Encry[i];
		
	}
		return encry;
	}

	@Override
	public String decrypt(String message) {
	char Decry[]=message.toCharArray();
	String decry="";
    for(int i=0;i<message.length();i++) {
	 for(int q=0;q<message.length();q++) {
		 if(Decry[i]==Char[q]){
			 if(q-n<0) {
				 Decry[i]=Char[q-n+31];
			 }else {
				 Decry[i]=Char[q-n];
			 }
		 }
		 
	 }
	 decry=decry+Decry[i];
 }
		return decry;
	}

	

}
