import java.util.*;
public class Make_All_Equal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
			int ans = 0;
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			int max = 1;
			for(int i = 0; i < n; i++) {
				if(arr[i] > max) {
					max = arr[i];
				}
			}
			int[] hash = new int[max+1];
			for(int i = 0; i < n; i++) {
				hash[arr[i]]++;
			}
			int mode = 0;
			for(int i = 1; i <= max; i++){
				if(hash[i] > mode) {
					mode = hash[i];
				} 
			}
			ans = n - mode;
			System.out.println(ans);
		}
		sc.close();
		
	}
}