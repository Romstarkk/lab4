public class Complex{
    public double x,y;
    public Complex(double x, double y) {
        this.x=x;
        this.y=y;
    }
    public Complex sum(Complex z){//сложение
        return new Complex(this.x+z.x,this.y+z.y);
    }
    public Complex um(Complex z){//умножение
        return new Complex(this.x*z.x-this.y*z.y,this.x*z.y+z.x*this.y);
    }
    public double modul(){//модуль
        return x*x+y*y;
    }
}



/*public class Z {
    double Re;
    double Im;
    public Z(){Re=0;Im=0;}
    public Z(double x,double y){Re=x;Im=y;}
    public Z pow2()//возведение комплексного числа в квадрат
    {
        Z in=this;
       Z ret=new Z();
       ret.Re=in.Re* in.Re- in.Im*in.Im;
       ret.Im=2*in.Re*in.Im;
       return ret;
    }
    public double mod_mod(){
        Z in=this;
        double ret=0;
        ret=in.Re*in.Re+in.Im*in.Im;
        return ret;
    }
    public Z sum(Z a,Z b){
        Z ret=new Z();
        ret.Re=a.Re+b.Re;
        ret.Im=a.Im+b.Im;
        return ret;
    }
}
*/
