/**
 * 
 */
package za.co.sindi.ai.a2a.server.spi.cdi;

import jakarta.enterprise.context.ApplicationScoped;
import za.co.sindi.ai.a2a.server.tasks.InMemoryPushNotificationConfigStore;
import za.co.sindi.ai.a2a.server.tasks.PushNotificationConfigStore;
import za.co.sindi.commons.utils.Strings;

/**
 * @author Buhake Sindi
 * @since 12 May 2025
 */
public class PushNotificationConfigStoreProducer extends CDIBean<PushNotificationConfigStore> {

	public PushNotificationConfigStoreProducer() {
		super.name("a2a#" + Strings.uncapitalize(PushNotificationConfigStore.class.getSimpleName()))
			 .scope(ApplicationScoped.class)
			 .beanClass(PushNotificationConfigStore.class)
			 .types(PushNotificationConfigStore.class)
			 .produce(_ -> new InMemoryPushNotificationConfigStore());
	}
}
