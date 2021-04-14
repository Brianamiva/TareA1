

public class Pintura
{
   private String color1;
   private String color2;
   private String color3;
   private int ancho;
   private int largo;
   Pintura(String color1, String color2, String color3, int ancho, int largo){
       this.color1=color1;
       this.color2=color2;
       this.color3=color3;
       this.ancho= ancho;
       this.largo=largo;
    }
    String getColor1(){
        return color1;
    }
    void setColor1(String color1){
        this.color1 = color1;
    }
    String getColor2(){
        return color2;
    }
    void setColor2(String color2){
        this.color2 = color2;
    }
    void setColor3(String color3){
        this.color3 = color3;
    }
    String getColor3(){
        return color3;
    }
    int getAncho(){
        return ancho;
    }
    void setAncho(int ancho){
        ancho = ancho;
    }
    int getLargo(){
        return largo;
    }
    void setLargo(int largo){
        this.largo = largo;
    }

}
