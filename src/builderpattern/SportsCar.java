package builderpattern;

public class SportsCar implements CarBuilder{
	
	private CarImpl sportsCar;
	
	public SportsCar(){
		this.sportsCar = new CarImpl();
	}

	@Override
	public void buildEngine() {
		sportsCar.setEngine("Used V12 Turbocharged engine");
		
	}

	@Override
	public void buildTyres() {
		sportsCar.setTyres("Used Tubeless Tyres");
		
	}

	@Override
	public void buildBody() {
		sportsCar.setBody("Body is 2 seater Sports Type");
		
	}
	
	@Override
	public CarImpl getCar() {
		// TODO Auto-generated method stub
		return sportsCar;
	}

}

