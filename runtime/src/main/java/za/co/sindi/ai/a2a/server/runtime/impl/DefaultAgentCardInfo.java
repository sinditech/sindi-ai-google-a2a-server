/**
 * 
 */
package za.co.sindi.ai.a2a.server.runtime.impl;

import java.util.Objects;

import za.co.sindi.ai.a2a.server.runtime.ExtendedAgentCardBuilder;
import za.co.sindi.ai.a2a.server.runtime.PublicAgentCardBuilder;
import za.co.sindi.ai.a2a.server.spi.AgentCardBuilder;
import za.co.sindi.ai.a2a.server.spi.AgentCardInfo;
import za.co.sindi.ai.a2a.types.AgentCard;

/**
 * @author Buhake Sindi
 * @since 16 November 2025
 */
public class DefaultAgentCardInfo implements AgentCardInfo {
	
	private final PublicAgentCardBuilder publicAgentCardBuilder;
	private ExtendedAgentCardBuilder extendedAgentCardBuilder;

	/**
	 * @param publicAgentCardBuilder
	 */
	public DefaultAgentCardInfo(PublicAgentCardBuilder publicAgentCardBuilder) {
		this(publicAgentCardBuilder, null);
	}
	
	/**
	 * @param publicAgentCardBuilder
	 * @param extendedAgentCardBuilder
	 */
	public DefaultAgentCardInfo(PublicAgentCardBuilder publicAgentCardBuilder,
			ExtendedAgentCardBuilder extendedAgentCardBuilder) {
		super();
		this.publicAgentCardBuilder = Objects.requireNonNull(publicAgentCardBuilder, "A public agent card builder is required.");
		this.extendedAgentCardBuilder = extendedAgentCardBuilder;
	}

	@Override
	public AgentCard getPublicAgentCard() {
		// TODO Auto-generated method stub
		return publicAgentCardBuilder.build();
	}

	@Override
	public AgentCardBuilder getPublicAgentCardBuilder() {
		// TODO Auto-generated method stub
		return publicAgentCardBuilder;
	}

	@Override
	public AgentCard getExtendedAgentCard() {
		// TODO Auto-generated method stub
		return extendedAgentCardBuilder == null ? null : extendedAgentCardBuilder.build();
	}

	@Override
	public AgentCardBuilder getExtendedAgentCardBuilder() {
		// TODO Auto-generated method stub
		return extendedAgentCardBuilder;
	}
}
