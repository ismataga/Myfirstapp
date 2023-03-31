package Aqil.Bootcamp1.tasks;

import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Test {
    public static void main(String[] args) throws Exception {
        URL imageLocation = new URL("https://upload.wikimedia.org/wikipedia/commons/3/35/Svln_svln4821_ordubad_me_best_top_photography_resimleri_sekilleri_photos_creative_profil_maraqli_sekil_resim_fotograflari_fotograf_ornek_resimler_%28268%29.JPG");
        JOptionPane.showMessageDialog(null, "Hello", "Title",
                JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
        System.exit(0);
    }
}