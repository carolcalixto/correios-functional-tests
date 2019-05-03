package com.carolsmanioto.com.correiosfunctionaltests.pages;

import com.carolsmanioto.com.correiosfunctionaltests.base.BaseSelenium;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BuscaCepEnderecoIT extends BaseSelenium {
	
	private final static String PAGE_URL = "http://www.buscacep.correios.com.br/sistemas/buscacep/BuscaCepEndereco.cfm";
	
	@FindBy(name = "relaxation")
	private WebElement enderecoOuCEP;
	
	@FindBy(name = "tipoCEP")
	private WebElement tipoCEP;
	
	@Test
	public void validarPagina() {
		driver.get(PAGE_URL);
		
		Assert.assertEquals(PAGE_URL, driver.getCurrentUrl());
	}
	
	@Test
	public void buscarCEPValido() {
		driver.get(PAGE_URL);
		enderecoOuCEP.sendKeys("13457-638");
		enderecoOuCEP.submit();
	}
	
	@Test
	public void buscarPorEndereco() {
		driver.get(PAGE_URL);
		enderecoOuCEP.sendKeys("Rua Tunisia Americana");
		new Select(tipoCEP).selectByValue("LOG");
		enderecoOuCEP.submit();
	}
	
}

