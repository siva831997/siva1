package prefix;
import java.util.Scanner;
public class Prefix {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String[] a=new String[10];
		String h="";

		int b=s.nextInt();
		int i=0,j=0,k=0,f=0;int l=0;
		for(i=0;i<b;i++){
			a[i]=s.next();
		}for (i = 0; i < b-1; i++){
	        if (a[i].length() > a[i+1].length()){

	            h = a[i+1];
	        }
	    }
	if(h==""){
		h=a[0];
	}System.out.println(h);
		
			for(j=0;j<h.length()&&(f==0||f==b);j++){
				f=0;
				for(k=0;k<b;k++){
				
				if(h.charAt(j)==a[k].charAt(j)){
					f++;
				}}
				if(f==b){
					l++;
				}
					
									
				}
				if(l>=1){
					for(i=0;i<l;i++){
						System.out.print(h.charAt(i));
					}
				}else{
					System.out.print("no possible");
				}
				}}
