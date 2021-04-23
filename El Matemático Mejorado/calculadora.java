public class calculadora
   {
  double a;
  double b;
  double c;
  double hipotenusa;
  double cateto;

 calculadora(){
 a = a;
 b = b;
 c = c;
 }

 String resolverEcuacion(double a, double b, double c){
    String valores;
    double X1;
    double X2;
    X1 = (- b + Math.sqrt((b * b) - 4 * a * c)) / (2 * a);
    X2 = (- b - Math.sqrt((b * b) - 4 * a * c)) / (2 * a);
    valores = "el primer valor de X vale " + X1 + " y el segundo vale " + X2;
    
    return valores;
    }
    
 String ecuaciondelarecta(Punto uno, Punto dos){
    String ecuacion;
    double X;
    double Y;
    double variable;
    X = (dos.getY() - uno.getY());
    Y = - (dos.getX() - uno.getX());
    variable = ((dos.getY() - uno.getY()) * -(uno.getX())) - ((dos.getX() - uno.getX()) * -(uno.getY()));
    ecuacion = "La ecuacion de los puntos es: " + X +"X  " + Y + "Y  " + variable;
    return ecuacion;
    }
    
    double catetofaltante(double Hipo, double Cate){
     hipotenusa = Hipo;
     cateto = Cate;
     double Cateto;
     Cateto = Math.sqrt((Hipo * Hipo) - (Cate * Cate));
     return Cateto;
    }
    
    void setA(double a){
    this.a = a;
    }
  void setB(double b){
    this.b = b ;
    } 
    void setC(double c){
    this.c = c;
    }
       
   
    }
  
 

