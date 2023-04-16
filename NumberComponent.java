package bt1;

public class NumberComponent extends Component {

	public NumberComponent(String content) {
		super(content);
	}

	@Override
	public boolean validate() {
		if (!content.matches("\\d+(\\.\\d+)?")) {
			return false;
		}
		double value = Double.parseDouble(content);
		for (Validation validation : validator) {

			if (!validation.validate(value)) {
				return false;
			}
		}
		return true;
	}

}
