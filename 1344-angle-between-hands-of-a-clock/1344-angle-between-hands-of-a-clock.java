class Solution {
    public double angleClock(int hour, int minutes) {
       double hrang=30*(hour%12)+0.5*minutes;
       double mang=6*minutes;
       double ang=Math.abs(hrang-mang);
       return Math.min(ang,360-ang);
    }
}