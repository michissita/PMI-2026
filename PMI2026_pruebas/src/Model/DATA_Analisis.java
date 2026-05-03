package Model;
import java.util.Map;
import java.util.HashMap;

public class DATA_Analisis {
    Map<Integer, String> tipos = new HashMap();
   
    public DATA_Analisis(){
        tipos.put(1, "Tipo de Sangre");
        tipos.put(2, "Glucosa");
        tipos.put(3, "Orina");
        tipos.put(4, "Colesterol");
        tipos.put(5, "Calcio");
        tipos.put(6, "Creatinina");
        tipos.put(7, "TSH");
        tipos.put(8, "Trigliceridos");
        tipos.put(9, "Radiografia");
        tipos.put(10, "Resonancia");
        tipos.put(11, "VIH");
        tipos.put(12, "Sifilis");
    }
   
}
