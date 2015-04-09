public class a01 {
	public static void main(String[] args){
        String s = new String("パタトクカシーー");
        int n = 1;
        while (n < 8) {
        System.out.print(s.substring(n - 1, n));
        n = n + 2;
    	}
    	System.out.println();
    }
}
