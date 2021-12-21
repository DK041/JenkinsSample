package org.testng;

import java.io.IOException;

import org.baseclass.BaseClass;
import org.baseclass.PojoClass;
import org.testng.annotations.Test;

public class sample extends BaseClass{

	@Test(groups="Regression")
	  private void tc2() throws IOException {
	    launchChrome();
	    loadUrl("https://www.facebook.com/");
	    winMax();
	    PojoClass p = new PojoClass();
	    fill(p.getTxtUser(),getData(0, 1));
	    fill(p.getTxtPass(),getData(0, 2));
	    System.out.println("Test2");
	    btnClick(p.getBtnLogin());
	    
	  }
	  
	  @Test(groups="Regression")
	  private void tc3() throws IOException {
	    launchChrome();
	    loadUrl("https://www.facebook.com/");
	    winMax();
	    PojoClass p = new PojoClass();
	    fill(p.getTxtUser(),getData(2, 1));
	    fill(p.getTxtPass(),getData(2, 2));
	    System.out.println("Test3");
	    btnClick(p.getBtnLogin());
	    
	  }
	  
	  @Test(groups="Sanity")
	  private void tc4() throws IOException {
	    launchChrome();
	    loadUrl("https://www.facebook.com/");
	    winMax();
	    PojoClass p = new PojoClass();
	    fill(p.getTxtUser(),getData(2, 1));
	    fill(p.getTxtPass(),getData(2, 2));
	    System.out.println("Test1");
	    btnClick(p.getBtnLogin());
	  }
}
