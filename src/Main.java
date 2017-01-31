import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 [] = {"1","2","3","4","5","12"};
		String str2 [] = {"2","3","4","5","6","7"};

		
		String [] strOneUniq = diffUniqueElementMass(str1,str2);
		String [] strTwoUniq = diffUniqueElementMass(str2,str1);
		String [] strUniq = copyMass(strOneUniq,strTwoUniq);
		
		System.out.println(Arrays.toString(diffUniqueElementMass(str1,str2)));
		System.out.println(Arrays.toString(diffUniqueElementMass(str2,str1)));
		
		System.out.println(Arrays.toString(strUniq));
	
		
		
	}
	
	public static String [] diffUniqueElementMass (String [] a, String [] b){
		int tmp=0; //tmp-переменная для подсчета количества итераций прохода по внутреннему массиву
		int countUnique = 0; // количество уникальных значений во внешнем массиве
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i].equals(b[j])== true){
					break;
				}else if (a[i].equals(b[j])== false){
					tmp++;
					if (tmp == b.length){
						countUnique++;
						tmp=0;
						}
				}
			}
		}
		
		String str3 [] = new String [countUnique];
		tmp=0;
		for (int k = 0; k < str3.length; ) {
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < b.length; j++) {
					if (a[i].equals(b[j])== true){
						break;
					}else if (a[i].equals(b[j])== false){
						tmp++;
						if (tmp == b.length){
							str3[k] = a[i];
							k++;
							tmp=0;
							break;
							}
					}
				}
			}
		}
		return str3;
	}
	
	public static String [] copyMass (String [] str1, String [] str2){
		String [] str3 = new String [str1.length + str2.length];
		System.arraycopy(str1, 0, str3, 0, str1.length);
		System.arraycopy(str2, 0, str3, str1.length, str2.length);
		return str3;
		
	}
	
	
	
	
	

}
