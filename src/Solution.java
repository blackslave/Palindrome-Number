/**
 * 將傳入值備份儲存，求解分析如下。
 * 即：將122反轉
 * 先前反轉值0乘10加上122先取10餘數2為2		122先除10，得出12，餘數為2
 * 先前反轉值2乘10加上12先取10餘數2為22		12除10，得出1，餘數為2	
 * 先前反轉值22乘10加上1先取10餘數1為221	1除10，得出0，結束迴圈
 * 以上步驟即可將122反轉為221在比較前後差異，若相同即為迴文。			
 * @author black
 *
 */
public class Solution 
{
	public  boolean isPalindrome(int x)
	{
		if(x<0)		return false;
		if(x==0)	return true;
		int tmp=x;
		int c=0;
		while(x!=0)
		{
			c = c*10 + x%10;
			x = x/10;
		}
		if(c==tmp)	return true;
		else		return false;
	}
}
