package builderpattern;

public class Sedan implements CarBuilder{
	
	private CarImpl sedanCar;
	
	public Sedan(){
		this.sedanCar = new CarImpl();
	}

	@Override
	public void buildEngine() {
		sedanCar.setEngine("Used V12 Engine");
		
	}

	@Override
	public void buildTyres() {
		sedanCar.setTyres("Used Normal Tyres");
		
	}

	@Override
	public void buildBody() {
		sedanCar.setBody("Body is 4 Seater");
	}

	@Override
	public CarImpl getCar() {
		// TODO Auto-generated method stub
		return sedanCar;
	}

}
