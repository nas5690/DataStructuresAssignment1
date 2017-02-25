package edu;

class GravityCalculator {
public static void main(String[] arguments){
double gravity =-9.81; // Earth's gravity in m/s^2 double initialVelocity = 0.0;
double initialVelocity = 0.0;
double finalVelocity = 0.0;
double fallingTime = 10.0;
double initialPosition = 0.0;
double a;
double t;
double vi; 
double xi;
double x;

a = gravity;
t = fallingTime;
vi = initialVelocity;
xi = initialPosition;
x = finalVelocity;
double finalPosition = (0.5)*(a)*((t) * (t)) + vi * t + xi;
System.out.println("The object's position after " + fallingTime + " seconds is " +
finalPosition + " m. ");

} }