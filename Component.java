package bt1;

import java.util.ArrayList;

public abstract class Component {
	protected String content;
	protected ArrayList<Validation> validator;
	public Component(String content) {
		super();
		this.content = content;
		this.validator = new ArrayList<Validation>();
	}
	public void addValidator(Validation Validator) {
		this.validator.add(Validator);
	}
	public abstract boolean validate();
	}

