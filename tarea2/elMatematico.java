
public class elMatematico
{
    int num1, num2,num3;
    public String ordenarNumeros (int num1, int num2, int num3){
        int menor, medio, mayor;
        if ((num1<= num2) && (num1<=num3)){
            menor=num1;
            if  (num2 <=num3){
            medio= num2;
            mayor = num3;
    }else {
        medio = num3;
        mayor = num2;
    }
    }else if ((num2<=num1)&&(num2<num3)){
        menor = num2;
        if (num1<=num3){
            medio= num1;
            mayor= num3;
        }else{
    medio= num3;
    mayor= num1;
     }
    }else {
    menor =num3;
     if (num1<=num2){
    medio= num1;
    mayor =num2;
      }else{
    medio =num2;
    mayor = num1;
   }

   }
    return "El número menor es " + menor+ "  ,el del medio es " + medio+ " y el mayor es " + mayor ;

  }
  
   public int buscarAreaDeUnCuadrado(int base, int altura){
   int area;
   area = (base * altura) ;
   return area;
  }
  
  public double calcularDistanciaDeDosPuntos( int x1,int y1, int x2, int y2){
      double distancia;
    
      distancia= (Math.sqrt((Math.pow(x2-x1,2) + (Math.pow(y2-y1,2)))));
      return distancia;
    }
    
public String obtenerCuadrante (int x, int y){
     String cuadrante;
       if(( x>=0)&&(y>=0)){
         cuadrante = " Se encuentra en el primer cuadrante";
        }
        else {
            cuadrante = "Se encuentra en el tercer cuadrante";
            if ((x<=0)&&(y>=0)){
            cuadrante = "Se encuentra en el segundo cuadrante";
        }
        else if ((x>=0)&&(y<=0)){
            cuadrante = "Se encuentra en el cuarto cuadrante";
        }
  
   } 
    return cuadrante; 
}
}
    
        
    
  
    




  




