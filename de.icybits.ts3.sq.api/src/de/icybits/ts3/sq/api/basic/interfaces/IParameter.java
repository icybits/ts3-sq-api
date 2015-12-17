package de.icybits.ts3.sq.api.basic.interfaces;

/**
 * The IParameter interface defines that an parameter has a name and a value.
 *
 * @author iceac_000
 */
public interface IParameter<VALUE> {

	public String getName();

	public VALUE getValue();
}
