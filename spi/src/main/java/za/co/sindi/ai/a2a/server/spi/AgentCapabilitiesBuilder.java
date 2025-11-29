/**
 * 
 */
package za.co.sindi.ai.a2a.server.spi;

import za.co.sindi.ai.a2a.types.AgentExtension;

/**
 * @author Buhake Sindi
 * @since 26 November 2025
 */
public interface AgentCapabilitiesBuilder {

	public AgentCapabilitiesBuilder streaming(final boolean streaming);
	
	public AgentCapabilitiesBuilder pushNotifications(final boolean pushNotifications);
	
	public AgentCapabilitiesBuilder stateTransitionHistory(final boolean stateTransitionHistory);
	
	public AgentCapabilitiesBuilder extensions(final AgentExtension... extensions);
}
