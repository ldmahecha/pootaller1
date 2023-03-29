package ejercicios;

public class circulo {
    private float area;
    public circulo (float area){
        this.area=area;

    }
    
    public float getArea() {
        return area;
    }




    public void setArea(float area) {
        this.area = area;
    }

    

    public void calcularArea(){
        float area=0;
        area=area*area;
        System.out.println("la area del circulo es:"+ area);
    }




   
}

