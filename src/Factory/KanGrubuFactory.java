/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;

/**
 *
 * @author user
 */
public class KanGrubuFactory {

    public static KanGrubu getKanGrubu(int id, String ad, String Rh, String alir, String verir, String bilgi) {
        if (1==id) {
            return new APozitif(ad, Rh, alir, verir, bilgi);
        } else if (id==2) {
            return new ANegatif(ad, Rh, alir, verir, bilgi);
        }else if (id==3) {
            return new ABPozitif(ad, Rh, alir, verir, bilgi);
        }else if (id==4) {
            return new ABNegatif(ad, Rh, alir, verir, bilgi);
        }else if (id==5) {
            return new BPozitif(ad, Rh, alir, verir, bilgi);
        }else if (id==6) {
            return new BNegatif(ad, Rh, alir, verir, bilgi);
        }else if (id==7) {
            return new OPozitif(ad, Rh, alir, verir, bilgi);
        }else if (id==8) {
            return new ONegatif(ad, Rh, alir, verir, bilgi);
        }
        return null;
    }
}
