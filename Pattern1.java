
public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		
		for(int i=0;i<n;i++) {
			//This is for I
			for(int j=0;j<n;j++) {
				if(j==(n-1)/2) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			for(int j=0;j<n;j++) {
				//This is for N
				if(j==0 || i==j || j==n-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			for(int j=0;j<n;j++) {
				//This is for E
				if(i==0 && j>=(n-1)/2 || 
				  i==(n-1)/2 && j>=(n-1)/2 ||
				  i==(n-1) && j>=(n-1)/2 ||
				  j==(n-1)/2) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			for(int j=0;j<n;j++) {
				//This is for U
				if(j==n/4 && i<(n-1) ||
				   i==(n-1) && j>0 && j>n/4 && j<n-1 ||
				   j==(n-1) && i<n-1
					) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			for(int j=0;j<n;j++) {
				//This is for R
				if(j==n/4 ||
					(i==0 && j<n-1 && j>n/4) ||
					(j==n-1 && i>0 && i<(n-1)/2) ||
					(i==(n-1)/2 && j>n/4 && j<n-1) ||
					(i==j && j>(n-1)/2)
					) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			for(int j=0;j<n;j++) {
				//This is for O
				if(i==0 && j>n/4 && j<n-1 ||
				   j==n-1 && i>0 && i<n-1 ||
				   i==n-1 && j>n/4 && j<n-1 ||
				   j==n/4 && i>0 && i<n-1
					) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			for(int j=0;j<n;j++) {
				//This is for N
				if(j==n/4 || i==j && j>n/4 || j==n-1
					) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
