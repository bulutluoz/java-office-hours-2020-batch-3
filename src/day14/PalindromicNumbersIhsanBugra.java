package day14;

public class PalindromicNumbersIhsanBugra {
	public static void main(String[] args) {
		int num = 0;
        for(int i = 100;i <=999;i++)
        {
            for(int j = i;j <=999;j++)
            {
                int result = i * j;
                StringBuilder sb1 = new StringBuilder(""+result);
                String sb2 = ""+result;
                sb1.reverse();
                if(sb2.equals(sb1.toString()) && num<result) {
                    num = result;
					break;
                }

            }
        }

        System.out.println(num);
	}

}