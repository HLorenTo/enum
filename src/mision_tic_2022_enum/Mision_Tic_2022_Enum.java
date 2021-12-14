package mision_tic_2022_enum;
public class Mision_Tic_2022_Enum {
    enum Continente {
        AFRICA(54),
        EUROPA(50),
        ASIA(49),
        OCEANIA(35),
        AMERICA(15);
        private int numeroDePaises;
        Continente(int numeroDePaises){
            this.numeroDePaises=numeroDePaises;
        }
        public int getNumeroDePaises(){
            return numeroDePaises;
        }
    }
    public static void main(String[] args) {
            Continente myVar = Continente.AFRICA;
            System.out.println(myVar.getNumeroDePaises());
    }
    
}
