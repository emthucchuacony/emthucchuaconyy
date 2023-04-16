	package bt1;

public class Test {
	
	 private TextComponent text = new TextComponent("thuc@gmail.com");
	 private NumberComponent number = new NumberComponent("0812131313.");
	 public void testIsEmail() {
		 text.addValidator(new ValidatorEmail());
		 System.out.println(text.validate());
	 }
	 public void testisPhoneNumber() {
		 number.addValidator(new ValidatorPhoneNumber());
		 System.out.println(number.validate());
	 }
	 public void testIsNumber() {
		 System.out.println(number.validate());
	 } 	
	 public void testRangeEmail() {
		 text.addValidator(new ValidatorMinLength(1));
		 text.addValidator(new ValidatorMaxLength(20));
		 System.out.println(text.validate());
	 }
	 public void testRangeNumber() {
		 number.addValidator(new ValidatorMinValue(1.0));
		 number.addValidator(new ValidatorMaxValue(50000.0));
		System.out.println( number.validate());
	 }
	public static void main(String[] args) {
			Test test = new Test();
		
		test.testIsNumber();
		test.testisPhoneNumber();
		
		
		
		
	}

}
