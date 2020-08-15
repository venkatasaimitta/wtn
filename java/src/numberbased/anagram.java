package numberbased;

public class anagram {

	public static void main(String[] args) {
		String a="asdfds";
		String b="asdfds";
		a=a.replace(" ","");
        b=b.replace(" ","");
        a=a.toLowerCase();
        b=b.toLowerCase();
        int al[] = new int[256];
        int bl[] = new int[256];
        boolean isanagram=true;

        for (char c:a.toCharArray()){
            int idx = (int)c;
            al[idx]++;

        }
        
        for (char c:b.toCharArray()){
            int idx = (int)c;
            bl[idx]++;

        }

        for (int i=0;i<256;i++){
            if (al[i]!=bl[i]){
                isanagram=false;

            }
        }
        
        
        if(isanagram) {
        	System.out.println("anagram");
        }
        else {
        	System.out.println("not anagram");
        }

	}

}
