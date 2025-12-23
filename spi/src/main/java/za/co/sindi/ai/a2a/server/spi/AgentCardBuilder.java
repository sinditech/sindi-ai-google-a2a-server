/**
 * 
 */
package za.co.sindi.ai.a2a.server.spi;

import java.util.List;
import java.util.Map;
import java.util.Set;

import za.co.sindi.ai.a2a.types.AgentCapabilities;
import za.co.sindi.ai.a2a.types.AgentCardSignature;
import za.co.sindi.ai.a2a.types.AgentInterface;
import za.co.sindi.ai.a2a.types.AgentProvider;
import za.co.sindi.ai.a2a.types.AgentSkill;
import za.co.sindi.ai.a2a.types.SecurityScheme;
import za.co.sindi.ai.a2a.types.TransportProtocol;

/**
 * @author Buhake Sindi
 * @since 15 November 2025
 */
public interface AgentCardBuilder {

	/**
	 * @param protocolVersion the protocolVersion to set
	 */
	public AgentCardBuilder protocolVersion(String protocolVersion);

	/**
	 * @param name the name to set
	 */
	public AgentCardBuilder name(String name);

	/**
	 * @param description the description to set
	 */
	public AgentCardBuilder description(String description);

	/**
	 * @param url the url to set
	 */
	public AgentCardBuilder url(String url);

	/**
	 * @param preferredTransport the preferredTransport to set
	 */
	public AgentCardBuilder preferredTransport(TransportProtocol preferredTransport);

	/**
	 * @param additionalInterfaces the additionalInterfaces to set
	 */
	public AgentCardBuilder additionalInterfaces(AgentInterface... additionalInterfaces);

	/**
	 * @param iconUrl the iconUrl to set
	 */
	public AgentCardBuilder iconUrl(String iconUrl);

	/**
	 * @param provider the provider to set
	 */
	public AgentCardBuilder provider(AgentProvider provider);

	/**
	 * @param version the version to set
	 */
	public AgentCardBuilder version(String version);

	/**
	 * @param documentUrl the documentUrl to set
	 */
	public AgentCardBuilder documentUrl(String documentUrl);

	/**
	 * @param capabilities the capabilities to set
	 */
	public AgentCardBuilder capabilities(AgentCapabilities capabilities);
	
	/**
	 * @param capabilitiesBuilder the capabilitiesBuilder to set
	 */
	public AgentCardBuilder capabilities(AgentCapabilitiesBuilder capabilitiesBuilder);

	/**
	 * @param securitySchemes the securitySchemes to set
	 */
	public AgentCardBuilder securitySchemes(Map<String, ? extends SecurityScheme> securitySchemes);

	/**
	 * @param security the security to set
	 */
	public AgentCardBuilder security(List<Map<String, String[]>> security);

	/**
	 * @param defaultInputModes the defaultInputModes to set
	 */
	public AgentCardBuilder defaultInputModes(String... defaultInputModes);

	/**
	 * @param defaultOutputModes the defaultOutputModes to set
	 */
	public AgentCardBuilder defaultOutputModes(String... defaultOutputModes);

	/**
	 * @param skills the skills to set
	 */
	public AgentCardBuilder skills(AgentSkill... skills);
	
	/**
	 * @param skills the skills to set
	 */
	public AgentCardBuilder skills(Set<AgentSkill> skills);

	/**
	 * @param signatures the signatures to set
	 */
	public AgentCardBuilder signatures(AgentCardSignature... signatures);
}
