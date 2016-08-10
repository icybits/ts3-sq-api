package de.icybits.ts3.sq.api.basic.interfaces;

/**
 * This interface defines that an IResponse has an Response String. Instances of
 * this interface normally used by implementations of the IResponseFactory
 * interface.
 *
 * @author Alias: Iceac Sarutobi
 */
public interface IResponse {

	/**
	 * To fulfill the contract of this interface this method should only return
	 * <code>true</code> if and only if:
	 * <p>
	 * <code>if(object == this)</code><br>
	 * <code>if(object instanceof IResponse)</code><br>
	 * <code>if(this.getResponse().equals(other.getResponse())</code><br>
	 * <p>
	 * There is no problem if this method returns <code>false</code>, if the
	 * contract of other interfaces, beside this interface, were not met. Even if
	 * the conditions above are all <code>true</code>.
	 * 
	 * @param object
	 * @return <code>true</code> if the other object is a IResponse object and if
	 *         the response of the other IResponse object is equals
	 */
	@Override
	public boolean equals(Object obj);

	/**
	 * @return the response String
	 */
	public String getResponse();

	/**
	 * To fulfill the contract of this interface the hash code returned by this
	 * method should do:
	 * <p>
	 * If two objects are equal according to the equals(Object) method, then
	 * calling the hashCode method on each of the two objects must produce the
	 * same integer result.
	 * 
	 * @return the hash code of the IResponse object
	 */
	@Override
	public int hashCode();
}
