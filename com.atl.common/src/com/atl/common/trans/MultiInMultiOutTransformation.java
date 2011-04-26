/**
 * 
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 * 
 */
package com.atl.common.trans;

import java.util.Set;

import org.eclipse.m2m.atl.core.emf.EMFModel;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.1
 */
public interface MultiInMultiOutTransformation extends Transformation<Set<EMFModel>, Set<EMFModel>> {

    public abstract Set<EMFModel> apply(Set<EMFModel> arg);
    
}