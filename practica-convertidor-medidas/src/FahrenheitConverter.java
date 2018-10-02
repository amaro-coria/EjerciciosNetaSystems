
public class FahrenheitConverter implements Convert{

	@Override
	public double convertTo(double source, Measure m) {
		if(m instanceof CelciusMeasure) {
			//Aplicar formula
		}else if(m instanceof ...) {
			return source;
		}
	}

}
