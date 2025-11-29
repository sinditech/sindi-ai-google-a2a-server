/**
 * 
 */
package za.co.sindi.ai.a2a.server.runtime.impl;

import za.co.sindi.ai.a2a.server.spi.AgentCapabilitiesBuilder;
import za.co.sindi.ai.a2a.types.AgentCapabilities;
import za.co.sindi.ai.a2a.types.AgentExtension;

/**
 * @author Buhake Sindi
 * @since 27 November 2025
 */
public class DefaultAgentCapabilitiesBuilder implements AgentCapabilitiesBuilder {

	private Boolean streaming;
	private Boolean pushNotifications;
	private Boolean stateTransitionHistory;
	private AgentExtension[] extensions;
	
	@Override
	public AgentCapabilitiesBuilder streaming(boolean streaming) {
		// TODO Auto-generated method stub
		this.streaming = streaming;
		return this;
	}

	@Override
	public AgentCapabilitiesBuilder pushNotifications(boolean pushNotifications) {
		// TODO Auto-generated method stub
		this.pushNotifications = pushNotifications;
		return this;
	}

	@Override
	public AgentCapabilitiesBuilder stateTransitionHistory(boolean stateTransitionHistory) {
		// TODO Auto-generated method stub
		this.stateTransitionHistory = stateTransitionHistory;
		return this;
	}

	@Override
	public AgentCapabilitiesBuilder extensions(AgentExtension... extensions) {
		// TODO Auto-generated method stub
		this.extensions = extensions;
		return this;
	}

	public AgentCapabilities build() {
		return new AgentCapabilities(streaming, pushNotifications, stateTransitionHistory, extensions);
	}
}
