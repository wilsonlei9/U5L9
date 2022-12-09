public class TrackCapuchin {
    private double xMonkey;
    private double yMonkey;
    private double xFood;
    private double yFood;

    public TrackCapuchin(int xFood, int yFood)
    {
        xMonkey = 0;
        yMonkey = 0;
        this.xFood = xFood;
        this.yFood = yFood;
    }

    public double getxMonkey() {
        return xMonkey;
    }

    public double getyMonkey() {
        return yMonkey;
    }

    public double getxFood() {
        return xFood;
    }

    public double getyFood() {
        return yFood;
    }

    public void moveMonkey(double x, double y)
    {
        xMonkey += x;
        yMonkey += y;
    }

    public double calcFoodDistance()
    {
        double foodDistance = Math.sqrt(Math.pow(xFood - xMonkey, 2) + Math.pow(yFood - yMonkey, 2));
        return foodDistance;
    }

    public boolean isCloserThan(TrackCapuchin other)
    {
        if(this.calcFoodDistance() < other.calcFoodDistance())
        {
            return true;
        }
        else {
            return false;
        }
    }
}
