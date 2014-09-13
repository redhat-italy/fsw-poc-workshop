import it.redhat.fsw.domain.Order;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.switchyard.component.test.mixins.cdi.CDIMixIn;
import org.switchyard.component.test.mixins.http.HTTPMixIn;
import org.switchyard.test.Invoker;
import org.switchyard.test.ServiceOperation;
import org.switchyard.test.SwitchYardRunner;
import org.switchyard.test.SwitchYardTestCaseConfig;
import org.switchyard.test.SwitchYardTestKit;


@RunWith(SwitchYardRunner.class)
@SwitchYardTestCaseConfig(config = SwitchYardTestCaseConfig.SWITCHYARD_XML, mixins = {
		CDIMixIn.class, HTTPMixIn.class })
public class MyServiceTest {

	private SwitchYardTestKit testKit;
	private CDIMixIn cdiMixIn;
	private HTTPMixIn httpMixIn;
	
	@ServiceOperation("BusinessProcessService.submitOrder")
	private Invoker service;

	@Test
	public void testNewOperation() throws Exception {
		Order order = new Order();
		order.setOrderId("1");
		order.setCustomerName("name");
		order.setCustomerVAT("12392139012");
		service.sendInOnly(order);

		Assert.assertTrue(true);
	}

}
