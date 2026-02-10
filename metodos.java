import java.util.Scanner;
public class metodos {
    public objVehiculo[]llenarRegistro (objVehiculo[]r){
    
        for(int i=0; i < r.length; i++){
        objVehiculo o = new objVehiculo();
            System.out.println("ingrese la marca");
        o.setmarca(sc.next());
        System.out.println("ingrese el tipo");
        o.setCelda(Sc.next());
        System.out.println("ingrese el cilindraje");
        o.setCilindraje(Sc.next());
        System.out.println("ingrese el pago actual");
        o.setPago_actual(sc.next());
        System.out.println("ingrese el pago anterior");
        o.setPago_anterior(sc.next());
        
         
    if(o.getCilindraje()>900 && o.getCilindraje()<1700){

    }
    else if (o.getCilindraje()>=1700 && o.getCilindraje()<2000){

    }else{
        o.setPago_anterior(Pago_anterior:250.000);
    }
    o.setCelda(i+ 1);
    r[1]=o;

        }


   return r;
   public objVehiculo[] calcularpago_actual(objVehiculo[]r)
   {
for(int i=0; i < r.length; i++){
  r[i].setPago_actual((r[i].getPago_anterior()*23));
   }
return r;

}
public void mostrarRegristro(objVehiculo[]r)
   {

     
     System.out.println("marca"+ r [i]get.getMarca());
     System.out.println("celda"+ r [i]get.celda());
     System.out.println("cilindraje"+ r [i]get.cilindraje());
     System.out.println("tipo"+ r [i]get.tipo());
     System.out.println("pago actual"+ r [i]get.pago_actual());
     System.out.println("pago anterior"+ r [i]get.pago_anterior());
     
     

  }
}



