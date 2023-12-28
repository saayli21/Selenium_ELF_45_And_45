package seleniumBasics;

public class varArgsCalculator {

        public int add(int...s)
		{
			int sum = 0;
			for(int a : s)
			{
				sum=sum+a;
			}
			return sum;
		}
		
		public int sub(int a, int b)
		{
			return a-b;
		}

	}



