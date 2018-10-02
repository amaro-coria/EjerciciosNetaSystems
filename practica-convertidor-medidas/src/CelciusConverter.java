
public class CelciusConverter implements Convert{

	@Override
	public double convertTo(double source, Measure m) {
		if(m instanceof FahrenheitMeasue) {
			///aplicar regla de multiplicacion
		}else {
			return source;
		}
	}

}
