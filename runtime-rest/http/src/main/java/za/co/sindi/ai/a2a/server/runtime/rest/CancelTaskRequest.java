/**
 * 
 */
package za.co.sindi.ai.a2a.server.runtime.rest;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 18 November 2025
 */
public record CancelTaskRequest(@JsonbProperty String name) {

}
