package edu.xavier.csci;
public class CalculatorTest{

	@Test
	public viod AppTest(){
		Calculator test1 = new Calculator();
		int result1 = test1.AddTo(4);
		assertEquals(4, result1);
		}
        public viod AppTest(){
                Calculator test2 = new Calculator();
                int result2 = test2.AddTo(4,5);
                assertEquals(9, result);
                }
        public viod AppTest(){
                Calculator test3 = new Calculator();
                int result3 = test3.AddTo(4,5,7);
                assertEquals(16, result);
                }
        public viod AppTest(){
                Calculator test4 = new Calculator();
                int result4 = test4.AddTo();
                assertEquals(null, result);
                }
	}
