/*
 * This file is part of cruzeira and it's licensed under the project terms.
 */
package org.cruzeira.filesystem;

/**
 * This components watches any changes on file system. It should be used once,
 * that is, after {@link #hasChanges()} returns true, next time it is not
 * guaranteed that it will return true because of the same event (same change).
 * The safest way to use is to reload it every time.
 * 
 */
public interface FileSystemChanges {

	/**
	 * Indicates if the file system has changed since its creation/reload
	 */
	boolean hasChanges();

	/**
	 * Reload the underlying mechanism of watch. 
	 */
	void reload();

}
