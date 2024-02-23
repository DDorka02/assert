package rendezesek1;

public class Teszt {

    public static void assertek() {
        int[] sor1 = {};
        assert rendezettE(Rendezesek.buborekRendezes(sor1)):"Üres sorozatra nem működik"; 
        
        int [] sor2 = {3,5,6};
        assert rendezettE(Rendezesek.buborekRendezes(sor2)):"Szigorúan monoton növekvő sorozatra nem működik";   
        
        int[] sor3 = {3, 5, 5, 6};
        assert rendezettE(Rendezesek.buborekRendezes(sor3)):"Monoton sorozatra nem működik";
        
        int[] sor4 = {13, 5, -5, -6};
        assert rendezettE(Rendezesek.buborekRendezes(sor4)):"Csökkenő sorozatra nem működik";
        
        int[] sor5 = {10, 2, 14};
        assert rendezettE(Rendezesek.buborekRendezes(sor5)):"Völgy típusú sorozatra nem működik";
        
        int[] sor6 = {10, 42, 14};
        assert rendezettE(Rendezesek.buborekRendezes(sor6)):"Hegy típusú sorozatra nem működik";
        
        int[] sor7 = {13, 5,5,6};
        assert rendezettE(Rendezesek.buborekRendezes(sor7)):"Az első nagyobb, a többi rendezett sorozatra nem működik";
        
        int[] sor8 = {13, 55, 75, 6};
        assert rendezettE(Rendezesek.buborekRendezes(sor8)):"Az utolsó kisebb, a többi rendezett sorozatra nem működik";
        
        int[] sor9 = {13, 55, 35, 46};
        assert rendezettE(Rendezesek.buborekRendezes(sor9)):"Hegy-völgy típusú sorozatra nem működik";
        
        int[] sor10 = {13, -5, 35, 16, 45, 0};
        assert rendezettE(Rendezesek.buborekRendezes(sor10)):"Völgy-hegy típusú sorozatra nem működik";
    }
    
    public static boolean rendezettE(int[] sor) {
        int i = 0;
        while(i < sor.length-1 && sor[i] <= sor[i+1]){
        i++;}
        return i >= sor.length-1;
        
        
    }
    
}
