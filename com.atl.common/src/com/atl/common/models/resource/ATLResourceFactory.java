package com.atl.common.models.resource;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Factory;

/**
 * 
 * @author <a href=g.hillairet@gmail.com>guillaume hillairet</a>
 * @since 0.6
 */
public class ATLResourceFactory implements Factory {

	@Override
	public Resource createResource(URI uri) {
		return new ATLResource(uri);
	}

}
