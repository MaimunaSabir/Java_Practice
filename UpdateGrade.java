public class Main {
	public static void main(String[] args) {
		char grade[]={'A','B','C','D'};
		
		grade[0]='C';
		
		for(int i=0;i<grade.length;i++){
			System.out.print(grade[i]+"  ");
		}
	}
}