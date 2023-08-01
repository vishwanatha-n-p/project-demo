/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.project.demo.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ProductService}.
 *
 * @author Brian Wing Shun Chan
 * @see ProductService
 * @generated
 */
public class ProductServiceWrapper
	implements ProductService, ServiceWrapper<ProductService> {

	public ProductServiceWrapper(ProductService productService) {
		_productService = productService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _productService.getOSGiServiceIdentifier();
	}

	@Override
	public java.util.List<com.project.demo.model.Product> getProductsByGender(
		String gender) {

		return _productService.getProductsByGender(gender);
	}

	@Override
	public ProductService getWrappedService() {
		return _productService;
	}

	@Override
	public void setWrappedService(ProductService productService) {
		_productService = productService;
	}

	private ProductService _productService;

}