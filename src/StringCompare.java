
public class StringCompare {
	public static void main(String[] args) {
		  
        String str1 = "the light";
          
        String str2 = new String(str1);
         
        String str3 = str1.toUpperCase();
 
        //==�����ж��Ƿ���ͬһ���ַ�������
        System.out.println( str1  ==  str2);
         
        System.out.println(str1.equals(str2));//��ȫһ������true
         
        System.out.println(str1.equals(str3));//��Сд��һ��������false
        System.out.println(str1.equalsIgnoreCase(str3));//���Դ�Сд�ıȽϣ�����true
      
    }
}
