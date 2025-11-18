/**
 * 
 */
package za.co.sindi.ai.a2a.server.runtime;

/**
 * @author Buhake Sindi
 * @since 15 November 2025
 */
public abstract class PublicAgentCardBuilder extends BaseAgentCardBuilder {

	/**
	 * @param supportsAuthenticatedExtendedCard the supportsAuthenticatedExtendedCard to set
	 */
	public abstract PublicAgentCardBuilder supportsAuthenticatedExtendedCard(boolean supportsAuthenticatedExtendedCard);
}
