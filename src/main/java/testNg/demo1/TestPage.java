
package testNg.demo1;

/**
 * @author:Helen
 * @date：2018年4月7日
 * @Description: 百度页面，对象定位和操作，继承BasePage
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestPage extends BasePage{
    public TestPage(WebDriver driver) {
        super(driver);
        // TODO Auto-generated constructor stub
    }

    //关键词输入框
    @FindBy(id="kw")
    private WebElement kw_Element;
    
    //“搜索”按钮
    @FindBy(id="su")
    private WebElement su_Element;
    
    //“登录”按钮
    @FindBy(name="tj_login")
    private WebElement loginBtn;
    
    //“登录”弹出框
    @FindBy(id = "passport-login-pop")
    private WebElement loginPassport_popup1;
    
    //“用户名登录”按钮
    @FindBy(id = "TANGRAM__PSP_10__footerULoginBtnp")
    private WebElement footerULoginBtn;
    
    
    @FindBy(className = "tang-pass-pop-login-merge")
    private WebElement loginPassport_popup2;
    
    //用户名输入框
    @FindBy(className = "pass-text-input pass-text-input-userName open")
    private WebElement usernameInput;
    
    @FindBy(className = "pass-text-input pass-text-input-password")
    private WebElement passwordInput;
    
    //输入关键词
    public void kw_sendkes(String s){
        this.sendkeys(kw_Element, s);
    }
    
    //点击“搜索”按钮
    public void su_click() {
        this.click(su_Element);
    }
    
    public void login(String username, String Password) {
    	this.click(loginBtn);
    	this.waitForElem(loginPassport_popup1);
    	this.click(footerULoginBtn);
    	this.waitForElem(loginPassport_popup2);
    	this.kw_sendkes(username);
    	this.kw_sendkes(Password);
    }
    
}