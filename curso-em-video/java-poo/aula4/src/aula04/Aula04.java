package aula04;

public class Aula04 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("NIC", "Amarelo", 0.4f);
        c1.status();
        Caneta c2 = new Caneta("KKK", "Laranja", 1.5f);
        c2.status();
        //c1.setModelo("BIC");
        //c1.setPonta(0.5f);
        //System.out.println("Tenho uma caneta " + c1.getModelo() + " de " + c1.getPonta());
    }
}
