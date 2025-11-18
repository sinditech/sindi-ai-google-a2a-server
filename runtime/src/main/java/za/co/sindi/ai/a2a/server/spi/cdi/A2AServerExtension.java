/**
 * 
 */
package za.co.sindi.ai.a2a.server.spi.cdi;

import jakarta.enterprise.event.Observes;
import jakarta.enterprise.inject.spi.AfterBeanDiscovery;
import jakarta.enterprise.inject.spi.BeanManager;
import jakarta.enterprise.inject.spi.Extension;

/**
 * @author Buhake Sindi
 * @since 17 November 2025
 */
public class A2AServerExtension implements Extension {

	void register(@Observes final AfterBeanDiscovery afterBeanDiscovery, final BeanManager beanManager) {
		
		afterBeanDiscovery.addBean(new PushNotificationConfigStoreProducer());
		afterBeanDiscovery.addBean(new QueueManagerProducer());
		afterBeanDiscovery.addBean(new TaskStoreProducer());
	}
}
