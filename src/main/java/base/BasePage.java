

public void selectDropdown(WebElement locator, String text) 
	{
		waitForElementVisible(locator, 15);
		Assert.assertTrue(isElementPresent(locator),"Element Locator :"+locator+" Not found");
		new Select(locator).selectByVisibleText(text);
	}

public void selectDropdown(WebElement locator, int index) 
	{
		waitForElementVisible(locator, 15);
		Assert.assertTrue(isElementPresent(locator),"Element Locator :"+locator+" Not found");
		new Select(locator).selectByIndex(index);
	}



public void sendKeys(WebElement locator, String text) 
	{	
		waitForElementVisible(locator, 15);
		Assert.assertTrue(isElementPresent(locator), "Element Locator :"+locator+" Not found");
		locator.clear();
		locator.sendKeys(text);
	}

	public void sendKeys(WebElement locator, Keys key) 
	{	
		waitForElementVisible(locator, 15);
		Assert.assertTrue(isElementPresent(locator), "Element Locator :"+locator+" Not found");
		locator.sendKeys(key);
	}
