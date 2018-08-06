//calculate factorial use exceptional objects
package com.apache;

public class Factorial {
	public int getFactorial(int num) throws Exception {
		if (num < 2) {
			throw new Exception("Invalid input exception");//manually throw exception
		}

		{

			int i;
			int fact = 1;
			for (i = 1; i <= num; i++)//calculate exception

				fact = fact * i;

			if (fact > 255) {//if total fact value greter than 255 manually throw exception
				throw new Exception("FactorialException");
			}
			return fact;
		}

	}

}
