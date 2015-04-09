public class a00 {
	public static void main(String[] args){
        String s = new String("stressed");
        int n = s.length();
        while (n > 0) {
        System.out.print(s.substring(n - 1, n));
        n = n - 1;
    	}
    	System.out.println();
    }
}
