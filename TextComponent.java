package bt1;

public class TextComponent extends Component {
	public TextComponent(String content) {
		super(content);
	}

	@Override
	public boolean validate() {
		for (Validation vali : validator) {
			if (!vali.validate(this.content)) {
				return false;

			}

		}
		return true;
	}
}
