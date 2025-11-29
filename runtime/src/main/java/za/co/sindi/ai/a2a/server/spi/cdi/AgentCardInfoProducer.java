/**
 * 
 */
package za.co.sindi.ai.a2a.server.spi.cdi;

import jakarta.enterprise.context.ApplicationScoped;
import za.co.sindi.ai.a2a.server.runtime.ExtendedAgentCardBuilder;
import za.co.sindi.ai.a2a.server.runtime.PublicAgentCardBuilder;
import za.co.sindi.ai.a2a.server.runtime.impl.DefaultAgentCardInfo;
import za.co.sindi.ai.a2a.server.spi.AgentCardInfo;
import za.co.sindi.commons.utils.Strings;

/**
 * @author Buhake Sindi
 * @since 29 November 2025
 */
public class AgentCardInfoProducer extends CDIBean<AgentCardInfo> {

	public AgentCardInfoProducer(PublicAgentCardBuilder publicAgentCardBuilder,
			ExtendedAgentCardBuilder extendedAgentCardBuilder) {
		super.name("a2a#" + Strings.uncapitalize(AgentCardInfo.class.getSimpleName()))
			 .scope(ApplicationScoped.class)
			 .beanClass(AgentCardInfo.class)
			 .types(AgentCardInfo.class)
			 .produce(_ -> new DefaultAgentCardInfo(publicAgentCardBuilder, extendedAgentCardBuilder));
	}
}
