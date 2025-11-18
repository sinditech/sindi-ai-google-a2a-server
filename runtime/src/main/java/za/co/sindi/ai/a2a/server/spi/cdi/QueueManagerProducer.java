/**
 * 
 */
package za.co.sindi.ai.a2a.server.spi.cdi;

import jakarta.enterprise.context.ApplicationScoped;
import za.co.sindi.ai.a2a.server.events.InMemoryQueueManager;
import za.co.sindi.ai.a2a.server.events.QueueManager;
import za.co.sindi.commons.utils.Strings;

/**
 * @author Buhake Sindi
 * @since 17 November 2025
 */
public class QueueManagerProducer extends CDIBean<QueueManager> {

	public QueueManagerProducer() {
		super.name("a2a#" + Strings.uncapitalize(QueueManager.class.getSimpleName()))
			 .scope(ApplicationScoped.class)
			 .beanClass(QueueManager.class)
			 .types(QueueManager.class)
			 .produce(_ -> new InMemoryQueueManager());
	}
}
