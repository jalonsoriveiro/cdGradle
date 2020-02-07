import org.jsoup.Jsoup;
import java.io.IOException;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class ElTiempo {
    public static void main(String[]args) throws IOException {
        Document doc = Jsoup.connect("https://weather.com/es-ES/tiempo/hoy/l/SPXX0084:1:SP").userAgent("Mozilla").get();
        Elements miTemperatura = doc.getElementsByClass("today_nowcard-temp");
        Elements miEstadoNu = doc.getElementsByClass("today_nowcard-phrase");
        Elements miEstadoTiempo = doc.getElementsByClass("today_nowcard-feels");
        String Titulo = doc.title();
        String Temperatura = miTemperatura.text();
        String TIempo = miEstadoTiempo.text();
        System.out.println("Titulo "+Titulo + "Temperatura "+Temperatura+" Tiempo"+TIempo);
    }
}
