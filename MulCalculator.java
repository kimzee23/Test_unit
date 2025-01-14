public class MulCalculator{

public int  multiplyNumber(int firstNumber, int secondNumber){

	return( firstNumber * secondNumber);
	

}

public int mulLoop(int firstNumber, int secondNumber){

int total = 0;

for(int counter = 1; counter <= secondNumber; counter++){
total += firstNumber;

}

return total;

}


public int mulArray(int[] numbers){

 int total =0;


for(int nono = 0; nono < numbers.length; nono ++){
total += numbers[nono];

}

return total;

}
}