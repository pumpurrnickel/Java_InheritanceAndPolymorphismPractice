import java.util.ArrayList;

public class ChangeHistory {

    private ArrayList<Double> historyList;

    public ChangeHistory() {
        this.historyList = new ArrayList<>();
    }

    public void add(double status) {
        historyList.add(status);
    }

    public void clear() {
        historyList.clear();
    }

    public double maxValue() {
        double maxValue = 0;
        for (Double line : historyList) {
            if (maxValue < line) {
                maxValue = line;
            }
        }
        return maxValue;
    }

    public double minValue() {
        if (historyList.size() == 0) {
            return 0;
        }
        double minValue = 100_000_000.00;
        for (double line : historyList) {
            if (minValue > line) {
                minValue = line;
            }
        }
        return minValue;
    }

    public double average() {
        double sum = 0.0;
        int count = 0;
        for (double line : historyList) {
            sum += line;
            count++;
        }
        return (sum / count);
    }
    

    @Override
    public String toString() {
        return historyList.toString();
    }
}