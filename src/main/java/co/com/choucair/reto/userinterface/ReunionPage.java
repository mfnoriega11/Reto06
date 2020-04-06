package co.com.choucair.reto.userinterface;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


public class ReunionPage{

    public static final Target LINK_REUNION = Target.the("Reunion").located(By.xpath("//*[@id='SidebarMenu']/li[6]/a/span"));
    public static final Target LINK_PROGRAMAR_REUNION = Target.the("Boton Reunion").located(By.xpath("//*[@id='SidebarMenu']/li[6]/ul/li[1]/a/span"));
    public static final Target BOTON_NUEVA_REUNION = Target.the("Boton Nuevo").located(By.xpath("//i[@class='fa fa-plus-circle text-green']"));
    public static final Target CAMPO_NOMBRE_REUNION = Target.the("Meeting Name").located(By.name("MeetingName"));
    public static final Target CAMPO_Link_Reunion = Target.the("Link").located(By.xpath(" //div[@id='s2id_StartSharp_Meeting_MeetingDialog12_UnitId']//b"));
    public static final Target CAMPO_Unidad = Target.the("Unidad").located(By.xpath(" //*[@id=\"s2id_autogen8_search\"]"));
    public static final Target Btn_Guardar = Target.the("Meeting Name").located(By.xpath("//span[contains(text(),'Guardar')]"));
    public static final Target Campo_Tefelono = Target.the("Meeting Name").located(By.xpath("//input[@id='StartSharp_Meeting_MeetingDialog12_MeetingN"));








}
