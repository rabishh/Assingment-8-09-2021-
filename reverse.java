package ClassPractice;

public class reverse {
public static void main(String args[]) {
	int a[]= {1,2,3,4,5};
	int b[]= new int[a.length];
	int index=0;
	for(int j=a.length-1;j>=0;j--) {
		b[index]=a[j];
		index++;
	}
	for(int i=0;i<b.length;i++) {
		System.out.println(b[i]);
	}
}
}
