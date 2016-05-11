package it.keyp.webapp.interceptors;

import java.util.logging.Logger;

import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor
@Logging
public class LoggingInterceptor {

	@Inject
    private Logger logger;
	
	public LoggingInterceptor() {
		// TODO Auto-generated constructor stub
	}

	@AroundInvoke
	public Object aroundInvoke(InvocationContext ic) throws Exception {
		String methodName = ic.getMethod().getName();
        logger.info("Executing " + ic.getTarget().getClass().getSimpleName() + "." + methodName + " method");
        return ic.proceed();
	}

}
