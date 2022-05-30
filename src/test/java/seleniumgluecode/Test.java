package seleniumgluecode;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class Test extends TestBase{


    @Given("^El usuario se encuentra en la pagina Home de Wikipedia$")
    public void elUsuarioSeEncuentraEnLaPaginaHomeDeWikipedia() throws Throwable {
        Assert.assertTrue(homePage.homePageEsIsDisplay());
    }

    @Given("^Cambia el idioma a Ingles$")
    public void cambiaElIdiomaAIngles() throws Throwable {
        homePage.clickOnEnglish();
    }

    @Given("^Entra en el primer articulo de 'On this days'$")
    public void entraEnElPrimerArticuloDeOnThisDays() throws Throwable {
        homePage.ArticlePage();
        ////*[@id="mp-otd"]/ul/li[1]/b/a
    }

    @When("^Realiza una busqueda de software testing y hace click en el buscador$")
    public void realizaUnaBusquedaDeSoftwareTestingYHaceClickEnElBuscador() throws Throwable {
        articlePage.pageSoftwareTesting();
    }

    @Then("^Se debe redirigir a la pantalla de software testing$")
    public void seDebeRedirigirALaPantallaDeSoftwareTesting() throws Throwable {
        Assert.assertTrue("No se redirecciono correctamente",softwareTestingPage.isTitleDisplayed());
    }

    @Then("^Vuelve a redirigirse a la pagina Home$")
    public void vuelveARedirigirseALaPaginaHome() throws Throwable {
        softwareTestingPage.returnPage();
        Assert.assertTrue(homePage.homePageEnIsDisplay());
    }

}
