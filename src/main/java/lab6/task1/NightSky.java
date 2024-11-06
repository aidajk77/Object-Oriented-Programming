package lab6.task1;

import java.util.Random;

public class NightSky {
    private double density;
    private int width;
    private int height;
    private int starsInLastPrint;

    public int starsInLastPrint() {
        return starsInLastPrint;
    }


    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
        this.starsInLastPrint = 0;
    }
    public NightSky(double density) {
        this.density = density;
        this.width = 20;
        this.height = 10;
        this.starsInLastPrint = 0;
    }
    public NightSky(int width, int height) {
        this.width = width;
        this.height = height;
        this.density = 0.1;
        this.starsInLastPrint = 0;
    }
    public void printLine(){
        for(int i=0; i<width; i++){
            double rand = new Random().nextDouble();
            if(rand < this.density){
                System.out.print("*");
                this.starsInLastPrint++;
            }
            else{
                System.out.print(" ");
            }
        }
    }

    public void print(){
        this.starsInLastPrint=0;
        for(int i=0; i<height; i++){
            printLine();
            System.out.println();
        }
    }


}
