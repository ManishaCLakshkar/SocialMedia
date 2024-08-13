package sendrequest;

import java.io.IOException;

import org.testng.annotations.Test;

import com.generic.ListenerUtility.BaseClass;
import com.generic.ObjectRepository.HomePage;
import com.generic.ObjectRepository.LoginPage;
import com.generic.ObjectRepository.MessagePAge;

import freemarker.ext.jsp.TaglibFactory.WebInfPerLibJarMetaInfTldSource;

public class VerifyMessage extends BaseClass {
	String projectName;
	ProjectPojo pObj
@Test
public void verifyMsg() throws InterruptedException, IOException {
	String BASEURi =p.getDataProperty("BASEUri");
	
	HomePage h = new HomePage(driver);
	Thread.sleep(2000);
	h.getMessageEdt().click();
	MessagePAge mp= new MessagePAge(driver);
	mp.getUserDemo().click();
	
	
	
	
	
	
	
}
}
