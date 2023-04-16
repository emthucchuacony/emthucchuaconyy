package bt1;

public  interface  Validation<T>  {	
	boolean validate(T value);
}
class ValidatorEmail implements Validation<String> {

	@Override
	public boolean validate(String value) {
		
		return value.contains("@");
	}
	
}
class ValidatorPhoneNumber implements Validation<String > {	

	@Override
	public boolean validate(String value) {
		// TODO Auto-generated method stub
		return value.matches("^08\\d{8}$");
	
}
}
 class ValidatorMaxLength implements Validation<String> {
 private int maxLength;
 	 public ValidatorMaxLength(int maxLength) {
 		 this.maxLength = maxLength;
 	 }
	@Override
	public boolean validate(String value) {
		// TODO Auto-generated method stub
	return	value.length() <= maxLength;
	}
	
}
 class ValidatorMinLength implements Validation<String> {
 private int minLength;
 	 public ValidatorMinLength(int minLength) {
 		 this.minLength = minLength;
 	 }
	@Override
	public boolean validate(String value) {
		// TODO Auto-generated method stub
	return	value.length() >= minLength;
	}
	
}
class ValidatorMinValue implements Validation<Double> {
	private double minValue;
	public ValidatorMinValue(Double minValue) {
	this.minValue = minValue;
	}
	@Override
	public boolean validate(Double value) {
		// TODO Auto-generated method stub
		return value >= minValue;
	}
}
 class ValidatorMaxValue implements Validation<Double> {
	private double maxValue;
	public ValidatorMaxValue(Double maxValue) {
	this.maxValue = maxValue;
	}
	@Override
	public boolean validate(Double value) {
		// TODO Auto-generated method stub
		return value <= maxValue;
	}
}
 

