import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MulCalculatorTest{

@Test
public void testMulTest(){

MulCalculator  mycal = new MulCalculator();

int mul = mycal.multiplyNumber(7,8);

assertEquals(56, mul);




}
@Test

public void mulLoopTest(){

MulCalculator  mycall = new MulCalculator();

int mulMul= mycall.mulLoop(7,8);

assertEquals(56, mulMul);
}
@Test

public void mulArray(){

MulCalculator  mySolve = new MulCalculator();

int [] number = {6,10,20,21};

int numbers = mySolve.mulArray(number);

assertEquals(57, numbers);


}

}