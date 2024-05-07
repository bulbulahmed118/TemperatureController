public class RangeInput {
    private int maxTemperature;
    private int minTmperature;
    private int currentTemperature;

    public RangeInput(){
        minTmperature = 60;
        maxTemperature = 80;
        calculateTemperature();
    }
    private RangeInput(int min,int max){
        minTmperature = min;
        maxTemperature = max;
        calculateTemperature();
    }
    public void calculateTemperature(){
        currentTemperature = (minTmperature + maxTemperature)/2;
    }
    public void up(){
        currentTemperature = Math.min(currentTemperature + 1,maxTemperature);
    }
    public void down(){
        currentTemperature = Math.max(currentTemperature - 1,minTmperature);
    }
    public int getCurrentTemperature(){
        return currentTemperature;
    }
}

