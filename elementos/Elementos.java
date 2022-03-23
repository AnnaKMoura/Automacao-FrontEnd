package elementos; //*[@id= 'downshift-2-input']

import org.openqa.selenium.By;

public class Elementos {

	private By cookies = By.id("cookiescript_accept");
	private By minhaConta = By.className("polishop-io-header-0-x-HorizontalHeaderItemTxt");
	private By login = By.xpath("//*[@class= 'center polishop-io-orders-0-x-OrderLoginBtn polishop-io-orders-0-x-OrderLoginBtnLogin']");
	private By entrar = By.xpath("//*[@class= 'vtex-button bw1 ba fw5 v-mid relative pa0 lh-solid br2 min-h-regular t-action bg-action-secondary b--action-secondary c-on-action-secondary hover-bg-action-secondary hover-b--action-secondary hover-c-on-action-secondary pointer ']");
	private By email = By.xpath("//*[@class= 'vtex-styleguide-9-x-input ma0 border-box vtex-styleguide-9-x-hideDecorators vtex-styleguide-9-x-noAppearance br2   w-100 bn outline-0 bg-base c-on-base b--muted-4 hover-b--muted-3 t-body ph5 ']");
	private By senha = By.cssSelector("body > div.render-container.render-route-store-custom-pedidos > div > div.vtex-store__template.bg-base > div > div:nth-child(6) > div > div > div.polishop-io-orders-0-x-OrdersLoginOptionsWrapper > div > div:nth-child(2) > div > div > div.vtex-login-2-x-contentForm.dn.vtex-login-2-x-contentFormVisible.db.ph4 > div > div > form > div.vtex-login-2-x-inputContainer.vtex-login-2-x-inputContainerPassword.pv3.flex.flex-column > div > label > div > input");
	private By logar = By.xpath("//*[@class= 'vtex-button__label flex items-center justify-center h-100 ph5 ']");
	private By confirmacao = By.xpath("//*[@class= 'polishop-io-header-0-x-LoginSituation polishop-io-header-0-x-StatusOnline']");
	private By textoRetorno = By.xpath("//*[@class= 'vtex-login-2-x-formError bg-danger--faded t-small tc pa1 mv1 mh0']");
	
	public By getMinhaConta() {
		return minhaConta;
	}

	public By getCookies() {
		return cookies;
	}

	public By getLogin() {
		return login;
	}

	public By getEntrar() {
		return entrar;
	}

	public By getEmail() {
		return email;
	}

	public By getSenha() {
		return senha;
	}

	public By getLogar() {
		return logar;
	}

	public By getConfirmacao() {
		return confirmacao;
	}

	public By getTextoRetorno() {
		return textoRetorno;
	}

}
