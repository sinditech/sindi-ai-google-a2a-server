/**
 * 
 */
package za.co.sindi.ai.a2a.server.runtime;

import za.co.sindi.ai.a2a.server.spi.AgentCardBuilder;
import za.co.sindi.ai.a2a.types.AgentCard;

/**
 * @author Buhake Sindi
 * @since 15 November 2025
 */
public abstract class BaseAgentCardBuilder implements AgentCardBuilder {

	public abstract AgentCard build();
}
