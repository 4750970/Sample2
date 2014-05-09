package application.framework.service;

public interface IApplicationService<S, T> {
	/**
	 * 
	 */
	T execute(S input);
}
