package builderpattern;

public class CarImpl implements Car {

	private String engine;
	private String tyre;
	private String body;

	@Override
	public void setEngine(String engine) {
		this.engine = engine;

	}

	public String getTyre() {
		return tyre;
	}

	public String getEngine() {
		return engine;
	}

	public String getBody() {
		return body;
	}

	@Override
	public void setTyres(String tyre) {
		this.tyre = tyre;

	}

	@Override
	public void setBody(String body) {
		this.body = body;

	}

}
