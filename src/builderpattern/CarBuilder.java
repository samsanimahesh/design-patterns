package builderpattern;

public interface CarBuilder {
	
	public void buildEngine();
	
	public void buildTyres();
	
	public void buildBody();
	
	public CarImpl getCar();

}
