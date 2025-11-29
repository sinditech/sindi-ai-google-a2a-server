/**
 * 
 */
package za.co.sindi.ai.a2a.server.spi;

import za.co.sindi.ai.a2a.types.AgentCard;

/**
 * @author Buhake Sindi
 * @since 15 November 2025
 */
public interface AgentCardInfo {
	
	public AgentCapabilitiesBuilder getAgentCapabilitiesBuilder();
	
	public AgentCard getPublicAgentCard();
	
	public AgentCardBuilder getPublicAgentCardBuilder();
	
	default AgentCard getExtendedAgentCard() {
		throw new UnsupportedOperationException("Method not supported.");
	}
	
	default AgentCardBuilder getExtendedAgentCardBuilder() {
		throw new UnsupportedOperationException("Method not supported.");
	}
}
