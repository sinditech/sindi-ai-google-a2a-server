/**
 * 
 */
package za.co.sindi.ai.a2a.server.runtime;

import java.util.Set;

import za.co.sindi.ai.a2a.server.runtime.impl.DefaultAgentCapabilitiesBuilder;
import za.co.sindi.ai.a2a.server.spi.AgentCapabilitiesBuilder;
import za.co.sindi.ai.a2a.server.spi.AgentCardBuilder;
import za.co.sindi.ai.a2a.types.AgentCard;
import za.co.sindi.ai.a2a.types.AgentSkill;

/**
 * @author Buhake Sindi
 * @since 15 November 2025
 */
public abstract class BaseAgentCardBuilder implements AgentCardBuilder {
	
	@Override
	public AgentCardBuilder capabilities(AgentCapabilitiesBuilder capabilitiesBuilder) {
		// TODO Auto-generated method stub
		if (capabilitiesBuilder != null && capabilitiesBuilder instanceof DefaultAgentCapabilitiesBuilder dacb) {
			return capabilities(dacb.build());
		}
		
		return this;
	}

	@Override
	public AgentCardBuilder skills(Set<AgentSkill> skills) {
		// TODO Auto-generated method stub
		if (skills != null && !skills.isEmpty()) {
			skills(skills.toArray(new AgentSkill[skills.size()]));
		}
		return this;
	}

	public abstract AgentCard build();
}
