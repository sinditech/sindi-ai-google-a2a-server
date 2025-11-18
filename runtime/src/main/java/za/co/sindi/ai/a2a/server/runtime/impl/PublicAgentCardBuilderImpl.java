/**
 * 
 */
package za.co.sindi.ai.a2a.server.runtime.impl;

import java.util.List;
import java.util.Map;

import za.co.sindi.ai.a2a.server.runtime.PublicAgentCardBuilder;
import za.co.sindi.ai.a2a.types.AgentCapabilities;
import za.co.sindi.ai.a2a.types.AgentCard;
import za.co.sindi.ai.a2a.types.AgentCardSignature;
import za.co.sindi.ai.a2a.types.AgentInterface;
import za.co.sindi.ai.a2a.types.AgentProvider;
import za.co.sindi.ai.a2a.types.AgentSkill;
import za.co.sindi.ai.a2a.types.SecurityScheme;
import za.co.sindi.ai.a2a.types.TransportProtocol;

/**
 * @author Buhake Sindi
 * @since 16 November 2025
 */
public class PublicAgentCardBuilderImpl extends PublicAgentCardBuilder {

	private za.co.sindi.ai.a2a.types.AgentCard.AgentCardBuilder builder = new za.co.sindi.ai.a2a.types.AgentCard.AgentCardBuilder();
	
	@Override
	public PublicAgentCardBuilder protocolVersion(String protocolVersion) {
		// TODO Auto-generated method stub
		builder.protocolVersion(protocolVersion);
		return this;
	}

	@Override
	public PublicAgentCardBuilder name(String name) {
		// TODO Auto-generated method stub
		builder.name(name);
		return this;
	}

	@Override
	public PublicAgentCardBuilder description(String description) {
		// TODO Auto-generated method stub
		builder.description(description);
		return this;
	}

	@Override
	public PublicAgentCardBuilder url(String url) {
		// TODO Auto-generated method stub
		builder.url(url);
		return this;
	}

	@Override
	public PublicAgentCardBuilder preferredTransport(TransportProtocol preferredTransport) {
		// TODO Auto-generated method stub
		builder.preferredTransport(preferredTransport);
		return this;
	}

	@Override
	public PublicAgentCardBuilder additionalInterfaces(AgentInterface... additionalInterfaces) {
		// TODO Auto-generated method stub
		builder.additionalInterfaces(additionalInterfaces);
		return this;
	}

	@Override
	public PublicAgentCardBuilder iconUrl(String iconUrl) {
		// TODO Auto-generated method stub
		builder.iconUrl(iconUrl);
		return this;
	}

	@Override
	public PublicAgentCardBuilder provider(AgentProvider provider) {
		// TODO Auto-generated method stub
		builder.provider(provider);
		return this;
	}

	@Override
	public PublicAgentCardBuilder version(String version) {
		// TODO Auto-generated method stub
		builder.version(version);
		return this;
	}

	@Override
	public PublicAgentCardBuilder documentUrl(String documentUrl) {
		// TODO Auto-generated method stub
		builder.documentUrl(documentUrl);
		return this;
	}

	@Override
	public PublicAgentCardBuilder capabilities(AgentCapabilities capabilities) {
		// TODO Auto-generated method stub
		builder.capabilities(capabilities);
		return this;
	}

	@Override
	public PublicAgentCardBuilder securitySchemes(Map<String, ? extends SecurityScheme> securitySchemes) {
		// TODO Auto-generated method stub
		builder.securitySchemes(securitySchemes);
		return this;
	}

	@SuppressWarnings("unchecked")
	@Override
	public PublicAgentCardBuilder security(List<Map<String, String[]>> security) {
		// TODO Auto-generated method stub
		builder.security(security.toArray(new Map[security.size()]));
		return this;
	}

	@Override
	public PublicAgentCardBuilder defaultInputModes(String... defaultInputModes) {
		// TODO Auto-generated method stub
		builder.defaultInputModes(defaultInputModes);
		return this;
	}

	@Override
	public PublicAgentCardBuilder defaultOutputModes(String... defaultOutputModes) {
		// TODO Auto-generated method stub
		builder.defaultOutputModes(defaultOutputModes);
		return this;
	}

	@Override
	public PublicAgentCardBuilder skills(AgentSkill... skills) {
		// TODO Auto-generated method stub
		builder.skills(skills);
		return this;
	}

	@Override
	public PublicAgentCardBuilder signatures(AgentCardSignature... signatures) {
		// TODO Auto-generated method stub
		builder.signatures(signatures);
		return this;
	}

	@Override
	public PublicAgentCardBuilder supportsAuthenticatedExtendedCard(boolean supportsAuthenticatedExtendedCard) {
		// TODO Auto-generated method stub
		builder.supportsAuthenticatedExtendedCard(supportsAuthenticatedExtendedCard);
		return this;
	}

	@Override
	public AgentCard build() {
		// TODO Auto-generated method stub
		return builder.build();
	}
}
