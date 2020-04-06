package co.com.choucair.reto.userinterface;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


public class OrganizacionPage {



    public static final Target LINK_ORGANIZACION = Target.the("Boton Organizacion").located(By.xpath("//*[@id='SidebarMenu']/li[7]/a/span"));
    public static final Target LINK_UNIDADES_DE_NEGOCIO = Target.the("Boton Unidades De Negocio").located(By.xpath("//*[@id='SidebarMenu']/li[7]/ul/li[1]/a/span"));
    public static final Target BOTON_NUEVA_UNIDAD_DE_NEGOCIO = Target.the("Boton Busines Unit").located(By.xpath("//i[@class='fa fa-plus-circle text-green']"));
    public static final Target CAMPO_NOMBRE = Target.the("Campo Name").located(By.name("Name"));
    public static final Target LISTA_UNIDAD_PADRE = Target.the("Campo Name").located(By.xpath("//*[@id=\"select2-chosen-31\"]"));
    public static final Target CAMPO_BUSCAR_UNIDAD_PADRE = Target.the("Campo Name").located(By.xpath("//input[@id='s2id_autogen2_search'"));
    public static final Target CAMPO_RESULTADO_UNIDAD_PADRE = Target.the("Campo Name").located(By.xpath("//ul[@id='select2-results-1']"));
    public static final Target Boton_Guardar = Target.the("Boton Guardar").located(By.xpath("//i[@class='fa fa-floppy-o text-purple']"));


}

