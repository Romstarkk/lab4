import java.awt.geom.Rectangle2D;

public class Mandelbrot extends FractalGenerator {
public static final int MAX_ITERATIONS=2000;
    private Rectangle2D.Double range;
    public Rectangle2D.Double getRange(){return range;}
    /*метод позволяет генератору фракталов определить наиболее «интересную»
    область комплексной плоскости для конкретного фрактала */
    public void getInitialRange(Rectangle2D.Double range){
        range.x=-2;
        range.y=-1.5;
        range.width=3;
        range.height=3;
        this.range=range;
    }
    public int numIterations(double x, double y){
        int i;
        Complex c= new Complex(x*range.width+range.x,y*range.height+range.y);
        Complex z=new Complex(0,0);
        for(i=0;i<MAX_ITERATIONS && z.modul()<4;i++){
            z=z.um(z).sum(c);

        }
        return i==MAX_ITERATIONS ? -1 : i;
    }
}
