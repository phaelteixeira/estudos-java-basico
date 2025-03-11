public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 0;

    public void ligar(){ 
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume(){ 
        volume++;
    }

    public void diminuirVolume(){
        volume--;
    }

    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }

    public void informarCanal(int novoCanal){
        canal = novoCanal;
    }

}