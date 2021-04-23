public class Matematico
{
    private double a;
    private double b;
    private double c;
    private double Hipo;
    private double Cate;
    String resolverecuacion(calculadora uno, double a, double b, double c){
       String resp;
        resp = uno.resolverEcuacion(a, b, c);
       return resp;
    }
    
    String ecuaciondelarecta(calculadora uno, Punto un, Punto dos){
    String resp;
    resp = uno.ecuaciondelarecta(un, dos);
    return resp;
    }
    
    double hallarcateto(calculadora uno, double Hipo, double Cate){
    double resp;
    resp = uno.catetofaltante(Hipo, Cate);
    return resp;
    }
}