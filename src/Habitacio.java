public class Habitacio {
    private int num;
    private boolean disponible;

    public Habitacio(int num){
        this.num = num;
        disponible = true;
    }

    public void reservar(){
        disponible = false;
    }

    public void alliberar(){
        disponible = true;
    }

    public boolean disponibilitat(){
        return disponible;
    }

    public int getNum(){
        return num;
    }

}
