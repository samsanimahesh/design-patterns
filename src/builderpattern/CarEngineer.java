package builderpattern;

public class CarEngineer {
	
	private CarBuilder carBuilder;
	
	public CarEngineer(CarBuilder cBuilder) {
		this.carBuilder = cBuilder;
	}
	
	public void makeCar(){
		this.carBuilder.buildBody();
		this.carBuilder.buildEngine();
		this.carBuilder.buildTyres();
		
	}
	public CarImpl getCar(){
		return this.carBuilder.getCar();
	}

}
