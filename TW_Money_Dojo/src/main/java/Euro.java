import java.util.HashMap;
import java.util.Map;

public class Euro {

    Double euroAmount = null;

    Map<Double, Double> matchingEuroObjects = new HashMap<Double, Double>();

    public Double getEuroAmount() {
        return euroAmount;
    }

    public void setEuroAmount(Double euroAmount) {
        this.euroAmount = euroAmount;
    }
}
