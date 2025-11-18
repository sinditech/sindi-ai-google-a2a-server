/**
 * 
 */
package za.co.sindi.ai.a2a.server.runtime.rest.provider;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.Status;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;
import za.co.sindi.ai.a2a.server.A2AServerError;
import za.co.sindi.ai.a2a.types.A2AError;
import za.co.sindi.ai.a2a.types.InternalError;
import za.co.sindi.ai.a2a.types.InvalidParamsError;
import za.co.sindi.ai.a2a.types.InvalidRequestError;
import za.co.sindi.ai.a2a.types.MethodNotFoundError;
import za.co.sindi.ai.a2a.types.TaskNotFoundError;

/**
 * @author Buhake Sindi
 * @since 17 November 2025
 */
@Provider
public class A2ServerErrorExceptionMapper implements ExceptionMapper<A2AServerError> {

	private static final Map<Class<? extends A2AError>, Status> STATUS_CODES = new HashMap<>();
	private static final Status DEFAULT_ERROR_STATUS = Status.INTERNAL_SERVER_ERROR;
	
	static {
		STATUS_CODES.put(InvalidRequestError.class, Status.BAD_REQUEST);
		STATUS_CODES.put(InvalidParamsError.class, Status.BAD_REQUEST);
		STATUS_CODES.put(MethodNotFoundError.class, Status.NOT_FOUND);
		STATUS_CODES.put(TaskNotFoundError.class, Status.NOT_FOUND);
		STATUS_CODES.put(InternalError.class, Status.INTERNAL_SERVER_ERROR);
	}
	
	@Override
	public Response toResponse(A2AServerError exception) {
		// TODO Auto-generated method stub
		A2AError error = exception.getError();
		Status status = Optional.ofNullable(STATUS_CODES.get(error.getClass())).orElse(DEFAULT_ERROR_STATUS);
		return Response.status(status).entity(error).build();
	}
}

