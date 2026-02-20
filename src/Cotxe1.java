public class Cotxe1 {
    private String marca, model;
    private int any;
    private double velocitatActual;

    public Cotxe1(String marca, String model, int any){
        this.marca = marca;
        this.model = model;
        this.any = any;
        this.velocitatActual = 0.0;
    }

    public void accelerar(double vel1){
        velocitatActual += vel1;
    }

    public void frenar(double vel2){
       double resp = velocitatActual - vel2;

        if (validar(resp)){
            velocitatActual = resp;
        }
       else{
            velocitatActual = 0.0;
        }
    }

    public void mostrarInformacio(){
        System.out.println("La marca es: "+ marca + ". El model es: "+ model
        + ". El seu any es: "+ any+ ". La seva velocitat es: "+ velocitatActual);
    }

    private boolean validar(double num){
       boolean resposta = true;
        if (num < 0.0){
            resposta = false;
        }
        return resposta;
    }



}
