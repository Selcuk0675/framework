import Base.BaseTest;
import Pages.AllPages;
import Utilities.ConfigReader;
import org.testng.annotations.Test;

public class TC001 extends BaseTest {

    AllPages allPages=new AllPages();

    @Test
    public void testName() {
       // allPages.mainPage().goToUrl("https://www.hepsiburada.com");
        allPages.mainPage().go_To_Url(ConfigReader.getProperty("baseURL"));
        allPages.mainPage().hoverOverGirisYapButon();
        allPages.loginPage().loginHepsiBurada(ConfigReader.getProperty("UserMail"),ConfigReader.getProperty("UserPassword"));
        allPages.userDashboardPage().verifyValidLogin("Selçuk Uzun");
        allPages.userDashboardPage().searchProduct("robot supurge");


        //1. Kullanıcı girişi yapılarak sepete ürün eklenmesi
// Kullanıcı Hepsiburada.com sitesini ziyaret eder.
// Kullanıcı giriş işlemi yapılır.
// Yönlendirmeden sonra anasayfada kullanıcı giriş işleminin yapıldığı doğrulanır
// Kullanıcı, burada satın almak istediği ürün için arama yapacaktır.
// Kullanıcı, Arama sonucunda ekrana gelen ürün listesinden (veya tek bir sonuç da dönmüş olabilir) ürün seçer.
// Seçilen ürün için 2 tane farklı satıcıdan ürün seçilip sepete eklenir.
// Seçilen ürünün doğru olarak eklendiği 'Sepetim' sayfasında doğrulanmalıdır.

//2. Kullanıcı girişi yapılmadan belirtilen ürünü sepete ekleme
// Kullanıcı Hepsiburada.com sitesini ziyaret eder.
//  Kullanıcı, Arama sonucunda ekrana gelen ürün listesinden (veya tek bir sonuç da dönmüş olabilir) ürün seçer.
// Seçilen ürün için 2 tane farklı satıcıdan ürün seçilip sepete eklenir.
// Seçilen ürünün doğru olarak eklendiği 'Sepetim' sayfasında doğrulanmalıdır.

    }
}
