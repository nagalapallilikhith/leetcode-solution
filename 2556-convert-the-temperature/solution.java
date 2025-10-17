class Solution {
    public double[] convertTemperature(double celsius) {
        double kelvin=celsius+273.15;
        double fahren=(celsius*1.80)+32.00;
        double res[]=new double[2];
        res[0]=kelvin;
        res[1]=fahren;
        return res;
    }
}
