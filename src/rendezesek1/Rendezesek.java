package rendezesek1;

public class Rendezesek {
    //rendezések
    public static int[] buborekRendezes(int[] sorozat) {
        
        int c = 0;
        for (int i = sorozat.length -1; i > 1;i++){
            for (int j = 0; j < i-1 ;j++){
                if(sorozat[j]> j+1){
                    c = sorozat[j];
                    sorozat[j] = sorozat[j]+1;
                    sorozat[j] = c;
                }
            }
            
                }
        return sorozat;
    }
    
}
