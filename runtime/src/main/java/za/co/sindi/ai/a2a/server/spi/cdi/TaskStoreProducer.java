/**
 * 
 */
package za.co.sindi.ai.a2a.server.spi.cdi;

import jakarta.enterprise.context.ApplicationScoped;
import za.co.sindi.ai.a2a.server.tasks.InMemoryTaskStore;
import za.co.sindi.ai.a2a.server.tasks.TaskStore;
import za.co.sindi.commons.utils.Strings;

/**
 * @author Buhake Sindi
 * @since 12 May 2025
 */
public class TaskStoreProducer extends CDIBean<TaskStore> {

	public TaskStoreProducer() {
		super.name("a2a#" + Strings.uncapitalize(TaskStore.class.getSimpleName()))
			 .scope(ApplicationScoped.class)
			 .beanClass(TaskStore.class)
			 .types(TaskStore.class)
			 .produce(_ -> new InMemoryTaskStore());
	}
}
